package APComputerScience;

public class InheritanceExample {

	public static void main(String[] args) {
		Dog kochi = new Dog();
		kochi.bark();
		kochi.eat();
		kochi.color = "Brown";
		kochi.breed = "Labrador";
		Cat cat = new Cat();
		cat.meow();
		cat.eat();
		cat.color = "brown";
		cat.age = 10;
		
		Animal animal = new Animal();
		animal.color = "xyz";
		animal.eat();
	}
	
}
class Animal{
	String color;
	public void eat() {
System.out.println("Animal Eating");
	}
}
class Dog extends Animal{
	String breed;
	public void bark() {

}
	public void eat() {
		System.out.println("Dog Eating");
		super.eat();
	}
	}
 class Cat extends Animal{
	 int age;
	 public void meow() {

	 }	
 }
