package fkpack;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Flipamazon {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\FAIZAN\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
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
         d.findElement(By.name("q")).sendKeys("REDMI Note 10 Pro (Dark Night,128GB)(6 GB RAM)"+Keys.ENTER);
         d.findElement(By.xpath("//div[@class=\"_4rR01T\"]")).click();
          WebElement k=d.findElement(By.xpath("//a/div[2]/div[2]/div/div/div"));
           String text=k.getText();
           System.out.println("price of mobile="+text);
           d.quit();
           System.setProperty("webdriver.gecko.driver","C:\\Users\\FAIZAN\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
  		 WebDriver d1=new FirefoxDriver();
  		 d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           d1.get("https://www.amazon.in/");
           d1.findElement(By.id("twotabsearchtextbox")).sendKeys("REDMI Note 10 Pro (Dark Night,128GB)(6 GB RAM)");
           d1.findElement(By.id("nav-search-submit-button")).click();
           d1.findElement(By.linkText("Redmi Note 10 Pro (Glacial Blue, 6GB RAM, 128GB Storage) -120hz Super Amoled Display|64MP with 5mp Super Tele- Macro | 33W Charger Included")).click();
           WebElement k1=d1.findElement(By.xpath("//tr[2]/td[2]/span/span[2]"));
           String text1=k1.getText();
           System.out.println("price of mobile="+text1);
           d.navigate().to("https://www.flipkart.com/");
           WebElement element=d.findElement(By.xpath("//a/div[2]/div[2]/div/div/div"));
           List<String> PageOneValue=new ArrayList<>();
           PageOneValue.add(element.getText());
           d.navigate().to("https://www.amazon.in/");
           WebElement element2=d.findElement(By.xpath("//tr[2]/td[2]/span/span[2]"));
           Assert.assertEquals(PageOneValue.get(0), element2.getText());
           

}
}
