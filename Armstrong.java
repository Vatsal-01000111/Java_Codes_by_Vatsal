import java.io.*;
class Armstrong{
public static void main(String [] args) throws IOException{
 try {
   BufferedReader obc=new BufferedReader (new InputStreamReader(System.in));
      int n1,r,n2,arm=0;      
      System.out.println("Please enter the number: ");
      n1=Integer.parseInt(obc.readLine());
        n2=n1;
          while(n1>0) {
             r=n1%10;
             arm=arm+r*r*r;
             n1=n1/10;
          }
            if(n2==arm) {
               System.out.println("The no. is Armstrong.");
            } else {
               System.out.println("The no. is not Armstrong.");
            }
     }catch(IOException e) {
         System.out.println("The entered no. is wrong");
     }
 }
}