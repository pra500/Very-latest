package pac1;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;

public class Vvn {


    @Test
    public void testVvnTest() {

        given().header("Content-Type", "application/json").when().
                get("https://reqres.in/api/unknown").then().assertThat().statusCode(200);




        given().header("Content-Type", "application/json").when().
                get("https://reqres.in/api/unknown").then().assertThat().statusCode(200).log().all();



        given().header("Content-Type", "application/json").when().
                get("https://reqres.in/api/unknown").then().assertThat().statusCode(200)
                .body("page", equalTo(1));



        given().header("Content-Type", "application/json").when().
                get("https://reqres.in/api/unknown").then().assertThat().statusCode(200)
                .body("page", equalTo(1));




        given().header("Content-Type", "application/json").when().
                get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("page", equalTo(2));



        given().header("Content-Type", "application/json").when().
                get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("page", equalTo(2));



        given().header("Content-Type", "application/json").when().
                get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200);
             //   .body("data[1].name", notNullValue());





        given().header("Content-Type", "application/json").when().
                get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data[1].year", equalTo(2001));



        given().header("Content-Type", "application/json").when().
                get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data[1].pantone_value", equalTo("17-2031"));






        given().header("Content-Type", "application/json").when().
                get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data", hasSize(6));




        given().header("Content-Type", "application/json").when().
                get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data[4].name", equalTo("aqua sky"));






        given().header("Content-Type", "application/json").when().
                get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("support.url", equalTo("https://contentcaddy.io?utm_source=reqres&utm_medium=json&utm_campaign=referral"));


















    }


}
