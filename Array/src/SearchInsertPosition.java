import java.util.Scanner;

public class SearchInsertPosition {
	
	public int searchInsert(int[] nums, int target) {
		int left = 0;
        int right = nums.length - 1;
        
        while(left <= right) {
            
            int mid = (left + right) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {//nums[mid] > target}
                right = mid - 1;
            }

        }

        return left;
			
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers of the array separated by spaces:");
		String[] input = sc.nextLine().split(" ");
		int[] nums = new int[input.length];
		
		for (int i = 0; i < input.length; i++) {
			nums[i] = Integer.parseInt(input[i]);
		}
		
		System.out.print("Enter the target value: ");
		int target = sc.nextInt();
		
		SearchInsertPosition solver = new SearchInsertPosition();
		int result = solver.searchInsert(nums, target);
		
		if (result < nums.length && nums[result] == target) {
		    System.out.println("The number " + target + " is in the array at index " + result + ".");
		} else {
		    System.out.println("The number " + target + " is not in the array, but if it were, it would be at index " + result + ".");
		}

		sc.close();
	}
}