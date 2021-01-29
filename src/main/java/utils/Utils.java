package utils;

import pageObjects.BasePage;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Utils extends BasePage {

    public static void main(String[] args) {
        System.out.println(getRandomCountryOrCity());
    }

    public static String getRandomString(int bound) {
        String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder builder = new StringBuilder(bound);

        for (int i = 0; i < bound; i++) {
            int index = (int) (alphaNumericString.length() * Math.random());
            builder.append(alphaNumericString.charAt(index));
        }

        return builder.toString();
    }

    public static String getRandomNumber() {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            builder.append(random.nextInt(9));
        }
        return builder.toString();
    }

    public static boolean getRandomBoolean(int bound) {
        Random random = new Random();
        int number = Math.abs(random.nextInt(bound));
        return number % 2 == 0;
    }

    public static String getRandomEmail() {
        return getRandomString(7) + "@" + getRandomString(5) + ".com";
    }

    public static String getRandomCountryOrCity() {
        Random random = new Random();
        String letters = "abcdefghijklmnopqrstuvxyz";

        StringBuilder builder = new StringBuilder();
        int bound = Math.abs(random.nextInt(45)) + 5;

        for (int i = 0; i < bound; i++) {
            int index = (int) (letters.length() * Math.random());
            builder.append(letters.charAt(index));
        }

        String randomString = builder.toString();
        String[] strings = randomString.split("");

        StringBuilder finalString = new StringBuilder();
        finalString.append(strings[0].toUpperCase());

        for (int i = 1; i < strings.length; i++) {
            finalString.append(strings[i]);
        }
        return finalString.toString();
    }

    public static Map<String, String> getNewClientData() {
        Map<String, String> data = new HashMap<>();
        data.put("FirstName", getRandomString(7));
        data.put("LastName", getRandomString(7));
        data.put("Email", getRandomEmail());
        data.put("Country", getRandomCountryOrCity());
        data.put("City", getRandomCountryOrCity());
        data.put("Phone", getRandomNumber());
        data.put("Skype", getRandomString(10));
        return data;
    }

}
