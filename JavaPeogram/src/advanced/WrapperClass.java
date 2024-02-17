package advanced;

import java.util.ArrayList;
import java.util.Collection;

public class WrapperClass {

	public static void main(String[] args) {
		int i = 10;
		Integer iObj = new Integer(i);
		Integer iObj2 = Integer.valueOf(i);
		Integer iObj3 = i;
		
		int j = iObj.intValue();
		int k = iObj;
		
		int[] arr = new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		Object[] arrOfObj = new Object[3];
		arrOfObj[0]=new Integer(10);
		arrOfObj[1]=new Float(10.12f);
		arrOfObj[2]=new Character('A');
		

	}

}
