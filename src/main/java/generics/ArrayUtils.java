package generics;

import java.util.Random;

public class ArrayUtils {
    public static Object randomElement(Object [] array){
        Random rand = new Random();
        return array[rand.nextInt(array.length)];
    }

    /*
    Параметр типа указывается перед возвращаемым значением.
     */
    public static <T> T genericRandomElement(T [] array){
        Random random = new Random();
        return array[random.nextInt(array.length)];
    }
}
