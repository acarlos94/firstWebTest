package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstWebTestTwo {
    @Test
    public void calculatorTest() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Antonio\\IdeaProjects\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        navegador.get("http://adam.goucher.ca/parkcalc/");
        escolheVaga(navegador, "Economy Parking");
        horarioEntrada(navegador);
        horarioSaida(navegador);
        navegador.findElement(By.name("Submit")).click();
        String result = navegador.findElement(By.tagName("b")).getText();
        Assert.assertEquals("$ 22.00", result);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        navegador.close();
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
    private void horarioEntrada(WebDriver navegador) {
        navegador.findElement(By.name("EntryTime")).clear();
        navegador.findElement(By.name("EntryTime")).sendKeys("10:07");
        navegador.findElement(By.name("EntryDate")).clear();
        navegador.findElement(By.name("EntryDate")).sendKeys("11/30/2018");
    }
    private void horarioSaida(WebDriver navegador) {
        navegador.findElement(By.name("ExitTime")).clear();
        navegador.findElement(By.name("ExitTime")).sendKeys("10:32");
        navegador.findElement(By.name("ExitDate")).clear();
        navegador.findElement(By.name("ExitDate")).sendKeys("12/02/2018");
    }
}
