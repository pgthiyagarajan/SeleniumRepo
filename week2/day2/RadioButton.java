package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']")).click();
		driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']")).click();
		driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']")).click();
		WebElement safari = driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']"));
		System.out.println("The button '"+safari.getText()+"' is selected by default");
		WebElement age = driver.findElement(By.xpath("//label[@for='j_idt87:age:1']"));
		System.out.println("The button '"+age.getText()+"' is selected by default");

	}

}
