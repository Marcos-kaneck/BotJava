package entities;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Initial_WebChat {

    static final ChromeOptions chromeOptions = new ChromeOptions();
    static final WebDriver driver = new ChromeDriver(chromeOptions);

    public Initial_WebChat(){
        
        driver.get("https://web.whatsapp.com/");
        File file = new File("C:\\Users\\marcos\\Documents\\NetBeansProjects\\ChatBot");
        
    }
}
