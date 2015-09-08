package br.com.brenda.folha.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pagina {

	WebDriver driver;
	
	public Pagina(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public Paginas getPaginas(){
	    return new Paginas();
	}
}

