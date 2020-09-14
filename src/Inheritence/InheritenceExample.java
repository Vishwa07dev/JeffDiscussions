package Inheritence;

import java.util.ArrayList;
import java.util.List;


public class InheritenceExample {
  /***
   *
   *
   * is A kind of relationship
   * @param args
   */

  public static void main(String[] args) {
      String str  = "Vishwa" ;

      for(char c : str.toCharArray()){

      }


      List<Integer> list = new ArrayList<>();

      for(int i : list){

      }


  }

}

class Animal {
  int a =5 ;
  public void eat(){

    System.out.println("I am eating");
  }
}
//
//class Dog extends Animal {
//
//}


class Machine {
  int powerRatings = 1000 ;

  public void operate(){
    System.out.println("Machine is getting operated");
  }
}

// Dog is A Machine --> False

class Dog extends Machine {  // this is wrong coding practice.... !!!
}



class A {

  public void eat(){
    System.out.println("A is eating");
  }
}

class B {
  public void eat(){
    System.out.println("B is eating");
  }
}
// Multiple inheritance is not allowed

//Diamond problem   C++ here multiple inheritance was allowed



/**
 *
 *   Three stages of evolutions
 *
 *   Monkeys  --> Caveman --> Tribals --> Humans
 **/