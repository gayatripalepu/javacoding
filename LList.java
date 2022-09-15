
class Node
{
private int data;
private  Node link;
public Node()
{
	data =0;
	link = null;
}
public Node(int data)
{
	this.data =data;
	this.link = null;
}
public void setData(int data)
{ this.data = data; }
public void setLink(Node link)
{ this.link  = link; }
public int getData()
{ return data;}
public Node getLink()
{ return link; }
}
class LList
{
private Node head;
public LList()
{
	head = null;
}
public void append(int data)
{
Node temp=new Node(data);;
if(head == null)
{
	
 	head = temp;
	return;
}

Node temp1;
temp1 = head;
while(temp1.getLink() != null)
	temp1 = temp1.getLink();
temp1.setLink(temp);


}

public void display()
{
	if(head != null)
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.getData());
			temp = temp.getLink();
		}
		return;
	}
	System.out.println("List is empty");
}
public Node search(int n)
{
if(head != null)
{
	Node temp = head;
	while(temp != null)
	{
		if(temp.getData() == n)
		return temp;
		temp = temp.getLink();
	}
}
return null;
}
public Node search2(int n)
{
if(head != null)
{
	Node temp = head;
	Node temp1=null;
	while(temp != null)
	{
		if(temp.getData() == n)
		{
			if(temp == head)
				return temp;
			else
				return temp1;
		
		}
		temp1 =temp;
		temp = temp.getLink();
	}
}
return null;
}

public Node search3(int n,int occ)
{
int cnt=0;
if(head != null)
{
	Node temp = head;
	Node temp1=null;
	while(temp != null)
	{
		if(temp.getData() == n)
		{
			cnt=cnt+1;
			if(cnt ==occ)
			{
			if(temp == head)
				return temp;
			else
				return temp1;
			}
		
		}
		temp1 =temp;
		temp = temp.getLink();
	}
}
return null;
}
public void insertAfter(int s,int t)
{
	Node temp = search(s);
	if(temp != null)
	{
		Node temp1 = new Node(t);
		temp1.setLink(temp.getLink());
		temp.setLink(temp1);
		return;
	}
	System.out.println("no such node found" + s);
}
public void insertBefore(int s,int t)
{
	Node temp1 = new Node(t);
	if(head.getData()==s)
	{
		temp1.setLink(head);
		head = temp1;
		return;	
	}	
	Node temp = search2(s);
	
	if(temp != null)
	{
		
			temp1.setLink(temp.getLink());
			temp.setLink(temp1);
		return;
	}
	System.out.println("no such node found : " + s);
}
public void insertBefore(int s,int t,int occ)
{
	Node temp1 = new Node(t);
	if(head.getData()==s && occ ==1)
	{
		temp1.setLink(head);
		head = temp1;
		return;	
	}	
	Node temp = search3(s,occ);
	
	if(temp != null)
	{
		
			temp1.setLink(temp.getLink());
			temp.setLink(temp1);
		return;
	}
	System.out.println("no such node found : " + s);
}
public void reverse(int k)
{
	Node curr=null,prev=null,next=null;
	if(head != null)
	{
		curr=head;
		while(curr != null)
		{
			next = curr.getLink();
			curr.setLink(prev);
			prev = curr;
			curr = next;
		}
			head = prev;
		return;
	}
	System.out.println("List is empty");
}
public void removeEvens()
{
	Node temp=head;
	if(head==null)
	{
		System.out.println("List is empty");
		return;	
	}
	Node prev=null;
	while(temp != null)
	{
		if(temp.getData()%2 !=0 )
		{
			
			
				if(prev == null)
				{
					prev = temp;
					head = temp;
				}
				else
				{
			 		prev.setLink(temp);	
					prev = prev.getLink();
				}				
		}		
			     temp = temp.getLink();		
	}
	if(prev != null)
		prev.setLink(null);
	else
		head = null;	
}
public static void main(String args[])
{
LList l = new LList();
l.append(10);
l.append(12);
l.append(23);
l.append(40);
l.append(32);
l.append(43);
l.append(51);
l.append(14);
l.append(15);
l.append(60);
l.append(20);
l.append(21);
l.display();
l.removeEvens();
System.out.println("");
l.display();
}
}