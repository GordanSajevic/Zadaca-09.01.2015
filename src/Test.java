
public class Test {

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		for (int i=0; i<10; i++)
		{
			int num = 1 + (int)(Math.random()*(10-1));
			llist.add(num);
		}
		System.out.println("Linked list: ");
		System.out.println(llist.toString());
		System.out.println(llist.getMiddleValue());
		llist.removeDuplicates();
		System.out.println(llist.toString());
	
	}

}
