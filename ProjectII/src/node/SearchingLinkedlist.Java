 // Node class represents each element in the LinkedList
package node;

//can you designed blue print of node :

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class to manage the list
class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    
    //if i say can you designed my own custom method get designed using assigning arguments
    // Method to insert a new node at the end of the list
    public void insert(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }
    
    

    // Method to search for an element in the list
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }



public class NodeDriver {
	
	public static void main(String[] args) {
		
		
		//its get designed my own to built config proper instance of create by custom object using faster manipulati:
		//list manipulating to Linkedlist better worked!
		LinkedList list = new LinkedList();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		
		System.out.println("Searching at element proper manner using  for 2:" +list.search(1));  //if i say its truely correct seaching 
		System.out.println("Seaching at element proper manner using for 4: " +list.search(4));   // false
		
	}
}
}
		
		
		
		
		
	
	