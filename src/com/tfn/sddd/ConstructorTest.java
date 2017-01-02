package com.tfn.sddd;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 创建对象
 * @author tfn
 *
 */
public class ConstructorTest {

	public ConstructorTest(){
		System.out.println("创建无参构造函数");
	}
	
	public ConstructorTest(String str){
		System.out.println("创建有参构造函数，str参数为：" + str);
	}
	
	public static void main(String[] args) {
		Class<?> clazz = null;
		try {
			clazz = Class.forName("com.tfn.sddd.ConstructorTest");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//第一种创建方法
		try {
			clazz.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		
		//第二种创建方法
		try {
			Constructor con = clazz.getConstructor(String.class);
			con.newInstance("test");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
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
