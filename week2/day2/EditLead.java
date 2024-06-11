package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Testing Company");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Testing");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Company");
		driver.findElement(By.xpath("//span[text()='First Name (Local)']/following::input")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("test");
		driver.findElement(By.name("description")).sendKeys("This is a testing company");
		driver.findElement(By.name("primaryEmail")).sendKeys("test@gmail.com");
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select st = new Select(state);
		st.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).sendKeys("");
		driver.findElement(By.name("importantNote")).sendKeys("This has been edited");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title = driver.getTitle();
		System.out.println("The page title for the edited lead is '"+title+"'");
	}

}
