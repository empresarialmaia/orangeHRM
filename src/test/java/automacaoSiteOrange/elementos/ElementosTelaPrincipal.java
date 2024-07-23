package automacaoSiteOrange.elementos;

import org.openqa.selenium.By;

public class ElementosTelaPrincipal {
	
	
	public By escreverCampoPesquisa = By.xpath("//input[@placeholder='Search']");
	public By textoResultadoPesquisa = By.xpath("//a[contains(.,'Admin')]");
	//public By semTextoOpcaoPesquisa = By.xpath("//div[@class='oxd-sidepanel-body']");
	public By textoDigitadoPesquisa = By.xpath("//input[contains(@class,'oxd-input oxd-input--active')]");
	

}
