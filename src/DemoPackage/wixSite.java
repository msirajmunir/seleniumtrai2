package DemoPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class wixSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		//options.addArguments("--incognito");
		//options.addArguments("--ignore-certificate-errors");
       // options.addArguments("--disable-popup-blocking");
		WebDriver driver = new ChromeDriver(options);
	
		//driver.manage().window().maximize();
		driver.get("https://qatestid12.wixsite.com/qaspecialist");
		
		WebElement name;
		WebElement email;
		WebElement password;
		WebElement loginButton;
		
		//WebElement contactButton;
		
	 driver.findElement(By.id("comp-ifgtula74label")).click();
	 System.out.println("Contact button clicked!! ");
	 
	
	 
	 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		name = driver.findElement(By.xpath("//*[@id='comp-jhrgftz1input']"));
		name.sendKeys("Siraj Munir");
		 System.out.println("Name enterred!! ");
		
	//	comp-jhrgftz1input
		 	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.close();
			//driver.quit();
		
		
		

	}

}
