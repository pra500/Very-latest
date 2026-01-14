package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class Getttsds {

    @Test
    public void getttsds(){


//
//        given().when().get("https://reqres.in/api/unknown").then().statusCode(200)
//                .body("page", equalTo(1));




        given().log().all().when().get("https://reqres.in/api/unknown/2").then().statusCode(200)
                .body("data.id", equalTo(2));


























    }
}
