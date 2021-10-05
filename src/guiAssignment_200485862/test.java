package guiAssignment_200485862;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test {
    public static void main(String[] args) {

            ArrayList<String> seats = new ArrayList<String>(); // Create an ArrayList object
            seats.add(0,"label33");
            seats.add(1,"label11");
            seats.add(2,"label22");
            seats.add(3,"label12");
            seats.add(4,"label13");
            seats.add(5,"label21");
            seats.add(6,"label23");
            seats.add(7,"label31");
            seats.add(8,"label32");

           do{
                Random rd = new Random();
                int j = rd.nextInt(seats.size());
                System.out.println(j);
                System.out.println("This is the node name:"+seats.get(j));
                seats.remove(j);
                System.out.println("size:"+seats.size());


            }
           while (seats.size()>0);
        }
    }
