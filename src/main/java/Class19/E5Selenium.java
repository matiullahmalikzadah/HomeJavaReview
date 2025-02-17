package Class19;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E5Selenium {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chrome=new ChromeDriver();
        chrome.manage().window().maximize();
        Thread.sleep(2000);
        chrome.navigate().to("https://google.com");
        System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().to("https://facebook.com");
        System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().to("https://amazon.com");
        System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().back();
        Thread.sleep(2000);
        chrome.close();

        FirefoxDriver firefox=new FirefoxDriver();
        firefox.manage().window().maximize();
        Thread.sleep(2000);
        firefox.navigate().to("https://google.com");
        System.out.println(firefox.getTitle());
        Thread.sleep(2000);
        firefox.navigate().to("https://facebook.com");
        System.out.println(firefox.getTitle());
        Thread.sleep(2000);
        firefox.navigate().to("https://amazon.com");
        System.out.println(firefox.getTitle());
        Thread.sleep(2000);
        firefox.navigate().back();
        Thread.sleep(2000);
        firefox.close();

        EdgeDriver edgeDriver=new EdgeDriver();
        edgeDriver.manage().window().maximize();
        Thread.sleep(2000);
        edgeDriver.navigate().to("https://google.com");
        System.out.println(edgeDriver.getTitle());
        Thread.sleep(2000);
        edgeDriver.navigate().to("https://facebook.com");
        System.out.println(edgeDriver.getTitle());
        Thread.sleep(2000);
        edgeDriver.navigate().to("https://amazon.com");
        System.out.println(edgeDriver.getTitle());
        Thread.sleep(2000);
        edgeDriver.navigate().back();
        Thread.sleep(2000);
        edgeDriver.close();
    }
}
