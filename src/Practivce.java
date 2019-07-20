import java.awt.List;
import java.io.File;
import java.io.IOException;
//import java.util.Iterator;
//import java.util.Set;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;

public class Practivce {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		File myfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(myfile,new File("C:\\Users\\Prabhu\\Downloads\\ScreenSHot.png"));


		
		
	

        
        
		
		
		

		By by1 = By.id("gf-BIG");
		WebElement footer = driver.findElement(by1);
			WebElement first = footer.findElement(By.xpath("//div[@id='gf-BIG']//td[1]"));
		System.out.println(first.findElements(By.tagName("a")).size());
		java.util.List<WebElement> mlinks = first.findElements(By.tagName("a"));
		//List<WebElement>  mlinks = first.findElements(By.tagName("a"));
		//Iterator<WebElement> i = mlinks.iterator();
		Actions a = new Actions(driver);
		a.sendKeys(Keys.END).build().perform();
		Thread.sleep(3000);
		for(WebElement mylink:mlinks){
			//a.contextClick(mylink).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
			mylink.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		}
		Set<String> childhandle = driver.getWindowHandles();
		
		String parentid = driver.getWindowHandle();
		for (String childid : childhandle){
			driver.switchTo().window(childid);
			DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
	        Date date = new Date();
	        String filename="Super_Selenium";

	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(scrFile, new File("C:\\Users\\Prabhu\\Downloads\\SS"+filename+"-"+dateFormat.format(date)+".png"));
	        Thread.sleep(3000);
			System.out.println(driver.getTitle());
			
			if(!childid.equalsIgnoreCase(parentid))
				driver.close();
		}
		
		
	}

}
