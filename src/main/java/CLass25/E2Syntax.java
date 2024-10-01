package CLass25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1Syntax {
    public static void main(String[] args) {

        String URL="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
        String userName="Admin";
        String password="Hum@nhrm123";

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

       WebElement Name=driver.findElement(By.id("txtUsername"));
       Name.sendKeys(userName);
       WebElement pass=driver.findElement(By.id("txtPassword"));
       pass.sendKeys(password);
       WebElement login=driver.findElement(By.id("btnLogin"));
       login.click();

    }
}
