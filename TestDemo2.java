package Samuel;

import java.util.List;

public class TestDemo2 {

	public static void main(String[] args) {
		Service service = new Service();
		List<Animal> animals = service.getAnimalList();
		
		for(Animal animal : animals){
			System.out.println(animal.getShelter_name());
		}
		
	}

}