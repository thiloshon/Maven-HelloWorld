package com.iit.tutorials;

import org.json.JSONObject;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        String HelloWorld = "Hello World";

        JSONObject HelloWorldJSON = new JSONObject().put("Message", HelloWorld);

        System.out.println(HelloWorldJSON.toString());
    }
}
