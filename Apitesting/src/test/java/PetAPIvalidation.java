import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.* ;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PetAPIvalidation {
	
	
	@Test

	public void test2 () {
		
		//static void main(String[] args)
		
		// TODO Auto-generated method stub
		
		//given - give all imput details
				//when - Submit the API
				//Then - validate the response
				RestAssured.baseURI= "https://petstore.swagger.io/v2";
				

		
		RequestSpecification httprequest=RestAssured.given();
		
		Response res=httprequest.request(Method.GET,"/pet/130391");
		
		String responseBody=res.getBody().asString();
		
		Reporter.log("Response Body is:"+responseBody);
		//ReportlogPass("Response Body is:"+responseBody);
		
		int statuscode=res.getStatusCode();
		
		Reporter.log("Response Code is:"+statuscode);
		
		Assert.assertEquals(statuscode, 200);
		
				
				
				
			
	        
	        
	        
	        
	        
	        
	        
	      
				
				
				//.body("name", equalTo("Dog"));
				
				
				
				
				//body("status", equalTo("Available"));
				
				

		
		

	}

	private static ResponseAwareMatcher<Response> equalsTo(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
