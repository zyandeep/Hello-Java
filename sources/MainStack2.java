/* Stack operations in Java
*  Date: 01-sept-13
**************************/

class Stack
{
	private int arr[]=new int[10];
	private int top;
	
	Stack()
	{
		System.out.println("Stack object is created! ");
		top=-1;
	}
	
	void push(int num)
	{
		if(top==arr.length-1)
		{
			System.out.println("Stack is full!");
			return ;
		}
		arr[++top]=num;
	}
	
	int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty!");
			return -1;
		}
		return arr[top--];
	}
	
	void display()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty!");
			return ;
		}
		
		System.out.println("Current elements in the stack... "); 
		for(int i=top; i>=0; i--)
			System.out.println(arr[i]);
	}
}

class MainStack2
{
	public static void main(String[] args)
	{
		Stack s=new Stack();
		s.push(12);
		s.push(10);
		s.push(20);
		s.push(24);
		s.push(5);
		s.display();
		System.out.println("element deleted: " +s.pop());
		System.out.println("element deleted: " +s.pop());
		System.out.println("element deleted: " +s.pop());
		s.display();
	}
}