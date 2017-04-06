package com.interview.learn.tests;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by chandrad on 4/6/17.
 */
public class WebServiceTests {

    //  1.   Create the request .. GET request
    //  Request URL:https://numverify.com/php_helper_scripts/phone_api.php?secret_key=5361b752e722907c6072aa67bf122ca0&number=9106513295571

    // URI : https://numverify.com/
    // endpoint : php_helper_scripts/phone_api.php?
    // Query Parameters :
    // scretkey = 5361b752e722907c6072aa67bf122ca0
    // number=9106513295571


    // 2.   Access/Trigger the request via HTTPCLIENT library ...

    // 3.   Access the response .. Handle the response .. (buffered reaader , input stream , readline)

    //4.    Assertions .... expected response ...


 //   http://apilayer.net/api/validate?", "access_key=500df77a8372eddc279852a0f085c1cc&number=917795070274

    String url =  "http://apilayer.net/api/validate?" ;
    String secret = "500df77a8372eddc279852a0f085c1cc" ;
    String number = "+916513295571";
    String reqURI = url + "access_key=" + secret + "&number=" + number;

    StringBuffer respAsString = new StringBuffer() ;


    @Test
    public void accessApi() throws IOException {

        CloseableHttpClient httpclient = HttpClients.createDefault();
        System.out.println(reqURI);
        HttpGet httpget = new HttpGet(reqURI);

        // triggering the request
        CloseableHttpResponse response = httpclient.execute(httpget);




//  //      BufferedReader  ... it excepts a input stream reader  of data  /
//        // inputStreaReder : it excepts a stream of strings...
//

        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent())) ;
        StringBuffer responseString = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            respAsString.append(line);
        }

        System.out.println(respAsString);

        JSONObject obj = new JSONObject(respAsString.toString());

        System.out.println(obj.get("carrier"));
        System.out.println(obj.get("valid"));
        System.out.println(obj.get("line_type"));
        System.out.println(obj.get("location"));
        System.out.println(obj.get("country_name"));

        Assert.assertEquals(obj.get("line_type"), "tollfree");


    }








}
