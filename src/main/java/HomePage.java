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
    public HomePage projectMainButtonClick(){
        projectMainButton.click();
        return this;
    }
    public HomePage projectMainButtonAllProjectsClick(){
        projectMainButtonAllProjects.click();
        return  this;
    }
    //Создание контактного лица в организации
    public HomePage couterAgentsClick(){
        couterAgents.click();
        return this;
    }
    public HomePage contactPersonsClick(){
        contactPersons.click();
        return  this;
    }

    //лого для LoginTest ассертов
    public WebElement logoGeekbrains() {
        return logoGeekbrains; // logoGeekbrains
    }
}
