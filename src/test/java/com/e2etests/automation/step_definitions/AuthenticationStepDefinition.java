package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.e2etests.automation.page_objects.AuthenticationPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AuthenticationStepDefinition {

	private AuthenticationPage authentificationPage;
	
	public AuthenticationStepDefinition() {
		this.authentificationPage = new AuthenticationPage();
	}
	
	@Given("Je me connecte sur l application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {
		authentificationPage.goToURL();
	}

	@When("Je saisis le user name {string}")
	public void jeSaisisLeUserName(String name) {
		authentificationPage.fillUserName(name);
	}

	@When("Je saisis le password {string}")
	public void jeSaisisLePassword(String password) {
		authentificationPage.fillPassword(password);
	}

	@When("Je clique sur le bouton submit")
	public void jeCliqueSurLeBoutonSubmit() {
		authentificationPage.clickOnSubmitButton();
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		String message = authentificationPage.welcomeMessage.getText();
		Assert.assertEquals(message, text);
	}

}
