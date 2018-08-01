package co.grandcircus.fileio;

import java.util.List;

public class CatGameApp {
	public static void main(String[] args) {
		List<Cat> cat = CatFileUtil.readFile();
		
		for (Cat c : cat) {
			System.out.println(c.getBreed()+" "+c.getColor()+" "+c.getAgeInMonths()+" "+c.getAdoptionAvailability());
		}
		
		Cat cat2 = new Cat("British", "brown", 2, false);
		CatFileUtil.appendLine(cat2);		
		
	}
}
