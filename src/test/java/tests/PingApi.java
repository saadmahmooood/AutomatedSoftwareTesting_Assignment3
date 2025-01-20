package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.devtools.v85.fetch.model.AuthChallengeResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PingApi {
    @Test
    public void pingTest(){

        Response pingResp = RestAssured.get("https://restful-booker.herokuapp.com/ping");
        pingResp.prettyPeek();
        Assert.assertEquals(pingResp.getStatusCode(),201);
    }
}
