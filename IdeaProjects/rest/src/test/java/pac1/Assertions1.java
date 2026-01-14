package pac1;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class  Assertions1 {

    public static void main(String[] args) {



        given().header("Content-Type", "application/json")
                .auth().basic("", "")
                .when().get("https://api.restful-api.dev/objects")
                .then().statusCode(200);


        given().header("Content-Type", "application/json")
                .auth().basic("", "")
                .when().get("https://api.restful-api.dev/objects")
                .then().assertThat().
                statusCode(200).body("[0].id", equalTo("1"));



        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[1].name", containsString("Apple iPhone 12 Mini, 256GB, Blue"));



        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[1].name", notNullValue());




            given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                    .body("[2].name", notNullValue());

        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[1].name", containsString("Apple iPhone 12 Mini, 256GB, Blue"));





//        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
//                .body(
//



















    }
}
