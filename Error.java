class Error extends Thread{
	public void run(){
		System.out.println("error: class names, not found error1 non-Runnable");

		System.out.println(Thread.currentThread().getState());
			}
	public static void main(String[]args){
	 	Error obj= new Error();
		obj.start();
		}	
}



