
public class answers {
	
	public static void main (String[] args) 
	{
		
	int x = 5, y = 10;
	
	//first equation - x+y*2
	int multiplyone = y*2;
	int firstanswer = multiplyone+x;
	
	//second equation - x-y+2
	int addtwo = y+2;
	int secondanswer = addtwo - x;
	
	//third equation - (x+y) * 2
	int addthree = x+y;
	int thirdanswer = addthree*2;
	
	//fourth equation =  y % x
	int fourthanswer = y%x;
	

		 System.out.println("Let's assume the value for X is '"+x +"'" +" and the value for Y is '"+ +y +"'");
		 System.out.println("The value for x+y*2 = " +firstanswer);
		 System.out.println("The value for x-y+2 = " +secondanswer);
		 System.out.println("The value for (x+y)*2 = " +thirdanswer);
		 System.out.println("When you divide Y by X, you get a remainder of = " +fourthanswer);
		 
		
	}
}
