package net.kidpluto.petfinder.com.RESTful.client.demo;

import org.springframework.web.client.RestTemplate;
import java.util.Scanner;

public class demo {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Petfinder.com api key: ");
        String apikey = in.nextLine();
        // System.out.println("You entered "+ apikey);
        String endpoint = "http://api.petfinder.com/pet.getRandom?key=" + apikey;
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(endpoint, String.class);
        System.out.println("Result: " + result);
    }
}