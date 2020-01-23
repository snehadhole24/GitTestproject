package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcass2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\h312276\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("snehadhole72@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("snehadhole72@gmail.com");

		driver.findElement(By.id("u_0_b")).click();

	}

}
