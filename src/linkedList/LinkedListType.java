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

	LinkedListType() {
		this.head = null;
	}
	
	// adds a previously created node to the beginning of the list
	public void addElement(ListElement le) {
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
		ListElement next = curr.next;
		
		// link around it
		curr.next = next.next;
		
		// return the removed node
		return next;
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
	
}
