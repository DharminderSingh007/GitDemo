import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ItemSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\udemy\\Chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.Gap.com");
		driver.findElement(By.cssSelector("#email-ftr")).sendKeys("kfhkfh@gmail.com");
		driver.findElement(By.cssSelector("#exit_ModalButton")).click();
	    driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("kfhkfh@gmail.com");
		driver.findElement(By.cssSelector("#inputConfirmEmail")).sendKeys("kfhkfh@gmail.com");
		
		driver.findElement(By.cssSelector("#gap_men")).click();
		driver.findElement(By.cssSelector("button.button_primary")).click();
		driver.findElement(By.cssSelector("#recaptcha-verify-button")).click();
		
		
		
		
		
		
	}

}
