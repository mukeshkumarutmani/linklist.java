public class linkedlist {
    // Node represented in class form
    private int size;
    linkedlist(){
       this.size=0;
    }
    class Node {
        String data;
        Node next;
        

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
     
    private Node head;

    // Add new node in linked list (add first)
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add new node at the end (add last)
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }
             
    public void dl8First(){
        // corner case

           if(head==null){
            System.out.println("List is empty");
            return;
           }
         head=head.next;
         size--;
    }
    public void dl8Last(){
        if(head==null){
              System.out.println("List is empty");
              return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }

        Node secondlast=head;
        Node lastnode=head.next;
        while(lastnode.next != null){
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;

    }
    // Print the linked list
    public void printList() {
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        
        
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + "-----> ");
            curNode = curNode.next;
        }
        System.out.println("Null");
    }
    
    
    public int getsize(){
          return size;
    }
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("List");
        list.printList();
        list.addFirst("This");
        list.printList();
        list.dl8First();
        list.printList();
        list.addFirst("This");
        list.dl8Last();
        list.printList();
         list.addLast("Mukesh");
         list.addLast("Kumar Utmani");
         list.printList();
        System.out.println(list.getsize());
        
    }
}


