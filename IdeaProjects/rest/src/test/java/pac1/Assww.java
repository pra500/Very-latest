package pac1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;

public class Assww {

    @Test
    public void teDFFTest() {

        Response response = RestAssured.given().when()
                .get("https://reqres.in/api/users");
        int code = response.getStatusCode();
        // Assert.assertEquals(code, 200);

        System.out.println(response.prettyPrint());
        System.out.println();

        System.out.println();

        System.out.println();

        response.getStatusLine();


    }
}
