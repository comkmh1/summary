package koreait.day10;

public class ConstructorTest {

	public static void main(String[] args) {

	}

}


class Product {
	int price;
	
	
	public Product(int price) {
		this.price = price;
	}
}
class Food extends Product{		//Product() 디폴트 생성자 실행 -> Food() 디폴트 생성자 실행
	public Food(int price) {
		
		super(price);
	}
}
	

class Electronics extends Product{
	
	public Electronics(int price) {
		super(price);		//Product()디폴트 생성자 대신에 커스텀 생성자 호출
	}
	
}
