package automacaoSiteOrange.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import automacaoSiteOrange.driver.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "automacaoSiteOrange.steps",
		tags =  "@regressivoLogin",
		dryRun = false,
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty","html:target/cucumber-report.html"}
		
		)

public class Executa extends Driver {
	
	public static void abrirNavegador(String url, String tipo) {	
		if(tipo.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			
		}else if(tipo.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			
		}else if(tipo.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
				
		driver.manage().window().maximize();
		driver.get(url);
		
	}

	
	public static void fecharNavegador() {
		if(driver != null) {
			driver.quit();
		}		
		
	}
}
