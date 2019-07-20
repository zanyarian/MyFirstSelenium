import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class framess {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/table.html");
		System.out.println(driver.findElements(By.tagName("tr")).size());
		int size = driver.findElements(By.tagName("tr")).size();
		List <WebElement> rows = driver.findElements(By.tagName("tr"));
		
		for( int i =0;i<size;i++){
			WebElement currentrow = rows.get(i);
			int currentsize = currentrow.findElements(By.tagName("td")).size();
			System.out.println("Number of Rows in ROW: "+(i+1)+" is "+currentsize);
			List<WebElement> number = currentrow.findElements(By.tagName("td"));
			int j=1;
			for(WebElement digit : number){
				System.out.println("Cell Value of Row "+(i+1)+" and column number "+j+" i "+digit.getText());
				j++;
			}
			


			
		}
		
		
	}

}
