package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;




public class he {


    @Test
    public void test() {
        given().headers("Content-Type", "application/json")


                .when().get("https://api.restful-api.dev/objects/10")
                .then().assertThat().statusCode(200)

                .body("id", equalTo("10")).log().all();


    }
}
