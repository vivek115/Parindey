package ObjectRepository;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
public class LogOut extends BasePage {
    public LogOut(AppiumDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//android.widget.FrameLayout[@index=4]")
    public WebElement Profile;
    @FindBy(xpath="//android.widget.FrameLayout[@index=4]")
    public WebElement MenuBar;
    @FindBy(xpath="//android.widget.TextView[@text='Logout']")
    public WebElement LogOutButton;
    @FindBy(xpath="//android.widget.TextView[@text='Yes logout']")
    public WebElement YesButton;
    @Test
    public void logout(){
        Profile.click();
        MenuBar.click();
        LogOutButton.click();
        YesButton.click();
    }
}
