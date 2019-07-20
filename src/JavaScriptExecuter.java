import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecuter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
        //Creating the JavascriptExecutor interface object by Type casting		
		driver.get("https://ksrtc.in/");
		WebElement from1 = driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
		from1.click();
				Actions a = new Actions(driver);
		from1.sendKeys("BEN");
		Thread.sleep(2000);
		from1.sendKeys(Keys.DOWN);
		System.out.println(from1.getText());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String code = "return document.getElementById(\"fromPlaceName\").value;";
		String place = (String)js.executeScript(code);
		System.out.println(place);
			
		

	}

}
