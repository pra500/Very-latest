package pac1;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Headerheadersdiff {


    @Test
    public void testTest()
    {
        given().header("Content-Type", "application/json")
                .when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200);



        given().headers("Content-Type", "application/json",
                "Connection", "keep-alive",
                "Accept", "*/*",
                        "Accept-Encoding", "gzip, deflate, br").when().get("https://reqres.in/api/users/2").
        then().assertThat().statusCode(200);





        //using a map also we can do headers

        Map<String, String> map=new HashMap<String, String>();
        map.put("Content-Type", "application/json");
        map.put("Connection", "keep-alive");
        map.put("Accept", "*/*");

        given().headers(map).when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200);
















    }


   // @Test
    public void tedddstTest()
    {}



    //@Test
    public void tesdfestTest()
    {}







}
