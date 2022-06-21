package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal ani1 = new Frog();	//�� ĳ����
		Animal ani2 = new Cat();
		
		Dog puddle = new Dog();
		Crow crow  = new Crow();
		// �ڽ� ��ü�� ������ �� ���� �θ�Ŭ���� ��ü�� �����ϸ鼭 �θ�Ŭ���� ������ ����
		
		System.out.println("::::::::");
		animal(ani1);
		animal(ani2);
		animal(puddle);
		animal(crow);
//		animal(new Frog());
		
	}
	//������
	//�޼ҵ� ���� Ÿ���� Animal : Animal , Dog , Crow, Cat, Frog  ��ü ��� ���q�մϴ�.
	public static void animal(Animal animal) {
		
		animal.act();
		animal.print();
		//���ڷ� ���޹��� animal ��ü�� �����ϴ� ���� ��¥ Ÿ��(�ν��Ͻ� Ÿ��) �˻� : instanceof
		System.out.println("dog ? " +(animal instanceof Dog));
		System.out.println("crow ? " +(animal instanceof Crow));
		System.out.println("frog ? " +(animal instanceof Frog));
		System.out.println("cat ? " +(animal instanceof Cat));
//Animal �θ�Ÿ�� ������ �ڽ�Ŭ���� �ʵ�� �޼ҵ� ���� ����.		
//		animal.jump();		//Frog
//		animal.run();		//Dog
//		animal.fly();		//Crow
//		animal.sound();		//Cat
	Cat cat; Dog dog; Frog frog; Crow crow;
		if(animal instanceof Cat) {
		 cat = (Cat)animal;		//animal ��¥ ��ü�� ���� ���� �Ǵ� ���� ����
		cat.sound();
	}
		if(animal instanceof Dog) {
		dog = (Dog)animal;
		dog.run();
		}
		if(animal instanceof Frog) {
		frog = (Frog)animal;
		frog.jump();
		}
		if(animal instanceof Crow) {
		crow = (Crow)animal;
		crow.fly();
		}
		}
}	


	 class Frog extends Animal {
		
		 
		 public Frog(){
			 System.out.println("���ο� ���� ������Frog");
		 }
		 protected String mouth; //����Ʈ ������ + �ٸ���Ű�� �ڽ�Ŭ���� 
		
		public void jump() {
		setName("������");
		setColor("�ʷ�");
		System.out.println("Ư¡ : ����");
		}		
		// ������ ���� : �޼ҵ� �������̵� : �θ� Ŭ������ �޼ҵ带 ������ ,���� Ÿ�԰� ���ڸ� �����ϰ� 
		//*�� : �����ε�
		@Override
		public void act() {
//			super.act();	// �θ�Ŭ������ act() ����
			System.out.println("Animal �ൿ : ���÷� �����ϱ�");
		}
	 
	 
	 
	 
	 
	 }		
	 
	 class Cat extends Animal {
				
		protected String eyes;
		
		public Cat(){
			System.out.println("���ο� ���� ������cat");
		}
		protected int legs;
		
		public void sound() {
			setName("������");
			setColor("ȭ��Ʈ");
			System.out.println("Ư¡ : �߿˾߿�");
		}				
	
		@Override
		public void act() {
//			super.act();
			System.out.println("Animal �ൿ : ���÷� �߿˾߿� ���");
		}
		
	
	
	
	
	
	
	
	
	
	
				
}