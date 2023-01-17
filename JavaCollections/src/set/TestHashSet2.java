package set;

import java.util.*;

class Animal {
	String species;
	String habitat;

	Animal(String species, String habitat) {
		this.species = species;
		this.habitat = habitat;
	}

	public int hashCode() {
		return (species + habitat).hashCode();
	}

	public boolean equals(Object obj) {
		if (obj instanceof Animal) {
			Animal temp = (Animal) obj;
			return species.equals(temp.species) && habitat.equals(temp.habitat);
		} else {
			return false;
		}
	}
}

public class TestHashSet2 {
	public static void main(String[] args) {
		HashSet<Animal> hs = new HashSet<Animal>();

		System.out.println(hs.add(new Animal("고양이", "육지")));
		System.out.println(hs.add(new Animal("고양이", "육지")));
		System.out.println(hs.add(new Animal("고양이", "육지")));
		
		System.out.println(hs.size());
	}
}