package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import  static org.hamcrest.Matchers.*;


public class Schemavalidation {


    @Test
    public void tTest() {


        given().when().get("https://api.restful-api.dev/objects").then().assertThat()
                .statusCode(200).body("[0].id", equalTo("1"));



        given().when().get("https://api.restful-api.dev/objects").then().assertThat()
                .statusCode(200).body("[0].name", equalTo("Google Pixel 6 Pro"));











    }
}
