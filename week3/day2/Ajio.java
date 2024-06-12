package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Ajio {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.tagName("input")).sendKeys("bags");
		driver.findElement(By.className("ic-search")).click();
		driver.findElement(By.xpath("(//label[contains(@class,'facet-linkname facet-linkname-genderfilter')])[2]")).click();
		driver.findElement(By.xpath("(//label[contains(@class,'facet-linkname facet-linkname-l1l3nestedcategory')])[2]")).click();
		
		WebElement items = driver.findElement(By.xpath("//div[@id='products']/div[3]/div[1]/div[1]/strong[1]"));
		String count = items.getText();
		System.out.println("The number of items found in the page are "+count);
		
		List<WebElement> brands = driver.findElements(By.className("facet-body"));
		int brandcount = brands.size();
		System.out.println("Number of brands are "+brandcount);
		for(int i=0;i<brandcount;i++) {
			String text = brands.get(i).getText();
			System.out.println(text);
		}
		
		

	}

}
