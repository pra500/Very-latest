package pac1;

import org.example.Main;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class SEEEE {

    @Test
    public void tSSTest()
    {


given().when().get("https://fake-json-api.mock.beeceptor.com/companies")
        .then().statusCode(200).and().body("industry", hasItem("Technology"));






        given().when().get("https://fake-json-api.mock.beeceptor.com/companies")
                .then().statusCode(200).and().body("employeeCount", notNullValue());





        given().when().get("https://fake-json-api.mock.beeceptor.com/companies")
                .then().statusCode(200).and().body("logo", hasItems("https://example.com/logo1.png"
                , "https://example.com/logo1.png"));





        given().when().get("https://api.restful-api.dev/objects/7")
                .then().statusCode(200).and().body("data.year", notNullValue());



//
//
//        {
//            "name": "Apple MacBook Pro 16",
//                "data": {
//            "year": 2019,
//                    "price": 1849.99,
//                    "CPU model": "Intel Core i9",
//                    "Hard disk size": "1 TB"
//        }
//        }


        System.out.println("----------------");

        JSONObject jo1=new JSONObject();
        jo1.put("year", 2034);
        jo1.put("price", 1249.99);
        jo1.put("CPU model", "Intel22 Core i9");
        jo1.put("Hard disk size", "15 TB");



        JSONObject jo=new JSONObject();
        jo.put("name", "Apple MacBoq222ok Pro 16");
        jo.put("data", "jo1");



        given().header("Content-Type", "application/json").
                body(jo.toString()).when().post("https://api.restful-api.dev/objects")
                .then().statusCode(201).assertThat().body("data.year", equalTo(2034));













    }
}
