package SolutionTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        String projectpath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectpath +"\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1024, 768));
		
		driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
        WebElement fromStation = driver.findElement(By.id("fromPlaceName"));
        fromStation.sendKeys("CHIKKAMAGALURU");
        fromStation.click();
        
        WebElement toStation = driver.findElement(By.id("toPlaceName"));
        toStation.sendKeys("BENGALURU");
        toStation.click();


        WebElement dateField = driver.findElement(By.id("txtJourneyDate"));
        dateField.click(); 

        WebElement searchButton = driver.findElement(By.className("btn-booking"));
        searchButton.click();

	}
}
