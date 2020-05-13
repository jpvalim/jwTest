package jpv.tests;

import org.junit.Test;

import jpv.core.BaseTest;
import jpv.pages.HomePage;

public class TestBiblia extends BaseTest {
	
	private HomePage pagInicial= new HomePage();
	private BiblePage pagBiblia = new BiblePage();
	
	@Test	
	public void testBiblia() {
		pagInicial.acessarTelaInicial();
		pagInicial.acessarBiblia();
		pagBiblia.LerBiblia("Salmo", 83, 18);
	}
	
	
}
