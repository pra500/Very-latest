package pac1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Testngassertiontrial {
    @Test
    public void test1Test() {



        Response response = RestAssured.given()
                .when().get("https://fake-json-api.mock.beeceptor.com/users");

        int code =
                response.getStatusCode();

        Assert.assertEquals(200, code);

        String s=
        response.getBody().asString();

        boolean b=
        s.contains("id");

        Assert.assertTrue(b);



        String ss=
        response.getHeader("Content-Type");

        Assert.assertEquals(ss,"application/json", "application/json; charset=utf-8");






int code1=

        response.getStatusCode();
Assert.assertEquals(code1,200);




boolean flag=
        response.getBody().asString().contains("photo");
Assert.assertTrue(flag);










    }
}
