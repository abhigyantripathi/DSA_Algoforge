package LinkedList.Introduction;

class Node{
     int data;
     Node next;


    public Node(int data){
        this.data=data;
    }
}

public class Main {

    public static void main(String[] args) {
        Node n1= new Node(5);
        Node n2= new Node(10);
        Node n3= new Node(3);

        n1.next=n2;
        n2.next=n3;
    }
   


    
}
