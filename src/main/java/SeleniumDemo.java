
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/path/to/chromedriver.exe");

        String chromeTitle = chromeTest("https://www.google.com/");
        System.out.println(chromeTitle);

    }

    private static String chromeTest(String url){
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String title = driver.getTitle();
        driver.quit();
        return title;
    }

}
