package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class teh {

    @Test
    public void geTest() {
        given().when().get("https://reqres.in/api/users?page=2").then().assertThat()
                .statusCode(200);


        given().when().get("https://reqres.in/api/users?page=2").then()
                .statusCode(200).body("data[0].id", equalTo(7));


        given().when().get("https://reqres.in/api/users?page=2").then()
                .statusCode(200).body("data[0].email", equalTo("michael.lawson@reqres.in"));


        given().when().get("https://reqres.in/api/users?page=2").then()
                .statusCode(200).body("data.email", hasItems(
                        "michael.lawson@reqres.in", "lindsay.ferguson@reqres.in"));


        given().when().get("https://reqres.in/api/users?page=2").then()
                .statusCode(200).body("data.email", hasItem(
                        "michael.lawson@reqres.in"));


        given().when().get("https://reqres.in/api/users?page=2").then()
                .statusCode(200).body("data[0].email", containsString(
                        "michael.lawson@reqres.in"));


        given().when().get("https://reqres.in/api/users?page=2").then()
                .statusCode(200).body("data.email", notNullValue());


        //  https://reqres.in/api/users/2


        given().when().get("https://reqres.in/api/users/2").then()
                .statusCode(200).body("support.url", notNullValue());


        given().when().get("https://reqres.in/api/users/2").then()
                .statusCode(200).body("support.text",
                        notNullValue());


        given().when().get("https://reqres.in/api/users/2").then()
                .statusCode(200).body("support.url",
                        notNullValue());


        given().when().get("https://reqres.in/api/users/2").then()
                .statusCode(200).body("support.url",
                        notNullValue());


    }
}
