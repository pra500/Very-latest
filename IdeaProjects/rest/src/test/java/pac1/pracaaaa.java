package pac1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.bytebuddy.asm.MemberSubstitution;
import org.json.JSONObject;

public class pracaaaa {


    public static void main(String[] args) {

//
//
//        Response response = RestAssured.given().when().get("https://reqres.in/api/users?page=2").then()
//                .statusCode(200).extract().response();
//
//        String s=
//        response.getContentType();
//        System.out.println(s);


        JSONObject jo=new JSONObject();
        jo.put("bookingid", 1000);


        Response res=RestAssured.given().body(jo.toString()).
        when().post("https://restful-booker.herokuapp.com/booking").then().extract().response();

        String ssss=
res.asString();


        System.out.println( res.getStatusCode());

        System.out.println(ssss);







        //put:


    }

}
