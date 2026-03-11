package genericos;

import java.util.ArrayList;
import java.util.List;

public class Main {



  public static void main(String[] args) {


    List<Object> list = new ArrayList<>();

    list.add(1);
    list.add("2");

    // Box<String> stringBox = new Box<String>("Daniel");

    // System.out.println(stringBox);

    // Box<Integer> integerBox = new Box<>(10);
    // System.out.println(integerBox.getValue());

    Utility.printItem("Daniel", 2);
    Utility.printItem(10);

    MathUtils.sum(2,2);

    List<String> names = new ArrayList<>();
    names.add("Gabriel");
    names.add("Daniel");

    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);

    printList(names);
    printList(numbers);

    sumNumbers(numbers);

    addNumbers(numbers);


  }

  public static void printList(List<?> list){
    for (Object obj: list){
      System.out.println(obj);
    }
  }

  public static void sumNumbers(List<? extends Number> numbers){
    double sum = 0;
    for (Number num: numbers){
      sum =+ num.doubleValue();
    }
    System.out.println(sum);
  }

  public static void addNumbers(List<? super Integer> numbers){

    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    Object num = numbers.get(0);

    System.out.println(num);


  }



}
