package main;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {6,20,8,19,56,23,87,41,49,53};
		bubbleSort(array);
	}

	public static void bubbleSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<=i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
				
				
			}
			for(int k=0;k<arr.length;k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
		System.out.println("Sorted Array: ");
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}
}
