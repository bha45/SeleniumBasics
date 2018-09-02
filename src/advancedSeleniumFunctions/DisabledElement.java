package advancedSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {

	public static void main(String ar[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/ECLIPSE%20ENV/WorkSpace/From_Old_WorkSpace/SeleniumBasics/TestResources/DisabledElement.html");

		WebElement textField = driver.findElement(By.xpath(".//*[@id='myText']"));
		textField.sendKeys("Jaga");
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(3000);

		String textval = textField.getAttribute("value");
		System.out.println("Value From Disabled Element : " + textval);

		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("arguments[0].removeAttribute('disabled');", textField);
		Thread.sleep(1000);

		String text = textField.getAttribute("value");
		System.out.println("Value From Enabled Element : " + text);

		driver.close();
	}

}
