import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
	
	
	// Two Sum problem solution 
	public int[] twoSum(int[] nums, int target) {

		// Map with Key and Value of type Integer, to store both indices
		Map<Integer,Integer> map = new HashMap();

		// Output will be returned as the array that contains solution
        	int[] output = new int[2];

	        for(int i = 0; i < nums.length; i++) {
	        	
	        	/* Checks if the map already contains the current number.
	        	 * 
	        	 * For example: if "7" is already in the map, it means a previous number 
	        	 * summed with 7 equals the target. In that case, output[0] will store 
	        	 * the index of the number that complements 7, and output[1] will store 
	        	 * the index of the current number.
	        	 */
	        	if(map.containsKey(nums[i])) {
				output[0] = map.get(nums[i]);
	                	output[1] = i;
	                	return output;
	            	}
	
	        	/* Stores the complement (target - current number) as key, 
	        	 * and the current index as value.
	        	 * This allows finding a match later to complete the target sum.
	        	 */
	        	map.put(target - nums[i], i);
	        	
	        }
	
	        return null;
		
	}
	
	//Driver method to test the algorithm
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os números do array separadamente:");
		String[] input = sc.nextLine().split(" ");
		int[] nums = new int[input.length];
		
		for (int i = 0; i < input.length; i++) {
			nums[i] = Integer.parseInt(input[i]);
		}
		
		System.out.print("Digite o valor alvo: ");
		int target = sc.nextInt();
		
		TwoSum solver = new TwoSum();
		int[] result = solver.twoSum(nums, target);
		
		if(result != null) {
			System.out.println("Índices encontrados: [" + result[0]
					+ ", " + result[1] + "]");
		} else {
			System.out.println("Nenhuma combinação encontrada que some " + target);
		}
		
		sc.close();
	}

}
