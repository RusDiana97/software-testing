import org.openqa.selenium.chrome.ChromeDriver;

public class IntroducereSelenium {

	public static void main(String[] args) {
		// Automated Test
		// Invocarea unei instante de browser (Invoking Browser)
		// chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Programe\\chrome driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com");
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
