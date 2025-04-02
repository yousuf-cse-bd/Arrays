package Arrays;


public class ArrayLargestElement {
    public static void main(String[] args) {
        final int SIZE = 10;
        int[] values = new int[SIZE];
        for(int i = 0; i < SIZE; i++){
            values[i] = (int)(Math.random() * 10);
        }

        for(int value : values){
            System.out.println("Value = " + value);
        }

        int largeValue = values[0];
        for(int i = 1; i < SIZE; i++){
            if(largeValue < values[i]){
                largeValue = values[i];
            }
        }
        System.out.println("LargeValue = " + largeValue);
    }
}
