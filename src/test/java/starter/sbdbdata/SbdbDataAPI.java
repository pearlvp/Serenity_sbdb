package starter.sbdbdata;

import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class SbdbDataAPI {

    private static String DATA_BY_DATE_AND_DIST = "https://ssd-api.jpl.nasa.gov/cad.api?des=433&date-min=1900-01-01&date-max=2100-01-01&dist-max=1";

    @Step("Get the success status in response")
    public void fetchdataByDateAndDist() {
        SerenityRest.given()
                .get(DATA_BY_DATE_AND_DIST);
    }


}
