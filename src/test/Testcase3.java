package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\h312276\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.findElement(By.xpath("//a[@data-nav-role='signin']")).click();

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("snehadhole72@gmail.com");

		driver.findElement(By.id("continue")).click();
		
		
	}

}