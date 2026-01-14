package pac1;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


import org.hamcrest.Matchers.*;
import org.testng.annotations.Test;


public class Getssss {

    @Test
    public void getsssTest() {


        given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data[0].id", equalTo(7));


    }







    @Test
    public void getssssTest() {


        given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data[0].first_name", equalTo("Michael"));


    }


}
