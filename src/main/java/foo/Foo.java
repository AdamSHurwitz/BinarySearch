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

    public static void main(String[] arg) {
        //1. get indices length
        //2. set min and max
        //3. assess value at avg of min + max (round down)
        //4. if match, return that index, if too low, set 1+ num as min
        //if too high, set num - 1 as max index
        //5.
        int target = 73;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
                41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        //int solution = binarySearch(primes, target);
        System.out.println("Answer: " + binarySearch(primes, target));
    }

    public static int binarySearch(int[] primes, int target) {
        boolean run = true;
        int arrayLength = primes.length;
        max = arrayLength - 1;
        System.out.println("Begin: min - " + min + " | max - " + max + "\n");
        while (run){
        //while (!found && indexFound == -1) {
        //while (indexFound == -1) {
        //while (timesSearched < arrayLength) {
            indexGuess = (max + min) / 2;
            System.out.println("indexGuess - " + indexGuess + " | min - " + min +
                    " | max - " + max);
            if (primes[indexGuess] == target) {
                indexFound = indexGuess;
                System.out.println("indexFound - " + indexFound);
                run = false;
            } else if (primes[indexGuess] < target) {
                min = indexGuess + 1;
                System.out.println("new min - " + (indexGuess + 1));

            } else if (primes[indexGuess] > target) {
                max = indexGuess - 1;
                System.out.println("new max - " + (indexGuess - 1));
            } else {
                indexFound = -2;
                System.out.println("indexFound - not found");
                run = false;
            }
            timesSearched += 1;
            //System.out.println("timesSeached - "+ timesSearched +"\n");
            //}
        }
        return indexFound;
    }
}