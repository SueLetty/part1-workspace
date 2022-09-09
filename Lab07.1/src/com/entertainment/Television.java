package com.entertainment;

public class Television {

  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 100;

  private static int instanceCount = 0;
  private String brand;
  private int volume;
  private boolean isMute;
  private int oldVolume;
  private DisplayType display = DisplayType.LED;

  public Television(){

  }
  public Television(String brand){
    //this.brand = brand;
    setBrand(brand);
  }
  public  Television(String brand, int volume){
    this(brand);
    //this.volume = volume;
    setVolume(volume);
  }
  public Television(String brand, int volume, DisplayType display){
    this(brand, volume);
    setDisplay(display);
  }
  public void turnOn(){
    boolean isConnected = verifyInternetConnection();
    System.out.println("The " + brand + " com.entertainment.Television is on, with a volume of " + volume);
  }
  public void turnOff(){
    System.out.println("The " + brand + " television is off");
  }

  public static int getInstanceCount() {
    return ++instanceCount;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
//    if(brand.equals("Samsung") || brand.equals("LG") || brand.equals("Sony") || brand.equals("Toshiba")){
//      this.brand = brand;
//    }else{
//      System.out.printf("Error!! Samsung, LG, Toshiba, and Sony are valid brands");
//    }
    switch(brand){
      case "Samsung":
      case "LG":
      case "Toshiba":
      case "Sony":
        this.brand = brand;
        break;
      default:
        System.out.printf("%s is not a valid brand; only Samsung, LG, Toshiba, and Sony are allowed.%n", brand);
    }

  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if(volume < MIN_VOLUME || volume > MAX_VOLUME){
      System.out.printf("%d is invalid the volume must be between %d and %d (inclusive).", volume, MIN_VOLUME,MAX_VOLUME);
    } else{
      this.volume = volume;
      isMute = false;
    }

  }

  public DisplayType getDisplay() {
    return display;
  }

  public void setDisplay(DisplayType display) {
    this.display = display;
  }

  public boolean isMute() {
    return isMute;
  }
  public void mute(){
    if(!isMute()){
      oldVolume = getVolume();
      setVolume(0);
      isMute =true;
    }else{
      setVolume(oldVolume);
      isMute = false;
    }
  }

  private boolean verifyInternetConnection(){
    return true;
  }
  @Override
  public String toString(){
    String volumeString = isMute() ? "<muted>" : String.valueOf(getVolume());
    return "com.entertainment.Television: brand=" + getBrand() + ", volume=" + volumeString + ", display=" + getDisplay();
  }
}
