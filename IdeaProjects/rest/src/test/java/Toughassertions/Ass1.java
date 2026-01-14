package Toughassertions;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Ass1 {


    @Test
    public void egTest()
    {

        given().when().
                get("https://dummy-json.mock.beeceptor.com/posts").then().statusCode(200)
                .body("[0].id", equalTo(1)).and()
                .body("[1].title", equalTo("Web Development with React")).and()
                .body("[1].link", equalTo("https://example.com/article2"));


        //we can do like dat also above:

//need to understand again below:

        given().when().
                get("https://dummy-json.mock.beeceptor.com/posts").then().statusCode(200)
                .body(("[0].id"), equalTo(1),
                ("[1].title"), equalTo("Web Development with React"),
                ("[1].link"), equalTo("https://example.com/article2"));


//hasitem:

//        given().when().
//                get("https://dummy-json.mock.beeceptor.com/posts").then().statusCode(200)
//              //  .body(
//
//



























    }

}
