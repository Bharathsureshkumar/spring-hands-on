package com.bean.lifecycle;

import org.springframework.core.Ordered;

public class BeanInitDestoyMethod implements Ordered{

	public void init() {
		System.out.println("Before Method Called after spring initialized the BeanInitDestroy Bean 0");
	}
	
	
	BeanInitDestoyMethod(){
		System.out.println("BeanInitDestoyMethod");
	}
	
	public void  destroy() {
		System.out.println("Destroy Method Called before spring destroyed the BeanInitDestroy Bean 0");
	}
	
	
	@Override
	public int getOrder() {return 0;}
	
}
