import java.util.ArrayList;
import java.util.List;


public class Main2 {
  public static void main(String[] args) {
    // 1. Strings
    String city = "Boulder";
    String postalCode = "80302";
    String address = city + " " + postalCode;

    System.out.println(address);

    // 4. List
    ArrayList<Integer> aList = new ArrayList<Integer>();

    aList.add(1);
    aList.add(2);
    aList.add(3);
    aList.add(4);
    aList.add(5);

    // get item by index
    int n = aList.get(0);

    // get sub list
    List<Integer> subList = aList.subList(0, 2);
    System.out.println(subList);
  }
}
