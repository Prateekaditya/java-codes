class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}	
}
public class MyExceptionDemo{
		
	 public static void validate(int age) throws MyException {
		if(age<18){
			throw new MyException ("Age Exception:You aren't eligible for vote as your age is " +age);	
			}
		else{
			System.out.println("You Are eligible for vote as your age is " +age);
			}

	}
	public static void main(String[]args){
		try{	
			validate(08);
			validate(20);
			validate(35);
			validate(15);
			}
		catch(MyException e){
			e.printStackTrace();
			}
		}

} 