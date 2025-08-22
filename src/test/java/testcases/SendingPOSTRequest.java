package testcases;

import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.Playwright;

public class SendingPOSTRequest {

    Playwright playwright = Playwright.create();
    APIRequestContext apiRequestContext = playwright.request().newContext();


//    Playwright playwright = Playwright.create();
//    APIRequestContext request = playwright.request().newContext();
//
//
//    //Request Payload
//
//    Map<String, Object> data = new HashMap<>();
//		data.put("email","trump@way2automation.com");
//		data.put("firstName","Donald");
//		data.put("lastName","Trump");
//
//    APIResponse response = request.post("http://localhost:8080/api/users", RequestOptions.create().setData(data));
//
//		System.out.println("Status code: "+response.status());
//
//
//		request.dispose();
//		playwright.close();

}
