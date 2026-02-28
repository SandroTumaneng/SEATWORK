class Person {
 	String name;
 	int age;

     void displayInfo() {
 	System.out.println("Name: " + name);
     System.out.println("Age: " + age);  
     }
   } 

public class seatworkFour {
	public static void main(String[] args) {
	
	Person p = new Person();
	
    p.name = "Sandro";
    p.age = 17;
    
    p.displayInfo();	
	}
}