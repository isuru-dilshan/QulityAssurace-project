import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Isuru Dilshan\\Desktop\\SelenumTest\\Chromedriver\\chromedriver98.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseurl="http://www.sliit.lk/";
		String expectedTitle="SLIIT | Sri Lanka Institute of Information Technology";
		String actualTitle="";
		
		driver.get(baseurl);
		
		actualTitle=driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test failed");
		}
		
	}

}
