import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    WebDriverWait wait30second;
    WebDriverWait wait10second;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait10second = new WebDriverWait(driver, 10);
        this.wait30second = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }
}
