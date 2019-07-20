import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cleartrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("//*[text()='Help']")).click();
		driver.findElement(By.xpath("//*[text()='Privacy']")).click();
		driver.findElement(By.xpath("//*[text()='Terms']")).click();	
		Set <String> child = driver.getWindowHandles();
		//String parentid = driver.getWindowHandle();
		Iterator <String>it = child.iterator();
		String parentid= it.next();
		System.out.println(driver.getTitle());
		String childid;
		while(it.hasNext()){
			childid= it.next();
			driver.switchTo().window(childid);
			System.out.println(driver.getTitle());
			driver.close();
		}	
		
		
		
		
	}

}
