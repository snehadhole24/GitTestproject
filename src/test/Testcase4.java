package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\h312276\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/newtours/login.php");
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("sneha.dhole@honeywell.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("sneha123");
		driver.findElement(By.xpath("//*[@name='submit']")).click();

		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText());
		
		/*driver.findElement(By.linkText("REGISTER")).click();

		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Sneha");
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Dhole");
		driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("9881177053");

		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("sneha.dhole@honeywell.com");

		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("Hadapsar Pune");
		driver.findElement(By.xpath("//*[@name='city']")).sendKeys("Pune");

		driver.findElement(By.xpath("//*[@name='state']")).sendKeys("Maharashtra");

		driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys("411013");

		Select dcountry = new Select(driver.findElement(By.xpath("//*[@name='country']")));

		dcountry.selectByValue("INDIA");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("sneha.dhole@honeywell.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("sneha123");
		driver.findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys("sneha123");
		driver.findElement(By.xpath("//*[@name='submit']")).click();*/
	}

}
