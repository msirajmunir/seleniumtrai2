package DemoPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		options.addArguments("--incognito");
		//options.addArguments("--ignore-certificate-errors");
       // options.addArguments("--disable-popup-blocking");
		WebDriver driver = new ChromeDriver(options);
	
		//driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		
		WebElement username;
		WebElement password;
		WebElement loginButton;
		WebElement search;
		WebElement searchButton;
		
		
		username = driver.findElement(By.id("input-email"));
		username = driver.findElement(By.name("email"));
		username.sendKeys("xirajmunir@gmail.com");
		
		password = driver.findElement(By.id("input-password"));
		password.sendKeys("siraj123");
		
		  
		loginButton = driver.findElement(By.xpath("//input[@type='submit' and @class='btn btn-primary']"));
		loginButton.click();
		
		String actualpagetitle = "";
		String expectedTitle = "My Account";
		actualpagetitle  = driver.getTitle();
	
		System.out.println(actualpagetitle);
		
		if (actualpagetitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
		
		String url = "";
		url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (actualpagetitle.contains("Account")) {
			System.out.println("URL Test Passed");
		} else {
			System.out.println("URL Test Failed");
		}
		
		search = driver.findElement(By.xpath("//input [@type = 'text']"));
		search.sendKeys("HP LP3065");
		searchButton = driver.findElement(By.xpath("//span [@class = \"input-group-btn\"] //button [@class = \"btn btn-default btn-lg\"]"));
		searchButton.click();
		System.out.println("Search Button Clicked");
		

			WebElement openfilter  = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]"));
					
				    JavascriptExecutor jse = (JavascriptExecutor)driver;
					jse.executeScript("arguments[0].scrollIntoView()", openfilter);
					
					Thread.sleep(2000);
					
				    openfilter.click(); 
				    
				    Thread.sleep(2000); 
				    WebElement openProduct  = driver.findElement(By.xpath("//button[@id=\"button-cart\" and @class = \"btn btn-primary btn-lg btn-block\"]"));
								
				    JavascriptExecutor jse1 = (JavascriptExecutor)driver;
					jse1.executeScript("arguments[0].scrollIntoView()", openProduct);
					
					Thread.sleep(2000); 
					
				    openProduct.click(); 
				    System.out.println("Product Added to Cart! ");
				    
				    Thread.sleep(2000);
				    WebElement openCart  = driver.findElement(By.xpath("//*[@id=\"cart\"]/button"));
				    openCart.click();
				    
				    Thread.sleep(2000);
				    WebElement checkOut  = driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong"));
				    checkOut.click();
				    
				    Thread.sleep(2000);
				    WebElement paymentAddress  = driver.findElement(By.xpath(" //*[@id=\"button-payment-address\"]"));
				    paymentAddress.click();
				    
				    Thread.sleep(4000);
				    WebElement shipAddress  = driver.findElement(By.xpath("//*[@id=\"button-shipping-address\"]"));
				    shipAddress.click();	
				    
				    Thread.sleep(4000);
				    WebElement step4  = driver.findElement(By.xpath("//*[@id=\"button-shipping-method\"]"));
				    step4.click();
				    
				    Thread.sleep(4000);
				    WebElement step5_01  = driver.findElement(By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]"));
				    step5_01.click();
				    
				    Thread.sleep(1000);
				    WebElement step5_02  = driver.findElement(By.xpath("//*[@id=\"button-payment-method\"]"));
				    step5_02.click();
				    
				    Thread.sleep(4000);
				    WebElement step6  = driver.findElement(By.xpath("//*[@id=\"button-confirm\"]"));
				    step6.click();
				    System.out.println("Order Proceeded");
				    
				    
				    Thread.sleep(4000);
				  String pagetitle = "";
				String expectedTitle1 = "Your order has been placed!";
				pagetitle  = driver.getTitle();
	
				System.out.println(pagetitle);
		
				if(pagetitle.contentEquals(expectedTitle1)){
            	System.out.println("Test Passed!");
        	} else {
            System.out.println("Test Failed");
        }
				 
			 

	
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.close();
		//driver.quit();
		
		
	}

}
