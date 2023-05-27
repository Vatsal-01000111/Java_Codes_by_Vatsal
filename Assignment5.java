class Overrated {
   public void displayInfo() {
      System.out.println("Chocolate is very overrated");
   }
}

class Check extends Overrated {
   @Override
   public void displayInfo() {
      System.out.println("Chocolate Ice-cream is very overrated");
   }
}

class Assignment5 {
   public static void main(String[] args) {
      System.out.println("A-33 Vatsal Gandhi");
      Check d1 = new Check();
      d1.displayInfo();
   }
}