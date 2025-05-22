/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

import java.util.Scanner;

/**
 * Array Concept
 * Array indexes start at 0, meaning first element is at 0 index
 * Write a logic to enter student names based on the size of the array
 */
public class Arrays //Firtst update comment
{
    public static void main(String[] args) 
    {
        Scanner inPut = new Scanner (System.in);
    
            System.out.println("Please enter number of students: ");
                int stu_size = inPut.nextInt();                         //stu_size provides the size of the element
                    inPut.nextLine();

            String[] studentNames = new String[stu_size];               //This creates an array that can store student names
            int[] studentMarks = new int[stu_size];                     //This creates an array that can store student marks
        
        for (int i = 0; i < stu_size; i++) 
        {
            System.out.println("\nEnter name of student " + (i+1) + ": "); 
                studentNames[i] = inPut.nextLine();                     /*[i] starts counting from 0 so with (i + 1)
                                                                          that diplay will be "Enter name of student 1:" instead
                                                                          of "Enter name of student 0:" which ca nconfuse*/
            System.out.println("Enter mark for " + studentNames[i] +": ");
                studentMarks[i] = inPut.nextInt();
                    inPut.nextLine();
        }
            System.out.println("""

                               CLASS REPORT
                               """);
        for (int i = 0; i < stu_size; i++) 
        {
            System.out.println((i+1) + ". " + studentNames[i] + ": " +  studentMarks[i]);
        }
    }
}
        
//Assign values or Initialise an Array
        /*StudentMarks[0] = 50;
        StudentMarks[1] = 70;
        StudentMarks[2] = 90;
        
        
        for (int i = 0; i < StudentMarks.length; i++) 
        {
            System.out.println("At index: " + i + ", the element is: " + StudentMarks[i] + "\n");
        }
        
    }
}*/
