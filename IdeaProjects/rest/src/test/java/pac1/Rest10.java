package pac1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
//import static sun.jvm.hotspot.HelloWorld.e;

public class Rest10 {





    @Test
    public void test1() {

Response re= given().when().get("https://dummy-json.mock.beeceptor.com/todos");

boolean   b =re.getStatusLine().contains("HTTP");
        System.out.println(b);


    }

    @Test
    public void test2() {


        Response re= given().when().get("https://dummy-json.mock.beeceptor.com/todos");

        System.out.println(re.prettyPrint());
        //re.prettyPrint();






    }

    @Test
    public void test3() {


        Response re= given().when().get("https://dummy-json.mock.beeceptor.com/todos");

        boolean   b =re.getStatusLine().contains("HTTP");
        System.out.println(b);

        given().when().get("https://dummy-json.mock.beeceptor.com/todos").then().assertThat().statusCode(200);
              //  .body("userId[0]", equals(3));






    }

    @Test
    public void test4() {


        Response re= given().when().get("https://dummy-json.mock.beeceptor.com/todos");

        boolean   b =re.getStatusLine().contains("HTTP");
        System.out.println(b);

        given().when().get("https://dummy-json.mock.beeceptor.com/todos").then().assertThat().statusCode(200);
        //  .body("userId[0]", equals(3));



    }
    @Test
    public void test5() {



        Response re= given().when().get("https://dummy-json.mock.beeceptor.com/posts");

        boolean   b =re.getStatusLine().contains("HTTP");
        System.out.println(b);

        given().when().get("https://dummy-json.mock.beeceptor.com/todos").then().assertThat().statusCode(200);
        //  .body("userId[0]", equals(3));






    }





}
