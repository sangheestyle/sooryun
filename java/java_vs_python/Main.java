import java.util.ArrayList;


// 4. Class and inheritance
class Animal{
  private String name;
  public Animal(String name){
    this.name = name;
  }
}

class Dog extends Animal{
  public Dog(String name) {
    super(name);
  }

  public void saySomething(){
    System.out.print("I can bark");
  }
}

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

    // 4. Class and inheritance
    Dog dog = new Dog("Chiwawa");
    dog.saySomething();

    // 6. Collections
    ArrayList<String> al = new ArrayList<String>();
    al.add("a");
    al.add("b");
    al.add("c");
    System.out.println(al);

    for (String s : al)
      System.out.println(s);
  }
}
