package pac1;


import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Jsoninsidejson {

    @Test
    public void jsoninsidejson()
    {


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





        //mine:

        //request:

//
//        {
//            "name": "Apple MacBoq222ok Pro 16",
//                "data": {
//            "year": 2034,
//                    "price": 1249.99,
//                    "CPU model": "Intel22 Core i9",
//                    "Hard disk size": "15 TB"
//        }
//        }




        //response:

//
//        {
//            "id": "ff8081819782e69e019a5de6d0af7ff3",
//                "name": "Apple MacBoq222ok Pro 16",
//                "createdAt": "2025-11-07T10:39:59.151+00:00",
//                "data": {
//            "year": 2034,
//                    "price": 1249.99,
//                    "CPU model": "Intel22 Core i9",
//                    "Hard disk size": "15 TB"
//        }
//        }


        //in postman i did



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
                .then().statusCode(200).body("name", equalTo("Apple MacBoq222ok Pro 16"));
                //.body("data.year", equalTo(2034));








    }
}
