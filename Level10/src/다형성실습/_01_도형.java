package 다형성실습;

import java.util.Random;

abstract class Shape {
	String name;
	String color;
	double size;

	Shape(String name, String color, int size) {
		super();
		this.name = name;
		this.color = color;
		this.size = size;
	}
	
	Shape(String name, String color, double size) {
		super();
		this.name = name;
		this.color = color;
		this.size = size;
	}
	
	abstract void draw();
	
	@Override
	public String toString() {
		return String.format("%s %s (%.2f)", name , color, size);
	}
}


class Line extends Shape {

	Line(String color, int size) {
		super("선", color,size);
	}

	@Override
	void draw() {
		System.out.println("선을 긋는다 ");
	}
}


class point extends Shape {

	point(String color, int size) {
		super("점", color,size);
	}

	@Override
	void draw() {
		System.out.println("점을 찍는다");
	}
}


class Circle extends Shape {

	int radius;

	Circle(String color, int radius) {
		super("원", color, radius*radius*Math.PI);
		this.radius = radius;
	}

	@Override
	void draw() {
		System.out.println("원을 그린다");
	}
}


class Rect extends Shape {
	
	int height;
	int width;
	
	Rect(String color, int height, int width) {
		super("사각형", color, height*width);
		this.height = height;
		this.width = width;
	}
	
	@Override
	void draw() {
		System.out.println("사각형을 그린다");
	}
}


class Triangle extends Shape {
	
	int height;
	int width;
	
	Triangle(String color, int height, int width) {
		super("삼각형", color, height*width/2);
		this.height = height;
		this.width = width;
	}

	@Override
	void draw() {
		System.out.println("삼각형을 그린다");
	}
}


public class _01_도형 {

	public static void main(String[] args) {
		
		// 모양, 색깔 사이즈, 모두 랜덤하게 도형 10개를 출력하시오
		// 점, 선, 기존 size 출력
		// 원, 네모, 세모 => size 넓이를 계산해서 출력
		
		String[] colors = {"파란색", "빨간색", "보라색", "분홍색", "노란색"};
		Shape[] list = new Shape[10];

		Random rd = new Random();
		
//		Rect meno = new Rect(colors[colorIdx], rd.nextInt(10)+1, rd.nextInt(10)+1);
//		meno.draw();
//		System.out.println(meno);
		
		// [문제1] 10개 랜덤으로 생성해서 출력하기 (사이즈는 랜덤 1~10까지로 설정)
		System.out.println("[  문제1  ]");
		for(int i=0; i<list.length; i++) {
			int size = rd.nextInt(4);
			int colorIdx = rd.nextInt(colors.length);
			if(size == 0) {
				list[i] = new Line(colors[colorIdx] , rd.nextInt(10)+1);
			}else if(size == 1) {
				list[i] = new point(colors[colorIdx] , rd.nextInt(10)+1);
			}else if(size == 2) {
				list[i] = new Circle(colors[colorIdx] , rd.nextInt(10)+1);
			}else if(size == 3) {
				list[i] = new Rect(colors[colorIdx] , rd.nextInt(10)+1, rd.nextInt(10)+1);
			}else {
				list[i] = new Triangle(colors[colorIdx] , rd.nextInt(10)+1, rd.nextInt(10)+1);
			}
		}
		
		for(Shape shape : list) {
			shape.draw();
			System.out.println(shape);
		}
		
		
		// [문제2] 원만 출력하기
		System.out.println();
		System.out.println("[  문제2  ]");
		
		for(Shape shape : list) {
			if(shape instanceof Circle) {
				shape.draw();
				System.out.println(shape);
			}
		}
	}
}
