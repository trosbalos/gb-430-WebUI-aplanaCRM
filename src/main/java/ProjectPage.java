import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectPage extends BasePage {

    public ProjectPage(WebDriver driver) {
        super(driver);
    }
    public WebElement succesMessage() {
        return succesMessage;   // Заявка сохранена, всплывающее на
        // пару сек уведомление после создания запроса.
    }

    // Создание проекта
    @FindBy(xpath = "//*[@id=\"container\"]/div[1]/div/div/div[2]/div/div/a")
    private WebElement projectCreateButton;

    @FindBy (xpath = "//*[@data-ftid=\"crm_project_name\"]")
    private WebElement projectNameField;

    @FindBy(xpath = "//div[@class='company-container']/div/a/span[@class='select2-arrow']")
    //@FindBy(xpath = "//div[@class='selector input-widget-select error hover']/div/a/span[@class='select2-arrow']")
    private WebElement projectOrgChosen;

    @FindBy(css = "#select2-drop > div > input")
    private WebElement projectOrgInput;

    @FindBy(css = "#select2-drop > div > input")
    private WebElement projectOrgFind;

    @FindBy(xpath = "//div[@class='select2-result-label']")
    private WebElement projectOrgResult;

    @FindBy (xpath = "//div[@class='select2-container select2']/a/span[@class='select2-chosen']")
    private WebElement contactPerson;

    @FindBy(css = "#select2-drop > div > input")
    private WebElement contactPersonInput;

    @FindBy(css= "#select2-drop > ul.select2-results > li > div > span")
    private WebElement contactPersonChoose;

    @FindBy(xpath = "//div[@class='selector input-widget-select']/select[@name ='crm_project[businessUnit]']")
    private WebElement unitSelection;

    @FindBy(xpath = "//*[@name=\"crm_project[businessUnit]\"]/option[2]")
    private WebElement unitSelectionChoose;

    @FindBy(xpath = "//div[@class='selector input-widget-select']/select[@name ='crm_project[curator]']")
    private WebElement curatorSelection;

    @FindBy(xpath = "//*[@name=\"crm_project[curator]\"]/option[3]")
    private WebElement curatorSelectionChoose;

    @FindBy(xpath = "//div[@class='selector input-widget-select']/select[@name ='crm_project[rp]']")
    private WebElement rpSelection;

    @FindBy(xpath = "//*[@name=\"crm_project[rp]\"]/option[3]")
    private WebElement rpSelectionChoose;

    @FindBy(xpath = "//div[@class='selector input-widget-select']/select[@name ='crm_project[administrator]']")
    private WebElement administratorSelection;

    @FindBy(xpath = "//*[@name=\"crm_project[administrator]\"]/option[3]")
    private WebElement administratorSelectionSelectionChoose;

    @FindBy(xpath = "//*[@name=\"crm_project[manager]\"]")
    private WebElement managerSelection;

    @FindBy(xpath = "//*[@name=\"crm_project[manager]\"]/option[3]")
    private WebElement managerSelectionSelectionChoose;

    @FindBy (xpath = " //*[@class=\"btn btn-success action-button\"]")
    private WebElement saveAndCloseButton;

    @FindBy(xpath = "//*[@id=\"flash-messages\"]/div/div/div/div")
    private WebElement succesMessage;
    public ProjectPage projectCreateButtonClick(){
        projectCreateButton.click();
        return this;
    }
    @Step(value = "enter ProjectName Field = {projectName}")
    public ProjectPage enterProjectNameField(String projectName){
        projectNameField.sendKeys(projectName);
        return this;
    }
    @Step(value = "projectOrg Chosen Click")
    public ProjectPage projectOrgChosenClick(){
        projectOrgChosen.click();
        return this;
    }
    @Step(value = "enter ProjectOrg Input = {projectOrgName}")
    public ProjectPage enterProjectOrgInput(String projectOrgName){
        projectOrgInput.sendKeys(projectOrgName);
        return this;
    }
    @Step(value = "project OrgFind Click")
    public ProjectPage projectOrgFindClick(){
        projectOrgFind.click();
        return this;
    }
    @Step(value = "project OrgResult Click")
    public ProjectPage projectOrgResultClick(){
        projectOrgResult.click();
        return this;
    }
    @Step(value = "contact Person Click")
    public ProjectPage contactPersonClick(){
        contactPerson.click();
        return this;
    }
    @Step(value = "enter Contact Person Input = {contactPersonName}")
    public ProjectPage enterContactPersonInput(String contactPersonName){
        contactPersonInput.sendKeys(contactPersonName);
        return this;
    }
    @Step(value = "contact Person Choose Click")
    public ProjectPage contactPersonChooseClick(){
        contactPersonChoose.click();
        return this;
    }
    @Step(value = "unit Selection Click")
    public ProjectPage unitSelectionClick(){
        unitSelection.click();
        return this;
    }
    @Step(value = "unit Selection Choose Click")
    public ProjectPage unitSelectionChooseClick(){
        unitSelectionChoose.click();
        return this;
    }
    @Step(value = "curator Selection Click")
    public ProjectPage curatorSelectionClick(){
        curatorSelection.click();
        return this;
    }
    @Step(value = "curator Selection Choose Click")
    public ProjectPage curatorSelectionChooseClick(){
        curatorSelectionChoose.click();
        return this;
    }
    @Step(value = "rp Selection Click")
    public ProjectPage rpSelectionClick(){
        rpSelection.click();
        return this;
    }
    @Step(value = "rp Selection Choose Click")
    public ProjectPage rpSelectionChooseClick(){
        rpSelectionChoose.click();
        return this;
    }
    @Step(value = "administrator Selection Click")
    public ProjectPage administratorSelectionClick(){
        administratorSelection.click();
        return this;
    }
    @Step(value = "administrator Selection ChooseClick")
    public ProjectPage administratorSelectionChooseClick(){
        administratorSelectionSelectionChoose.click();
        return this;
    }
    @Step(value = "managerSelection Click")
    public ProjectPage managerSelectionClick(){
        managerSelection.click();
        return this;
    }
    @Step(value = "managerSelection Choose Click")
    public ProjectPage managerSelectionChooseClick(){
        managerSelection.click();
        return this;
    }
    @Step(value = "saveAndClose Button Click")
    public ProjectPage saveAndCloseButtonClick(){
        saveAndCloseButton.click();
        return this;
    }


}
