package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class TT {

    //we ll get JsonSchemaValidationException
    @Test
    public void validateUserListSchema() {
        given()
                .baseUri("https://reqres.in")
                .queryParam("page", 1)
                .when()
                .get("/api/users")
                .then()
                .body(matchesJsonSchemaInClasspath("f.json"));


    }
}
