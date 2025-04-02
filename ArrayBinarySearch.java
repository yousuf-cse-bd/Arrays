package Arrays;

/// Binary search algorithm using a sorted array

public class ArrayBinarySearch {
    public static int[] readyArray(){
        return new int[]{-5, 0, 1, 4, 5, 6, 7, 8, 9};
    }
    public static void main(String[] args) {
        int[] array = readyArray();

        int index = binarySearchAlgorithm(array, 11);
        if(index == (-1)){
            System.out.println("\t\tNOT found");
        }
        else {
            System.out.println("\t\tFound and index: "+index);
        }
    }

    public static int binarySearchAlgorithm(int[] array, final int KEY){
        final int SIZE = array.length;

        int lowerIndex = 0;
        int upperIndex = SIZE - 1;
        int midIndex;
        while(lowerIndex <= upperIndex){
            midIndex = lowerIndex + (upperIndex - lowerIndex)/2;
            if(array[midIndex] == KEY){
                return midIndex;
            }
            else if(array[midIndex] < KEY){
                lowerIndex = midIndex + 1;
            }
            else {
                upperIndex = midIndex - 1;
            }
        }
        return (-1);
    }
}
