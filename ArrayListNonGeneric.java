package Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListNonGeneric {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Yousuf");
        arrayList.add(101);
        arrayList.add(47.23);

        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
