package myOtherPackage;

import access.baseclass;

public class OtherPackage extends baseclass{
	
	
	public void myotherClass()  {
		
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}

}

class myOtherderivedclass{
	public void myother() {
		baseclass bas2= new baseclass();
		bas2.a = 10;
		bas2.b = 20;
		bas2.c = 30;
		bas2.d = 40;
	}
}
