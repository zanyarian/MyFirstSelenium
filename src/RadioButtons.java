import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/toolcustomforms.htm");
		WebElement radio1 = driver.findElement(By.xpath("//*[@value='outset' and @type='radio']"));
		radio1.click();
		
		List radiobt = driver.findElements(By.xpath("//*[@type='radio']"));
		driver.switchTo().alert().
		
	}

}
