import java.util.Arrays;

public class MyMain {

    // Rotates all values in an array to the left
    // Ex. rotateLeft([1, 2, 3, 4, 5]) => [2, 3, 4, 5, 1]
    public static int[] rotateLeft(int[] arr) {
        int[] newarray = new int[arr.length];
        int counter = 0;
        for (int i = 0; i< arr.length-1; i++) {
            newarray[counter] = arr[i + 1];
            counter++;
        }
        newarray[arr.length-1] = arr[0];


        return newarray;
    }

    // Rotates all values in an array to the right
    // Ex. rotateRight([1, 2, 3, 4, 5]) => [5, 1, 2, 3, 4]
    public static int[] rotateRight(int[] arr) {
        int[] newarray = new int[arr.length];
        int counter = 1;
        for (int i = 1; i< arr.length-1; i++) {
            newarray[counter] = arr[i - 1];
            counter++;
        }
        newarray[0] = arr[arr.length -1];
        newarray[arr.length-1] = arr[arr.length - 2];
        return newarray;
    }

    // Replaces all duplicate values with -1
    // Ex. duplicateReplacer([1, 2, 1, 2, 1, 1]) => [1, 2, -1, -1, -1, -1]
    public static int[] duplicateReplacer(int[] arr) {
        for (int i = 0; i<arr.length; i++){
            for(int x = 0; x< arr.length; x++){
                if (arr[i] == arr[x] && i != x){
                    arr[x] = -1;
                }
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
