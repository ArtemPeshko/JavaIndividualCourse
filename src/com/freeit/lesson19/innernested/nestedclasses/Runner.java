package com.freeit.lesson19.innernested.nestedclasses;


public class Runner {
	public static void main(String[] args) {

		Outer1.Inner1 inner1 = new Outer1.Inner1();
		inner1.method();

		new Outer1.Inner2().method();

		Outer1 o1 = new Outer1();
		Outer1.Inner2 i2 = new Outer1.Inner2();
		i2.method();

		Outer1.Inner3 inner3 = new Outer1.Inner3();
		inner3.printMe();

		Outer1.Inner3.method();


		InnerExtending.method();

//		Класс вложенный в интерфейс статический по умолчанию

		new InterfaceNestedExampl.InnerInInterface().meth();
	}
}
