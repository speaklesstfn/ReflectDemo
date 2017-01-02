package com.tfn.sddd;

import java.lang.reflect.Array;

/**
 * 操作数组
 * @author tfn
 *
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		//创建一个元素类型为String，长度为15的数组
		Object arr = Array.newInstance(String.class, 15);

		//设置第7个元素和第9个元素值,这里直接使用set
		Array.set(arr,7,"第七个元素");
		Array.set(arr,9,"第九个元素");
		
		//取出第七个和第九个元素值，这里直接使用get
		Object val7 = Array.get(arr,7);
		Object val9 = Array.get(arr,9);
		
		System.out.println(val7);
		System.out.println(val9);
		
	}

}
