package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class CalInterestAmountReplacer implements MethodReplacer {
	
	//replacer class / replaced logics will be kept here 

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
			
		return "This is simple Interest";
	}


	}


