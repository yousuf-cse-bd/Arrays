package Arrays;

//Random number as array elements

public class ArrayElementsSum {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 10;
        double[] values = new double[ARRAY_SIZE];
        for(int i = 0; i < ARRAY_SIZE; i++){
            values[i] = (int) (Math.random() * 100);
        }

        for(double value : values){ //Enhance for loop (ForLoop-each loop)
            System.out.print(value+"\t");
        }
        System.out.println();

        double sum = 0;
        for(double value : values){ //Enhance for loop (ForLoop-each loop)
            sum += value;
        }

        System.out.println("Sum: "+sum);
    }
}
