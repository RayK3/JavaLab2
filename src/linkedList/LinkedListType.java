/**
 * 
 */
package linkedList;

/**
 * @author RDK3
 *
 */
public class LinkedListType {
	private ListElement head;
	private ListElement tail;
	LinkedListType() {
		this.head = null;
		this.tail = null;
	}
	
	// adds a previously created node to the beginning of the list
	public void addElement(ListElement le) {
		// if the list is not empty
		if(this.head != null) {
			this.head.prev = le;
		}
		// if the list is empty
		else {
			this.tail = le;
		}
		le.next = this.head;
		this.head = le;
	}
	
	public ListElement getElement(int index) {
		ListElement curr = this.head;
		// traverses the list to that index
		for(int i = 0; i < index; i++) {
			curr = curr.next;
		}
		
		return curr;
	}
	
	public ListElement deleteElement(int index) {
		ListElement curr = this.head;
		// traverses the list to one before the node to be deleted
		for(int i = 0; i < index - 1; i++) {
			curr = curr.next;
		}
		
		// next is the node to be deleted
		ListElement nextNode = curr.next;
		
		// link around it
		curr.next = nextNode.next;
		nextNode.next.prev = curr;
		
		// return the removed node
		return nextNode;
	}
	
	 public void printLinkedListHead() {
		 ListElement curr = this.head;
		 
		 while(curr != null) {
			 System.out.print(curr.getData());
			 System.out.print(" ");
			 
			 curr = curr.next;
		 }
		 System.out.print("\n");
	 }
	 
	 public void printLinkedListTail() {
		 ListElement curr = this.tail;
		 
		 while(curr != null) {
			 System.out.print(curr.getData());
			 System.out.print(" ");
			 
			 curr = curr.prev;
		 }
		 System.out.print("\n");
	 }
	
}
