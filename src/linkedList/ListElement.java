/**
 * 
 */
package linkedList;

/**
 * @author RDK3
 *
 */
public class ListElement {
	public ListElement next;
	public ListElement prev;
	private int data;
	
	public ListElement()
	{
		this.data = 0;
		this.next = null;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
	
}
