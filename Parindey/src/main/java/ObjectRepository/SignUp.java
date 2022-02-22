package ObjectRepository;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignUp extends BasePage {
    public AndroidDriver<AndroidElement> driver;

    public SignUp(AppiumDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//android.widget.TextView[@text='Adeventure']")
    public WebElement Remove_Interest;
    @FindBy(xpath = "//android.widget.TextView[@text='Photography']")
    public WebElement Select_New_Interest;
    @FindBy(xpath = "//android.widget.EditText[@text='What is your Name?']")
    public WebElement Enter_Name;
    @FindBy(xpath = "//android.widget.ImageButton[@index=2]")
    public WebElement Click_On_Check_Button;
    @FindBy(xpath = "//android.widget.EditText[@text='When were you born?']")
    public WebElement Enter_Born_Place;
    @FindBy(xpath = "//android.widget.ImageButton[@index=2]")
    public WebElement Select_Date_Of_Birth;
    @FindBy(id = "com.travelpartner.parindey:id/inputLocation")
    public WebElement Click_On_Location;
    @FindBy(xpath = "//android.widget.TextView[@text='#100 Bed and Breakfast']")
    public WebElement Enter_Location;
    @FindBy(xpath = "//android.widget.ImageButton[@resource-id='com.travelpartner.parindey:id/navigation_chat']")
    public WebElement Click_On_Plus_Tab ;
    @FindBy(xpath = "//android.widget.Button[@text='LOGIN WITH GOOGLE']")
    public WebElement Click_On_LoginWithGoogle;
    @FindBy(xpath = "//android.widget.TextView[@text='vivekjoshi840@gmail.com']")
    public WebElement Select_Gmail_Account;

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
        Remove_Interest.click();
        Select_New_Interest.click();
        String scrollElement1 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"NEXT\").instance(0))";
        driver.findElementByAndroidUIAutomator(scrollElement1).click();
        AndroidElement VerifyTellUsAboutYourselfScreen = driver.findElement(By.xpath("//android.widget.TextView[@text='Awesome!']"));
        String ActualTitle2 = VerifyTellUsAboutYourselfScreen.getText();
        String ExpectedTitle2 = "Awesome!";
        Assert.assertEquals(ActualTitle, ExpectedTitle, "TellUsAboutYourselfScreen is not verified");
        System.out.println("Successfully navigated to tell us about screen");
        Enter_Name.click();
        actions.sendKeys("vicky").build().perform();
        Click_On_Check_Button.click();
        Enter_Born_Place.click();
        actions.sendKeys("prithi").build().perform();
        Select_Date_Of_Birth.click();
        Thread.sleep(3000);
        Click_On_Location.click();
        Enter_Location.click();
        String clickOnDone = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"DONE\").instance(0))";
        driver.findElementByAndroidUIAutomator(clickOnDone).click();
        AndroidElement VerifyDashboardScreen = driver.findElement(By.xpath("//android.widget.TextView[@text='Parindey']"));
        String ActualTitle3 = VerifyDashboardScreen.getText();
        String ExpectedTitle3 = "Parindey";
        Assert.assertEquals(ActualTitle, ExpectedTitle, "DashboardScreen is not verified");
        System.out.println("Successfully navigated to dashboard screen");
        Click_On_Plus_Tab.click();
        Click_On_LoginWithGoogle.click();
        Select_Gmail_Account.click();
    }
}
