public class Dog extends Animal {
	
	@Override
		public void eat(){
			System.out.print("Dog love to eat seeds ");
		}
	@Override	
		public void sleep(){
			System.out.print("and sleep for 12-14 hours a day.");
		}
	@Override	
		public void makeSound(){
			System.out.println("Aww aww");
		} 
}