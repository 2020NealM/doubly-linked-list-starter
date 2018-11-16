
public class Node {

	public String record;
	public Node next;
	public Node prev;
	
	public Node(String newRecord) {
		record = newRecord;
		next = null;
		prev = null;
	}
}
