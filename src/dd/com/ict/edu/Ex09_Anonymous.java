package dd.com.ict.edu;

 interface Animal{
	 public void sound();
 }

interface Animal2{
	public String play();
}

class Cat{
	void music(Animal animal) {
		animal.sound();
	}
	void game(Animal2 animal2) {
		System.out.println(animal2.play());
		}
}

public class Ex09_Anonymous {
public static void main(String[] args) {
	Cat cat = new Cat();
	cat.music(new Animal() {
		
		@Override
		public void sound() {
		System.out.println("야옹~ 야옹~");
			
		}
	});
	cat.game(new Animal2() {
		
		@Override
		public String play() {
	
			return "그루밍";
		}
	});		
			
			
			
}
}
