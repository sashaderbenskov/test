package yandexmarket;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mvideo extends Imac {
    @Test
    public void Mvideo(){


        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1458,898));
        driver.get("https://www.mvideo.ru/product-list");


        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("-category-section")));
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294948446&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12\"]")).click();



        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form")));
        ////driver.findElement(By.className("facet-price-min")).sendKeys("00");
        //driver.findElement(By.className("facet-price-max")).sendKeys("");

    }
    public void type_cases(){
        WebDriver driver = new ChromeDriver();

        WebDriverWait typeCases = new WebDriverWait(driver, 10);
        typeCases.until(ExpectedConditions.visibilityOfElementLocated(By.id("--type_mobile_cases-section")));
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294948446+4294965185+12254&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603517493230\"]")).click();
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294948446+4294965185+12255&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603517493230\"]")).click();
    }
    public void promo_cases(){
        WebDriver driver = new ChromeDriver();

        WebDriverWait promo = new WebDriverWait(driver, 10);
        promo.until(ExpectedConditions.visibilityOfElementLocated(By.id("-promo_group-section")));
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294948446+4294965185+12254&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603517493230\"]")).click();
        driver.findElement(By.cssSelector("[href=\"/product-list?N=4294948446+4294965185+12254+12255+4294470263&Nr=AND%28product.searchable%3A1%2CNOT%28product.nonSearchable%3A1%29%2Cproduct.siteId%3ASite_1%29&Nrpp=12&_=1603517493232\"]")).click();

    }
    public void Cases(){
        WebDriver driver = new ChromeDriver();
        WebDriverWait cases = new WebDriverWait(driver, 10);
        cases.until(ExpectedConditions.visibilityOfElementLocated(By.id("-brand-section")));
        driver.findElement(By.className("class=\"facet-name sel-facet-name\"")).click();
    }



}

