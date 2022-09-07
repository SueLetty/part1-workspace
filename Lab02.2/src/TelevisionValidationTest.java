public class TelevisionValidationTest {

  public static void main(String[] args) {
    //Validation testing for Volume
    Television tv1 = new Television();
    tv1.setVolume(-1);
    System.out.println(tv1.getVolume());

    tv1.setVolume(1);
    System.out.println(tv1.getVolume());

    Television tv2 = new Television("Samsung", 101);
    System.out.println(tv2.getVolume());

    //Validation testing for brand
    Television tv3 = new Television();
    tv3.setBrand("Samsung");
    System.out.println(tv3);

    tv3.setBrand("LG");
    System.out.println(tv3);

    tv3.setBrand("Sony");
    System.out.println(tv3);

    tv3.setBrand("Toshiba");
    System.out.println(tv3);

    tv3.setBrand("INVALID");
    System.out.println(tv3);

    //validation testing for mute
    Television tv4 = new Television("Samsung", 32);
    System.out.println(tv4);

    tv4.mute();
    System.out.println(tv4);//mute

    tv4.mute();
    System.out.println(tv4);//unmute

    tv4.mute();
    System.out.println(tv4);//mute

    tv4.setVolume(50);
    System.out.println(tv4);//unmute

  }
}
