import io.qameta.allure.Step;
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
    @Step(value = "success Message ")
    public WebElement successMessage() {
        return successMessage;
    }

    @FindBy (xpath = "//*[@class=\"btn back icons-holder-text \"]")
    private WebElement createContactPerson;
    @Step(value = "createContact Person Click ")
    public ContactPage createContactPersonClick(){
        createContactPerson.click();
        return this;
    }

    @FindBy (xpath = "//*[@name=\"crm_contact[lastName]\"]")
    private WebElement lastNameInput;
    @Step(value = "lastName Input Enter ={surname}")
    public ContactPage lastNameInputEnter(String surname){
        lastNameInput.sendKeys(surname);
        return this;
    }

    @FindBy(xpath = "//*[@name=\"crm_contact[firstName]\"]")
    private WebElement firstName;
    @Step(value = "firstName Input Enter ={name}")
    public ContactPage firstNameInputEnter(String name){
        firstName.sendKeys(name);
        return this;
    }

    @FindBy(xpath = "//*[@name=\"crm_contact[jobTitle]\"]")
    private WebElement jobTitle;
    @Step(value = "jobTitle Enter ={job}")
    public ContactPage jobTitleEnter(String job){
        jobTitle.sendKeys(job);
        return this;
    }

    @FindBy(xpath = "//*[@class=\"select2-chosen\"]")
    private WebElement orgDropdown;
    @Step(value = "orgDropdown Click")
    public ContactPage orgDropdownClick(){
        orgDropdown.click();
        return this;
    }

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/div/input")
    private WebElement orgInput;
    @Step(value = "orgInput Enter ={org}")
    public ContactPage orgInputEnter(String org){
        orgInput.sendKeys(org);
        return this;
    }

    @FindBy(xpath = "//*[@class=\"select2-match\"]")
    private WebElement orgMatch;
    @Step(value = "orgMatch Click")
    public ContactPage orgMatchClick(){
        orgMatch.click();
        return this;
    }

    @FindBy (xpath = "//*[@class='pull-right']/div/div/button[@class='btn btn-success main-group action-button']")
    private WebElement succesButton;
    @Step(value = "succes Button Click")
    public ContactPage succesButtonClick(){
        succesButton.click();
        return this;
    }


}
