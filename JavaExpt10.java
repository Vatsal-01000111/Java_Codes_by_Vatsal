class odd extends Thread{
	public void run(){
		for(int i=1;i<=20;i=i+2){
		System.out.println("ODD="+i);
		try{
			sleep(1000);
		}
		catch(Exception e){
			System.out.println("Error");
		}
		} 
	} 
}
class even extends Thread{
	public void run(){
		for(int i=0;i<=20;i=i+2){
			System.out.println("EVEN="+i);
			try{
				sleep(1000);
			}
			catch(Exception e){
				System.out.println("Error");
			}
		}
	}
}
class JavaExpt10{
public static void main(String args[]){
    System.out.println("A-33 Vatsal Gandhi");
    odd o=new odd();
    even e=new even();
    e.start();
    o.start();
}
}
