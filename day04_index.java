package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest4 {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Dog puddle = new Dog();
		Crow crow = new Crow();
		Animal animal2 = new Crow();
		//�޼ҵ� ���ڷ� Object Ÿ�԰�ü�� �޴� �޼ҵ� 
		System.out.println(Animal.isCrow(puddle));
		System.out.println(Animal.isDog(puddle));
		System.out.println(Animal.isDog("����"));
		System.out.println(Animal.isDog(1));
		System.out.println(Animal.isCrow(animal));
		System.out.println(Animal.isCrow(crow));
		System.out.println(Animal.isCrow(animal2));
		System.out.println(Animal.isCrow("���"));
		
	}
}