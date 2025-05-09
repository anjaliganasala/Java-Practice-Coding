import java.util.Scanner;

public class ArraysFindLargestAndSmallest {
public static void main(String[] args) {
    int [] arr = {100,50,78,98,20,10};
    int max = arr[0];
    int min = arr[0];
    
for(int i=1; i<arr.length;i++) {
	if(arr[i]>max) {
		max = arr[i];
	}
	if(arr[i]<min) {
		min = arr[i];
	}
}
	System.out.println("max :"+max);
	System.out.println("min :"+min);
}
}

