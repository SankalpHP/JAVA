package stack;

public class Stack {
	
	static final int Max = 10;
	int top;
	int a[] = new int[Max];
	
	Stack()
	{
		top = -1;
	}

	boolean Push(int data)
	{
		if(top >= (Max-1 ))
		{
			System.out.println("Stack is Overflow");
			return false;
		}
		else
		{
			top=top+1;
			a[top] = data;
			System.out.println("Data added to a Stack");
			return true;
		}
	}
	
	int pop()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
		{
			int x = a[top];
			top = top -1;
			return x;
		}
	}
	
	int peek()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
		{
			int y = a[top];
			return y;
	    }
    }
	
	boolean isEmpty()
	{
		return(top < 0);
	}
	
	boolean isFull()
	{
		return(top > Max - 1);// or return(top > a.lenght());
	}
	int Size()
	{
		return(top + 1);
	}

}
