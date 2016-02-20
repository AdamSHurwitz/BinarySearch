package foo;

/**
 * Created by adamhurwitz on 2/18/16.
 */
public class Foo {
    static private final String LOG_TAG = Foo.class.getSimpleName();
    static int min = 0;
    static int max;
    static int indexFound = -1;
    static int arrayLength;
    static int indexGuess;
    static int timesSearched;
    static int round;

    public static void main(String[] arg) {
        int target = 73;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
                41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        System.out.println("Answer is Index: " + binarySearch(primes, target));
    }

    public static int binarySearch(int[] primes, int target) {
        arrayLength = primes.length;
        max = arrayLength - 1;
        System.out.println("Begin: min - " + min + " | max - " + max + "\n");
        while (indexFound == -1) {
            round += 1;
            indexGuess = (max + min) / 2;
            if (primes[indexGuess] == target) {
                indexFound = indexGuess;
                System.out.println("Round (" + round + ") indexFound - " + indexFound);
                //run = false;
            } else if (primes[indexGuess] < target) {
                min = indexGuess + 1;
                System.out.println("Round (" + round + ") indexGuess - " + indexGuess
                        + " | min - " + min +
                        " | max - " + max);
            } else if (primes[indexGuess] > target) {
                max = indexGuess - 1;
                System.out.println("Round (" + round + ") indexGuess - " + indexGuess
                        + " | min - " + min +
                        " | max - " + max);
            } else {
                System.out.println("indexFound - not found");
                indexFound = -2;
                //run = false;
            }
            timesSearched += 1;
        }
        return indexFound;
    }
}