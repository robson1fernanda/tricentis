package tricentis.navegadores;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import tricentis.drivers.DriversFactory;

public class Navegadores extends DriversFactory {

	static boolean exibirNavegador = false;

	public static void iniciarTeste() {
		ChromeOptions options = new ChromeOptions();
		if (exibirNavegador) {
			options.addArguments("--headless");// executar sem abrir o navegador
		}
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://sampleapp.tricentis.com/101/app.php");
	}

	public static void finalizarTeste() {
		driver.quit();

	}
}
