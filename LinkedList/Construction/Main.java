package LinkedList.Construction;

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
class LinkedList {
    Node head;
    Node tail;
    int size;

    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    public void reverseLinkedList(){
        Node prev= null;
        Node curr=head;

        while(curr!=null){
            Node currNext= curr.next;
            curr.next=prev;
            prev=curr;
            curr= currNext;
            if(currNext!=null){
                currNext=currNext.next;
            }
            
        }
        tail= head;
        head=prev;
    }

    public void addNodeAt(int idx, int val){
        if(idx<0 || idx>size){
            System.out.println("index out of bound");
            return;
        }
        if(idx==0){
            addFirst(val);
            return ;
        } else if(idx==size){
            addLast(val);
            return ;
        }
        Node newNode= new Node(val);
        Node prev= head;
        for(int i=0;i<idx-1;i++){
            prev=prev.next;
        }
        Node nextNode= prev.next;
        prev.next=newNode;
        newNode.next= prev;

        this.size++;
    }

    public Node getNodeAt(int idx){

        if(idx<0 || idx>=idx){
            System.out.println("index out of bound");
            return null;
        }
        Node temp=head;
        while(idx>0){
            temp=temp.next;
            idx--;
        }
        return temp;

    }

    public void removeFirst(){
        if(head==null){
            System.out.println("NOTHING TO REMOVE");
            return ;

        } 
        if(this.head==this.tail){
            this.head=null;
            this.tail=null;
        }
        head=head.next;
        this.size--;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("Nothong to remove");
            return;
        }
        else if (head==tail) {
            head=null;
            tail=null; 
        }
        else{
            Node temp=head;
            while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        }
        this.size--; 
    }

    // add a node at the end of linkedList
    public void addLast(int val){
        Node newNode= new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
        this.size++;

    }
    public void addFirst(int val){
        Node newNode= new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
        } else{
            newNode.next=head;
            head=newNode;
        }
        this.size++;
    }

    
    // dont read this function yet
    public void displayList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();

        ll.addFirst(5);
        ll.addFirst(10);
        ll.addFirst(15);
        ll.addFirst(20);

//       ll.displayList();
        // ll.removeLast();
        //ll.removeFirst();
        ll.displayList();
        // ll.removeFirst();
        // ll.displayList();
        // ll.removeFirst();
        // ll.displayList();
        // ll.removeFirst();
        // ll.displayList();
        ll.reverseLinkedList();
        ll.displayList();

    }
}