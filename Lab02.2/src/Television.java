import javax.xml.transform.stream.StreamSource;

public class Television {
  String brand;
  int volume;

  void turnOn(){
    System.out.println("The " + brand + " Television is on, with a volume of " + volume);
  }
  void turnOff(){
    System.out.println("The " + brand + " television is off");
  }

}
