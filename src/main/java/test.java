import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sarengaraj/Saravanakumar/Kalpana/TestLeaf/chromedriver");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();

		// ************************************************************
		// Type your name
		WebElement element1 = driver
				.findElement(By.xpath("//h5[contains(text(),'Type your name')]/following-sibling::div[1]/div/input"));

		WebElement element2 = driver
				.findElement(By.xpath("//h5[contains(text(),'Type your name')]/following-sibling::div[1]/div/input"));
		
		//System.out.println(element2.getText());
		System.out.println(element2.getAttribute("value"));
		element1.sendKeys("Kalpana");
		//Thread.sleep(3000);
		//System.out.println("after");
		System.out.println(element2.getAttribute("value"));
		 
		
		System.out.println(element1.getAttribute("value"));
	}

}
