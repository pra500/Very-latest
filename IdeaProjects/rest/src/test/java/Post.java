import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Post {

    public static void main(String[] args) {
//
//
//        Response resp = RestAssured.given().when().
//
//                get("https://reqres.in/api/users?page=2").
//
//                then().
//                statusCode(200).extract().response();
//
//
//        System.out.println(resp.prettyPrint());
//        //resp.prettyPrint()
//



//
//        {
//                "userId": 1,
//                "id": 1,
//                "title": "Introduction to Artificial Intelligence",
//                "body": "Learn the basics of Artificial Intelligence and its applications in various industries.",
//                "link": "https://example.com/article1",
//                "comment_count": 8
//        }


        JsonObject jo=new JsonObject();
/*

        jo.put("userId", 23);
        jo.get("id", 23);
        jo.get("title", "title1");
        jo.get("body", "Learn the basieecs");
        jo.get("link", "https://beeceptor.com/docs/sample-api-for-testing/");
        jo.get("comment_count", 2);

*/

        Response response = RestAssured.given().body(jo.toString()).
                when().post("").then().statusCode(201).extract().response();





        System.out.println(response.asString());
        //response.asString();


      int statuscode=  response.getStatusCode();
        System.out.println(statuscode);










    }
}
