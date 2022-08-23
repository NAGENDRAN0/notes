package target;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlinng {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/window.xhtml;jsessionid=node0ech4agfopfsdo3m7md6nl9uv143013.node0");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
    Thread.sleep(3000);
    //String parentWindow = driver.getWindowHandle();
    
    driver.findElement(By.xpath("//span[text()='Open']")).click();
    
    Set<String> childWindow = driver.getWindowHandles();
    
    List<String> newWindow=new ArrayList<String>(childWindow);
    driver.switchTo().window(newWindow.get(1));
    
    
    String title2 = driver.getTitle();
    System.out.println(title2);
    String currentUrl2 = driver.getCurrentUrl();
    System.out.println(currentUrl2);
    
    driver.navigate().to("https://www.leafground.com/window.xhtml;jsessionid=node0ech4agfopfsdo3m7md6nl9uv143013.node0");
    
   // driver.switchTo().window(newWindow.get(0));
    
    
    String title = driver.getTitle();
    System.out.println(title);
    String currentUrl = driver.getCurrentUrl();
    System.out.println(currentUrl);





}
}
