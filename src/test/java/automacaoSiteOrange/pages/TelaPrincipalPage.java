package automacaoSiteOrange.pages;

import automacaoSiteOrange.elementos.ElementosTelaPrincipal;
import automacaoSiteOrange.metodos.Metodos;

public class TelaPrincipalPage {
	
	LoginPage logado = new LoginPage();
	ElementosTelaPrincipal eleTelaPrincipal = new ElementosTelaPrincipal();
	Metodos metodo = new Metodos();
	
	public void telaPrincipalLogado() {
		logado.login("admin", "admin123");
		logado.botaoLogin();
	}
    public void escreverCampoPesquisa() {
    	//metodo.aguardar();
    	metodo.escrever(eleTelaPrincipal.escreverCampoPesquisa, "Admin");
    	
    }
    
    public void validacaoTextoPesquisa() {
    	metodo.validarTexto(eleTelaPrincipal.textoResultadoPesquisa, "Admin");
    }
    
    public void clicarNaOpcaoPesquisada() {
    	metodo.clicar(eleTelaPrincipal.textoResultadoPesquisa);
    }
    
    public void escreverCampoPesquisaErro() {
    	//metodo.aguardar();
    	metodo.escrever(eleTelaPrincipal.escreverCampoPesquisa, "teste");
    }
    public void validacaoTextoBranco() {
    	metodo.validarTexto(eleTelaPrincipal.textoEmBrancoPesquisa, "");
    	
    }
}
