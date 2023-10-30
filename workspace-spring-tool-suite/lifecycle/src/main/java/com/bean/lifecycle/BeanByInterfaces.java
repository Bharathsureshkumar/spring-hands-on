package com.bean.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.Ordered;

public class BeanByInterfaces implements InitializingBean, DisposableBean, Ordered{
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Before BeanByInterface destroy by Spring .. ! 2");

	}

	@Override
	public void afterPropertiesSet() throws Exception {


		System.out.println("After BeanByInterface initialization by Spring .. ! 2");
		
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 2;
	}

}
