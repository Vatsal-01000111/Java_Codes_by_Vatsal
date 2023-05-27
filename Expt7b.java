interface IcecreamTaste {
   void taste();
}
interface IcecreamCompany {
   void company();
}
class Food implements IcecreamTaste, IcecreamCompany {
   public void taste() {
      System.out.println("Ice-cream is delicious");
   }
   public void company() {
      System.out.println("Ice-cream companies are Havmor, Kwality Wall's, Amul, etc.");
   }
}
public class Expt7b {
   public static void main(String args[]) {
      System.out.println("A-33 Vatsal Gandhi");
      Food a = new Food();
      a.taste();
      a.company();
   }
}