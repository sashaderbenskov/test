package yandexmarket;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Imac {
    public void Mvideo(){


        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1458,898));
        driver.get("https://www.mvideo.ru/product-list");


        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("-category-section")));
        driver.findElement(By.cssSelector("[href=\"/product-list?Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603517493237\"]")).click();



        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form")));
        ////driver.findElement(By.className("facet-price-min")).sendKeys("00");
        //driver.findElement(By.className("facet-price-max")).sendKeys("");

    }
    public void display(){
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("-monoblock_razreshenie-section")));
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294955817&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603517493238\"]")).click();
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294955817+13779+13782&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603517493238\"]")).click();

    }
    public void processor(){
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("-processor_monoblok-section")));
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294955817+13779+13782+12202&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603517493239\"]")).click();
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294955817+13779+13782+12202+12203&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603517493240\"]")).click();
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294955817+13779+13782+12202+12203+12204&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603517493241\"]")).click();

    }

    public void jaderMonoblock(){
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("-kolvo_jader_monoblok-section")));
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294955817+13779+13782+12202+12203+12204+4294956271+4294954482&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603517493245\"]")).click();
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294955817+13779+13782+12202+12203+12204+4294956271+4294954538&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603517493245\"]")).click();

    }
    public void operativka(){
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("-operativnaya_monoblok-section")));
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294955817+13779+13782+12202+12203+12204+4294956271+4294954538+4294954482+4294955819&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603517493245\"]")).click();
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294955817+13779+13782+12202+12203+12204+4294956271+4294954538+4294954482+4294955081&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603517493245\"]")).click();

    }

    public void SSD(){
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("-zhestkii_disk_ssd_monoblok-section")));
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294955817+13779+13782+12202+12203+12204+4294956271+4294954538+4294954482+4294955819+4294955081+15941&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603517493247\"]")).click();
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294955817+13779+13782+12202+12203+12204+4294956271+4294954538+4294954482+4294955819+4294955081+15944&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603517493247\"]")).click();

    }
}
