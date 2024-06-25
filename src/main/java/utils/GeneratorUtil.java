package utils;

import java.util.Random;

public class GeneratorUtil {

    public static String generateRandomEmail(){
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000) + "j.jons@gmail.com";

    }

}
