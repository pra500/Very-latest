package pac1;

import com.github.dockerjava.api.model.CpuStatsConfig;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class Fg {
    @Test
    public void test() {


        given().when().get("https://fake-json-api.mock.beeceptor.com/users")
                .then().assertThat().statusCode(200)
                .body("[1].id", equalTo(2));



    }
}
