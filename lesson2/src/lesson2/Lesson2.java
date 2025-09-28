  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

/**
 *
 * @author This User
 */
public class Lesson2 {

    /**
     * @param args the command line arguments
     */
     public static void printList(Node<Integer> lst){
        Node<Integer> curr = lst;
        while(curr!=null){
            System.out.print(curr.getValue()+ " ");
            curr = curr.getNext();
        }
        System.out.println("");
    }
 public static Node<Integer> onceOne(Node<Integer> lst){
  Node<Integer> curr = lst;
  int[]monim =new int[100];
   int count=0,max=Integer.MAX_VALUE;
          
  while(curr.getNext() != null){
      if(monim[ lst.getValue()]  >=1)
          lst=delete(lst, lst.getValue());
      else{ 
          monim [lst.getValue()]++;
           count++;
           max=lst.getValue();
      }   
      curr=curr.getNext();
      
  }
  
    if(count%2!=0){
        delete(lst, max);
        printList(lst);
  }
     Node<Integer> curr1 = lst;
    while(curr1.getNext()!= null){
          if(curr1.getValue()>curr1.getNext().getValue())
              delete(lst, curr1.getNext().getValue());
          else
             delete(lst, curr1.getValue());
          curr1=curr1.getNext().getNext();
    }
  return lst;
 }
 
    public static Node<Integer> delete(Node<Integer> lst, int num){
        Node<Integer> curr = lst;
        if(lst.getValue() == num)
            return lst.getNext();
        while(curr.getNext() != null){
            if(curr.getNext().getValue() == num)
                curr.setNext(curr.getNext().getNext());
            else
                curr = curr.getNext();
        }
        return lst;
    }
    
    public static void main(String[] args) {

        Node<Integer> n1 = new Node<>(3);
        Node<Integer> n2 = new Node<>(5);
        Node<Integer> n3 = new Node<>(7);
        Node<Integer> n4 = new Node<>(1);
        Node<Integer> n5 = new Node<>(3);
        Node<Integer> n6 = new Node<>(9);
        Node<Integer> n7 = new Node<>(5);
        Node<Integer> n8 = new Node<>(3);
        Node<Integer> n9 = new Node<>(8);
        Node<Integer> n10 = new Node<>(7);
        Node<Integer> n11= new Node<>(5);
        Node<Integer> n12= new Node<>(4);
        Node<Integer>n13=new Node<>(2);
       
            
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7); 
        n7.setNext(n8);
        n8.setNext(n9);
        n9.setNext(n10);
        n10.setNext(n11);
        n11.setNext(n12);
        n12.setNext(n13);

        

 
  

        printList(n1);
       Node<Integer> lst1=onceOne(n1);
        printList(lst1);
    }

}
