package ExceptionHandling;

public class ExceptionClass {
	
	public void Trycatch()
	{
	
	try
	{
		String strString=null;
		String strNewString=strString.concat("Hello");
		System.out.println(strNewString);
		
		
		
		int[] arr=new int[3];
		arr[4]=56;
			
	int intNum_1 = 20;
	int intResult= intNum_1/0 ;
	System.out.println(intResult);
	System.out.println("Try block............");
	}
	catch(ArithmeticException ex)
	{
		System.out.println("You cannot divide a number by 0");
	}
	catch (ArrayIndexOutOfBoundsException ex) {
		System.out.println("Array index is wrong");
	}
	catch (NullPointerException ex) {
		
	}
	
	finally {
		System.out.println("Program end.............");
	}

	
	}
	
	
	
	public void HandleGenericException()
	{
		try {
			
			
			int[] arr=new int[3];
			arr[4]=56;
			String str= null;
			str.concat("Hello");
			
		} catch (Exception ex) {
			System.out.println("Exception found");
			//ex.printStackTrace();
		}
	}
	
	public void ThrowKeyword()
	{
		int intNum1= 20;
		int intNum2=30;
		int intNum3= intNum1+intNum2;
		
		throw new ArithmeticException();
	}
}
