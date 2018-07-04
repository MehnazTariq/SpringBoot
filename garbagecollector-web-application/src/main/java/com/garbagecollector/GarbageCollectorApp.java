package com.garbagecollector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;



/**
 * Hello world!
 *
 */
@SpringBootApplication
public class GarbageCollectorApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(GarbageCollectorApp.class, args);
    	
//    	GeoApiContext context = new GeoApiContext.Builder()
//    		    .apiKey("AIzaSyDJFlCml5x8Ly7mMSH4w8xC9lr4xfOTF54")
//    		    .build();
//    		GeocodingResult[] results = null;
//			try {
//				results = GeocodingApi.geocode(context,
//				    "1600 Amphitheatre Parkway Mountain View, CA 94043").await();
//			} catch (ApiException e) {
//				
//				e.printStackTrace();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//    		Gson gson = new GsonBuilder().setPrettyPrinting().create();
//    		System.out.println(gson.toJson(results[0].addressComponents));

    	
    }
}
