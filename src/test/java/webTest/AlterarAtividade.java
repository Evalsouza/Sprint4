/*package webTest;
// Generated by Selenium IDE
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;
public class AlterarAtividade {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void teste7() throws InterruptedException {
        driver.get("https://testando.eveclass.com/pt/admin/conteudo");
        driver.manage().window().setSize(new Dimension(1200, 750));
        driver.findElement(By.cssSelector("h1")).click();
        assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Entrar"));
         driver.findElement(By.cssSelector("input[type=email]")).sendKeys("evaluzia.souza@gmail.com");
        driver.findElement(By.cssSelector("input[type=password]")).sendKeys("asD#89447182");
        driver.findElement(By.cssSelector(".button-text > span")).click();
        Thread.sleep(10000);
        driver.navigate().refresh();
        driver.findElement(By.cssSelector(".button-text > span")).click();
        new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href=\"/pt/admin/conteudo/atividades\"]")));
        //By.xpath("//*[@href=\"/pt/admin/conteudo/atividades\"]")
        {
            WebElement element = driver.findElement(By.xpath("//*[@href=\"/pt/admin/conteudo\"]"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".text > .fa-comments-alt")).click();
        assertThat(driver.findElement(By.cssSelector(".overview-group-title_primary")).getText(), is("Visão Geral"));
        assertThat(driver.findElement(By.cssSelector(".ACTIVITY .text-title")).getText(), is("Atividades"));
        driver.findElement(By.cssSelector(".text > .fa-comments-alt")).click();
        Thread.sleep(7000);
        assertThat(driver.findElement(By.cssSelector(".segment-title:nth-child(1)")).getText(), is("Visão Geral"));
        Thread.sleep(7000);
        assertThat(driver.findElement(By.cssSelector(".button:nth-child(3) > .button-text > span > span")).getText(), is("Nova Atividade"));
        driver.findElement(By.cssSelector(".button:nth-child(3) > .button-text > span > span")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".button:nth-child(3) > .button-text > span > span"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Nova Atividade"));
        driver.findElement(By.xpath("//*[@href=\"/pt/admin/conteudo/atividades/cadastros/adicionar\"]")).click();
        driver.findElement(By.id("name-i-8493778296178029")).sendKeys("Nova Atividade");
    //    new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href=\"/pt/admin/conteudo/atividades/cadastros/adicionar\"]")));
        {
            WebElement element = driver.findElement(By.cssSelector(".select:nth-child(2) .msg"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Nova Atividade"));
        assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Nova Atividade"));
        assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Nova Atividade"));
        assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Nova Atividade"));
        assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Nova Atividade"));
        assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Nova Atividade"));
        assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Nova Atividade"));
        assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Nova Atividade"));
    }
}*/
