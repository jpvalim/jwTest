package jpv.core;

import static jpv.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {
	
	
	@Rule
	public TestName testname = new TestName();
	
	//private  LoginPage page = new LoginPage();
	@Before
	public void inicializa() {
		/*page.acessarTelaInicial();
		page.logar("jeff@valim", "jpv123");*/
		
	}
	
	
	@After
	public void finaliza() throws IOException{
		TakesScreenshot ss = (TakesScreenshot) DriverFactory.getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" + 
				File.separator + testname.getMethodName()+".jpg"));
		
		
		
		if (Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
		
	
	}
}
