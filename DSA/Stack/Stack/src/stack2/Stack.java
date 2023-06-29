package stack2;

public class Stack {
	
	static final int Max = 10;
	int Top;
	int a[] = new int[Max];
	
	
	Stack()
	{
	   Top = -1;	
	}
	
	public boolean Push(int data)
	{
		if(Top >= Max-1)
		{
			System.out.println("Stack is Overflow");
			return false;
			
		}
		else
		{
			Top = Top + 1;
			a[Top] = data;
			System.out.println("data is added to stack");
			return true;
		}
	}
	public int pop()
	{
	  if(Top == -1)
	  {
		  System.out.println("Stack is empty");
		  return 0;
	  }
	  else
	  {
		 int x = a[Top];
		 Top = Top - 1;
		 return x;
		  
	  }
	}
	
	public int peek()
	{
		 if(Top == -1)
		  {
			  System.out.println("Stack is empty");
			  return 0;
		  }
		  else
		  {
			 int y = a[Top];
			 return y;
			  
		  }
	}
	
	
	public boolean isempty()
	{
		return (Top < 0);
	}
	
	public boolean isfull()
	{
		return(Top > Max - 1);
	}
	
	public int Size()
	{
		return Top + 1; 
	}
	
}
