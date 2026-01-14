package pac1;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Hasitemhasitemshassize {

    public static void main(String[] args) {


        //it will search in entire payload


        //Hasitem, hasitems, hassize:



        given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat()
                .statusCode(200).body("title", hasItem("eveniet quod temporibus"));



        given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat()
                .statusCode(200).body("title", hasItems("eveniet quod temporibus","fugit voluptas sed molestias voluptatem provident"
                ,"delectus ullam et corporis nulla voluptas sequi"));





        given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat()
                .statusCode(200).body("title", hasItems("eveniet quod temporibus","fugit voluptas sed molestias voluptatem provident"
                        ,"delectus ullam et corporis nulla voluptas sequi"));








        given().when().get("https://dummy-json.mock.beeceptor.com/posts").then().assertThat()
                .statusCode(200).body("$", hasSize(10));







    }
}
