import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage{

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    //Контактное лицо сохранено. Ассерт.
    @FindBy(xpath = "//*[@class=\"alert alert-success fade in top-messages \"]")
    private WebElement successMessage;
    public WebElement successMessage() {
        return successMessage;
    }

    @FindBy (xpath = "//*[@class=\"btn back icons-holder-text \"]")
    private WebElement createContactPerson;

    public ContactPage createContactPersonClick(){
        createContactPerson.click();
        return this;
    }

    @FindBy (xpath = "//*[@name=\"crm_contact[lastName]\"]")
    private WebElement lastNameInput;

    public ContactPage lastNameInputEnter(String surname){
        lastNameInput.sendKeys(surname);
        return this;
    }

    @FindBy(xpath = "//*[@name=\"crm_contact[firstName]\"]")
    private WebElement firstName;
    public ContactPage firstNameInputEnter(String name){
        firstName.sendKeys(name);
        return this;
    }

    @FindBy(xpath = "//*[@name=\"crm_contact[jobTitle]\"]")
    private WebElement jobTitle;
    public ContactPage jobTitleEnter(String job){
        jobTitle.sendKeys(job);
        return this;
    }

    @FindBy(xpath = "//*[@class=\"select2-chosen\"]")
    private WebElement orgDropdown;
    public ContactPage orgDropdownClick(){
        orgDropdown.click();
        return this;
    }

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/div/input")
    private WebElement orgInput;
    public ContactPage orgInputEnter(String org){
        orgInput.sendKeys(org);
        return this;
    }

    @FindBy(xpath = "//*[@class=\"select2-match\"]")
    private WebElement orgMatch;
    public ContactPage orgMatchClick(){
        orgMatch.click();
        return this;
    }

    @FindBy (xpath = "//*[@class='pull-right']/div/div/button[@class='btn btn-success main-group action-button']")
    private WebElement succesButton;
    public ContactPage succesButtonClick(){
        succesButton.click();
        return this;
    }


}
