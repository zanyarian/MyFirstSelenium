import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String mysting = (String) js.executeScript("return document.getElementById(\"innings_1\").value");
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20269/nz-vs-pak-match-33-icc-cricket-world-cup-2019");
		WebElement first = driver.findElement(By.xpath("//*[@id='innings_1']/div[1]"));
		System.out.println(first.findElements(By.xpath("//*[@id='innings_1']/div[1]/*[@class='cb-col cb-col-100 cb-scrd-itms']/*[@class='cb-col cb-col-8 text-right text-bold']")).size());
		List<WebElement> myitems = first.findElements(By.xpath("//*[@id='innings_1']/div[1]/*[@class='cb-col cb-col-100 cb-scrd-itms']/*[@class='cb-col cb-col-8 text-right text-bold']"));
		int sum=0;
		for (WebElement run: myitems){
			sum+=Integer.parseInt(run.getText());
		}
		System.out.println(sum);

	}

}
