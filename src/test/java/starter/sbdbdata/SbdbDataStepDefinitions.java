package starter.sbdbdata;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;

public class SbdbDataStepDefinitions {

    @Steps
    SbdbDataAPI sbdbDataAPI;

    @When("I look up at sbdp for close data api")
    public void i_look_up_at_sbdp_for_close_data_api() {
        sbdbDataAPI.fetchdataByDateAndDist();
    }
    @Then("I can see the success status in response")
    public void i_get_the_success_status_in_response() {
        restAssuredThat(response -> response.statusCode(200));
    }

//Assertion to verify signature and find  substring NASA/JPL SBDB Close Approach Data API
// (unfortunately it didn't get through) with substring and contain func
    @Then("I can see string in the NASA\\/JPL in source of signature")
    public void i_can_see_source_in_the_signature() {
        String source ="<{source=NASA/JPL SBDB Close Approach Data API, version=1.4}>";
        restAssuredThat(response -> response.body(DataResponse.SIGNATURE,equalTo(source)) );

    }
}
