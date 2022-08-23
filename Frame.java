package target;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/frame.xhtml");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
    
    
    driver.switchTo().frame(2);
    driver.switchTo().frame("frame2");
    WebElement frame = driver.findElement(By.id("Click"));
    frame.click();
    
    String text = frame.getText();
System.out.println(text);


}
}
