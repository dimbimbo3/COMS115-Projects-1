import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class MidTermDriver {
    public static void main(String[] args)throws Exception{
        File f = new File("Grades.csv");
        Scanner input = new Scanner(f);
        ArrayList<String> list = new ArrayList();
        
        //Inputs each line from "Grades.csv" into ArrayList list as an element
        while(input.hasNext()){
            list.add(input.nextLine());
        }
        
        //Loops through list and temporarily stores each element in temp for
        //the MidTerm Object grades, which is then outputted through toString()
        for(int i = 0; i < list.size(); i++){
            String temp = list.get(i);
            MidTerm grades = new MidTerm(temp);
            System.out.println(grades);
        }
    }
}