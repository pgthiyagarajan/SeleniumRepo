package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		WebElement message = driver.findElement(By.className("ui-growl-title"));
		String received_message = message.getText();
		if(received_message.equals("Checked")) {
			System.out.println("Expected message is displayed");
		}
		else {
			System.out.println("Expected message is not displayed");
		}
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();
		driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]")).click();
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		received_message = message.getText();
		if(received_message.equals("Checked")) {
			System.out.println("Expected message is displayed");
		}
		else {
			System.out.println("Expected message is not displayed");
		}
		driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple-container ui-widget')]")).click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		Thread.sleep(1000);
		driver.close();
	}
		
}
