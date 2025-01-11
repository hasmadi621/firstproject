package mytestcaseSsucelap;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverFinder;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MaintestCases {
	
	private static final String priority = null;

	WebDriver driver = new ChromeDriver();
	
	String mywebsite ="https://www.saucedemo.com";
	
	String usernameinput = "standard_user";
			
	String passwordinput = "secret_sauce";

	private int i;

	private int z;
			
	@BeforeTest
	
	public void MySetup() {
		
		driver.get(mywebsite);
		
		driver.manage().window().maximize();

	}
	@Test
	public void Login() {
		//driver.findElement(By.id("user-name")).sendKeys(usernameinput);
		WebElement userrname = driver.findElement(By.id("user-name"));
		WebElement loginbutton= driver.findElement(By.id("login-button"));
		WebElement password = driver.findElement(By.id("password"));

		
		
 userrname.sendKeys(usernameinput);
password.sendKeys(passwordinput);
loginbutton.click();

			
		}
	@Test(priority =2,enabled=false)
	public void AddAllItems() {
		
		
		//System.out.println( driver.findElements(By.className("btn")).get(0).getText());
		
		List<WebElement> AddToCartButtons= driver.findElements(By.className("btn"));
		
		for (int k =1; k<AddToCartButtons.size(); k=k+2){
			AddToCartButtons.get(k).click(); 

		}
		
			}
		
	@Test(priority=2)
	public void AddCertainNumberOfItems() {
		List<WebElement>	AddToCartButton = driver.findElements(By.className("btn"));

		for(int z=0; z<AddToCartButton.size();z++){
			if (z==2&&z==0) {
				continue;

			}

			

			AddToCartButton.get(z).click();


	
	}
		
		
	}}
		





	
	
	
		


