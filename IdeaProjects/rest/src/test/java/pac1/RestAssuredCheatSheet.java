package pac1;

import static io.restassured.RestAssured.*;


public class RestAssuredCheatSheet {

    public static void main(String[] args) {

        //https://reqres.in/api/users/2

        //path parameter:

        given().baseUri("https://reqres.in").pathParam("userId", 2)

                .get("/api/users/{userId}").then().statusCode(200);






     //   given().baseUri("//https://reqres.in").pathParam("users", 2)






     //     https://reqres.in/api/users?page=2




        given().baseUri("https://reqres.in").queryParam("page", 2).when()
                .get("/api/users").then().assertThat().statusCode(200);











        //2. Authentication





    }
}
