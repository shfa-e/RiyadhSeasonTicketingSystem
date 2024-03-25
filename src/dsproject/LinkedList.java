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
public class LinkedList {
    int size;
    Node head = new Node() ;
    
    public boolean check(int x){
    // Base Case
    if (head == null)
        return false;
 
    Node t = new Node();
    t = head;
 
    // Traverse the LinkedList List
    while (t != null) {
        if (t.roll == x)
            return true;
        t = t.next;
    }
        return false;
}
    
    
    public void Insert_Record(int roll, String Name,String Dept, int Marks){

    // if Record Already Exist
    if (check(roll)) {
        System.out.print("Student with this record Already Exists\n");
        return;
    }
    Node t = new Node();
    t.roll = roll;
    t.Name = Name;
    t.Dept = Dept;
    t.Marks = Marks;
    t.next = null;
    
    // Insert at Begin
    if (head == null || head.roll >= t.roll) {
        t.next = head;
        head = t;
    }
 
    // Insert at middle or End
    else {
        Node c = head;
        while (c.next != null && c.next.roll < t.roll) {
            c = c.next;
        }
        t.next = c.next;
        c.next = t;
    }
      
    System.out.print( "Record Inserted Successfully\n ");
    size ++;
}
 
// Function to search record for any
// students Record with roll number
    public void Search_Record(int roll){  
    // if head is NULL
    if (head==null) {
        System.out.print("No such Record Available\n"); 
        return ;
    }
 
    // Otherwise
    else {
        Node p = head;
        while (p!= null) {
            if(p.roll == roll){
                System.out.print("Roll Number\tName\tDepartment\tMarks");
                System.out.print("\n"+p.roll+"\t\t"+p.Name+"\t"+p.Dept+"\t\t"+p.Marks);
            return ;
            }
            p = p.next;
        }
 
        if (p == null)
            System.out.print("No such Record Available\n");
    }
    }
    
    void delete(int num) {
        Node node = head;
        Node dummy = new Node();//Creating a dummy starting node.
        Node prev = dummy;
        prev.next = node;

        while(node!=null) {
            if(node.roll==num)
            {
                prev.next = node.next;//Removing current node.
                node.next = null;//Removing reference to the next node.
                break;//Exiting the loop
            }
            prev = node;
            node = node.next;
        }
        dummy = null;
    }

// Function to display the Student's
// Record
 public void Show_Record(){
    Node p = head;
    if (p == null)
   System.out.print("No Record Available\n");
    else 
        // Until p is not NULL
        System.out.print("Roll Number\tName\tDepartment\tMarks");
        while (p!= null) {
            if(p.Name != null)
            System.out.print("\n"+p.roll+"\t\t"+p.Name+"\t"+p.Dept+"\t\t"+p.Marks);
            p = p.next;
        }
}
 
// Function to delete record students
// record with given roll number
// if it exist
// to view numbers of records
}
