package ObjectRepository;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BasePage {
    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException, InterruptedException {
        File appDir = new File("C://Users//VivekJoshi//IdeaProjects//Dandy//Parindey//src//main//java//ObjectRepository");
        File app = new File(appDir, "com.travelpartner.parindey-1.9996-free-www.kekaku.com.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung A31");
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        //cap.setCapability("unicodeKeyboard", "true");
        cap.setCapability("resetKeyboard", "true");
        cap.setCapability("autoGrantPermissions", "true");
        cap.setCapability("automationName", "UiAutomator2");

        cap.setCapability("autoGrantPermissions", "true");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        return driver;
    }
    public AndroidDriver<AndroidElement> driver;
    }




