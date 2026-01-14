package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;



public class tx {




        @Test
        public void geeTest()
        {

            given().headers("Content-Type", "application/json")
                    .when().get("https://reqres.in/api/users/2").then()
                    .assertThat().statusCode(200)
                    .body("data.id",equalTo(2));



            given().headers("Content-Type", "application/json")
                    .when().get("https://reqres.in/api/users/2").then()
                    .assertThat().statusCode(200)
                    .body("data.last_name",equalTo("Weaver"));








        }
}
