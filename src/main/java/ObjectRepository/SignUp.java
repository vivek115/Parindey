package ObjectRepository;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class SignUp extends BasePage {
    public AndroidDriver<AndroidElement> driver;
    @Test
    public void login() throws Throwable {
        driver = Capabilities();
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        AndroidElement VerifyHomeScreen = driver.findElement(By.xpath("//android.widget.TextView[@text='Languages You Love']"));
        String ActualTitle = VerifyHomeScreen.getText();
        String ExpectedTitle = "Languages You Love";
        Assert.assertEquals(ActualTitle, ExpectedTitle, "Homepage  is not verified");
        System.out.println("Successfully navigated to homepage");
        String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"NEXT\").instance(0))";
        driver.findElementByAndroidUIAutomator(scrollElement).click();
        AndroidElement VerifyYourInterestScreen = driver.findElement(By.xpath("//android.widget.TextView[@text='Your Interests']"));
        String ActualTitle1 = VerifyYourInterestScreen.getText();
        String ExpectedTitle1 = "Your Interests";
        Assert.assertEquals(ActualTitle, ExpectedTitle, "InterestScreen is not verified");
        System.out.println("Successfully navigated to InterestScreen");
        AndroidElement RemoveInterest = driver.findElement(By.xpath("//android.widget.TextView[@text='Adeventure']"));
        RemoveInterest.click();
        AndroidElement SelectNewInterest = driver
                .findElement(By.xpath("//android.widget.TextView[@text='Photography']"));
        SelectNewInterest.click();
        String scrollElement1 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"NEXT\").instance(0))";
        driver.findElementByAndroidUIAutomator(scrollElement1).click();
        AndroidElement VerifyTellUsAboutYourselfScreen = driver.findElement(By.xpath("//android.widget.TextView[@text='Awesome!']"));
        String ActualTitle2 = VerifyTellUsAboutYourselfScreen.getText();
        String ExpectedTitle2 = "Awesome!";
        Assert.assertEquals(ActualTitle, ExpectedTitle, "TellUsAboutYourselfScreen is not verified");
        System.out.println("Successfully navigated to tell us about screen");
        AndroidElement EnterName = driver
                .findElement(By.xpath("//android.widget.EditText[@text='What is your Name?']"));
        EnterName.click();
        actions.sendKeys("vicky").build().perform();
        AndroidElement ClickOnRightButton = driver.findElement(By.xpath("//android.widget.ImageButton[@index=2]"));
        ClickOnRightButton.click();
        AndroidElement EnterBornPlace = driver
                .findElement(By.xpath("//android.widget.EditText[@text='When were you born?']"));
        EnterBornPlace.click();
        actions.sendKeys("prithi").build().perform();
        AndroidElement SelectDateOfBirth = driver.findElement(By.xpath("//android.widget.ImageButton[@index=2]"));
        SelectDateOfBirth.click();
        Thread.sleep(3000);
        AndroidElement ClickOnLocation = driver.findElement(By.id("com.travelpartner.parindey:id/inputLocation"));
        ClickOnLocation.click();
        AndroidElement EnterLocation = driver
                .findElement(By.xpath("//android.widget.TextView[@text='#100 Bed and Breakfast']"));
        EnterLocation.click();
        String clickOnDone = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"DONE\").instance(0))";
        driver.findElementByAndroidUIAutomator(clickOnDone).click();
        AndroidElement VerifyDashboardScreen = driver.findElement(By.xpath("//android.widget.TextView[@text='Parindey']"));
        String ActualTitle3 = VerifyDashboardScreen.getText();
        String ExpectedTitle3 = "Parindey";
        Assert.assertEquals(ActualTitle, ExpectedTitle, "DashboardScreen is not verified");
        System.out.println("Successfully navigated to dashboard screen");
        AndroidElement ClickOnPlusTab = driver.findElement(
                By.xpath("//android.widget.ImageButton[@resource-id='com.travelpartner.parindey:id/navigation_chat']"));
        ClickOnPlusTab.click();
        AndroidElement ClickOnLoginWithGoogle = driver
                .findElement(By.xpath("//android.widget.Button[@text='LOGIN WITH GOOGLE']"));
        ClickOnLoginWithGoogle.click();
        AndroidElement SelectGmailAccount = driver
                .findElement(By.xpath("//android.widget.TextView[@text='vivekjoshi840@gmail.com']"));
        SelectGmailAccount.click();
        AndroidElement logout = driver.findElement(By.xpath("//android.widget.FrameLayout[@index=4]"));
        logout.click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click()", logout);
        AndroidElement MenuBar = driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.travelpartner.parindey:id/navigation_menu_bar']"));
        MenuBar.click();
        AndroidElement logoutClick = driver.findElement(By.xpath("//android.widget.TextView[@text='Logout']"));
        logoutClick.click();
        AndroidElement yesLogout = driver.findElement(By.xpath("//android.widget.TextView[@text='Yes logout']"));
        yesLogout.click();
    }
}
