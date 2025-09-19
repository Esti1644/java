/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
     public static void printList(Node<Integer> lst) {
        Node<Integer> curr = lst;
        while (curr != null) {
            System.out.println(curr.getValue());
            curr = curr.getNext();
        }
    }
     //exe8
         public static Node<Integer> BuildList8()
        {
            int count=2;
            Node<Integer> lst=new Node<> (2^2);
            Node<Integer> head = lst;
            while(count<=10)
            {
               lst.setNext(new Node<Integer>(2^count));
               lst=lst.getNext();
               count++;
            }
            return head;
        }
   
     
   //סריקת רשימה
   // exer 3
public int  minMax(Node<Integer> list){
        
    int min=1000,max=0,help;
    Node<Integer> cur=list;
    while(cur!=null){
        help=cur.getValue();
    
        if(help>max)
            max=help;
        if(help<min)
            min=help;
        cur.getNext();
    }
    return max;
} 

//exer 8
public static void update(Node<Integer> list4){
    Node<Integer> number;
    Node<Integer>curr4=list4;
    while(curr4!=null){
        if(curr4.getValue()<0)
            curr4.setValue(Math.abs(curr4.getValue()) ); 
        curr4= curr4.getNext();
    }
    printList(list4);
}
//exer 12
public static boolean choosex(Node<Integer>lst,int x){
     Node<Integer>head=lst;
     int[]monim =new int[x];
     while(head!=null){
         monim[head.getValue()]++;
          head= head.getNext();
     }
    for(int i=1;i<=x;i++){
        if(monim[i]!=i)
            return false;
    }
    return true;
}
        
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
                
        
//exe1
  Node<Integer>list=new Node<>(1,new Node<>(10,new Node<>(20,new Node<>(4,new Node<>(1,new Node<>(null))))));
  
  //exe5
  Node<Integer> n10=new Node<>(10*5);
  Node<Integer> n9=new Node<>(9*5,n10);
  Node<Integer> n8=new Node<>(8*5,n9);
  Node<Integer> n7=new Node<>(7*5,n8);
  Node<Integer> n6=new Node<>(6*5,n7);
  Node<Integer> n5=new Node<>(5*5,n6);
  Node<Integer>n4=new Node<>(4*5,n5);
  Node<Integer>n3=new Node<>(3*5,n4);
  Node<Integer>n2=new Node<>(2*5,n3);
  Node<Integer>n1=new Node<>(1*5,n2);
  //exe3
//     int x=0;
//  System.out.println("enter number");
//   x=input.nextInt();
//    Node<Integer>list1 = new Node<>(x);
//    Node<Integer>cur1=list1; 
//    Node<Integer>addPos=new Node<Integer>(x,list1);
//    while(x>-1){
//        System.out.println("enter number");
//        x=input.nextInt();
//        Node<Integer>addPos=new Node<Integer>(x,cur1.getNext());
//        cur1.setNext(addPos);
//    }
//
   
    choosex(list, 4);
    update(n1);
    Node<Integer> newlist;
   newlist = BuildList8();
}

}