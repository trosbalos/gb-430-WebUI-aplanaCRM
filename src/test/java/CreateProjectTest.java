import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class CreateProjectTest extends BaseTest {


    @Test
    void createProjectTest()  {
        new HomePage(driver)
                .projectMainButtonClick()
                .projectMainButtonAllProjectsClick();
        new ProjectPage(driver)
                .projectCreateButtonClick()
                .enterProjectNameField(RANDOM_NAME_COMPANY)
                .projectOrgChosenClick()
                .enterProjectOrgInput(TEST_ORGANISATION)
                .projectOrgFindClick()
                .projectOrgResultClick()
                .contactPersonClick()
                .enterContactPersonInput(CONTACT_PERSON)
                .contactPersonChooseClick()
                .unitSelectionClick()
                .unitSelectionChooseClick()
                .curatorSelectionClick()
                .curatorSelectionChooseClick()
                .rpSelectionClick()
                .rpSelectionChooseClick()
                .administratorSelectionClick()
                .administratorSelectionChooseClick()
                .managerSelectionClick()
                .managerSelectionChooseClick()
                .saveAndCloseButtonClick();


        ProjectPage projectPage = new ProjectPage(driver);
        WebElement succesMessage = projectPage.succesMessage();
        Assertions.assertAll(
                () -> assertTrue(succesMessage.isDisplayed())
        );
    }

}
