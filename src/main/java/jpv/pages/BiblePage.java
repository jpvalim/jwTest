package jpv.pages;

import static jpv.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jpv.core.BasePage;

public class BiblePage extends BasePage {
	
	public void LerBiblia(String livro, int capitulo, int verso) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='jsFullScreenLoadingIndicator']")));
		selecionarLivro(livro);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='jsFullScreenLoadingIndicator']")));
		selecionarCapitulo(capitulo);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='jsFullScreenLoadingIndicator']")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='vjs-control-bar']")));
		selecionarVersiculo(verso);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='contextMenuButton']")));
		play();
		
	}
	
	public void selecionarLivro(String livroBiblico) {
		clicarLink(By.xpath("//div[@class='hebrewScriptures  clearfix']//span[@class='fullName'][contains(text(),'"+livroBiblico + "')]"));
		
	}
	
	public void selecionarCapitulo(int capitulo) {
		clicarLink(By.xpath("//a[@data-chapter='"+capitulo+"']"));
		
	}
	
	public void selecionarVersiculo(int versiculo) {
		getDriver().findElement(By.xpath("//sup[@class='verseNum']/a[contains(text(),'"+versiculo+"')]/../../..")).click();
	}

	public void play() {
		clicarLink(By.xpath("//div[@class='contextMenuButton']"));
	}
}

