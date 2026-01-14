package pac1;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;




public class s {

    public static void main(String[] args) {

        //hasitem
//
//        given().when().get("https://dummy-json.mock.beeceptor.com/posts")
//                .then().assertThat().statusCode(200)
//                .body("[0].title", equalTo("Introduction to Artificial Intelligence")).and()
//                .body("[1].title", hasItem("Web Development with React"));
//
//




        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(222);



    }
}
