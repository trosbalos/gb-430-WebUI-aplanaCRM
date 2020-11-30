import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;


public class LoginTest extends BaseTest {


    @Test
    void loginTest() {
        //Вход в BaseTest, в методе beforeTest()
        HomePage homePage = new HomePage(driver);
        WebElement logoGeekbrains = homePage.logoGeekbrains();
        Assertions.assertAll(
                () -> assertTrue(logoGeekbrains.isDisplayed())
        );

    }
}
