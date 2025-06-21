package com.lambda;

@FunctionalInterface
public interface Vehicle {

	public void start();        // supports only one public abstract methpd - functional inteface
   
	default void stop() {
	}
}
