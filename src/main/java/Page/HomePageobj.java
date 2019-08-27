package Page;

import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageobj extends BasePage {
	
	public HomePageobj(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Women']")
	public WebElement Women;
		
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	public WebElement Dresses;
	
	@FindBy(xpath = "//a[@title='T-shirts']")
	private WebElement shirts;

	@FindBy(xpath = "//*[@id='ul_layered_id_attribute_group_1']/li[2]" )
	public WebElement checkbox;
	
	@FindBy(xpath= "//input[@name='email']")
	public WebElement Mailid;
	
	@FindBy(xpath = "//button[@name='submitNewsletter']")
	public WebElement Button;
	
	@FindBy(xpath ="//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")
    private WebElement ProductOne;
	
	@FindBy(xpath = "//*[@class='heading-counter']")
	private WebElement txtProductHeaderCount;

	@FindBys(@FindBy(xpath = "//*[@class='product_list grid row']/li"))
	private List<WebElement> firstProduct;
	
	
	
	
	
	
	public WebElement getTxtProductHeaderCount() {
		return txtProductHeaderCount;
	}


	public List<WebElement> getFirstProduct() {
		return firstProduct;
	}


	public WebElement getProductOne() {
		return ProductOne;
	}


	public WebElement getMailid() {
	Mailid.click();
		return Mailid;
	}


	public WebElement getButton() {
		Button.click();
		return Button;
	}


	public WebElement getShirts() {
		return shirts;
	}


	public WebElement getCheckbox() {
		return checkbox;
	}

	
	//public void HomePageObjects() {
		//PageFactory.initElements(driver, this);
	
	
	public WebElement getWomen() {
		return Women;
	}
	

	public WebElement getDresses() {
	//	Dresses.click();   
	return Dresses;
	
	}


	
}

