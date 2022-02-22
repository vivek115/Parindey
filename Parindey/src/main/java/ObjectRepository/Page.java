package ObjectRepository;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Page {
    public Page(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
}

