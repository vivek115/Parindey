package ObjectRepository;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class SearchTab extends BasePage {
    public SearchTab(AppiumDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='com.travelpartner.parindey:id/navigation_explore']")
    public WebElement Click_On_SearchTab;
    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.travelpartner.parindey:id/add_travel_story']")
    public WebElement Click_On_User;

    @FindBy(xpath = "//android.widget.Button[@text='FOLLOW']")
    public WebElement Follow_User;

    @FindBy(xpath = "//android.widget.TextView[@text='TRAVEL SHOTS']")
    public WebElement Click_On_TravelShots;

    @FindBy(xpath = "//android.widget.TextView[@text='PLANNED TRIPS']")
    public WebElement Click_On_PlannedTrips;

    @FindBy(xpath = "//android.widget.Button[@text='MESSAGE']")
    public WebElement Click_On_MessageButton;

    @Test
    public void SearchedUser() {
        Click_On_SearchTab.click();
        Click_On_User.click();
        Follow_User.click();
        Click_On_TravelShots.click();
        Click_On_PlannedTrips.click();
        Click_On_MessageButton.click();
//        if (Follow_User.isDisplayed()) {
//            Follow_User.click();
//        }
        // Assert.assertEquals("UNFOLLOW", "UNFOLLOW");

    }
}


