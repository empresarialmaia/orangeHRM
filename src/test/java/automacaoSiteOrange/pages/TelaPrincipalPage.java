package automacaoSiteOrange.pages;

import automacaoSiteOrange.elementos.ElementosTelaPrincipal;
import automacaoSiteOrange.metodos.Metodos;

public class TelaPrincipalPage {
	
	LoginPage logado = new LoginPage();
	ElementosTelaPrincipal eleTelaPrincipal = new ElementosTelaPrincipal();
	
	public void telaPrincipalLogado() {
		logado.login("admin", "admin123");
		logado.botaoLogin();
	}
    public void escreverCampoPesquisa() {
    	Metodos.aguardar();
    	Metodos.escrever(eleTelaPrincipal.escreverCampoPesquisa, "Admin");
    	
    }
    
    public void validacaoTextoPesquisa() {
    	Metodos.validarTexto(eleTelaPrincipal.textoResultadoPesquisa, "Admin");
    }
    
    public void clicarNaOpcaoPesquisada() {
    	Metodos.clicar(eleTelaPrincipal.textoResultadoPesquisa);
    }
    
    public void escreverCampoPesquisaErro() {
    	Metodos.aguardar();
    	Metodos.escrever(eleTelaPrincipal.escreverCampoPesquisa, "teste");
    }
    public void validacaoTextoBranco() {
    	Metodos.validarTexto(eleTelaPrincipal.textoEmBrancoPesquisa, "");
    	
    }
}
