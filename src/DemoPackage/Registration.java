package DemoPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

String emailAddress = "msiraj123sksd@gmail.com";
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		options.addArguments("--incognito");
		//options.addArguments("--ignore-certificate-errors");
       // options.addArguments("--disable-popup-blocking");
		WebDriver driver = new ChromeDriver(options);
	
		//driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=common/home");
		
		//*[@id="top-links"]/ul/li[2]/a
		WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
		myAccount.click();
		WebElement register = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
		register.click();
		
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
		firstName.sendKeys("Siraj");
		
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
		lastName.sendKeys("Munir");
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		email.sendKeys(emailAddress);
		
		WebElement phone = driver.findElement(By.xpath("//*[@id=\"input-telephone\"]"));
		phone.sendKeys("03221234567");
		
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		password.sendKeys("siraj123");
		
		WebElement Cpassword = driver.findElement(By.xpath("//*[@id=\"input-confirm\"]"));
		Cpassword.sendKeys("siraj123");
		
		
		WebElement privacy = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
		privacy.click();
		
		WebElement continue1 = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
		continue1.click();
		
		WebElement continue2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a"));
		continue2.click();
		
		WebElement myAccountlogout = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
		myAccountlogout.click();
		
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"));
		logout.click();
		
		Thread.sleep(1000);
		WebElement myAccountlogin = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
		myAccountlogin.click();
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		login.click();
		

		WebElement username;
		WebElement loginpassword;
		WebElement loginButton;
		
		username = driver.findElement(By.id("input-email"));
		username = driver.findElement(By.name("email"));
		username.sendKeys(emailAddress);
		
		loginpassword = driver.findElement(By.id("input-password"));
		loginpassword.sendKeys("siraj123");
		
		  
		loginButton = driver.findElement(By.xpath("//input[@type='submit' and @class='btn btn-primary']"));
		loginButton.click();
		
		
	
		
		

	}

}
