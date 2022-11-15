package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exam3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//指定したURLへ移動
		driver.get("https://www.e-procurement.metro.tokyo.lg.jp/index.jsp");

		//画面の更新
		//driver.navigate().refresh();		

		//ポップアップブラウザのOKボタンクリック
		WebElement element = driver.findElement(By.xpath("//button[text()='OK']"));
		element.click();

		//それぞれのテキスト名のリンク要素を取得
		WebElement link1 = driver.findElement(By.cssSelector("#tepsLogo"));
		WebElement link2 = driver.findElement(By.cssSelector("#menu_1"));
		
		link2.click();
		//全てのウィンドウハンドルを取得
		Set<String> set = driver.getWindowHandles();
		//それぞれのウインドウハンドルを別々の変数に保存
		Iterator<String> it = set.iterator();
		//ウィンドウハンドル１
		String window1 = it.next();
		System.out.println(window1);
		//ウィンドウハンドル２
		String window2 = it.next();
		System.out.println(window2);

		driver.switchTo().window(window2);
		WebElement link3 = driver.findElement(By.cssSelector("#topMenuBtn03"));
		link3.click();


		WebElement element1 = driver.findElement(By.name("StartDateYY"));
		element1.sendKeys("4");
		WebElement element2 = driver.findElement(By.name("StartDateMM"));
		element2.sendKeys("11");
		WebElement element3 = driver.findElement(By.name("StartDateDD"));
		element3.sendKeys("15");

		WebElement element4 = driver.findElement(By.name("EndDateYY"));
		element4.sendKeys("4");
		WebElement element5 = driver.findElement(By.name("EndDateMM"));
		element5.sendKeys("12");
		WebElement element6 = driver.findElement(By.name("EndDateDD"));
		element6.sendKeys("15");

		//検索ボタンクリック
		WebElement serch = driver.findElement(By.xpath("//button[text()='検索']"));
		serch.click();
		
//		List<WebElement> emelist = driver.findElements(By.tagname("tr"));
//		int count = 0;
//		for (WebElement eme : emelist)
//			if (count < 3) {
//				WebElement tdeme = eme.findElement(By.tagName("td"));
//				String url = tdeme.getAttribute("src");
//				System.out.println(url);
//			}
//		count++;
		
		
	}

}
