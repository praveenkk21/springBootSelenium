package libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class driverSelection {
    @Value("${browser.name}")
    private String environment;
    private WebDriver driver;
    public WebDriver driver(){
        if(environment.equalsIgnoreCase("chrome")){
            driver= new ChromeDriver();
        }
        return driver;
    }
}
