package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; 
            for (int j = i +1; j < n; j++) {
                Student student1 = list.get(j);
                Student student2 = list.get(minIndex);   
                if (student1.getLastName().compareTo(student2.getLastName()) < 0 || //compare last name
                (student1.getLastName().compareTo(student2.getLastName()) == 0 && 
                student1.getFirstName().compareTo(student2.getFirstName()) < 0) || 
                (student1.getLastName().compareTo(student2.getLastName()) == 0 && 
                student1.getFirstName().compareTo(student2.getFirstName()) == 0 && 
                student1.getGpa() > student2.getGpa())) {
                    minIndex = j;
                }        
            }
            Student temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
        return list;
    }

}
