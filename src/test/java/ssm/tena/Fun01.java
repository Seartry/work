package ssm.tena;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Fun01 {

	public static void main(String[] args) {
		test01();
		
	}
	
	public static void test01() {
		//二级制无法精确标示1/3
		double d = 3-2.9;
		System.out.println(d);//0.10000000000000009
		int[] arr = new int[6];
		//通过System的arraycopy方法复制数组
//		int[] a = new int[5];
//		System.arraycopy(arr, 2, a, 0, 2);
		int[] a = Arrays.copyOfRange(arr, 1, 4);
		a = Arrays.copyOf(a, a.length+1);
		System.out.println("-------");
		Random ran = new Random();
		for(int i=0;i<arr.length;i++) {
			arr[i] = ran.nextInt(100);
		}
		System.out.println("冒泡排序法演示");
		everyOne(arr);
		System.out.println("生成数组成功！");
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("冒泡排序成功！");
		everyOne(arr);
	}
	
	//遍历数组或者List
	public static void everyOne(Object obj) {
		if(obj !=null) {
			if(obj instanceof List) {
				
			}else if(obj instanceof int[]) {
				for(int o:(int[])obj) {
					System.out.print(o+"  ");
				}
			}
		}
	}
}
