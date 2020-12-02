import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    //Logo для ассерта
    @FindBy(css = "#organization-switcher > h1 > a")
    private WebElement logoGeekbrains;
    //Проекты - Мои проекты
    @FindBy(css = ".dropdown:nth-child(3) > .unclickable > .title")
    private WebElement projectMainButton;
    @FindBy (xpath = "//li[3]/ul/li[4]/a/span")
    private WebElement projectMainButtonAllProjects;

    //Создание контактного лица в организации
    @FindBy (css = "#main-menu > ul > li.dropdown.first > a > span")
    private WebElement couterAgents;
    @FindBy(css = "#main-menu > ul > li.dropdown.first > ul > li.single.last > a")
    private WebElement contactPersons;




    //Проекты
    @Step(value = "project MainButton Click")
    public HomePage projectMainButtonClick(){
        projectMainButton.click();
        return this;
    }
    @Step(value = "project MainButton AllProjects Click")
    public HomePage projectMainButtonAllProjectsClick(){
        projectMainButtonAllProjects.click();
        return  this;
    }
    //Создание контактного лица в организации
    @Step(value = "couter Agents Click")
    public HomePage couterAgentsClick(){
        couterAgents.click();
        return this;
    }
    @Step(value = "contact Persons Click")
    public HomePage contactPersonsClick(){
        contactPersons.click();
        return  this;
    }

    //лого для LoginTest ассертов
    @Step(value = "Ассерт logoGeekbrains")
    public WebElement logoGeekbrains() {
        return logoGeekbrains; // logoGeekbrains
    }
}
