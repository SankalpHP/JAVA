package Collections;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

//        List<Integer> list = new LinkedList<Integer>();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        System.out.println(list.contains(1));
//        System.out.println(list.size());
//        System.out.println(list.remove(0));
//        System.out.println(list.size());

//       ArrayList<Integer> array =  new ArrayList<Integer>();
//       array.add(12);
//       array.add(13);
//       array.add(34);
//
//        System.out.println(array.get(0));
//        System.out.println(array.clone());
//        System.out.println(array.size());
//        System.out.println(array.remove(1));
//        System.out.println(array.size());

//                   HashMap<Integer,String> HM  = new HashMap<Integer,String>();
//                   HM.put(1,"Sankalp");
//                   HM.put(2,"Rahul");
//                   HM.put(3,"Lucky");
//
//        System.out.println(HM.get(1));
//        System.out.println(HM.isEmpty());
//        System.out.println(HM.replace(2,"Karan"));
//        System.out.println(HM.get(2));
//        System.out.println(HM.remove(2));
//        System.out.println(HM.size());

//        TreeMap<Integer,String> HM  = new TreeMap<Integer,String>();
//        HM.put(1,"Sankalp");
//        HM.put(2,"Rahul");
//        HM.put(3,"Lucky");
//
//        System.out.println(HM.get(1));
//        System.out.println(HM.isEmpty());
//        System.out.println(HM.replace(2,"Karan"));
//        System.out.println(HM.get(2));
//        System.out.println(HM.remove(2));
//        System.out.println(HM.size());

//        HashSet<String> set = new HashSet<String>();
//        set.add("Sankalp");
//        set.add("Lucky");
//        set.add("Rohit");
//
//        System.out.println(set.contains("Sankalp"));
//        System.out.println(set.clone());
//        System.out.println(set.size());
//        System.out.println(set.remove("Sankalp"));
//        System.out.println(set.clone());
//        System.out.println(set.size());

        TreeSet<String> set = new TreeSet<String>();
        set.add("Sankalp");
        set.add("Lucky");
        set.add("Rohit");

      for (String t : set){
          System.out.println(t);
      }

        System.out.println(set.contains("Sankalp"));
        System.out.println(set.clone());
        System.out.println(set.size());
        System.out.println(set.remove("Sankalp"));
        System.out.println(set.clone());
        System.out.println(set.size());
    }
}
