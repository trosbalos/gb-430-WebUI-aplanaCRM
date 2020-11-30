import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class AddContactPersonTest extends BaseTest{
    @Test
    void addContactPersonTest(){
        new HomePage(driver)
                .couterAgentsClick()
                .contactPersonsClick();
        new ContactPage(driver)
                .createContactPersonClick()
                .lastNameInputEnter(RANDOM_NAME)
                .firstNameInputEnter(RANDOM_NAME)
                .jobTitleEnter(RANDOM_JOB)
                .orgDropdownClick()
                .orgInputEnter(TEST_ORGANISATION)
                .orgMatchClick()
                .succesButtonClick()
                ;

        ContactPage contactPage = new ContactPage(driver);
        WebElement successMessage = contactPage.successMessage();
        Assertions.assertAll(
                () -> assertTrue(successMessage.isDisplayed())
        );
    }


}
