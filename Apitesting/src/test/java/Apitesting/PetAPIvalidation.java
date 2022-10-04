package Apitesting;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.* ;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PetAPIvalidation {
	
	
	@Test

	public void Apipetstorevalidations () {
		
		//static void main(String[] args)
		
		// TODO Auto-generated method stub
		
		//given - give all imput details
				//when - Submit the API
				//Then - validate the response
				RestAssured.baseURI= "https://petstore.swagger.io/v2";
				

		// Get request
		
		RequestSpecification httprequest=RestAssured.given();
		Response res=httprequest.request(Method.GET,"/pet/130391");
		String responseBody=res.getBody().asString();
		Reporter.log("Response Body is:"+responseBody);
		//ReportlogPass("Response Body is:"+responseBody);
		int statuscode=res.getStatusCode();
	    Reporter.log("Response Code is:"+statuscode);
	    Assert.assertEquals(statuscode, 200);
		
		// PUT request
	    
	    RequestSpecification putrequest=RestAssured.given();
	    JSONObject reqparams = new JSONObject();
	    JSONObject catergoryparms = new JSONObject();
	    JSONObject tagparams = new JSONObject();
	    catergoryparms.put("id","13");
	    catergoryparms.put("name", "Cat");
	    tagparams.put("id","0");
	    tagparams.put("name","string");
	    reqparams.put("id","130391");
	    reqparams.put("category", catergoryparms);
	    reqparams.put("name", "DogC");
	    reqparams.put("photourls", "[abcd]");
	    reqparams.put("tags","["+tagparams+"]");
	    reqparams.put("status", "available");
	    
	    
	    putrequest.header("Content-Tyoe", "application/json");
	    putrequest.body((reqparams.toJSONString()));
	    
	    Response response_PUT=putrequest.request(Method.PUT,"/pet/130391");
	    
	    String responseBody_PUT=response_PUT.getBody().asString();
	    
	    Reporter.log("Response Body is:"+responseBody_PUT);
	    int statuscode_PUT=response_PUT.getStatusCode();
	    Reporter.log("Response Code is:"+statuscode_PUT);
	    Assert.assertEquals(statuscode_PUT, 200);
//	    
	    
	    
		// DELETE request
			
	    RequestSpecification deleterequest= RestAssured.given()
	    .header("Authorization", "special-key")
		.header("Content-Type", "application/json");
	    
	    Response response_Delete=deleterequest.body("https://petstore.swagger.io/v2")
	    	.request(Method.DELETE,"/pet/130391");
	    		
	    Reporter.log("Response Body is:"+response_Delete);
	    int statuscode_Delete=response_Delete.getStatusCode();
	    Reporter.log("Response Code is:"+statuscode_Delete);
	    Assert.assertEquals(statuscode_Delete, 200);
	    				
					

	}


	}

