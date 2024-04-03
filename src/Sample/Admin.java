package Sample;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		
		co.setBinary("C:\\Users\\User\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://admin.engagetoelect.com/login");
		
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
		
		String s1 =driver.findElement(By.xpath("//h2[contains(text(), 'Sign In')]")).getText();
		
		System.out.println(s1);
		
		//login
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vishnutest60@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[@id='login_btn']")).click();
		
		
//		//Dashboard-citizen
//	
//		driver.findElement(By.xpath("//h2[contains(text(), 'General Report')]")).isDisplayed();
//	
//		//driver.findElement(By.xpath("//div[@class='dropdown-toggle notification notification--bullet cursor-pointer']")).click();	
//		driver.findElement(By.xpath("//h2[contains(text(), 'REVENUE')]")).isDisplayed();
//		
//		driver.findElement(By.xpath("//h2[contains(text(), 'Visitors')]")).isDisplayed();
//		
//	
//		driver.findElement(By.xpath("//h2[contains(text(), 'Users By Age')]")).isDisplayed();
//		
//		driver.findElement(By.xpath("//h2[contains(text(), 'New Users')]")).isDisplayed();
//		
//		driver.findElement(By.xpath("//a[@class='intro-x w-full block text-center rounded-md py-3 border border-dotted border-slate-400 dark:border-darkmode-300 text-slate-500']")).click();
//		
//		System.out.println(driver.getCurrentUrl());
//		
//		
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//div[@class='side-menu__sub-icon transform rotate-180']")).click();
		
		
		driver.findElement(By.xpath("//div[contains(text(), 'Posts')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(), 'Master Data')]")).click();
				
		//driver.quit();
		
		
		
		

	}

}
