package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStayPage extends Utility {

    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement clickOnWorkAcademic;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement sixMonthsOrLess;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement longerThan6Months;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement withContinue;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement healthCareProfessional;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement afterContinue;

    public void selectOnWorkAcademic(String work){
        clickOnElement(clickOnWorkAcademic);
        log.info("Select On Work Academic: " + clickOnWorkAcademic.toString());
    }
    public void selectLengthOfStay(String moreOrLess){
        clickOnElement(longerThan6Months);
        log.info("Select lenth Of stay:" + longerThan6Months.toString());

        switch (moreOrLess){
            case "more":
            clickOnElement(longerThan6Months);
            break;
            case "less":
            clickOnElement(sixMonthsOrLess);
            break;
        }

    }

    public void clickContinue(){
        clickOnElement(withContinue);

    }
    public void clickOnHealthProfessional(){
        clickOnElement(healthCareProfessional);
        log.info("Click with : " + healthCareProfessional.toString());
    }
    public void clickAfterContinue(){
        clickOnElement(afterContinue);
        log.info("click after : "+ afterContinue.toString());
    }


}
