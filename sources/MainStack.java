/* Stack data structure 
   Date: 24 sept,13
***************************/
class Stack
{
	private int arr[]=new int[7];
	private int top;
	Stack()
	{
		System.out.println(" Stack is created ");
		top=-1;
	}
	void displayStack()
	{
		if(top==-1)
		{
			System.out.println("stack is empty!");
			return;
		}
		System.out.println(" Current stack elements are...");
		for(int i=top;i>=0;i--)
			System.out.println(arr[i]);
	}
	int peekAt()
	{
		if(top==-1)
			return -1;
		return arr[top];
	}
	void push(int num)
	{
		if(top==arr.length-1)
		{
			System.out.println("Stack is full!");
			return;
		}
		arr[++top]=num;
		System.out.println(+num+" is pushed to the stack!");
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
}

class MainStack
{
	public static void main(String[] args)
	{
		Stack obj=new Stack();
		obj.push(10);
		obj.push(60);
		obj.push(20);
		obj.displayStack();
		System.out.println("Top element of stack: "+obj.peekAt());
		System.out.println("Element deleted: "+obj.pop());
		System.out.println("Element deleted: "+obj.pop());
		System.out.println("Element deleted: "+obj.pop());
		obj.displayStack();
		obj.push(50);
	}
}		