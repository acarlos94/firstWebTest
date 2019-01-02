package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstWebTest {
    @Test
    public void calculatorTest() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Antonio\\IdeaProjects\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        navegador.get("http://adam.goucher.ca/parkcalc/");
        escolheVaga(navegador, "Long-Term Garage Parking");
        horarioEntrada(navegador);
        horarioSaida(navegador);
        navegador.findElement(By.name("Submit")).click();
        String result = navegador.findElement(By.tagName("b")).getText();
        Assert.assertEquals("$ 14.00", result);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        navegador.close();
    }
    private void horarioSaida(WebDriver navegador) {
        navegador.findElement(By.name("ExitTime")).clear();
        navegador.findElement(By.name("ExitTime")).sendKeys("03:05");
        List<WebElement> horarios = navegador.findElements(By.name("ExitTimeAMPM"));
        for (WebElement horario : horarios){
            String escolha = "PM";
            if (horario.getAttribute("value").equals(escolha)){
                horario.click();
            }
        }
        navegador.findElement(By.name("ExitDate")).clear();
        navegador.findElement(By.name("ExitDate")).sendKeys("11/13/2018");
    }
    private void horarioEntrada(WebDriver navegador) {
        navegador.findElement(By.name("EntryTime")).clear();
        navegador.findElement(By.name("EntryTime")).sendKeys("09:00");
        navegador.findElement(By.name("EntryDate")).clear();
        navegador.findElement(By.name("EntryDate")).sendKeys("11/13/2018");
    }
    private void escolheVaga(WebDriver navegador, String vaga) {
        WebElement tipoVaga = navegador.findElement(By.name("Lot"));
        tipoVaga.click();
        List<WebElement> opcoes = tipoVaga.findElements(By.tagName("option"));
        for (WebElement opcao : opcoes){
            String escolha = vaga;
            if (opcao.getText().equals(escolha)){
                opcao.click();
            }
        }
    }
}
