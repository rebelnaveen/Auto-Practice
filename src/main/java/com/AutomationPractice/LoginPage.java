package com.AutomationPractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
public static WebDriver driver;

	@FindBy(xpath="//a[@class='login']")
	private WebElement signin;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement pass;
	
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private WebElement btn;
	
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement tshirt;
	
	@FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement img;
	
	@FindBy(xpath = "//div[@class='primary_block row']")
	private WebElement frame;
	
	@FindBy(xpath = "//div[@class='box-info-product']")
	private WebElement frame1;
	
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement addcrt;
	
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	private WebElement procrt;
	
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement sumy;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement addrs;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement tser;
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement ship;
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement payment;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement confirm;
	
	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement backtoorder;
	
	
	
	public WebElement getBacktoorder() {
		return backtoorder;
	}



	public LoginPage(WebDriver driver2) {
	this.driver=driver2;
	
	PageFactory.initElements(driver2, this);
	}



	public static WebDriver getDriver() {
		return driver;
	}



	public WebElement getSignin() {
		return signin;
	}



	public WebElement getEmail() {
		return email;
	}



	public WebElement getPass() {
		return pass;
	}



	public WebElement getBtn() {
		return btn;
	}



	public WebElement getWomen() {
		return women;
	}



	public WebElement getTshirt() {
		return tshirt;
	}



	public WebElement getImg() {
		return img;
	}



	public WebElement getFrame() {
		return frame;
	}



	public WebElement getFrame1() {
		return frame1;
	}



	public WebElement getAddcrt() {
		return addcrt;
	}



	public WebElement getProcrt() {
		return procrt;
	}



	public WebElement getSumy() {
		return sumy;
	}



	public WebElement getAddrs() {
		return addrs;
	}



	public WebElement getTser() {
		return tser;
	}



	public WebElement getShip() {
		return ship;
	}



	public WebElement getPayment() {
		return payment;
	}



	public WebElement getConfirm() {
		return confirm;
	}



	
}
