package TestCases;
import ObjectRepository.SignUp;
import org.testng.annotations.Test;
public class ToVerifySignUp {
    @Test
public void SignUp() throws Throwable {
       SignUp obj = new SignUp();
       obj.login();
   }
}
