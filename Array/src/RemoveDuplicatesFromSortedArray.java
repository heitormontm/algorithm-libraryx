import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
		if(nums.length == 0) return 0;
		
		int k = 1;
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] != nums[k-1]) {
				nums[k] = nums[i];
				k++;
			}
		} 
		
		return k;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers of the array:");
		String[] input = sc.nextLine().split(" ");
		int[] nums = new int[input.length];
		
		for (int i = 0; i < input.length; i++) {
			nums[i] = Integer.parseInt(input[i]);
		}
		
		RemoveDuplicatesFromSortedArray solver = new RemoveDuplicatesFromSortedArray();
		int k = solver.removeDuplicates(nums);
		
		System.out.println("Number of unique elements: " + k);
		System.out.print("Array without duplicates: ");
		for(int i = 0; i < k; i++) {
			System.out.print(nums[i] + " ");
		}
		
		sc.close();
	}

}
