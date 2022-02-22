package TestCases;
import ObjectRepository.SearchTab;
import org.testng.annotations.Test;

public class ToVerifySearchTab extends SearchTab {
    @Test
    public void SearchedTab() throws Throwable {
           login();
          SearchedUser();
    }
}
