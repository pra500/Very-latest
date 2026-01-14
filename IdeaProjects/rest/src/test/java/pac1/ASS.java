package pac1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.checkerframework.checker.index.qual.LessThan;

public class ASS {


    public static void main(String[] args) {
//1:

        Response response= RestAssured.given().log().all().when().get("https://api.restful-api.dev/objects");
        if(response.getStatusCode()==200)
        {
            System.out.println("req is correct only");
        }
    else
        {
            System.out.println("req is not correct only");
        }


    //2:
       String s= response.getStatusLine();

        if(s.contains("200"))
        {
            System.out.println("right");
        }
        else
        {
            System.out.println("wrong");
        }



        //3:

        if( response.getContentType().contains("application"))
            System.out.println("perfect");
        else
            System.out.println("imperfect");



        //4:

        System.out.println(response.getCookies());

        //5:
        System.out.println(response.getTime());


















    }
}
