import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class First {
	
	public static void main(String args[]) throws IOException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qaclickacademy.com/practice.php#");
		List <WebElement> l = driver.findElements(By.tagName("a"));
		for(WebElement k : l) {
			
			String url = k.getAttribute("href");
			if(url.contentEquals("") ){
				System.out.println("Emoty");
				continue;
			}
			URL murl = new URL(url);
			HttpURLConnection huc = ( HttpURLConnection)murl.openConnection();
			huc.connect();
			int code = huc.getResponseCode();
			if(code>=400)
				System.out.println("Broken");
			else
				System.out.println("Working");


				
			
		}
	


		
		
			}
	}
	
	
	
	


