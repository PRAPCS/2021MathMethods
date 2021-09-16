class Main {
  public static void main(String[] args) {

    double num1 = 5.2;
    double num2 = 10.5;
    double num4;
    int num5;

    //absolute value of a number
    System.out.println(Math.abs(-100));

    //power - a values rasied to the power of the second value
    System.out.println(Math.pow(2,4));
    System.out.println(Math.pow(num1,4));

    //square root
    System.out.println(Math.sqrt(num2));
    System.out.println(Math.sqrt(100));

    //random number
    System.out.println(Math.random()); //0.0 - less than 1.0
     System.out.println(Math.random()*20);//0.0 - 19.9999999..
      System.out.println((int)(Math.random()*20));//0-19
       System.out.println((int)(Math.random()*20)+1);//1-20


  }
}