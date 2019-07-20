import java.awt.List;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alerts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,20);
		driver.get("http://demo.guru99.com/popup.php");
		String mainwin = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[text()='Click Here']")).click();
		Set<String> winhan = driver.getWindowHandles();
		Iterator<String> it = winhan.iterator();
		while(it.hasNext())
		{
			String current = it.next();
			System.out.println(current);
			if(!current.equalsIgnoreCase(mainwin)){
				driver.switchTo().window(current);

				driver.findElement(By.name("emailid")).sendKeys("okie@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				driver.close();
			}
		}
	}
}
