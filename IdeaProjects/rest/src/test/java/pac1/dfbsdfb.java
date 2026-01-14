package pac1;

import static io.restassured.RestAssured.given;

public class    dfbsdfb {
    public static void main(String[] args) {

        given().when().get("https://dummy-json.mock.beeceptor.com/posts")
                .then().assertThat().statusCode(200);




    }
}
