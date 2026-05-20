package practiceDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoPractice1 implements DemoInterface {
	
	WebDriver driver;
	boolean status;
	
	
	
	@BeforeTest
	
	void launchbrowser() {
		driver= new ChromeDriver();
		driver.navigate().to(baseurl);
		driver.manage().window().maximize();
		
		
		
	}
	
	@Test
	void VerifivisibiltyOfPage() {
		
		status=	driver.getPageSource().contains("Features Items");
		
		if(status==true)
		{
			System.out.println("Pass");
			
		}
		
		else{
			System.out.println("Fail");
			
		}
	}
	 
	@Test
	void clickOnLogin() {
		driver.findElement(By.linkText("Signup / Login")).click();
		
	}

}
