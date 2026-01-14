package pac1;


import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class h {


    @Test
    public void tTest() {


        ValidatableResponse body = given().when().get("https://fake-json-api.mock.beeceptor.com/companies")
                .then().assertThat().statusCode(200).and().
                body("[1].id", equalTo(2)).and().body("[2].address", notNullValue());


    }


}
