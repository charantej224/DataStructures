import com.charan.datastructures.lists.LinkedList;
import com.charan.datastructures.lists.Node;

public class SingleLinkedList {
	
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(20);
		linkedList.add(10);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		linkedList.add(80);
		
		System.out.println(getSortedList(linkedList));
	}

	private static LinkedList<Integer> getSortedList(LinkedList<Integer> linkedList) {
		Node<Integer> node = linkedList.headNode;
		LinkedList<Integer> sortedlinkedList = new LinkedList<Integer>();
		while(node != null) {
			Node<Integer> node1 = sortedlinkedList.headNode;
			if(null == node1) {
				sortedlinkedList.add(node.getT());
			} else {
				while(node1 != null) {
					if(node.getT().compareTo(node1.getT()) > 0) {
						
					}
				}
			}
		}
		return null;
	}

}
