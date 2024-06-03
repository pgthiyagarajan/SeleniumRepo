package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		String Leadid = driver.findElement(By.linkText("10284")).getText();
		driver.findElement(By.linkText("10284")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(Leadid);
		driver.findElement(By.id("ext-gen334")).click();
		String result = driver.findElement(By.className("x-paging-info")).getText();
		String expected_result = "No records to display";
		if(result == expected_result) {
			System.out.println(" This message confirms the successful deletion.");
		}
		else {
			System.out.println(" This message confirms the unsuccessful deletion.");
		}
		Thread.sleep(3000);
		driver.close();
	}

}
