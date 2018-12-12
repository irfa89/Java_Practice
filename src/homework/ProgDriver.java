package homework;

 class Person { 
	public static final int MALE = 0, 
	FEMALE = 1; 
	protected String  name;
	int sex; 
	public void setName(String n) { 
		// Accessor 
		name = n; 
		} 
	public String getName() {
		// Accessor 
		if (sex == MALE) {
			return("Mr. " + name);
			} 
		else {
			return("Ms. " + name);
			}
		}
	}



class Engineer extends Person {
	String employer; 
	public String getName() { 
		// New version 
		if (sex == MALE) 
			return ("Mr. " + name + ", Engineer"); 
		else 
			return ("Ms. " + name + ", Engineer"); 
		}
	}



class ProgDriver { 
	public static void main(String[] args) { 
		Engineer ceo = new Engineer(); 
		ceo.setName("Norm Augustine"); 
		ceo.sex = Person.MALE; 
		System.out.println(ceo.getName()); 
		}
	}