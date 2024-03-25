/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;

/**
 *
 * @author whyyy
 */
import java.util.Scanner;
public class DSProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Node head =new Node();
        LinkedList L =new LinkedList();
        head = null;
        
        String Name, Course;
        int Marks;
 
    // Menu-driven program
    while (true) {
        System.out.print("\n\tWelcome to Student Record Management System\n\n\tPress\n\t"
                + "1. Create a new Record\n\t"
                + "2. Delete a Student Record\n\t"
                + "3. Search a Student Record\n\t"
                + "4. View all Student Record\n\t"
                + "5. Exit\n"+
                "\nEnter your Choice: ");
        int Choice;
 
        // Enter Choice
        Choice=in.nextInt();
        if (Choice == 1) {
            System.out.print("\nEnter Name of Student: ");
            String temp = in.nextLine();
            Name = in.nextLine();
            
            System.out.print("\nEnter Roll Number of Student: ");
            int roll = in.nextInt();
            
            System.out.print("\nEnter Course of Student: ");
            String temp1 = in.nextLine();
            Course = in.nextLine();
            
            System.out.print("\nEnter Total Marks of Student: ");
            Marks = in.nextInt();
            L.Insert_Record(roll, Name, Course, Marks);
        }
        
        else if (Choice == 2) {
             System.out.print("\nEnter Roll Number of Student whose record is to be Deleted:  ");
             int Roll1= in.nextInt();
             L.delete(Roll1);
        }
        
        else if (Choice == 3) {
            System.out.print("\nEnter Roll Number of Student whose record you want to Search: ");
            int Roll2= in.nextInt();
            L.Search_Record(Roll2);
        }
        
        else if (Choice == 4) {
            L.Show_Record();
        }
        
        else if (Choice == 5) {
           break;
        }
        
        else {
            System.out.print("\nInvalid Choice \nTry Again\n ");
        }
    }
    }
    
    
}
