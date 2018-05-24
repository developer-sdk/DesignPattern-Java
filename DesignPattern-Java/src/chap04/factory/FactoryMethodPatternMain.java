package chap04.factory;

import chap04.factory.idcard.IDCardFactory;
import chap04.factory.pencil.PencilFactory;

public class FactoryMethodPatternMain {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		
		Product p1 = factory.create("A");
		Product p2 = factory.create("B");
		Product p3 = factory.create("C");
		
		p1.use();
		p2.use();
		p3.use();
		
		factory = new PencilFactory();
		
		p1 = factory.create("철수");
		p2 = factory.create("영희");
		p3 = factory.create("순이");
		
		p1.use();
		p2.use();
		p3.use();
	}
}