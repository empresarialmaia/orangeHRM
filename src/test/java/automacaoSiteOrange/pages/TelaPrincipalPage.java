package automacaoSiteOrange.pages;

import automacaoSiteOrange.elementos.Elementos;
import automacaoSiteOrange.metodos.Metodos;

public class TelaPrincipalPage {
	
	
	
	
	
	LoginPage logado = new LoginPage();	
	Metodos metodo = new Metodos();
	Elementos elementoTPrincipal = new Elementos();
	
	public void telaPrincipalLogado(String usuario, String senha) {	
		metodo.esperarElementoVisivel(elementoTPrincipal.usuario);
		logado.login(usuario,senha);
		logado.botaoLogin();
		
	}
	
    public void escreverCampoPesquisa(String texto) { 
    	metodo.esperarElementoVisivel(elementoTPrincipal.escreverCampoPesquisa);
    	metodo.escrever(elementoTPrincipal.escreverCampoPesquisa, texto);
    	
    }
    
    public void validacaoTextoPesquisa(String texto) {  
    	metodo.esperarElementoVisivel(elementoTPrincipal.textoResultadoPesquisa);
    	metodo.validarTexto(elementoTPrincipal.textoResultadoPesquisa, texto);
    }
    
    public void clicarNaOpcaoPesquisada() {
    	metodo.esperarElementoVisivel(elementoTPrincipal.textoResultadoPesquisa);
    	metodo.clicar(elementoTPrincipal.textoResultadoPesquisa);
    }
    
    public void escreverCampoPesquisaErro(String texto) {
    	metodo.esperarElementoVisivel(elementoTPrincipal.escreverCampoPesquisa);
    	metodo.escrever(elementoTPrincipal.escreverCampoPesquisa, texto);
    }
    public void validacaoPrint(String historia, String nomeAqrquivo) {
    	metodo.esperarElementoVisivel(elementoTPrincipal.textoDigitadoPesquisa);
    	metodo.printTela(historia, nomeAqrquivo);    	
    	
    }    
     
    	
    
}
