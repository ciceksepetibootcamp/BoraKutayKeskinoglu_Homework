import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;

public class RestAssuredSteam {

    public static String STEAM_API_KEY = "584836F79B7E03EB2C6CCFA259132CFE";
    public static String BASE_URL = "https://api.steampowered.com";
    public static String STEAM_ID = "76561198011215175";



    @Test
    public void checkNews(){  //CHECK IF IT'S ABOUT 2k GAMES
        int appId = 1644960;
        int count = 1;
        String endPoint="/ISteamNews/GetNewsForApp/v0002/?appid="+appId+"&count="+count;

        when()
                .get(BASE_URL + endPoint)
                .then()
                .statusCode(200)
                .body("appnews.newsitems[0].author",equalTo("2K Sam"))
                .time(lessThan(2000L));

    }

    @Test
    public void checkNumberOfPlayers(){  //IF NUMBER OF PLAYERS > 4000
        int appId = 72850; //SKYRIM

        String endPoint="/ISteamUserStats/GetNumberOfCurrentPlayers/v1/?appid="+appId;
        when()
                .get(BASE_URL + endPoint)
                .then()
                .statusCode(200)
                .body("response.player_count",greaterThanOrEqualTo(4000))
                .time(lessThan(2000L));

    }
    @Test
    public void checkUserHasGame(){
        int appId = 72850; //SKYRIM

        when()
                .get("https://partner.steam-api.com/ISteamUser/CheckAppOwnership/v2/?key="+STEAM_API_KEY+"&steamid="+STEAM_ID+"&appid="+appId)
                .then()
                .statusCode(200)
                .body("response.ownsapp",equalTo(true))
                .time(lessThan(2000L));
    }

    @Test
    public void friendsCheck(){
        String endPoint = "/ISteamUser/GetFriendList/v1/?key="+STEAM_API_KEY+"&steamid="+STEAM_ID;
        when()
                .get(BASE_URL+endPoint)
                .then()
                .statusCode(200);

    }




}
