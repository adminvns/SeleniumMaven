package firstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester_one {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chrome_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://semantic-ui.com/examples/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
