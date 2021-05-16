package za.ac.cput;

import java.util.*;

/**
 * Name:Munyaradzi Manyati
 * Student number: 215211855
 */
public class CollectionsMvn {

    String[] names = {"Munya", "Honest", "Mpu", "Sanele", "Ayanda", "Asanda", "Manyati", "Munya", "Mpungu"};

    List<Integer> Many = new ArrayList<>();
    List<String> Munya1 = new ArrayList<String>();
    Set<String> Manyati = new TreeSet<String>();
    TreeMap<Integer, String> treemap = new TreeMap<>();
    Collection<String> Mu = new Vector<String>();


    public void vectorCheck(){

        Mu.addAll(Munya1);
        System.out.println(" ");
        if(Mu.contains("Honest")){
            System.out.println("Honest exists in the Vector");

        }

    }

    public void ManyatiList() {
        for (String name : names) {            //add names to the arraylist
            Munya1.add(name);

        }
        System.out.println(" ");
        System.out.println("List of Students 2021 :");     //print out names in the list
        for (int i = 0; i < Munya1.size(); i++) {

            System.out.println(Munya1.get(i));
        }
        Collections.sort(Munya1);                             //sort the list using and print out its content
        System.out.println(" ");
        System.out.println("Sorted List of Students 2021 :");
        for (int i = 0; i < Munya1.size(); i++) {

            System.out.println(Munya1.get(i));

        }
        System.out.println("Number of Elements :" + Munya1.size());
        System.out.println("ManyatiList Method done!! ");

    }
    public void MapMun() {

        treemap.put(80, "Honest");
        treemap.put(100, "Munyaradzi");
        treemap.put(90, "Sanele");
        treemap.put(80, "Ayanda");
        treemap.put(75, "Asanda");

        System.out.println(treemap.ceilingKey(85));//  ?>=85
        System.out.println(treemap.higherKey(70));//  ?>70
        System.out.println(treemap.floorKey(80));// ?<=80
        System.out.println("MapMun Method done!! ");
        for (int key : treemap.keySet()){
            System.out.println(key+ " - " + treemap.get(key));
        }
        System.out.println(" ");
        int search = 100;
        if (treemap.containsKey(search)){
            System.out.println("Found the mark: " + treemap.get(search));
        }
        treemap.clear();
        System.out.println(" ");
        System.out.println("Number of Students left: " + treemap.size());

    }

    public void setTreeMethod() {
        Manyati.add("Munyaradzi");
        Manyati.add("Munyaradzi");
        Manyati.add("Mpungu");
        Manyati.add("Ayanda");
        Manyati.add("Ayanda");
        Manyati.add("Sanele");
        Manyati.add("Asanda");
        System.out.println("TreeSet Methods remove duplicate " + Manyati); // the tree will sort everything in A-Z

        Manyati = new TreeSet<String>(Munya1);
        System.out.println( " ");
        System.out.println("Names Printed with no duplicates: ");

        for (String name :Manyati){
            System.out.println(name);
        }


        System.out.println("SetTree Method done!! ");
    }


    public static void main(String[] args) {

        System.out.println("Hello World!");

        CollectionsMvn bob = new CollectionsMvn();

        bob.ManyatiList();
        bob.vectorCheck();
        bob.setTreeMethod();

        bob.MapMun();
        bob.collect();



    }


    public void collect() {
        Many.add(9);
        Many.add(6);
        Many.add(3);
        Many.add(50);
        Many.add(4);
        // Many.add(1, 14);//fixing 6 to 14 index1.

       // System.out.println("Total number of Elements in the List : " + Many.size());//total number

      /*  Iterator<Integer> AyList = Many.iterator();
        while (AyList.hasNext()) {
            Integer str = AyList.next();
            System.out.println(str); //printing arrayList numbers.
        }

        // Many.remove(0);
        System.out.println("Is Element 5 there? :" + Many.contains(5));
        System.out.println("The Value @ index 1 is :" + Many.get(1));
        System.out.println("Number of Elements :" + Many.size());
        Collections.sort(Many);
        System.out.println(Many);*/

        for (String name : names) {            //add names to the arraylist
            Munya1.add(name);

        }
        System.out.println(" ");
        System.out.println("List of friends are:");     //print out names in the list
        for (int i = 0; i < Munya1.size(); i++) {

            System.out.println(Munya1.get(i));
        }
        Collections.sort(Munya1);                             //sort the list using and print out its content
        System.out.println(" ");
        System.out.println("Sorted list of friends are:");
        for (int i = 0; i < Munya1.size(); i++) {

            System.out.println(Munya1.get(i));
        }

        System.out.println("Collect Method done!! ");
    }


}

