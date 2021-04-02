package APComputerScience;

public class mainSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      student ronok = new student();
     String a = ronok.getName();
      System.out.println(a);
      ronok.setName("rhea");
      System.out.println(ronok.getName());
	 student manisha = new student("manisha", 50, 38, "female");
	 String manname = manisha.getName();
	 int manage = manisha.getAge();
	 System.out.println( manname+ "'s age is " + manage);
	 manisha.setName("sudip");
	 System.out.println( manisha.getName()+ "'s age is " + manage);
	
	}

}
