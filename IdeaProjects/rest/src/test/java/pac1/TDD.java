package pac1;

import static io.restassured.RestAssured.given;

public class TDD {


    public static void main(String[] args) {

        given().header("Content-Type", "application/json")
                .when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200);



    }










}
