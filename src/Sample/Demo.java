package Sample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class Demo {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.setBinary("C:\\Users\\User\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://engagetoelect.com/#home");
		
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		driver.findElement(By.xpath("//a[contains(text(), 'Contact us')]")).click();
		
		String str = driver.findElement(By.xpath("//h2[contains(text(), 'Get in Touch')]")).getText();
        System.out.println(str);
        
        JavascriptExecutor js = (JavascriptExecutor) driver; 
        js.executeScript("window.scrollBy(0,300)");
        
        driver.findElement(By.xpath("//input[@id='formFirstName']")).sendKeys("Shalini");
		
		driver.findElement(By.xpath("//input[@id='formEmail']")).sendKeys("shalini.srinivasa@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='formPhone']")).sendKeys("8885467893");
		driver.findElement(By.xpath("//textarea[@id='formMessages']")).sendKeys("I wish i could login this screen");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		driver.findElement(By.xpath("m-rose-600 to-rose-300  hover:from-black hover:to-gray-900']/preceding-sibling::div")).click();
		
	
		
//		//button[@class='py-2 px-6 rounded-md text-white bg-gradient-to-r from-rose-600 to-rose-300  hover:from-black hover:to-gray-900']
//		
//		
//		
//		//System.out.println("str");
//		
	String st3=	driver.findElement(By.xpath("//div[@id='successMessage2']")).getText();
	
	System.out.println(st3);
	
		//driver.quit();
		
		
		
		
		
		
		
		
		
	}
}
		
	
	
	
	