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
public class Node {
    int roll;
    String Name;
    String Dept;
    int Marks;
    Node next;
    Node Pervious;

    public Node() {
        this.roll = roll;
        this.Name = Name;
        this.Dept = Dept;
        this.Marks = Marks;
        this.next = next;
    }
    
    
     @Override
    
    public String toString(){
        if(next!=null)
        return "Roll="+roll+" "+"Next="+next.roll;
        else return "Roll="+roll;
    }
}
