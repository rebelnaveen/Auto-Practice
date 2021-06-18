package com.AutomationPractice;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.AutomationPractice.BaseClassSelinium;
import com.AutomationPractice.LoginPage;

public class Mini_Pro_1 extends BaseClassSelinium{
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver=browserlaunch("Chrome");
		geturl("http://automationpractice.com/index.php");
		
		LoginPage lp = new LoginPage(driver);
		
		
		
		//driver.manage().window().maximize();

		//WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		//signIn.click();
		clickOnElement(lp.getSignin());
		
		Thread.sleep(5000);

		//WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		//email.sendKeys("rebel10@gmail.com");
		sendValues(lp.getEmail(), "rebel10@gmail.com");
		
		//WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
		//pass.sendKeys("3011130");
		sendValues(lp.getPass(), "3011130");
		
		//WebElement btn = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		//btn.click();
		clickOnElement(lp.getBtn());
		
		//WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		//women.click();
		clickOnElement(lp.getWomen());

		//WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		clickOnElement(lp.getTshirt());
		
		Thread.sleep(5000);
		
		//WebElement img = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		clickOnElement(lp.getImg());
	
		//WebElement frame = driver.findElement(By.xpath("//div[@class='primary_block row']"));
		clickOnElement(lp.getFrame());
		
		//WebElement frame1 = driver.findElement(By.xpath("//div[@class='box-info-product']"));
		clickOnElement(lp.getFrame1());
		
		Thread.sleep(5000);
		
//		WebElement frame3 = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
//		clickOnElement(frame3);
		
//		WebElement quantity = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
//		clickOnElement(quantity);
//		
//		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
//		Select s = new Select(size);
//		s.selectByValue("2");
//		
//		WebElement colour = driver.findElement(By.xpath("//a[@title='Blue']"));
//		clickOnElement(colour);
		
		//Thread.sleep(4000);
		
		//WebElement addcrt = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		clickOnElement(lp.getAddcrt());
		
		Thread.sleep(4000);
		
		screenshot("C:\\Users\\shiva\\eclipse-workspace\\AutomationPractice\\ScreenShot\\snap1.png");
		
		implicitwait(5);
		
		//WebElement prockt = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		clickOnElement(lp.getProcrt());
		
		//WebElement sumy = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		clickOnElement(lp.getSumy());
		
		//WebElement addrs = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickOnElement(lp.getAddrs());
		
		Thread.sleep(3000);
		
		//WebElement tser = driver.findElement(By.xpath("//input[@type='checkbox']"));
		clickOnElement(lp.getTser());
		
		Thread.sleep(3000);
		
		//WebElement ship = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		clickOnElement(lp.getShip());
		
		Thread.sleep(3000);
		
		//WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		clickOnElement(lp.getPayment());
		
		Thread.sleep(3000);
		
		//WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickOnElement(lp.getConfirm());
		
		screenshot("C:\\Users\\shiva\\eclipse-workspace\\AutomationPractice\\ScreenShot\\snap2.png");
		
		clickOnElement(lp.getBacktoorder());
		
		
	}



}
