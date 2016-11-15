/**
 * Created by Vincent on 15/11/2016.
 */
public class Opdracht1Test {
    public static void main(String[] args){
        new Opdracht1Test().run();
    }


    private void run(){

        /*
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        return totalTime; */

        int[] ar = Opdracht1.algorithmOne(6);
        bubbleSort(ar);
        printIntArray(ar);
        testArray(ar);
    }

    public static void bubbleSort(int[] numbers) {

        boolean finished = false;
        while (!finished) {
            finished = true;
            for(int i=1; i<numbers.length; i++) {
                int temp = 0;
                if(numbers[i-1] > numbers[i]) {
                    temp = numbers[i-1];
                    numbers[i-1] = numbers[i];
                    numbers[i] = temp;
                    finished = false;
                }
            }
        }

    }

    public static boolean testArray(int[] ar) {
        int previous = 0;
        if (ar[0] != 0) {
            return false;
        }

        for(int i=1; i<ar.length; i++) {
            int current = previous + 1;
            if (ar[i] != current) {
                return false;
            }
            previous = current;
        }
        System.out.println("Array valid!");
        return true;
    }

    public static void printIntArray(int[] array) {
        for (int number: array) {
            System.out.printf(number + " ");
        }
        System.out.printf("\n");
    }
}
