
public class DoublyLinkedList {
	
	Node head;
	class Node{
		int data;
		Node prev;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.prev=null;
			this.next=null;
		}
	}
	private void addFirst(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
			head=newNode;
		else
		{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		
	}
	private void addLast(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
		}
		else if(head.next==null)
		{
			head.next=newNode;
			newNode.prev=head;
		}
		else
		{
			Node temp=head.next;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.prev=temp;
		}
				
	}
	private void addMid(int data,int position)
	{
		Node newNode=new Node(data);
		if(position==1)
		{
			addFirst(data);
		}
		else
		{

			Node currentNode=head;
			
			for(int i=1;i<position-1;i++)
			{
				if(currentNode==null)
				{
					return;
				}
				currentNode=currentNode.next;
			}
			newNode.next=currentNode.next;
			newNode.prev=currentNode;
			currentNode.next.prev=newNode;
			currentNode.next=newNode;

			
		}
	}
	public void deleteFirst()
	{
		if(head==null)
			System.out.println("List is empty");
		else
			head=head.next;
	}
	private void deleteLast()
	{
		if(head==null)
			System.out.println("List is empty");
		else if(head.next==null)
			head=head.next;
		else
		{
			Node currNode=head.next;
			Node prevNode=head;
			while(currNode.next!=null)
			{
				prevNode=currNode;
				currNode=currNode.next;
			}
			prevNode.next=null;
		}
	}
	private void search(int data)
	{
		Node temp=head;
		int i=0;
		while(temp.next!=null)
		{
			if(temp.data==data)
			{
				System.out.println("data is found at "+i+"th index");
				break;
			}
			i++;
			temp=temp.next;
		}
	}
	private void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
			
	}
	
	public static void main(String args[])
	{
		DoublyLinkedList l1=new DoublyLinkedList();
		l1.addFirst(10);
		l1.addFirst(11);
		l1.addFirst(12);
		//l1.display();
		//l1.addLast(9);
		l1.addMid(15,3);
		//l1.deleteFirst();
		//l1.deleteLast();
		l1.display();
		
	}
	

}
