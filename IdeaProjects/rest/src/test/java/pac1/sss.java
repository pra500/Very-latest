package pac1;

import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class    sss {

    @Test
    public void m1Test(){


        //given().when().get("https://reqres.in/api/users/2").then().statusCode(200);


       given().when().get("https://reqres.in/api/users/2").then().statusCode(200);

        given().when().get("https://api.restful-api.dev/objects").then().statusCode(200);


    }


//

   // @Test
    public void m2Test(){

        given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).log().all();








    }
//
//
//    @Test
//    public void m3Test() {
//        JSONObject jo=new JSONObject();
//        jo.put("name","samm");
//        jo.put("job","lead");
//
//        given().log().all().header("Content-Type", "application/json").body(jo.toString())
//                .when().put("https://reqres.in/api/users/2");
//
//
//
//    }
//
//
//    @Test
//    public void m4Test() {
//
//
//    given().log().all().when().delete("https://reqres.in/api/users/2").then().statusCode(204);
//    }
//
//    @Test
//    public void m5Test(){
//
//        given().when().get("https://reqres.in/api/users/2").then().statusCode(200);
//    }
//



}
