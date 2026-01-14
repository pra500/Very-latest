package pac1;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class sd {


    public static void main(String[] args) {


        given().when().get("https://dummy-json.mock.beeceptor.com/posts")
                .then().statusCode(200)
                .body("", hasSize(greaterThan(3)));



        given().when().get("https://dummy-json.mock.beeceptor.com/posts")
                .then().statusCode(200)
                .body("", hasSize(lessThan(20)));




        given().when().get("https://dummy-json.mock.beeceptor.com/posts")
                .then().statusCode(200)
                .body("", hasSize(lessThanOrEqualTo(10)));


    }
}
