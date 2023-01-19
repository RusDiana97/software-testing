import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroducereSelenium1 {

	public static void main(String[] args) {
		// AUTOMATED TEST
				// Invocarea unei instante de browser (Invoking Browser)
		
				// chromedriver.exe -> Chrome browser
				System.setProperty("webdriver.chrome.driver", "D:\\Programe\\chrome driver\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				// ----- open MyElectrica Login page -----
				driver.get("https://myelectrica.ro/index.php?pagina=login");
				// print the url in console
				System.out.println(driver.getCurrentUrl());
				
				// ----- find the fields for user name/email and password -----
				// for user name/email by name and send keys
				driver.findElement(By.name("myelectrica_utilizator")).sendKeys("mail@yahoo.com");
				// for password by xpath and send keys
				driver.findElement(By.xpath("//*[@id=\"myelectrica_pass\"]")).sendKeys("1234");
				// find submit button by id and click on the button
				driver.findElement(By.id("myelectrica_login_btn")).click();
				
				// close browser
				driver.close();

	}

}
