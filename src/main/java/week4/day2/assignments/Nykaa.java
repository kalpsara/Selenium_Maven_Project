package week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/sarengaraj/Saravanakumar/Kalpana/TestLeaf/chromedriver");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement brandMenu = driver.findElement(By.xpath("//header//a[contains(text(),'brands')]"));

		Actions actions = new Actions(driver);
		actions.moveToElement(brandMenu).perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris",Keys.ENTER);
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		//setTimeout(function(){debugger;},5000);
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("L'Oreal Paris")) {
			System.out.println("title matching!");
		} else {
			System.out.println("Title not matching!!");
		}
		// WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[2]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act =  new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Sort By')]"))).click().perform();
		//driver.findElement(By.xpath("//span[contains(text(),'Sort By')]")).click();

		driver.findElement(By
				.xpath("//label[contains(@for,'radio_customer top rated')]/div[contains(@class,'control-indicator')]")).click();

		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Category']//following::span[text()='Hair']")).click();
		driver.findElement(By.xpath(
				"//span[text()='Category']/parent::div/following-sibling::ul//span[contains(text(),'Hair Care')]")).click();
		//driver.findElement(By.xpath("//input[@id='checkbox_Shampoo_316']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]/parent::div/following-sibling::div")).click();
		//span[contains(text(),'Shampoo')]/parent::div/following-sibling::div
	}

}
