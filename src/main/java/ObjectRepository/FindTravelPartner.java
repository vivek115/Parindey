package ObjectRepository;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
public class FindTravelPartner extends AddStory {
    public AndroidDriver<AndroidElement> driver;
    @Test(priority = 1)
    public void ClickOnAddTab1() throws MalformedURLException, InterruptedException {
        driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        AndroidElement AddTab = driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.travelpartner.parindey:id/navigation_bar_item_icon_view']"));
        AddTab.click();
    }
    @Test(priority = 2)
    public void ClickOnFindTravelPartner() {
        AndroidElement ClickOnFindTravelPartner = driver.findElement(By.xpath("//android.widget.TextView[@text='Find Travel Partner']"));
        ClickOnFindTravelPartner.click();
        AndroidElement VerifyFindTravelScreen = driver.findElement(By.xpath("//android.widget.TextView[@text='Find A Travel Partner']"));
        String ActualTitle = VerifyFindTravelScreen.getText();
        String ExpectedTitle = "Find A Travel Partner";
        Assert.assertEquals(ActualTitle, ExpectedTitle, "FindTravelScreen is not verified");
        System.out.println("Successfully navigated to Find Travel screen");
    }
    @Test(priority = 3)
    public void AddTravelPartnerDetail() {
        Actions actions = new Actions(driver);
        AndroidElement EditText = driver.findElement(By.xpath("//android.widget.EditText[@text='Type Something Here about your trip plans & journey.. user @mention or #hashtags']"));
        EditText.click();
        actions.sendKeys("hello friend").build().perform();
        AndroidElement AddLocation = driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.travelpartner.parindey:id/chooseLocation']"));
        AddLocation.click();
        AndroidElement SelectLocation = driver.findElement(By.xpath("//android.widget.LinearLayout[@index=5]"));
        SelectLocation.click();
        AndroidElement SelectTravelDate = driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.travelpartner.parindey:id/chooseDate']"));
        SelectTravelDate.click();
        AndroidElement ClickOnYear = driver.findElement(By.xpath("//android.widget.Button[@text='JANUARY 2022']"));
        Actions action = new Actions(driver);
        action.moveToElement(ClickOnYear).click().perform();
        AndroidElement WantToTravelWith = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id='com.travelpartner.parindey:id/female_card']"));
        WantToTravelWith.click();
        AndroidElement SelectYear = driver.findElement(By.xpath("//android.widget.TextView[@text='2024']"));
        SelectYear.click();
        AndroidElement SelectDate = driver.findElement(By.xpath("//android.widget.TextView[@index=10]"));
        SelectDate.click();
        AndroidElement ClickOnOkkButton = driver.findElement(By.xpath("//android.widget.Button[@text='OK']"));
        ClickOnOkkButton.click();
        AndroidElement ClickOnCheckBox = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.travelpartner.parindey:id/publish_action']"));
        ClickOnCheckBox.click();
        AndroidElement VerifyDashboardScreen = driver.findElement(By.xpath("//android.widget.TextView[@text='Parindey']"));
        String ActualTitle = VerifyDashboardScreen.getText();
        String ExpectedTitle = "Parindey";
        Assert.assertEquals(ActualTitle, ExpectedTitle, "DashboardScreen is not verified");
        System.out.println("Successfully navigated to dashboard screen");
    }
    @Test(priority = 4)
    public void ClickOnMenuBar(){
        AndroidElement ClickOnOkkButton = driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.travelpartner.parindey:id/more_options']"));
        ClickOnOkkButton.click();
        AndroidElement VerifyDialogBox = driver.findElement(By.xpath("//android.widget.TextView[@text='Edit']"));
        String ActualTitle = VerifyDialogBox.getText();
        String ExpectedTitle = "Edit";
        Assert.assertEquals(ActualTitle, ExpectedTitle, "Dialog box  is not verified");
        System.out.println("Dialog box is displaying on screen");
    }
    @Test(priority = 5)
    public void ClickOnDeleteButton(){
        AndroidElement ClickOnDeleteButton = driver.findElement(By.xpath("//android.widget.TextView[@text='Delete']"));
       ClickOnDeleteButton.click();
        AndroidElement VerifyDialogBox = driver.findElement(By.xpath("//android.widget.TextView[@text='Are you sure?']"));
        String ActualTitle = VerifyDialogBox.getText();
        String ExpectedTitle = "Are you sure?";
        Assert.assertEquals(ActualTitle, ExpectedTitle, "Dialog box  is not verified");
        System.out.println("Dialog box is displaying on screen");
        Alert alert = driver.switchTo().alert();
        // Capturing alert message.
        String alertMessage= driver.switchTo().alert().getText();
        // Displaying alert message
        System.out.println(alertMessage);
        // Accepting alert
        alert.accept();
        System.out.println("Post deleted successfully");
    }
}
