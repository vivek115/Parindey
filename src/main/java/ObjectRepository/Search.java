package ObjectRepository;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
public class Search extends BasePage{
    public AndroidDriver<AndroidElement> driver;
    @Test
    public void SearchBar() throws MalformedURLException, InterruptedException {
        driver=Capabilities();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        AndroidElement ProfileTab = driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.travelpartner.parindey:id/navigation_bar_item_icon_view']"));
        action.moveToElement(ProfileTab).build().perform();
        AndroidElement Places =  driver.findElement(By.xpath("//android.widget.TextView[@text='PLACES']"));
        Places.click();
        AndroidElement Trending =  driver.findElement(By.xpath("//android.widget.TextView[@text='TRENDING']"));
        Trending.click();
        AndroidElement Travellers =  driver.findElement(By.xpath("//android.widget.TextView[@text='TRAVELLERS']"));
        Travellers.click();
        AndroidElement SearchBar=  driver.findElement(By.xpath("//android.widget.EditText[@text='Search']"));
        SearchBar.click();
        action.sendKeys("vicky").build().perform();
        AndroidElement ClickOnUser=  driver.findElement(By.xpath("//android.widget.LinearLayout[@index=1]"));
        ClickOnUser.click();
        AndroidElement SendFollowRequest=  driver.findElement(By.xpath("//android.widget.Button[@text='FOLLOW']"));
        SendFollowRequest.click();
        AndroidElement ClickOnMessageIcon=  driver.findElement(By.xpath("//android.widget.Button[@text='MESSAGE']"));
        ClickOnMessageIcon.click();
    }
}
