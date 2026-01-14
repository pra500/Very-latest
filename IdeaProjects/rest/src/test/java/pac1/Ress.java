package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;


public class Ress {




    @Test
    public void testRessTest(){


        given().when().get("https://api.restful-api.dev/objects/7").then()
                .statusCode(200).body("id", equalTo("7"));


    }
}
