package gov.uk.check.visa.cucumber.steps;


import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfirmationSteps  {

    @Given("I click on start button")
    public void iClickOnStartButton() {
     new StartPage().clickStartNow();
    }
    @When("I Select a Nationality {string}")
    public void iSelectANationalityAustralia(String Nationality) {
        new SelectNationalityPage().selectNationality(Nationality);
    }
    @And("I Click on Continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I Select reason {string}")
    public void iSelectReasonTourism(String reason) {
        new ReasonForTravelPage().selectReasonForVisit(reason);
    }


    @Then("verify result {string}")
    public void verifyResultYouWillNotNeedAVisaToComeToTheUK(String result) {
        String expectedMessage = "You will not need a visa to come to the UK";
        String actualMessage = new ResultPage().getResultMessage(result);
        Assert.assertEquals(expectedMessage, actualMessage, "Message not displayed");

    }

    @And("I Select intendent to stay for {string}'")
    public void iSelectIntendentToStayFor(String moreOrLess) {
        new DurationOfStayPage().selectLengthOfStay(moreOrLess);

    }


    @And("I Select have planning to work for {string}")
    public void iSelectHavePlanningToWorkForHealthAndCareProfessional() {
        new DurationOfStayPage().clickOnHealthProfessional();
    }

    @Then("I verify result {string}")
    public void iVerifyResultYouNeedAVisaToWorkInHealthAndCare(String result) {
        String expectedMessage = "You will not need a visa to come to the UK";
        String actualMessage = new ResultPage().confirmResultMessage(result);
        Assert.assertEquals(expectedMessage, actualMessage, "Message not displayed");

    }

//    @And("I Select state My partner of family member have uk immigration status {string}")
//    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatusYes() {
//
//    }
}
