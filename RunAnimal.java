import java.util.Scanner;

public class RunAnimal{
   public static void main(String[] args) {
   Scanner SC = new Scanner(System.in);
   
   System.out.print("Choose an animal. Press B for Bird, C for Cat, D for Dog:");
   String A = SC.nextLine();
   
   if(A.equalsIgnoreCase("B")){
   	Bird B = new Bird();
   	B.eat();
   	B.sleep();
   	B.makeSound();
   }
   
   else if(A.equalsIgnoreCase("C")){
   	Cat C = new Cat();
   	C.eat();
   	C.sleep();
   	C.makeSound();
   }
   
   else if(A.equalsIgnoreCase("D")){
   	Dog D = new Dog();
   	D.eat();
   	D.sleep();
   	D.makeSound();
   }
  }
}