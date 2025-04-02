package Arrays;

//Array elements copying using built-in method
public class ArrayCopy {
    public static void main(String[] args) {
        final int SIZE = 5;
        int[] sourceArray = new int[SIZE];
        for(int i = 0 ; i < SIZE; i++){
            sourceArray[i] = (int)(Math.random() * 10);
        }

        System.out.print("Source array elements: ");
        for(int x : sourceArray){
            System.out.print(x +"\t");
        }
        System.out.println();

        int[] targetArray = new int[SIZE];

        System.arraycopy(sourceArray, 0, targetArray, 0, SIZE);

        System.out.print("Target array elements: ");
        for(int x : targetArray){
            System.out.print(x+"\t");
        }
    }
}
