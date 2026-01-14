package pac1;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.apache.http.impl.io.SocketOutputBuffer;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static org.hamcrest.Matchers.*;




public class Asss {
    @Test
    public void testTest(){

        given().when().get("https://jsonplaceholder.typicode.com/posts").then().statusCode(200)
                .body("", hasSize(greaterThan(2)));


    }

    @Test
    public void tessddtTest(){


        given().when().get("https://jsonplaceholder.typicode.com/posts").then().statusCode(200)
                .body("id", hasItems(98, 99));

    }



@Test
public void teseedtTest(){

    given().when().get("https://jsonplaceholder.typicode.com/posts").then().statusCode(200)
            .body("title", hasItem("ea molestias quasi exercitationem repellat qui ipsa sit aut"));
}



 @Test
public void teddstTest(){
     given().when().get("https://jsonplaceholder.typicode.com/posts").then().statusCode(200)
             .body("title", hasItems("ea molestias quasi exercitationem repellat qui ipsa sit aut",
                     "sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));

}

@Test
public void teeesddsestTest(){


    given().when().get("https://jsonplaceholder.typicode.com/posts").then().statusCode(200)
            .body("[0].id", equalTo(1));

}


@Test
public void tes33tTest(){

    given().when().get("https://jsonplaceholder.typicode.com/posts").then().statusCode(200)
            .body("[1].body", notNullValue());

}

    @Test
    public void tedes33tTest(){
        Response response= RestAssured.given().get("https://jsonplaceholder.typicode.com/posts");
        int c=
        response.getStatusCode();
        Assert.assertEquals(c, 200);

    }


    @Test
    public void tedesds33tTest(){
        Response response= RestAssured.given().get("https://jsonplaceholder.typicode.com/posts");
        String c=
                response.getStatusLine();
        System.out.println(c);

    }


    @Test
    public void tedesdddds33tTest(){
        Response response= RestAssured.given().get("https://jsonplaceholder.typicode.com/posts");
        System.out.println();

        System.out.println( response.getHeaders());

brokee();



    }

    public static void brokee(){

        Response response= RestAssured.given().get("https://jsonplaceholder.typicode.com/posts");
        System.out.println();

        System.out.println( response.getHeaders());

    }



    @Test
    public void tedesdds33tTest(){
        Response response= RestAssured.given().get("https://jsonplaceholder.typicode.com/posts");
        System.out.println();

        System.out.println( response.getHeaders());


        }

    @Test
    public void tedewwwsdds33tTest(){


        Response response= RestAssured.given().get("https://jsonplaceholder.typicode.com/posts");
        System.out.println( response.getCookies());


    }



    @Test
    public void tedewwwssdds33tTest(){


        Response response= RestAssured.given().get("https://jsonplaceholder.typicode.com/posts");
        System.out.println( response.getBody().asString().contains("bo"));


    }
}














