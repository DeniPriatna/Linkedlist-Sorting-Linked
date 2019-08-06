/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistis;

/**
 *
 * @author XiauXiau
 */
public class LinkedlistIS {
    node head;
    node sorted;
    
    class node{
        int val;
        node next;
        
        public node(int val){
            this.val = val;
        }
    }
    
    void push(int val){
        node newnode = new node(val);
        newnode.next = head;
        head = newnode;
    }
    
    void insertionSort(node headref){
        sorted =null;
        node current = headref;
        while (current != null){
            node next = current.next;
            sortedInsert(current);
            current = next;
            
        }
        head =sorted;
    }
    
    void sortedInsert(node newnode){
        if(sorted == null || sorted.val >= newnode.val){
            newnode.next = sorted;
            sorted = newnode;
        }else{
            node current = sorted; 
            while (current.next != null 
                   && current.next.val < newnode.val) { 
                current = current.next; 
            } 
            newnode.next = current.next; 
            current.next = newnode; 
        } 
        
    }
    
    void printList(node head){
        while (head != null){
            System.out.println(head.val + " ");
            head =head.next;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedlistIS list = new LinkedlistIS();
        list.push(5);
        list.push(30);
        list.push(7);
        list.push(3);
        list.push(30);
        System.out.println("Linked List before sorting...");
        list.printList(list.head);
        list.insertionSort(list.head);
        System.out.println("\nLinkedList after sorting");
        list.printList(list.head);
    }
    
}
