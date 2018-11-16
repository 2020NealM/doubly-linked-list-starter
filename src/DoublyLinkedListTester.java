/**
 * Tester program for DoublyLinkedList class
 * 
 * @author Michael Ida
 *
 */
public class DoublyLinkedListTester {

	public static void main(String[] args) {
		
		DoublyLinkedList testList = new DoublyLinkedList();
		Node bookmark;
		
		System.out.println("Testing insertHead()...");
		testList.insertHead("alligator");
		testList.insertHead("buffalo");
		testList.insertHead("crocodile");
		System.out.println("should be crocodile -> buffalo -> alligator");
		System.out.println(testList.toString(0));
		System.out.println("Should be alligator -> buffalo -> crocodile");
		System.out.println(testList.toString(1));
		
		System.out.println("Testing insertTail()...");
		testList.insertTail("dromedary");
		testList.insertTail("elephant");
		System.out.println("should be crocodile -> buffalo -> alligator -> dromedary -> elephant");
		System.out.println(testList.toString(0));
		
		System.out.println("Testing removeHead()...");
		testList.removeHead();
		System.out.println("should be buffalo -> alligator -> dromedary -> elephant");
		System.out.println(testList.toString(0));
		
		System.out.println("Testing removeTail()...");
		testList.removeTail();
		System.out.println("should be buffalo -> alligator -> dromedary");
		System.out.println(testList.toString(0));

		System.out.println("Testing find() and insertAfter()...");
		bookmark = testList.find("alligator");
		testList.insertAfter("fox", bookmark);
		System.out.println("should be buffalo -> alligator -> fox -> dromedary");
		System.out.println(testList.toString(0));
		
		System.out.println("Testing find() and remove()...");
		bookmark = testList.find("fox");
		testList.remove(bookmark);
		System.out.println("should be dromedary -> alligator -> buffalo");
		System.out.println(testList.toString(1));
		
		System.out.println("Testing find() without a match...");
		bookmark = testList.find("giraffe");
		if (bookmark == null) {
			System.out.println("correct result");
		} else {
			System.out.println("incorrect result");
		}
	}
}
