package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exam2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://rakuplus.jp/");

		WebElement element = driver.findElement(By.name("log"));
		Thread.sleep(2000);
		element.sendKeys("akito.ebina@rakus-partners.co.jp");
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.name("pwd"));
		Thread.sleep(2000);
		element2.sendKeys("Rugbydog1357");
		Thread.sleep(2000);
		element2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.get("https://rakuplus.jp/archives/11203");

		//int row = driver.findElement(By.className("big")).findElements(By.tagName("tr")).size();

		List<WebElement> emelist1 = driver.findElements(By.className("big"));
		List<WebElement> emelist2 = driver.findElements(By.className("has-text-align-center has-text-color"));
		List<WebElement> emelist3 = driver.findElements(By.className("smartphoto-img active"));
		for (WebElement list1 : emelist1) {
			System.out.println(list1);
		}
		for (WebElement list2 : emelist2) {
			System.out.println(list2);
		}
		for (WebElement list3 : emelist3) {
			System.out.println(list3);
		}

		//<img style="transform:translate(0px,0px) scale(1);width:169px;" src="https://rakuplus.jp/wp-content/uploads/2022/10/59d04606476c92127a8c52788b8815a1.png"
		//class="smartphoto-img active" ondragstart="return false;">
	}
}
