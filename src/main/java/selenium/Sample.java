package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		Thread.sleep(2000);
		driver.get("http://www.google.co.jp/");
		
		//Googleの検索テキストボックスの要素をCSSセレクタ(クラスセレクタ)から指定
		//WebElement element = driver.findElement(By.cssSelector(".gsfi"));
		//↑↓同義
		//検索テキストボックスの要素をid属性値から取得
		//WebElement element = driver.findElement(By.id("lst-ib"));

		//検索テキストボックスに"Selenium"を入力
		//element.sendKeys("CSSセレクタとは？");
		//Enterキーを押下してGoogle検索を実行
		//element.sendKeys(Keys.ENTER);
	}
}
