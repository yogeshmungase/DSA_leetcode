package org.example.two_d_array.array_list;

import java.util.ArrayList;

public class ArrayListProblem {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);a.add(2);a.add(3); a.add(4);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(5);b.add(6);b.add(7);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(8); c.add(9);c.add(10); c.add(11);c.add(12);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

//        for(int i =0; i<list.size(); i++){
//            for (int j =0; j<list.get(i).size(); j++){
//                System.out.print(list.get(i).get(j)+", ");
//            }
//            System.out.println();
//        }

        for(ArrayList<Integer> arr : list){
            for(int ele : arr){
                System.out.print(ele+", ");
            }
            System.out.println();
        }
    }
}
