
public class LinkedList1 {
	int size;
	Node head;
	class Node{
		int data;
		Node next;
	
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public void addFirst(int data)
	{
		Node newNode=new Node(data);
		
		newNode.next=head;
		head=newNode;
		size++;
		
	}
	
	public void addLast(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			newNode.next=head;
			head=newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
		}		
		size++;
	}
	
	public void addMid(int data,int loc)
	{
		Node newNode=new Node(data);
		Node temp=head;
		
		for(int i=0;i<loc;i++)
		{
			if(temp==null)
			{
				return;
			}
			temp=temp.next;
			
		}
		newNode.next=temp.next;
		temp.next=newNode;
		
	}
	
	public void removeFirst()
	{
		if(head==null)
			System.out.println("List is empity");
		else
			head=head.next;
		size--;
			
	}
	public void removeLast()
	{
		if(head==null)
			System.out.println("List is empity");
		else if(head.next==null)
		{
			head=null;
			size--;
		}
		else
		{
			Node currNode=head;
			Node lastNode=head.next;
			while(lastNode.next!=null)
			{
				currNode=currNode.next;
				lastNode=lastNode.next;
			}
			currNode.next=null;
			size--;
		}
	}
	
	public void removeMid(int loc) {
		
		if(head==null)
		{
			System.out.println("List is empity");
		}
		else
		{
				Node prevNode=null;
				Node nextNode=head;
				for(int i=1;i<loc;i++)
				{
					if(nextNode==null)
					{
						return;
					}
					prevNode=nextNode;
					nextNode=nextNode.next;
				}
				prevNode.next=nextNode.next;
		}
	
	}
	public void printList()
	{
		if(head==null)
		{
			System.out.println("List is empity");
		}
		else {
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+"  ");
				temp=temp.next;
			}
		}
	}
	
	public void serarch(int key)
	{
		Node temp=head;
		int i=0;
		while(temp!=null)
		{
			if(temp.data==key)
			{
				
				System.out.println("\nElement is found in the list at "+i+" index");
				break;
			}
			i++;
			temp=temp.next;
		}
	}
	public int getCount(Node node)
	{
		if(node==null)
			return 0;
		return 1+getCount(node.next);
	}
	private void nthNodeFind(int position)
	{
		int n=getCount(head);
		Node currNode=head;
		for(int i=1;i<n-position+1;i++)
		{
			if(currNode==null)
				return;
			currNode=currNode.next;
		}
		
		System.out.println(currNode.data);
		removeMid(n-position+1);
	}
	private Node middle()
	{
		Node p1=head;
		Node p2=head;
		while(p2.next!=null && p2.next.next!=null)
		{
			p1=p1.next;
			p2=p2.next.next;
		}
		return p1;
	}
	private void deleteMiddle()
	{
		
		Node prevP1=null;
		Node p1=head;
		Node p2=head;
		while(p2.next!=null && p2.next.next!=null)
		{
			prevP1=p1;
			p1=p1.next;
			p2=p2.next.next;
		}
		prevP1.next=p1.next;
	}
	public static void main(String args[])
	{
		LinkedList1 list=new LinkedList1();
		list.addFirst(7);
		list.addFirst(6);
		list.addFirst(5);
		list.addFirst(4);
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		
		//list.printList();
		//list.addLast(8);
		//System.out.println("Adding element in last");
		//list.printList();
		//list.removeFirst();
		//System.out.println("size"+list.size);	
		//list.printList();
		
		//list.addMid(15, 4);
		list.printList();
		System.out.println();
		//list.nthNodeFind(1);
		//list.printList();
	//	list.serarch(5);
		//list.removeMid(1);
		//list.printList();
		Node a=list.middle();
		System.out.println(a.data);
		list.deleteMiddle();
		list.printList();
	}

}


