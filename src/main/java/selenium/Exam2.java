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
		element.sendKeys("akito.ebina@rakus-partners.co.jp");
		WebElement element2 = driver.findElement(By.name("pwd"));
		element2.sendKeys("Rugbydog1357");
		element2.sendKeys(Keys.ENTER);
		driver.get("https://rakuplus.jp/archives/11203");

		//int row = driver.findElement(By.className("big")).findElements(By.tagName("tr")).size();

		//WebElement emelist1 = driver.findElement(By.className(""));
		//List<WebElement> list2 = emelist3.(By.cssSelector("href"));
		
		List<WebElement> emelist1 = driver.findElements(By.className("has-text-align-center"));
		for (WebElement list1 : emelist1) {
			System.out.println(list1.getText());
		}

		List<WebElement> emelist = driver.findElements(By.cssSelector("section.entry-content > div"));
		int count = 0;
		for (WebElement eme : emelist)
			if (count > 0) {
				WebElement imgeme = eme.findElement(By.tagName("img"));
				String url = imgeme.getAttribute("src");
				System.out.println(url);
			}
		count++;

		driver.close();
		
		//<img style="transform:translate(0px,0px) scale(1);width:169px;" src="https://rakuplus.jp/wp-content/uploads/2022/10/59d04606476c92127a8c52788b8815a1.png"
		//class="smartphoto-img active" ondragstart="return false;">
		//js-smartphoto
	}
}
