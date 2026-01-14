package pac444;

import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class dd {

  //  import org.json.JSONObject;





    @Test
    public void testCreateUserWithJSONObject() {
        JSONObject payload = new JSONObject();
        payload.put("name", "Alex Johnson");
        payload.put("job", "Automation Engineer");

        given()
                .baseUri("https://reqres.in/api/users")
                .header("Content-Type", "application/json")
                .body(payload.toString())
                .when()
                .post()
                .then()
                .statusCode(201)
                .body("name", equalTo("Alex Johnson"))
                .body("id", notNullValue())
                .body("job", equalTo("Automation Engineer"));





    }
}



