package week1.day2;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int myArray1[] = {3,2,11,4,6,7};
		int myArray2[] = {1,2,8,4,9,7};
		System.out.println("Intersection of the two arrays");
		for(int i = 0; i<myArray1.length; i++ ) {
	         for(int j = 0; j<myArray2.length; j++) {
	            if(myArray1[i]==myArray2[j]) {
	               System.out.println(myArray1[i]);
	}
	         }
		}
	}
}

