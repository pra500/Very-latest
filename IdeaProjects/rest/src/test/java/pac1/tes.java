package pac1;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class tes {


/*
    https://api.restful-api.dev/objects/10
    https://reqres.in/api/users?page=2
*/







    public static void main(String[] args) {

        given().baseUri("https://reqres.in").queryParam("page", 2)
                .when().get("/api/users").then().assertThat().statusCode(200).body("per_page",equalTo(6))
                .log().all();



    }

}
