package pac1;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Yudsv {

    @Test
    public void geTest()
    {

        given().when().get("https://api.restful-api.dev/objects").then()
                .statusCode(200).body("[0].id", equalTo("1"));

}



    @Test
    public void gddeTest()
    {

        given().when().get("https://api.restful-api.dev/objects").then()
                .statusCode(200).body("", hasSize(13));

    }



    @Test
    public void geddddTest()
    {

        given().when().get("https://api.restful-api.dev/objects").then()
                .statusCode(200)
                .body("[0].name", equalTo("Google Pixel 6 Pro"));

    }

}