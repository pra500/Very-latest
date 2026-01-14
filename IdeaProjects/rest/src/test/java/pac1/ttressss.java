package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import  static org.hamcrest.Matchers.*;






public class  ttressss {
    @Test
    public void geTest() {


        given().when().get("https://api.restful-api.dev/objects/7").then().assertThat().statusCode(200)
                .body("data.year", equalTo(2019));
    }


    @Test
    public void gesTest() {


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data.email", hasItem("michael.lawson@reqres.in"));
    }

    @Test
    public void gssseTest() {



        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data.email", hasItems("michael.lawson@reqres.in", "lindsay.ferguson@reqres.in"));



    }






}

