import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,20);
		
		
		driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[class='k-icon k-i-calendar']")).click();
		Thread.sleep(1000);
		WebElement top=driver.findElement(By.xpath("//a[contains(@class,'k-link k-nav-fast')]"));
		Thread.sleep(1000);
		top.click();
		Thread.sleep(1000);
		top.click();
		Thread.sleep(1000);int year=11;
		year=Integer.parseInt(top.getText().substring(0, 4));
		while (year>1988){
			driver.findElement(By.xpath("//a[contains(@class,'k-link k-nav-prev')]")).click();
			year=Integer.parseInt(top.getText().substring(0, 4));

		}
		List<WebElement> mylist = driver.findElements(By.xpath("//table[contains(@class,'k-content k-meta-view k-decade')] //a[@class='k-link']"));
		System.out.println("Year: "+mylist.size());

		Iterator<WebElement> it = mylist.iterator();
		int byear = Integer.parseInt(it.next().getText());
				int i=0;
		while(it.hasNext() ){
			
			if (byear ==1988)
				mylist.get(i).click();
			else
				i++;
			byear = Integer.parseInt(it.next().getText());
			
			}
		Thread.sleep(3000);
		WebElement mar = driver.findElement(By.xpath("//a[text='Mar']"));
		mar.click();
		Thread.sleep(2000);
		WebElement date=driver.findElement(By.xpath("//a[@data-value='1988/2/23']"));
		date.click();
}}
	
	/*
	List<WebElement> listmonth = driver.findElements(By.xpath("//div[contains(@class,'k-calendar-view')]   //a[@class='k-link']"));
	System.out.println("Month: "+listmonth.size());

	it = listmonth.iterator();
	String months = "";
	 i=0;
	while (it.hasNext()){
		months = it.next().getText();
		if(months.equalsIgnoreCase("Mar"))
			listmonth.get(i).click();
		else
			i++;			
			}


List <WebElement> datel = driver.findElements(By.xpath("//table[contains(@class,'k-content k-month')]//a[@class='k-link']"));
it = datel.iterator();
int dates = 0;
 i=0;
while (it.hasNext()){
	dates = Integer.parseInt(it.next().getText());
	if(dates==23)
		datel.get(i).click();
	else
		i++;			
		}

}*/
	

	/*driver.get("https://www.spicejet.com/");
	driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
	String today = 	driver.findElement(By.cssSelector("#view_fulldate_id_1")).getText();
	System.out.println("Today: "+today);
	driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
//	driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();
	WebElement nextbt = driver.findElement(By.cssSelector("[class='ui-icon ui-icon-circle-triangle-e']"));
	String title= driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-last'] // *[@class='ui-datepicker-title']")).getText();
	System.out.println("Today: "+title);
	Thread.sleep(2000);

	while (!title.contains("October")){
		title = driver.findElement(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-last'] // *[@class='ui-datepicker-title']")).getText();

		nextbt.click();
	}
	*/
