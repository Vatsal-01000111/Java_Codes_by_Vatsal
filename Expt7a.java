abstract class Subject {
  abstract void easy();

  public void difficult() {
    System.out.println("Dlca Subject is difficult.");
  }
}

class Dog extends Subject {
  public void easy() {
    System.out.println("Math Subject is easy.");
  }
}

public class Expt7a {
  public static void main(String[] args) {

    Dog d1 = new Dog();
    System.out.println("A-33 Vatsal Gandhi");
    d1.easy();
    d1.difficult();
  }
}