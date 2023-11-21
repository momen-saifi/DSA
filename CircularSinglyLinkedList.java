
public class CircularSinglyLinkedList {
	
	class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	
	private void addFirst(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
			{
			head=newNode;
			newNode.next=head;
			}
		else
		{
			Node currNode=head;
			while(currNode.next!=head)
			{
				currNode=currNode.next;
			}
			newNode.next=head;
			head=newNode;
			currNode.next=newNode;//(currNode.next=head)
			
		}
			
	}
	private void display()
	{
		if(head==null)
			System.out.println("List is empty");
			
		else
		{
			Node temp=head;
			do
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}while(temp!=head);
		}
		
	}
	public static void main(String args[])
	{
		CircularSinglyLinkedList c1=new CircularSinglyLinkedList();
		
		c1.addFirst(5);
		c1.addFirst(6);
		c1.addFirst(7);
		c1.addFirst(8);
		c1.addFirst(9);
		c1.display();
	}
			

}
