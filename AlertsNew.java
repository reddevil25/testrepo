package mypackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsNew {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.way2automation.com/way2auto_jquery/alert.php#load_box");
		driver.manage().window().maximize();


		driver.findElement(By.xpath("//a[normalize-space()='Input Alert']")).click();
	  /*  WebElement frame=driver.findElement(By.xpath("//div[@id='example-1-tab-1']//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame); */
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@src='alert/input-alert.html']"));
		driver.switchTo().frame(frame);
		
		
		
	/*	driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept(); */
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		Alert ale = driver.switchTo().alert();
		System.out.println(ale.getText());
		ale.sendKeys("Hey");
		ale.accept();
	
		
	}

}
