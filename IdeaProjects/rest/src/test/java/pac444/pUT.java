package pac444;

import static io.restassured.RestAssured.*;

public class pUT {

    public static void main(String[] args) {


given().when().get("https://fake-json-api.mock.beeceptor.com/users/1")
        .then().statusCode(200).log().all();






    }
}

