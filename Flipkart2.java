package fkpack;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart2 {
	
static {
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\FAIZAN\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		
				 WebDriver d=new FirefoxDriver();
				 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 d.get("https://www.flipkart.com/");
				 d.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("7720957830");
			     d.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("1234");
	             Thread.sleep(2000);
	             WebDriverWait wait=new WebDriverWait(d,5000);
	             wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")));
	             d.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
	             wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
	             d.findElement(By.name("q")).sendKeys("iphone"+Keys.ENTER);
	             d.findElement(By.xpath("//div[@class=\"_4rR01T\"]")).click();
	             WebElement k=d.findElement(By.xpath("//a/div[2]/div[2]/div/div/div"));
	     		 String text=k.getText();
	     		 System.out.println("price of mobile="+text);
	             d.findElement(By.id("pincodeInputId")).sendKeys("444001");
	    		 Set<String> h=d.getWindowHandles();
	    		 System.out.println();
	    		 
	    		 for(String String :h)
	    		 {
	    			 d.switchTo().window(String);
	    		 }
	    		
	    		 
	    		 d.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
	    			Thread.sleep(2000);
	    			d.quit();
	
	
	}
	

}
