package pac444;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;

public class Post1 {

    public static void main(String[] args) {


        //******post*******

/*
        {
            "userId": 1,
                "id": 2,
                "title": "qui est esse",
                "body": "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla"
        },
*/



/*
        JSONObject jo=new JSONObject();
        jo.put("userId", 44);
        jo.put("id", 192);
        jo.put("title", "titles1");
        jo.put("body", "errrsr");
*/




        //result diff in both below
//
//                Response response= RestAssured.given().header("Content-Type","application/json").body(jo.toString())
//                .when().post("https://jsonplaceholder.typicode.com/posts");


//
//        Response response= RestAssured.given().body(jo.toString())
//                .when().post("https://jsonplaceholder.typicode.com/posts")
//
//                .then().statusCode(201).extract().response();
//
//


       // System.out.println(response.asString());




        //put:

//        {
//            "userId": 4,
//                "id": 35,
//                "title": "id nihil consequatur molestias animi provident",
//                "body": "nisi error delectus possimus ut eligendi vitae\nplaceat eos harum cupiditate facilis reprehenderit voluptatem beatae\nmodi ducimus quo illum voluptas eligendi\net nobis quia fugit"
//        }


/*

        //**********put******
        JSONObject jo=new JSONObject();
        jo.put("title", "abc");

        Response response=RestAssured.given()
                        .header("Content-Type", "application/json").
                                body(jo.toString()).when().put("https://jsonplaceholder.typicode.com/posts/4")
                .then().statusCode(200).extract().response();

        System.out.println(response.asString());

*/








        //**********post******
//post:
//
//
//        {
//            "name": "morpheus",
//                "job": "leader"
//        }



        JSONObject jo1=new JSONObject();
        jo1.put("name", "ankur");
        jo1.put("job", "manager");

        Response response1=RestAssured.given()
                .header("Content-Type", "application/json").
        body(jo1.toString()).when().post("https://reqres.in/api/users/2")
                .then().statusCode(201).extract().response();

        System.out.println(response1.asString());















    }
}
