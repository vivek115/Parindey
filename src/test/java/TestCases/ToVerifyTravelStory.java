package TestCases;
import ObjectRepository.AddStory;
import ObjectRepository.SignUp2;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
public class ToVerifyTravelStory {
    @Test
    public void SignUp() throws Throwable {
        SignUp2 obj = new SignUp2();
        obj.login();
    }
    @Test(dependsOnMethods = "SignUp")
    public void TravelStory() throws MalformedURLException, InterruptedException {
        AddStory obj = new AddStory();
        obj.ClickOnAddTab();
    }
}
