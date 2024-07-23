package libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class driverSelection {

    private WebDriver driver;
    @Bean
    public WebDriver browser2(){
            driver = new ChromeDriver();
            return driver;
    }
}
