package pac1;

import org.json.JSONObject;

import java.util.*;

import static io.restassured.RestAssured.*;

public class get1111 {

    public static void main(String[] args) {


        //delete:

       // given().when().delete("https://reqres.in/api/users/2").then().statusCode(204);
        given().when().delete("https://reqres.in/api/users/2").then().statusCode(204);


//get:

        given().when().get("https://reqres.in/api/users/2").then().statusCode(200);











        //post:

        JSONObject jo = new JSONObject();
        jo.put("name", "Cherry");
        jo.put("job", "qalead");

        given().body(jo.toString()).when().post("https://reqres.in/api/users").then().statusCode(201);


        //put:


        //     https://reqres.in/api/users/2

        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "Cherry111");
        map.put("job", "devlead");


        given().body(map).when().put("https://reqres.in/api/users/2").then().statusCode(200);


        //patch:


        JSONObject jo1 = new JSONObject();
        jo1.put("name", "Cherry888888");
        //   jo.put("job","qalead");


        given().body(jo1.toString()).when().put("https://reqres.in/api/users/2").then().statusCode(200);




    }
}




