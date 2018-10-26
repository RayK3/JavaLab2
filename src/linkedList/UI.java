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
		
		ListElement le = new ListElement();
		le.setData(5);
		
		ListElement le1 = new ListElement();
		le1.setData(7);
		
		list.addElement(le);
		list.addElement(le1);
		list.printLinkedListHead();
		ListElement le2 = list.getElement(1);
		
		list.deleteElement(1);
		
		list.printLinkedListHead();
		
	}

}
