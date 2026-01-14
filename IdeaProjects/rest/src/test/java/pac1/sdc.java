package pac1;

import org.testng.annotations.Test;

import java.util.*;

import static io.restassured.RestAssured.given;

public class sdc {
    //   https://api.restful-api.dev/objects?id=1


    @Test
    public void tesdsctTest(){
/*

  given().queryParam("id", 1).
         when().get("https://api.restful-api.dev/objects")
          .then().statusCode(200);


//   https://api.restful-api.dev/objects/7


        given().pathParam("id", 7).when()
                .get("https://api.restful-api.dev/objects/{id}").then().assertThat().statusCode(200);

*/






Map<String, String> map=new HashMap<String, String>();
 map.put("Content-Type", "application/json");
 map.put("Accept", "*/*");
 map.put("Content-Type", "application/json");
 map.put("Content-Type", "application/json");



 given().headers(map).when().get("https://fake-json-api.mock.beeceptor.com/users").then().assertThat()
         .statusCode(200);




 //  https://fake-json-api.mock.beeceptor.com/users/1

        //need to practice












    }
}
