package com.nt.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("bat")
//@Lazy
public class Bat {
	
	public Bat() {
		System.out.println("Bat:: 0-param Constructor "+this.getClass());
	}

	public int runsScored() {
		return (int) (Math.random()*125);
	}
}
