package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Thiyagarajan");
		driver.findElement(By.name("lastname")).sendKeys("P G");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.id("password_step_input")).sendKeys("Thiyagu@123");
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select option1 = new Select(day);
		option1.selectByVisibleText("21");
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select option2 = new Select(month);
		option2.selectByVisibleText("Jun");
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select option3 = new Select(year);
		option3.selectByVisibleText("2002");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
	}

}