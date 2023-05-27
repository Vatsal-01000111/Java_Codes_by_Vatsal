class Movie {
   public void displayInfo() {
      System.out.println("Marvel's best movie is Avengers:End Game");
   }
}

class Check extends Movie {
   @Override
   public void displayInfo() {
      System.out.println("Marvel Only Creates Amazing Movies");
   }
}

class Java5 {
   public static void main(String[] args) {
      System.out.println("A-51 Siddhi Kommuri");
      Check d1 = new Check();
      d1.displayInfo();
   }
}