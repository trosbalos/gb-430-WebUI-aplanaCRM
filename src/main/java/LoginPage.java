import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }


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

    public LoginPage enterLogin(String login){
    loginInput.sendKeys(login);
    return this;
}
    public LoginPage enterPassword(String password){
        passwordInput.sendKeys(password);
        return this;
    }

    public LoginPage clickSingInButton(){
        singInButton.click();
        return this;
    }


}
