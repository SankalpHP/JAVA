package linkedList2;

class Node
{
	public int data;
	public Node next;
}

public class Linkedlist2 {
	
	public Node head;
	
	public boolean isempty()
	{
		return (head == null);
		
	}
	
	public void InsertFirst(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
	
	public Node DeleteFirst()
	{
		head = head.next;
		return head;
	}
	
	public void Printdata()
	{
		
		Node current = head;
		while(current != null)
		{
			System.out.println(current.data);
			current = current.next;
		}
	}

}
