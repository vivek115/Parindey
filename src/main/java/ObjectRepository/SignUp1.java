package ObjectRepository;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class SignUp1 extends BasePage{
        public AndroidDriver<AndroidElement> driver;
        @FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Adeventure']")
        public AndroidElement RemoveInterest;
        @FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Photography']")
        public AndroidElement SelectNewInterest;
        @FindBy(how = How.XPATH, using = "//android.widget.EditText[@text='What is your Name?']")
        public AndroidElement EnterName;
        @FindBy(how = How.XPATH, using = "//android.widget.ImageButton[@index=2]")
        public AndroidElement ClickOnRightButton;
        @FindBy(how = How.XPATH, using = "//android.widget.EditText[@text='When were you born?']")
        public AndroidElement EnterBornPlace;
        @FindBy(how = How.XPATH, using = "//android.widget.ImageButton[@index=2]")
        public AndroidElement SelectDateOfBirth;
        @FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='#100 Bed and Breakfast']")
        public AndroidElement EnterLocation;
        @FindBy(how = How.XPATH, using = "//android.widget.ImageButton[@resource-id='com.travelpartner.parindey:id/navigation_chat']")
        public AndroidElement ClickOnPlusTab;
        @FindBy(how = How.XPATH, using = "//android.widget.Button[@text='LOGIN WITH GOOGLE']")
        public AndroidElement ClickOnLoginWithGoogle;
        @FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='vivekjoshi840@gmail.com']")
        public AndroidElement SelectGmailAccount;
        @FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Languages You Love']")
        public AndroidElement VerifyHomeScreen;
        @FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Your Interests']")
        public AndroidElement VerifyYourInterestScreen;
        @FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Awesome!']")
        public AndroidElement VerifyTellUsAboutYourselfScreen;
        @FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Parindey']")
        public AndroidElement VerifyDashboardScreen;

        @Test
        public void SignUp() throws MalformedURLException, InterruptedException {
            driver = Capabilities();
            driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
            String ActualTitle = VerifyHomeScreen.getText();
            String ExpectedTitle = "Languages You Love";
            Assert.assertEquals(ActualTitle, ExpectedTitle, "Homepage  is not verified");
            Actions actions = new Actions(driver);
            driver = Capabilities();
            driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
            String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"NEXT\").instance(0))";
            driver.findElementByAndroidUIAutomator(scrollElement).click();
            String ActualTitle1 = VerifyYourInterestScreen.getText();
             String ExpectedTitle1 = "Your Interests";
            Assert.assertEquals(ActualTitle, ExpectedTitle, "InterestScreen is not verified");
            RemoveInterest.click();
            SelectNewInterest.click();
            String scrollElement1 = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"NEXT\").instance(0))";
            driver.findElementByAndroidUIAutomator(scrollElement1).click();
            String ActualTitle2 = VerifyTellUsAboutYourselfScreen.getText();
            String ExpectedTitle2 = "Awesome!";
            Assert.assertEquals(ActualTitle, ExpectedTitle, "TellUsAboutYourselfScreen is not verified");
            EnterName.click();
            actions.sendKeys("vicky").build().perform();
            ClickOnRightButton.click();
            EnterBornPlace.click();
            actions.sendKeys("prithi").build().perform();
            SelectDateOfBirth.click();
            Thread.sleep(3000);
            AndroidElement ClickOnLocation = driver.findElement(By.id("com.travelpartner.parindey:id/inputLocation"));
            ClickOnLocation.click();
            EnterLocation.click();
            String clickOnDone = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"DONE\").instance(0))";
            driver.findElementByAndroidUIAutomator(clickOnDone).click();
            String ActualTitle3 = VerifyDashboardScreen.getText();
            String ExpectedTitle3 = "Parindey";
            Assert.assertEquals(ActualTitle, ExpectedTitle, "DashboardScreen is not verified");
            ClickOnPlusTab.click();
            ClickOnLoginWithGoogle.click();
            SelectGmailAccount.click();
        }
    }

