package pac1;

import static io.restassured.RestAssured.given;

public class H777 {

    public static void main(String[] args) {



        given().when().get("https://fake-json-api.mock.beeceptor.com/users")
                .then().assertThat().
                statusCode(200);













    }
}
