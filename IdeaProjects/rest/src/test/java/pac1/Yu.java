package pac1;

import static io.restassured.RestAssured.given;

public class Yu {

    public static void main(String[] args) {



        given().log().all().when().get("https://fake-json-api.mock.beeceptor.com/users");



    }


}
