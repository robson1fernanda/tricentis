package tricentis.elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By make = By.id("make");
	public By model = By.id("model");
	public By cylinderCapacity = By.id("cylindercapacity");
	public By enginePerformance = By.id("engineperformance");
	public By dateoFmanufacture = By.id("dateofmanufacture");
	public By numberOfSeats = By.id("numberofseats");
	public By rightHandDrive = By.xpath("//span[@class='ideal-radio checked']");
	public By numberOfSeatSmotorcycle = By.id("numberofseatsmotorcycle");
	public By selecaoAudi = By.xpath("//select[@id='make'] //option[@value='Audi']");
	public By selecaoScooter = By.xpath("//select[@id='model'] //option[@value='Scooter']");
	public By selecaoOne = By.xpath("//select[@id='numberofseats'] //option[@value='1']");
	public By selecaoSeatMotor = By.xpath("//select[@id='numberofseatsmotorcycle'] //option[@value='1']");
	public By fuelType = By.id("fuel");
	public By selecaoFuelType = By.xpath("//select[@id='fuel'] //option[@value='Diesel']");
	public By payload = By.id("payload");
	public By totalWeight = By.id("totalweight");
	public By listPrice = By.id("listprice");
	public By licensePlateNumber = By.id("licenseplatenumber");
	public By annualMileage = By.id("annualmileage");
	public By btnNext = By.id("nextenterinsurantdata");
	public By firstName = By.id("firstname");
	public By lastName = By.id("lastname");
	public By dateOfBirth = By.id("birthdate");
	public By gender = By.id("gendermale");
	public By streetAddress = By.id("streetaddress");
	public By country = By.xpath("//select[@id='country'] //option[@value='Brazil']");
	public By zipCode = By.id("zipcode");
	public By city = By.id("city");
	public By occupation = By.xpath("//select[@id='occupation'] //option[@value='Public Official']");
	public By hobbies = By.id("bungeejumping");
	public By webSite = By.id("website");
	public By btnNextb = By.id("nextenterproductdata");
	public By startDate = By.id("startdate");
	public By insuranceSum = By.xpath("//select[@id='insurancesum'] //option[@value='5000000']");
	public By meritRating = By.xpath("//select[@id='meritrating'] //option[@value='Bonus 3']");
	public By damageInsurance = By.xpath("//select[@id='damageinsurance'] //option[@value='No Coverage']");
	public By optionalProducts = By.id("LegalDefenseInsurance");
	public By courtesyCar = By.xpath("//select[@id='courtesycar'] //option[@value='Yes']");
	public By btnNextc = By.id("nextselectpriceoption");
	public By mensagem = By.xpath("//*[text()='Please, complete the first three steps to see the price table.']");
	
	
	

	
	
	
	
	
	
	
	
	
	
}
