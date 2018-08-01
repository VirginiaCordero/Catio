package co.grandcircus.fileio;

public class Cat {

	private String breed;
	private String color;
	private int ageInMonths;
	boolean adoptionAvailability = true;
	
	public Cat() {
		
	}
	
	
	public Cat(String breed, String color, int ageInMonths, boolean adoptionAvailability) {
		super();
		this.breed = breed;
		this.color = color;
		this.ageInMonths = ageInMonths;
		this.adoptionAvailability = adoptionAvailability;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setAgeInMonths(int ageInMonths) {
		this.ageInMonths = ageInMonths;
	}

	public void setAdoptionAvailability(boolean adoptionAvailability) {
		this.adoptionAvailability = adoptionAvailability;
	}

	public String getBreed() {
		return breed;
	}

	public String getColor() {
		return color;
	}

	public int getAgeInMonths() {
		return ageInMonths;
	}

	public boolean getAdoptionAvailability() {
		return adoptionAvailability;
	}

	@Override
	public String toString() {
		return "Cat [breed=" + breed + ", color=" + color + ", ageInMonths=" + ageInMonths + ", adoptionAvailability="
				+ adoptionAvailability + "]";
	}
}
