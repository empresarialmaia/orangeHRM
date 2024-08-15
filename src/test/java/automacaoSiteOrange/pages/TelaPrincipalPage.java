package automacaoSiteOrange.pages;

import org.openqa.selenium.By;

import automacaoSiteOrange.metodos.Metodos;

public class TelaPrincipalPage {
	
	By escreverCampoPesquisa = By.xpath("//input[@placeholder='Search']");
	By textoResultadoPesquisa = By.xpath("//a[contains(.,'Admin')]");
	By textoDigitadoPesquisa = By.xpath("//input[contains(@placeholder,'Search')]");
	                                                       
	
	LoginPage logado = new LoginPage();	
	Metodos metodo = new Metodos();
	
	public void telaPrincipalLogado(String ususario, String senha) {	
		metodo.esperarElementoVisivel(logado.usuario);
		logado.login(ususario,senha);
		logado.botaoLogin();
		
	}
	
    public void escreverCampoPesquisa(String texto) { 
    	metodo.esperarElementoVisivel(this.escreverCampoPesquisa);
    	metodo.escrever(this.escreverCampoPesquisa, texto);
    	
    }
    
    public void validacaoTextoPesquisa(String texto) {  
    	metodo.esperarElementoVisivel(this.textoResultadoPesquisa);
    	metodo.validarTexto(this.textoResultadoPesquisa, texto);
    }
    
    public void clicarNaOpcaoPesquisada() {
    	metodo.esperarElementoVisivel(textoResultadoPesquisa);
    	metodo.clicar(this.textoResultadoPesquisa);
    }
    
    public void escreverCampoPesquisaErro(String texto) {
    	metodo.esperarElementoVisivel(this.escreverCampoPesquisa);
    	metodo.escrever(this.escreverCampoPesquisa, texto);
    }
    public void validacaoPrint(String historia, String nomeAqrquivo) {
    	metodo.esperarElementoVisivel(this.textoDigitadoPesquisa);
    	metodo.printTela(historia, nomeAqrquivo);
    	
    	
    }
}
