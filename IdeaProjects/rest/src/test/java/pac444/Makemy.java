package pac444;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Makemy {

    public static void main(String[] args) {

        //get:
given().when().get("https://fake-json-api.mock.beeceptor.com/users").then().statusCode(200).log().all();



//post:

//
//        {
//            "name": "morpheus",
//                "job": "leader"
//        }


//
//      Map<String, String> map=new HashMap<String, String>();
//map.put("id", "ss");
//map.put("job", "dev");


//given().body(map.toString()).when().post("https://reqres.in/api/users/2").then().statusCode(201)
//        .body("name",equalTo("ss"));
//
//



        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("userId", 19);
        requestBody.put("id", 100);
        requestBody.put("title", "Introduction to Artificial Inteaaalligence");
        requestBody.put("body", "Learn the basics of Artificial Inteslligence and its applications in various industries.");
        requestBody.put("link", "https://example.com/article9");
        requestBody.put("comment_count", 46);



        given().header("Content-Type", "application/json")
                .body(requestBody).when().post("https://jsonplaceholder.typicode.com/posts").then().statusCode(201);
            //    .body("name",equalTo("ss"));











//put:
        //https://reqres.in/api/users/2


        Map<String, String> maps=new HashMap<String, String>();
        maps.put("name", "sssw");
        maps.put("job", "devss");

        given().body(maps.toString()).when().post("https://reqres.in/api/users/2")
                .then().statusCode(200);



        //patch:

        Map<String, String> maps1=new HashMap<String, String>();
        maps1.put("name", "sssw11");
        maps1.put("job", "devss");

        given().body(maps.toString()).when().patch("https://reqres.in/api/users/2")
                .then().statusCode(200);


//delete:


        given().when().delete("https://reqres.in/api/users/2").then().statusCode(204);






    }
}


