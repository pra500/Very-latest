package pac1;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

public class Sizeassertionsss {
    public static void main(String[] args) {




        given()
                .when().get("https://reqres.in/api/users?page=2")
                .then().statusCode(200).body("data",hasSize(6));


        given().header("Content-Type", "application/json").
    when().post("https://dummy-json.mock.beeceptor.com/posts")
                .then().statusCode(200).body("", hasSize(10));










    }
}
