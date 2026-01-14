package pac1;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;



public class Basicauthsss {

    public static void main(String[] args) {




        given().auth().basic("postman", "password")
                .when().get("https://postman-echo.com/basic-auth")
                .then().statusCode(200).body("authenticated", equalTo(true));




        //  https://reqres.in/api/users?page=2





        given()
                .when().get("https://reqres.in/api/users?page=2")
                .then().statusCode(200).body("data.size()",equalTo(6));










    }
}
