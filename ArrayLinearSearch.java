package Arrays;

/// Linear search algorithm using an array

public class ArrayLinearSearch {

    public static int[] createArray(final int SIZE){
        int[] array = new int[SIZE];

        for(int i = 0; i < SIZE; i++){
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }
    public static void main(String[] args) {
        final int SIZE = 10;
        int[] array = createArray(SIZE);
        showArrayElements(array);

        final int KEY = 4;

        int index = linearSearchAlgorithm(array, KEY);
        if(index == -1){
            System.out.println("\t\tNOT found!");
        }
        else{
            System.out.println("\t\t"+KEY+" is found and index: "+index);
        }
    }

    public static int linearSearchAlgorithm(int[] array, final int KEY){
        final int SIZE = array.length;
        for(int i = 0; i < SIZE; i++){
            if(array[i] == KEY){
                return i;
            }
        }
        return -1;
    }

    public static void showArrayElements(int[] array){
        for(int element : array){
            System.out.print(element+"\t");
        }
        System.out.println();
    }
}
