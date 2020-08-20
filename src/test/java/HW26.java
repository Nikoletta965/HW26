import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW26 {

    public static WebDriver driver;

    @Test
    public void FavouriteMusic () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vermu\\Desktop\\ChromeDriverWin32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get ("https://www.i.ua/?_rand=1597857878");

        Thread.sleep(5000);
        driver.findElement(By.xpath("//html/body/div[2]/div[3]/ul[1]/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/fieldset/p[1]/input")).sendKeys("Nika965");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/fieldset/p[2]/input")).sendKeys("Vermushelka965");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/input[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"searchQ\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"searchQ\"]")).sendKeys("варум на паузу клип");
        driver.findElement(By.xpath("//html/body/div[3]/div[3]/div[3]/div[1]/div[2]/div/div[2]/form/input")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"___gcse_0\"]/div/div/div/div[5]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]/div/a")).click();

}
}