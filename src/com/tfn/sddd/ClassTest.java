package com.tfn.sddd;

/**
 * 获取Class对象
 * @author tfn
 *
 */
public class ClassTest {

	public static void main(String[] args) {
		// 第一种 Class.forName()  一般采用这种方式，名称需要带包名全名
		try {
			Class<?> class1 = Class.forName("com.tfn.sddd.ClassTest");
			System.out.println("第一种类名：" + class1.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//第二种 每个类型都有class属性
		Class<?> class2 = ClassTest.class;
		System.out.println("第二种类名：" + class2.getName());
		
		//第三种 任意一个对象都有getClass()方法
		Class<?> class3 = new ClassTest().getClass();
		System.out.println("第三种类名：" + class3.getName());
	}

}
