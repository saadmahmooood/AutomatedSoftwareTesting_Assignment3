package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetBookings {
    @Test
    public void getBookingId(){

        Response getBookingId = RestAssured.get("https://restful-booker.herokuapp.com/booking/");
        getBookingId.prettyPrint();
        //Assert.assertEquals(getBookingId.jsonPath().get("firstname").toString(),"Ali","Wrong Name");
    }
}
