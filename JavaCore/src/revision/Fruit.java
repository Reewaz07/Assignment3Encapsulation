package revision;
//question numn=2
 class Fruit {
String name="BANANa";
String Taste="sweer";
int size=5;
void eat() {
	System.out.println(this.name);
	System.out.println(this.Taste);
	//System.out.println(this.size);//
	
}
 }
class Apple extends Fruit{
	void eat() {
		System.out.println(name);
		System.out.println(Taste);
	
}
}
	class Orange extends Fruit{
		void eat() {
			System.out.println(name);
			System.out.println(Taste);
		
}
	
		public static void main(String[] args) {
			Orange obj=new Orange();
			obj.eat();
			
		}
	}
 

	

