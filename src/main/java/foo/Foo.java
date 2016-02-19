package foo;

/**
 * Created by adamhurwitz on 2/18/16.
 */
public class Foo {
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
        // TODO: add error handling for out of bounds result
        System.out.println("Answer: " + binarySearch(primes, target));
    }

    public static int binarySearch(int[] input, int targetValue) {
        int solutionIndex = -1;
        int n = input.length;
        int min = 1;
        int max = n - 1;
        //TODO: use while loop
        //TODO: if max < min solutionIndex is -1
        return solutionIndex;
    }
}