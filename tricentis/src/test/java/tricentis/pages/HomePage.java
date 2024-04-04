package tricentis.pages;


import org.junit.Before;
import org.junit.Test;

import tricentis.elementos.Elementos;
import tricentis.metodos.Metodos;
import tricentis.navegadores.Navegadores;

public class HomePage {
	
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	@Before
	public void iniciarTeste() {
		Navegadores.iniciarTeste();
				
	}
	
	@Test
	public void preencherCampo() {
		metodo.clicar(el.make);
		metodo.clicar(el.selecaoAudi);
		metodo.clicar(el.model);
		metodo.clicar(el.selecaoScooter);
		metodo.escrever(el.cylinderCapacity, "20");
		metodo.escrever(el.enginePerformance, "10");
		metodo.escrever(el.dateoFmanufacture, "03/12/2024");
		metodo.clicar(el.numberOfSeats);
		metodo.clicar(el.selecaoOne);
		metodo.clicar(el.rightHandDrive);
		metodo.clicar(el.numberOfSeatSmotorcycle);
		metodo.clicar(el.selecaoSeatMotor);
		metodo.clicar(el.fuelType);
		metodo.clicar(el.selecaoFuelType);
		metodo.escrever(el.payload, "50");
		metodo.escrever(el.totalWeight, "300");
		metodo.escrever(el.listPrice, "500");
		metodo.escrever(el.licensePlateNumber, "6");
		metodo.escrever(el.annualMileage, "100");
		metodo.capturarScreenshot("Primeira Tela", "tela 1");
		metodo.clicar(el.btnNext);
		metodo.escrever(el.firstName, "Levi");
		metodo.escrever(el.lastName, "Silva");
		metodo.escrever(el.dateOfBirth, "02/05/1984");
		metodo.clicar(el.gender);
		metodo.escrever(el.streetAddress, "123455");
		metodo.clicar(el.country);
		metodo.escrever(el.zipCode, "08260");
		metodo.escrever(el.city, "São Paulo");
		metodo.clicar(el.occupation);
		metodo.clicar(el.hobbies);
		metodo.escrever(el.webSite, "www.e2etreinamentos.com.br");
		metodo.capturarScreenshot("Segunda Tela", "tela 2");
		metodo.clicar(el.btnNextb);
		metodo.escrever(el.startDate, "07/04/2024");
		metodo.clicar(el.insuranceSum);
		metodo.clicar(el.meritRating);
		metodo.clicar(el.damageInsurance);
		metodo.clicar(el.optionalProducts);
		metodo.clicar(el.courtesyCar);
		metodo.capturarScreenshot("Terceira Tela", "tela 3");
		metodo.clicar(el.btnNextc);
		metodo.validarTexto(el.mensagem, "Please, complete the first three steps to see the price table.");
		Navegadores.finalizarTeste();
	}

}
