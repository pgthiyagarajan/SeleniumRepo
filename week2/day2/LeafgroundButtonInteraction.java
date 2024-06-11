package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		String title = driver.getTitle();
		if(title.equals("Dashboard")) {
			System.out.println("The title has been verified");
		}
		else {
			System.out.println("The title has not been verified");
		}
		driver.navigate().back();
		WebElement button = driver.findElement(By.xpath("(//div[@class='card'])[2]"));
		if(button.isDisplayed())
		{
			System.out.println("The button is not disabled");
		}
		else {
			System.out.println("The button is disabled");
		}
		WebElement buttonposition = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"));
		System.out.println("The position of the submit button is '"+buttonposition.getLocation()+"'");
		WebElement savebutton =driver.findElement(By.xpath("//span[text()='Save']"));
		System.out.println("The color of the save button is '"+savebutton.getCssValue("color")+"'");
		WebElement buttonhw = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		System.out.println("The height and width of the submit button is '"+buttonhw.getSize()+"'");
		driver.close();
	}

}
