package pac1;

import static io.restassured.RestAssured.given;import static org.hamcrest.Matchers.*;



public class dfded3 {
    public static void main(String[] args)
    {
        given().when().get("https://fake-json-api.mock.beeceptor.com/users")
                .then().assertThat().statusCode(200)
                .body("",hasSize(10));




    }

}
