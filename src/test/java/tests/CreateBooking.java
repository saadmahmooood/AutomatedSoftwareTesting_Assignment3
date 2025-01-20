package tests;

import io.restassured.RestAssured;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class CreateBooking {

    @Test
    public void createBooking(){
        JSONObject newUser = new JSONObject();
        newUser.put("firstname" ,"Jim");
        newUser.put("lastname", "Brown");
        newUser.put("totalprice", 111);
        newUser.put("depositpaid", true);

        JSONObject bookingDates = new JSONObject();
        bookingDates.put("checkin" , "2018-01-01");
        bookingDates.put("checkout" , "2019-01-01");


        newUser.put("bookingdates", bookingDates);
        newUser.put("additionalneeds", "Breakfast");

        System.out.println(newUser.toString());

        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(newUser.toString())
                .post(
                        " https://restful-booker.herokuapp.com/booking/");
    }
}
