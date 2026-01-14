package pac1;

import static io.restassured.RestAssured.given;

public class UUU {

    public static void main(String[] args) {

        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200);
    }
}
