package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		WebElement message = driver.findElement(By.className("ui-growl-title"));
		String received_message = message.getText();
		String expected_message = "Checked";
		if(received_message == expected_message) {
			System.out.println("Expected message is displayed");
		}
		else {
			System.out.println("Expected message is not displayed");
		}
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();
		driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]")).click();
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		received_message = message.getText();
		expected_message = "Checked";
		if(received_message == expected_message) {
			System.out.println("Expected message is displayed");
		}
		else {
			System.out.println("Expected message is not displayed");
		}
		WebElement one = driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[3]/div[1]/div[2]"));
		Select paris = new Select(one);
		paris.selectByVisibleText("Paris");
		WebElement two = driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[5]/div[1]/div[2]"));
		Select berlin = new Select(two);
		berlin.selectByVisibleText("Berlin");
	}
		
}
