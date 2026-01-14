package pac1;

import org.json.JSONObject;

import static io.restassured.RestAssured.given;





public class Stxv {

    public static void main(String[] args)
    {

//
//
//        {
//            "name": "Apple MacBook Pro 16",
//                "data": {
//            "year": 2019,
//                    "price": 1849.99,
//                    "CPU model": "Intel Core i9",
//                    "Hard disk size": "1 TB"
//        }
//        }



//
//        {
//            "userId": 1,
//                "id": 2,
//                "title": "Introduction to Artificial Intelligence",
//                "body": "Learn the basics of Artificial Intelligence and its applications in various industries.",
//                "link": "https://example.com/article1",
//                "comment_count": 8
//        }







        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().
                statusCode(200);




        JSONObject j1=new JSONObject();
        j1.put("userId", 56);
        j1.put("id", 58);
        j1.put("title", "Introduction to Artificial Intelligenceyyyyy");
        j1.put("body", "Learn the basics of Artificial Intelligence and its applications in various industries.yyyyy");
        j1.put("link", "https://example.com/article1eeeee");
        j1.put("comment_count", 88);


given().body(j1.toString()).when().post("https://dummy-json.mock.beeceptor.com/posts/58").then().statusCode(200);











    }
}
