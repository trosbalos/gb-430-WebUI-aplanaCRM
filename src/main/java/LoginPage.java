import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

@Step(value = "Login with login = {USER_LOGIN}, password {USER_PASSWORD}")
     void login(String USER_LOGIN,String USER_PASSWORD) {
        new LoginPage(driver)
                .enterLogin(USER_LOGIN)
                .enterPassword(USER_PASSWORD)
                .clickSingInButton();
    }

    @FindBy(css = "#prependedInput")
    private WebElement loginInput;
    @FindBy(css="#prependedInput2")
    private WebElement passwordInput;
    @FindBy (css = "#_submit")
    private WebElement singInButton;
    @Step(value = "enter Login = {login}")
    public LoginPage enterLogin(String login){
    loginInput.sendKeys(login);
    return this;
}
@Step(value = "enter Password = {password}")
    public LoginPage enterPassword(String password){
        passwordInput.sendKeys(password);
        return this;
    }
@Step(value ="click SingIn Button")
    public LoginPage clickSingInButton(){
        singInButton.click();
        return this;
    }


}
