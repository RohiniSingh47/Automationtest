import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SuppressWarnings("ALL")
public class postStep {
    @Given("User should be logged in and should be present on his wall")
    public void userShouldBeLoggedInAndShouldBePresentOnHisWall() {
        System.out.println("userShouldBeLoggedInAndShouldBePresentOnHisWall");
    }

    @When("I type the message in the box")
    public void iTypeTheMessageInTheBox() {
        System.out.println("iTypeTheMessageInTheBox");
    }

    @And("Click on Post button")
    public void clickOnPostButton() {
        System.out.println("clickOnPostButton");
    }

    @Then("Message should get posted")
    public void messageShouldGetPosted() {
        System.out.println("messageShouldGetPosted");
    }
}
