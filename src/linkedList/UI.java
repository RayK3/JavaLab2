/**
 * 
 */
package linkedList;

/**
 * @author RDK3
 *
 */
public class UI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a new linked list
		LinkedListType list = new LinkedListType();
		
		
		// each list element must be independently created and appended to the list
		ListElement le = new ListElement();
		le.setData(5);
		
		ListElement le1 = new ListElement();
		le1.setData(7);
		
		ListElement le2 = new ListElement();
		le2.setData(9);
		
		
		list.addElement(le);
		list.addElement(le1);
		list.printLinkedListHead();
		list.printLinkedListTail();
		
		list.addElement(le2);
		
		ListElement le3 = list.getElement(1);
		
		
		list.printLinkedListHead();
		list.printLinkedListTail();
		
		list.deleteElement(1);
		
		list.printLinkedListHead();
		list.printLinkedListTail();
	}

}
