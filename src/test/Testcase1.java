package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcase1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\h312276\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
 
        driver.get("http://ie67dtgw1rfd2.global.ds.honeywell.com:90/Account/Login?ReturnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fscope%3Dopenid%2520profile%2520offline_access%26response_type%3Dcode%26client_id%3DCompass%26redirect_uri%3Dhttp%253A%252F%252Fie67dtgw1rfd2.global.ds.honeywell.com%253A90%252Fsignin-oidc%26state%3DcwfkbL5qSuNlENEO3GtIcIgfOip22yLvFzbSTFUka0j9TKjbLx6nyxS3JJV2f5TcoMA1nVSKsOJqQfqOvODJ3DxHVW2L0j0XwcJYR1aBYP6AH8l89u2YhLgt1WZEoCfiVHFSQcLBrL8UYPrFoG7qwKX6wVK4luXCQACbPRUZdnPN8uivnVFcygzyfNlh7qJYNSFrOAIIrs0XomXfmulSvinokMzYmSI0fPdDftKg2cX25EGMky5nGFIgkIXmY4831X8GTWhOU7AyToJBHcvH8UVs4YWmNE5V1LUeZq1LMlmuyD5RwIrdCpwl8ZhjXhkSqH2NKzeNXNByGAZ9H5UQsY5OCngHAu%26nonce%3Dj0MBDD1xralYZ3GnDWO6mANubIRNfIOfrxloxyLMS9wNPcUAtAiB74Q1QZTQMTLCOESNVuMvuv9Zl3zgBqIm8ZVGHpi114nj1imjgOirweD7zwbyAi6EGRpHlB3C4wzPLp");
	   
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys("passpass");
         driver.findElement(By.xpath("//*[@type='text']")).sendKeys("pass");
         //driver.findElement(By.xpath("//*[@value='LOG IN']")).click();
         
        WebDriverWait wait = new WebDriverWait(driver,30);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@value='LOG IN']"))).click();
         
         
         
       
}
}

