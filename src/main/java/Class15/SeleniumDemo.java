package Class15;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver c=new ChromeDriver();
        c.navigate().to("https://facebook.com");
        System.out.println(c.getTitle());
        Thread.sleep(3000);
        c.close();
    }
}
