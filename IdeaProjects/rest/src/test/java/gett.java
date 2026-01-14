import io.restassured.RestAssured;
import io.restassured.response.Response;

public class gett {


    public static void main(String[] args) {
Response respose= RestAssured.given().when()
        .get("https://jsonplaceholder.typicode.com/posts/1");

String s=
respose.getContentType();

        System.out.println(s);
    }
}
