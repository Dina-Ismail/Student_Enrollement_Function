package guiAssignment_200485862;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Model {

    private String studentName;
    private String studentColor;
    private String node;
    static ArrayList<String> seats = new ArrayList<>(); // Create an ArrayList object

    public Model(){}

    public void setStudentColor(String studentColor) {
        this.studentColor = studentColor;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentColor() {
        return studentColor;
    }

    public String getStudentName() {
        return studentName;
    }

    //this function returns which node will be allocated randomly, after choosing the random number the
    //system removes the allocated node.
    public String allocateSeat()
    {
        do{
            Random rd = new Random();
            int j = rd.nextInt(seats.size());
            System.out.println(j);
            String node = seats.get(j);
            seats.remove(j);
            System.out.println("size:"+seats.size());
            return node;
        }
        while (seats.size()>0);
    }

    //method to check the length of the student name
    public boolean verifyNameLength(String input)
    {
         if(input.trim().length()<3)
            {
                return false;
            }
         else
             return  true;
    }

    //This method verifies if color is chosen is white
    public boolean verifyColor(String color)
    {
        if(color.equals("0xffffffff"))
        {
            return false;
        }
        else
            return  true;
    }

    //This method adds to the Array list all the labels to be randomly chosen from
    static void createArray()
    {
        seats.add("label33");
        seats.add("label11");
        seats.add("label22");
        seats.add("label12");
        seats.add("label13");
        seats.add("label21");
        seats.add("label23");
        seats.add("label31");
        seats.add("label32");
        Collections.shuffle(seats);

    }


}
