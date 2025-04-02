package Arrays;

import java.util.ArrayList;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList <String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Suman");
        stringArrayList.add("Maruf");
        stringArrayList.add("Tamim");
        stringArrayList.add("Istiak");
        stringArrayList.add("Yousuf");

        for(String string : stringArrayList){
            System.out.println(string);
        }
    }
}
