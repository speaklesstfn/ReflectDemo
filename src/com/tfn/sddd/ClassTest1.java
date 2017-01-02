package com.tfn.sddd;

import java.lang.reflect.Method;

/**
 * 从Class中获取信息
 * @author tfn
 *
 */
public class ClassTest1 {

	//定义一个无参的public方法
	public void info(){
		System.out.println("执行无参数的info方法");
	}

	//定义一个有参的public方法
	public void info(String str){
		System.out.println("执行public有参数的info方法，其str参数值为：" + str);
	}
	
	//定义一个有参的private方法
	private void info(String str,int num){
		System.out.println("执行private有参数的info方法，其str参数值为：" + str + " ，num参数为：" + num);
	}
	
	public static void main(String[] args) {
		Class<?> clazz = null;
		try {
			clazz = Class.forName("com.tfn.sddd.ClassTest1");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//获取该Class对象对应类的全部public方法
		Method[] methods = clazz.getMethods();
		System.out.println("ClassTest1的全部public方法如下：");
		for(Method mtd :methods){
			System.out.println(mtd);
		}

		System.out.println("");
		//获取该Class对象对应类的全部方法
		Method[] dMethods = clazz.getDeclaredMethods();
		System.out.println("ClassTest1的全部方法如下：");
		for(Method mtd :dMethods){
			System.out.println(mtd);
		}

		System.out.println("");
		//获取该Class对象对应类的指定public方法
		try {
			System.out.println("ClassTest1中名为info，参数类型为String的public方法为：" + clazz.getMethod("info", String.class));
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("");
		//获取该Class对象对应类的指定方法
		try {
			System.out.println("ClassTest1中名为info，参数类型为String和int的方法为：" + clazz.getDeclaredMethod("info", String.class,int.class));
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("");
	}
	
}
