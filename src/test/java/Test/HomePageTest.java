package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Page.BasePage;
import Page.HomePageobj;

public class HomePageTest {

	
	HomePageobj homePage;
	BasePage bp;
 	//private JavascriptExecutor driver;

	public HomePageTest() {
		homePage = new HomePageobj();
		bp = new BasePage();
	}
/*@Test
public void verifyWomen() throws Throwable {
	Assert.assertTrue(homePage.getWomen().isDisplayed());
	//Assert.assertTrue(bp.elementFound(homePage.getDresses()));
   homePage.Women.click();*/

   
   
    


/*@Test
   public void verifycheckbox() {
//Assert.assertTrue(bp.elementFound(homePage.getcheckbox()));
Assert.assertTrue(homePage.getCheckbox().isDisplayed());
homePage.checkbox.click();
}*/




/*@Test
public void verifyDresses() {
	//Assert.assertTrue(bp.elementFound(homePage.getDresses()));
	Assert.assertTrue(homePage.getDresses().isDisplayed());
	  //Assert.assertTrue(homePage.getDresses().isDisplayed());
//homePage.Dresses.click();

}*/

/*@Test 
public void verifyWomen () {
Assert.assertTrue(bp.elementFound(homePage.getWomen()));
homePage.Women.click();
Assert.assertEquals(bp.getTitlte(), "Women - My Store");
System.out.println("All Sucesses");

}*/


@Test 
public void verifyMailid () {
Assert.assertTrue(bp.elementFound(homePage.getMailid()));
homePage.Mailid.click();
homePage.Mailid.sendKeys("kumaran14.02@gmail.com");
homePage.Button.click();


}
}
	
	
	
	
	
	
	
	