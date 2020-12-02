import static org.junit.jupiter.api.Assertions.*;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;


public class LoginTest extends BaseTest {

@Feature("login")
@Severity(SeverityLevel.BLOCKER)
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
