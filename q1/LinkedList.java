public class LinkedList{ 
    
    public Node head;
    public Node tail=null;
    
    public LinkedList(){
        head = null;
    }

    public void insert(int c){
        //to be completed by the student
        Node newNode = new Node(c);
        if (head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next= newNode;
            tail=tail.next;
        }
    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println(" ");
    }

    public int len(){
        //to be completed by the student
    Node temp = head;
        int result_len=0;    // if head (null){result_len=0;}
        while(temp!=null ){
            result_len++;
            temp=temp.next;
        }
        return result_len;
    }
}


