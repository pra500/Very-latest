package pac222;

import org.checkerframework.checker.tainting.qual.PolyTainted;
import org.json.JSONObject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GetTrial {

    @BeforeClass
    public void beforeClass() {

        System.out.println("starting 😊😊😊😂😂😂😂");

    }


    @AfterClass
    public void afterClass() {
        System.out.println("ending 😊😊😊");
    }


    @Test(priority = 0)
    public void TestT1Test() {


        //get:

        given().when().get("https://reqres.in/api/users?page=2").then().assertThat().statusCode(200);

    }


    @Test(priority = 1)
    public void TestTw1Test() {


///        https://reqres.in/api/users/2

//post:

        JSONObject jo = new JSONObject();
        jo.put("name", "Charu");
        jo.put("job", "qa");


        given().header("Content-Type", "application/json").body(jo.toString())
                .when().post("https://reqres.in/api/users").then().assertThat().statusCode(201)
                .body("name", equalTo("Charu")).body("job", equalTo("qa"));


    }






    @Test(priority = 2)
    public void TestTrr1Test() {

//put:
        JSONObject jo = new JSONObject();
        jo.put("name", "Charu1");
        jo.put("job", "qa1");


        given().header("Content-Type", "application/json").body(jo.toString())
                .when().put("https://reqres.in/api/users/2").then().assertThat().statusCode(200)
                .body("name", equalTo("Charu")).body("job", equalTo("qa"));

    }

    @Test
    public void TestTassz1Test() {
















//patch:

        JSONObject jo = new JSONObject();
        jo.put("name", "Charu1ssddd");
        //jo.put("job", "qa1");


        given().header("Content-Type", "application/json").body(jo.toString())
                .when().patch("https://reqres.in/api/users/2").then().assertThat().statusCode(200)
                .body("name", equalTo("Charu1ssddd")).body("job", equalTo("qa"));


    }


}
