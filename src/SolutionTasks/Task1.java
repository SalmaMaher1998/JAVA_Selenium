package SolutionTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        String projectpath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectpath +"\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1024, 768));
		
		driver.navigate().to("https://www.amazon.com/");
		
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("car accessories");
        searchBox.submit();
        
        WebElement firstItem = driver.findElement(By.cssSelector("[data-cel-widget='search_result_2']"));
        firstItem.click();
	}
}
