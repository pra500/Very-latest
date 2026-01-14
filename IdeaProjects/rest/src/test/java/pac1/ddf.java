package pac1;

import java.util.*;

import static io.restassured.RestAssured.given;

public class ddf {

    public static void main(String[] args) {

        Map<String, String> map=new HashMap<String, String>();
        map.put("Content-Type", "application/json");
        map.put("Accept", "*/*");
        map.put("Connection", "keep-alive");

given().headers(map).when().get("https://jsonplaceholder.typicode.com/posts/1/comments")
        .then().assertThat().statusCode(200);



    }
}
