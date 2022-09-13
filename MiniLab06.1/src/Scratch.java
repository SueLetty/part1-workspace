public class Scratch {

  public static void main(String[] args) {
    String city1 = "new york";
    String city2 = "new york";

    System.out.println(city1.equals(city2));
    System.out.println(city1==city2);

    String newCity1 = city1.substring(0,3);
    String newCity2 = city2.substring(0,3);
    System.out.println(newCity1.equals(newCity2));
    System.out.println(newCity1==newCity2);
  }
}
