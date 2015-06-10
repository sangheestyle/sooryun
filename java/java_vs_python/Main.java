public class Main {
  public static void main(String[] args) {
    // 1. Hello World
    System.out.println("Hello world");

    // 2. String Operations
    String test = "compare Java with Python";
    for(String a : test.split(" "))
      System.out.println(a);

    // 3. Control Flow
    int condition = 10;

    if(condition > 10)
      System.out.println("> 10");
    else
      System.out.println("<= 10");

    while(condition > 1){
      System.out.println(condition);
      condition--;
    }

    switch(condition){
      case 1:
        System.out.println("is 1");
        break;
      case 2:
        System.out.println("is 2");
        break;
    }

    for(int i=0; i<10; i++)
      System.out.print(i);
  }
}
