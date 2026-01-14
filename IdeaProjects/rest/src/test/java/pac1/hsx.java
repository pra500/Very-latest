package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class hsx {


    @Test
    public void hsx()
    {


        //    https://api.restful-api.dev/objects/7
//   https://api.restful-api.dev/objects?id=3&id=5&id=10
//  https://reqres.in/api/users/2
        //   https://jsonplaceholder.typicode.com/comments?postId=1




//        given().
//                pathParam("id", 7)
//                .when().get("https://api.restful-api.dev/objects/{id}")
//                .then().assertThat().statusCode(200);


//
//        given().queryParam("id", 3)
//                .and().queryParam("id", 5).and()
//                .queryParam("id", 7).when().get("https://api.restful-api.dev/objects?id=3&id=5&id=10")
//                .then().assertThat().statusCode(200);





        given().pathParam("id", 2).when().get("https://reqres.in/api/users/{id}")
                .then().assertThat().statusCode(200);





        given().pathParam("id", 2).when().get("https://reqres.in/api/users/{id}")
                .then().assertThat().statusCode(200);




    //    https://jsonplaceholder.typicode.com/comments?postId=1

        given().queryParam("postId", 1)
                .when().get("https://jsonplaceholder.typicode.com/comments")
                .then().statusCode(200);





        given().queryParam("page", 2).when().get("https://reqres.in/api/users")
                .then().assertThat().statusCode(200);



        given().queryParam("page", 3).when().get("https://reqres.in/api/users")
                .then().assertThat().statusCode(200);


















        //  https://reqres.in/api/users?page=2




















//    https://jsonplaceholder.typicode.com/comments?postId=1







    }
}
