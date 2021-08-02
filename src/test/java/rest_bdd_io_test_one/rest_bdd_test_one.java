package rest_bdd_io_test_one;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;


import io.restassured.RestAssured;

public class rest_bdd_test_one {
	String body;

	
	@BeforeTest
	public void baseUri()
	{
		RestAssured.baseURI="https://reqres.in/";
		
	}
	
	
	
	
	
	
	
	
	
	@Test
	public void test_01() 
	{
//		RestAssured.baseURI="https://reqres.in/";

		given().
				get("api/users/2").
					then().body("data.id", equalTo(2)).log().all();
	
		
		
		
		
	}
	
	
	@Test
	public void test_02()
	{	
		System.out.println("This is also running!");	

		
		
		
	}
	
	
	@Test
	public void test_03()
	{
		
	}

}
