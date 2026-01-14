package pac1;

import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class te {

    public static void main(String[] args){

        given().when().delete("https://api.restful-api.dev/objects/6").then().assertThat().statusCode(405);

//
//        {
//            "name": "Apple MacBook Pro 16",
//                "data": {
//            "year": 2019,
//                    "price": 1849.99,
//                    "CPU model": "Intel Core i9",
//                    "Hard disk size": "1 TB"
//
//        }

//        JSONObject jo=new JSONObject();
//
//        jo.put("name", "cxd");
//        jo.put("data")

//given().when().delete("https://api.restful-api.dev/objects/6").then().st




    }
}
