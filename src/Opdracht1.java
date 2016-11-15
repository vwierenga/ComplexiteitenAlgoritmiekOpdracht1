import java.util.Random;

/**
 * Created by Vincent on 15/11/2016.
 */
public class Opdracht1 {
    public static int[] algorithmOne(int n){

        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            boolean existingNumber = true;
            int randomInt = 0;
            while (existingNumber) {
                randomInt = randInt(0, n);
                existingNumber = false;
                for(int j = 0; j < i; j++){
                    if(ar[j] == randomInt){
                        existingNumber = true;
                    }
                }
            }
            ar[i] = randomInt;
        }

        return ar;
    }

    public static void algorithmTwo(int n){

    }
    public static void algorithmThree(int n){

    }

    public static int randInt(int min, int max){
        return (int) (Math.random() * (max - min)) + min;
    }

}
