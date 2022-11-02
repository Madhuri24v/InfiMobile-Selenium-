package infi.selenium.com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.given;

public class SimPurchase {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/home/ubuntu/billing_micro_services/infi.selenium.com/src/main/resources/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://preprodsys.gorillawireless.com:800/Gorilla/#/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[64]/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(
				By.xpath("/html/body/app-root/div/div/app-plans/div[1]/app-best-plans/div/div[4]/div[1]/div[3]/a"))
				.click();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"zipCode\"]")).sendKeys("30303");

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/div/div/app-plan-details/div/div/div[3]/div[2]/div/button[1]"))
				.click();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}

}
