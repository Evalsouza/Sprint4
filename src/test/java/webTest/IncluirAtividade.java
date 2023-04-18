package webTest;
// Generated by Selenium IDE
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class IncluirAtividade {
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
    public void incluirAtividadenoTestandoEveClass() throws InterruptedException {
        driver.get("https://testando.eveclass.com/pt");
        driver.manage().window().setSize(new Dimension(1440, 779));
        driver.findElement(By.cssSelector("#support-action > .button-text > span > span")).click();
        assertThat(driver.findElement(By.cssSelector("#support-action > .button-text > span > span")).getText(), is("Entrar"));
        driver.get("https://testando.eveclass.com/pt/admin/conteudo");
        driver.findElement(By.cssSelector("input[type=email]")).sendKeys("evaluzia.souza@gmail.com");
        driver.findElement(By.cssSelector("input[type=password]")).sendKeys("asD#89447182");
        assertThat(driver.findElement(By.cssSelector(".button-text > span")).getText(), is("Entrar"));
        driver.findElement(By.cssSelector(".button-text > span")).click();
        Thread.sleep(20000);
        driver.get("https://testando.eveclass.com/pt/admin/conteudo");
        driver.findElement(By.cssSelector(".ACTIVITY .text-title")).click();
        driver.findElement(By.cssSelector(".button:nth-child(3) > .button-text > span > span")).click();
     //   driver.findElement(By.id("name-i-882501529969015")).click();

        driver.navigate().refresh();
    //    Thread.sleep(10000);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href=\"/pt/admin/conteudo/atividades\"]")));
        driver.findElement(By.xpath("//*[@href=\"/pt/admin/conteudo/atividades\"]")).click();
        driver.navigate().refresh();
        Thread.sleep(10000);
      //  assertEquals("Visão Geral", driver.findElement(By.cssSelector("h1")).getText());
        assertThat(driver.findElement(By.cssSelector(".segment-title:nth-child(1)")).getText(), is("Visão Geral"));
        driver.findElement(By.cssSelector(".button:nth-child(3) > .button-text > span > span")).click();
        Thread.sleep(10000);
    {
        WebElement element = driver.findElement(By.cssSelector(".toolbar-actions > .button:nth-child(3)"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
    }
        Thread.sleep(10000);
        assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Nova Atividade"));
        Thread.sleep(9000);
        driver.findElement(By.xpath("//*[@href=\"/pt/admin/conteudo/atividades/cadastros/adicionar\"]")).click();
        Thread.sleep(9000);

        driver.findElement(By.xpath("//*[@placeholder=\"Insira o nome da atividade\"]")).clear();
        driver.findElement(By.xpath("//input placeholder=\"Insira o nome da atividade\"")).sendKeys("Teste de Selenium");
       // placeholder="Insira o nome da atividade"
        driver.findElement(By.cssSelector("#vs1__combobox .vs__search")).click();
        driver.findElement(By.cssSelector("#vs1__combobox .vs__search")).sendKeys("eva");
    {
        WebElement element = driver.findElement(By.cssSelector(".form-group-row:nth-child(1) .form-column:nth-child(1)"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).release().perform();
    }
        assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Nova Atividade"));
  }
}
