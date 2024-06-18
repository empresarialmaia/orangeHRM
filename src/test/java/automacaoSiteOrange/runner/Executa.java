package automacaoSiteOrange.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import automacaoSiteOrange.driver.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "automacaoSiteOrange.steps",
		tags = "@negativoTelaPrincipal",
		dryRun = false,
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty","html:target/cucumber-report.html"}
		
		)

public class Executa extends Driver {
	
	public static void iniciarTest(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}

	
	public static void encerrarTest() {
		driver.quit();
		
	}
}
