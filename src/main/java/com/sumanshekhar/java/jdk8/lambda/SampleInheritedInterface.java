package com.sumanshekhar.java.jdk8.lambda;

@FunctionalInterface
public interface SampleInheritedInterface extends SampleFunctionalInterface1 {
	public void m1();// if child class contains method with the same name from functional interface ,
						// Its still a functional interface
}
