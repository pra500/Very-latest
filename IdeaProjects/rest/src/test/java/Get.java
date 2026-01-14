import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get {

    public static void main(String[] args) {


        // Base URI
        RestAssured.baseURI = "https://reqres.in";

        // GET request
        Response response = RestAssured
                .given()
                .when()
                .get("/api/users?page=2")
                .then()
                .statusCode(200)   // validate status code
                .extract().response();

        // Print response
        System.out.println("Response Body:");
        System.out.println(response.asPrettyString());
    }



    }


