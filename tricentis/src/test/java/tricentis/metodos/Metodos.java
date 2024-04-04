package tricentis.metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import tricentis.drivers.DriversFactory;

public class Metodos extends DriversFactory{
	
	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void capturarScreenshot(String historia, String nomeDoArquivo) {
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screenshot, new File("./evidencias/" + historia + "/"+nomeDoArquivo+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, textoCapturado);
		
	}
}
