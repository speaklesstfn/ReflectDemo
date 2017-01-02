package com.tfn.sddd;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 调用方法
 * @author tfn
 *
 */
public class MethodTest {
	
	public void testMethod(String str){
		System.out.println("调用有参方法，str参数为：" + str);
	}
	
	public static void main(String[] args) {
		Class<?> clazz = null;
		try {
			clazz = Class.forName("com.tfn.sddd.MethodTest");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//调用方法
		try {
			Object ins = clazz.newInstance();
			
			//获取testMethod方法
			Method method = clazz.getMethod("testMethod", String.class);
			
			//通过Method的invoke方法调用
			method.invoke(ins, "test");
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
