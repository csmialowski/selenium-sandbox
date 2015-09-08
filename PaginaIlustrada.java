package br.com.brenda.folha.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PaginaIlustrada extends Pagina{

	public PaginaIlustrada(WebDriver driver) {
		super(driver);
	}
		@FindBy(linkText = "música") WebElement menuMusica;
		
		public void navegarMenuMusica(){
			Actions acoes = new Actions(this.driver);
			acoes.moveToElement(menuMusica).click().build().perform();
		}
	}
	


