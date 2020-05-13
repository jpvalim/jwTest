package jpv.pages;

import jpv.core.BasePage;
import jpv.core.DriverFactory;

public class HomePage extends BasePage {
	
	
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("https://www.jw.org/pt/");
		
		}
	
	
	public void acessarBiblia() {
		clicarLink("Leia a Bíblia on-line");	
		
	}
	
}
