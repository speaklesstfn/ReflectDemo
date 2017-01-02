package com.tfn.sddd;

import java.lang.reflect.Field;

/**
 * 修改Field值
 * @author tfn
 *
 */
public class FieldTest {
	
	public static void main(String[] args) {
		Class<?> clazz = null;
		try {
			clazz = Class.forName("com.tfn.sddd.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//修改Field值
		try {
			Object ins = clazz.newInstance();
			
			//获取name属性
			Field nameField = clazz.getDeclaredField("name");
			//设置可操作性为true
			nameField.setAccessible(true);
			//修改name的值，这里直接使用set
			nameField.set(ins, "张三");
			
			//获取age属性
			Field ageField = clazz.getDeclaredField("age");
			//设置可操作性为true
			ageField.setAccessible(true);
			//修改age的值，这里使用setInt
			ageField.setInt(ins, 28);
			
			System.out.println(ins);
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}


class Person{
	private String name = "";
	private int age = 0;

	public String toString(){
		return "Person[name:" + name + ", age:" + age + "]";
	}
}

