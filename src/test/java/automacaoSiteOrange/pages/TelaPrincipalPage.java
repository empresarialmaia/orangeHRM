package automacaoSiteOrange.pages;

import automacaoSiteOrange.elementos.ElementosLogin;
import automacaoSiteOrange.elementos.ElementosTelaPrincipal;
import automacaoSiteOrange.metodos.Metodos;

public class TelaPrincipalPage {
	
	LoginPage logado = new LoginPage();
	ElementosLogin login = new ElementosLogin();
	ElementosTelaPrincipal eleTelaPrincipal = new ElementosTelaPrincipal();
	Metodos metodo = new Metodos();
	
	public void telaPrincipalLogado() {	
		metodo.esperarElementoVisivel(login.username, 5);
		logado.login("admin", "admin123");
		logado.botaoLogin();
	}
    public void escreverCampoPesquisa() { 
    	metodo.esperarElementoVisivel(eleTelaPrincipal.escreverCampoPesquisa, 5);
    	metodo.escrever(eleTelaPrincipal.escreverCampoPesquisa, "Admin");
    	
    }
    
    public void validacaoTextoPesquisa() {  
    	metodo.esperarElementoVisivel(eleTelaPrincipal.textoResultadoPesquisa, 5);
    	metodo.validarTexto(eleTelaPrincipal.textoResultadoPesquisa, "Admin");
    }
    
    public void clicarNaOpcaoPesquisada() {
    	metodo.clicar(eleTelaPrincipal.textoResultadoPesquisa);
    }
    
    public void escreverCampoPesquisaErro() {
    	metodo.esperarElementoVisivel(eleTelaPrincipal.escreverCampoPesquisa, 5);
    	metodo.escrever(eleTelaPrincipal.escreverCampoPesquisa, "teste");
    }
    public void validacaoTextoInexistentePrint() {
    	metodo.printTela("Negativo","Pesquisa_Item_Inexistente");
    	
    }
}
