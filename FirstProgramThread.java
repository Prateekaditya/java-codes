class FirstProgramThread extends Thread{
	public void run(){
		System.out.println("Good Morning");
		System.out.println("Good Afternoon");
		System.out.println("Good Evening");
		System.out.println("Good Night");
		System.out.println(Thread.currentThread().getState());
			}
	public static void main(String[]args){
	 	FirstProgramThread obj= new FirstProgramThread();
		obj.start();
		}	
}