package testcases;

import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.Playwright;

public class SendingGETRequest {

    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        APIRequestContext apiRequestContext = playwright.request().newContext();

//        Playwright playwright = Playwright.create();
//        APIRequestContext request = playwright.request().newContext();
//        APIResponse response = request.get("http://localhost:8080/api/users/1");
//
//
//        System.out.println("Status code : "+response.status());
//        String responseBody = response.text();
//        System.out.println("Response Body : "+responseBody);
//
//
//        JsonObject jsonResposne = JsonParser.parseString(responseBody).getAsJsonObject();
//        String firstName = jsonResposne.get("firstName").getAsString();
//        System.out.println(firstName);
//        request.dispose();
//        playwright.close();

    }
}
