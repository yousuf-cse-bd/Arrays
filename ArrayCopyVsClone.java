package Arrays;

/***
 * Array clone is better than arrayCopy function
 */

public class ArrayCopyVsClone {
    public static void main(String[] args) {
        int[] sourceArray = {11, 22, 33};
        int[] arrayClone = sourceArray.clone();
        int[] copyArray = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, copyArray, 0, sourceArray.length);

        arrayClone[0] = 100;

        showElement(arrayClone);
        showElement(sourceArray); // No changed
        System.out.println("------------------------------");
        copyArray[1] = 111;
        showElement(copyArray);
        showElement(sourceArray);

    }
    public static void showElement(int[] array){
        for(int x : array){
            System.out.print(x+"\t");
        }
        System.out.println();
    }
}
