package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class J {


    @Test(priority = 0)
    public void tesssstTest() {


        given().when().get("https://fake-json-api.mock.beeceptor.com/users")
                .then().assertThat().
                statusCode( 200);


    }



}
