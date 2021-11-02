package utilities;

import java.util.Random;

public class Utility {
    public static int generateRandomNum(){
        Random random = new Random();
        return random.nextInt(99999);

    }
}
