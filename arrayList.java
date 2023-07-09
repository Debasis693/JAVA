import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String args[]){
        //This line declare ArrayList as integer
            ArrayList<Integer> list = new ArrayList<Integer>();

            //add elements
            list.add(1);
            list.add(5);
            list.add(7);
            System.out.println(list);

            //add element 2 to index 1
            list.add(1,2);
            System.out.println(list);//This will add 2 in index no.1 and print

            //get elements present in index 0
            int num = list.get(0);
            System.out.println(num);//This will print element present at index 0

            //set the element 9 in index 0
            list.set(0,9);
            System.out.println(list);

            //delete the element present in index 3
            list.remove(3);
            System.out.println(list);

            //size
            int size = list.size();
            System.out.println(size);//print the size of ArrayList

            //sorting the ArrayList
            Collections.sort(list);
            System.out.println(list);
    }
}
