import java.util.Scanner;

public class RemoveElement {

	public int removeElement(int[] nums, int val) {
		
		int k = 0;
		
		for(int i = 0; i < nums.length; i++) {
			
			if(nums[i] != val) {
				nums[k] = nums[i];
				k++;
			}
			
		}
		
		return k;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers of the array separated by spaces:");
        String[] input = sc.nextLine().split(" ");
        int[] nums = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        System.out.print("Enter the value to remove: ");
        int val = sc.nextInt();

        RemoveElement solver = new RemoveElement();
        int k = solver.removeElement(nums, val);

        System.out.println("Number of elements after removal: " + k);
        System.out.print("Array after removal: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
	}
	
}
