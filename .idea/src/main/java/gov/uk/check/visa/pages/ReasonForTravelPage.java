package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasonForTravelPage extends Utility {

    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement reasonForVisit;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickOnContinue;


    public void selectReasonForVisit(String reason){
        clickOnElement(reasonForVisit);
        log.info("Select Reason : " + reasonForVisit.toString());
    }
    public void byContinue(){
        clickOnElement(clickOnContinue);
        log.info("With continue : " + clickOnContinue.toString());
    }
}
