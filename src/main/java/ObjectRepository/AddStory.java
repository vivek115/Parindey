package ObjectRepository;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
public class AddStory extends SignUp2 {
    public AndroidDriver<AndroidElement> driver;
    public void ClickOnAddTab() throws MalformedURLException, InterruptedException {
        driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        AndroidElement AddTab = driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.travelpartner.parindey:id/navigation_bar_item_icon_view']"));
        AddTab.click();
    }
//    public void AddTravelStory() throws MalformedURLException, InterruptedException {
//        driver = Capabilities();
//        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
//        AndroidElement ClickOnAddTravelStory = driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.travelpartner.parindey:id/add_travel_story']"));
//        ClickOnAddTravelStory.click();
//        AndroidElement selectImage = driver.findElement(By.xpath("//android.widget.TextView[@index=3]"));
//        selectImage.click();
//        AndroidElement ClickOnComplete = driver.findElement(By.xpath("//android.widget.TextView[@text='Complete(1/6)']"));
//        ClickOnComplete.click();
//        AndroidElement ClickOnCheckButton = driver.findElement(By.xpath("//android.widget.TextView[@index=0]"));
//        ClickOnCheckButton.click();
//        AndroidElement EditText = driver.findElement(By.xpath("//android.widget.EditText[@text='Type Something Here..']"));
//        EditText.click();
//        AndroidElement AddLocation = driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.travelpartner.parindey:id/textLocation']"));
//        AddLocation.click();
//        AndroidElement ChooseLocation = driver.findElement(By.xpath("//android.widget.LinearLayout[@index=4]"));
//        ChooseLocation.click();
//        AndroidElement AddInterest = driver.findElement(By.xpath("//android.widget.TextView[@text='Add Interests']"));
//        AddInterest.click();
//        AndroidElement SelectInterest = driver.findElement(By.xpath("//android.widget.TextView[@index=10]"));
//        SelectInterest.click();
//        AndroidElement ClickOnCheckButton1 = driver.findElement(By.xpath("//android.widget.TextView[@index=2]"));
//        ClickOnCheckButton1.click();
//    }
}
