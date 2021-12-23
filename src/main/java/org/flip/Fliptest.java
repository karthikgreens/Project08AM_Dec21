package org.flip;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fliptest {
	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement clos = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clos.click();

		WebElement loc1 = driver.findElement(By.xpath("//input[@type='text']"));
		loc1.sendKeys("iphone 12pro");

		WebElement loc2 = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		loc2.click();

		List<WebElement> li = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 12 Pro')]"));
		for (WebElement lo : li) {
			String ok = lo.getText();
			System.out.println(ok);

		}

		List<WebElement> pri = driver.findElements(By.xpath("//div[contains(text(),'₹')]"));

		for (WebElement rup : pri) {
			String fin = rup.getText();

			System.out.println(fin);

		}
//		Set<String> ts = new TreeSet<String>();
//		ts.add(fin);

	}

}
