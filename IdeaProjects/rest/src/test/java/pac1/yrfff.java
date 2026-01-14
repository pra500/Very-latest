package pac1;

import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class yrfff {

    @Test
    public void eTest()
    {


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






        given().when().get("https://api.restful-api.dev/objects")
                .then().assertThat().statusCode(200);


        //https://api.restful-api.dev/objects




//
//
//        JSONObject jo1=new JSONObject();
//        jo1.put("year", 2026);
//        jo1.put("price", 1844.99);
//        jo1.put("CPU model", "Intel Coeere i9");
//        jo1.put("Hard disk size", "2 TB");
//
//
//
//        JSONObject jo=new JSONObject();
//        jo.put("name", "Apple MaddddcBook Pro 16");
//        jo.put("data", "jo1");
//
//given().body(jo.toString()).when().post("https://api.restful-api.dev/objects").then().assertThat()
//        .statusCode(200);
//
//

        given().when().get("https://api.restful-api.dev/objects/1")
                .then().assertThat().statusCode(200);






        given().when().get("https://api.restful-api.dev/objects/10")
                .then().assertThat().statusCode(200);



        given().when().get("https://api.restful-api.dev/objects/2")
                .then().assertThat().statusCode(200);














    }
}
