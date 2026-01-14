package pac1;

import io.restassured.response.Response;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class  pOSSSS {

public static void main(String[] args) {

//
//    {
//        "name": "morpheus",
//            "job": "leader"
//    }





  //  given().when().delete("https://reqres.in/api/users/11").then().assertThat().statusCode(204);





given().when().get("https://dummy-json.mock.beeceptor.com/todos").then().assertThat().
        statusCode(200).body("[0].id", equalTo(1));


    given().when().get("https://dummy-json.mock.beeceptor.com/todos").then().assertThat().
            statusCode(200).body("id", hasSize(lessThan(30)));


    given().when().get("https://dummy-json.mock.beeceptor.com/todos").then().assertThat().
            statusCode(200).body("id", hasItem(1));


    given().when().get("https://dummy-json.mock.beeceptor.com/todos").then().assertThat().
            statusCode(200).body("id", hasItems(1, 4, 5));




    given().when().get("https://dummy-json.mock.beeceptor.com/todos").then().assertThat().
            statusCode(200).body("id", hasItems(1, 4, 5,6));





    given().when().get("https://dummy-json.mock.beeceptor.com/todos").then().assertThat().
            statusCode(200).body("[0].id", notNullValue());




    given().when().get("https://dummy-json.mock.beeceptor.com/todos").then().assertThat().
            statusCode(200).body("[4].id", greaterThanOrEqualTo(5));




    given().when().get("https://dummy-json.mock.beeceptor.com/todos").then().assertThat().
            statusCode(200).body("[4].id", greaterThanOrEqualTo(3));




    given().when().get("https://dummy-json.mock.beeceptor.com/todos").then().assertThat().
            statusCode(200).body("[4].title", containsString("Pay bill"));




    given().when().get("https://dummy-json.mock.beeceptor.com/todos").then().assertThat().
            statusCode(200).body("[4].title", containsString("Pay"
                    ));



    given().when().get("https://dummy-json.mock.beeceptor.com/todos").then().assertThat().
            statusCode(200).body("[4].title", containsString("P"
            ));



    given().when().get("https://dummy-json.mock.beeceptor.com/todos").then().assertThat().
            statusCode(200).body("[4].title", containsString("Pay bill"));











































}
}
