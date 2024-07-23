package libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class driverSelection {
    @Bean
    public WebDriver browser2(){
            WebDriver driver = new ChromeDriver();
            return driver;
    }
}
