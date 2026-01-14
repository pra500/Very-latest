package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class dd90 {


    @Test
    public void ddsdTest() {


        //given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200);

        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200);


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("page", equalTo(2));


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("total", equalTo(12));


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("total_pages", equalTo(2));


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data.first_name", hasItem("Lindsay"));


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data.first_name", hasItems("Lindsay", "Michael"));


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("data", hasSize(6));


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("support.url", equalTo("https://contentcaddy.io?utm_source=reqres&utm_medium=json&utm_campaign=referral"));


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("support.url", notNullValue());


        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200)
                .body("support.url", equalTo("https://contentcaddy.io?utm_source=reqres&utm_medium=json&utm_campaign=referral"));


        // .body("support.url", equalTo("https://contentcaddy.io?utm_source=reqres&utm_medium=json&utm_campaign=referral"));


    }
}
