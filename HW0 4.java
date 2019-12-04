class BreakContinue {

	public static void main(String[] args) {
		int[] a = {1, 2, -3, 4, 5, 4};
		int n = 3;
		int[] abc = windowPosSum(a, n);
		System.out.println(java.util.Arrays.toString(abc));
			}
			
	public static int[] windowPosSum(int[] a, int n) {
			int[] result = new int[a.length];
			for (int i = 0; i < a.length; i++){
				int sum = a[i];
				if (i == a.length - 1){
					result[i] = sum;
					break;
				}
				if (a[i] <= 0){
					result[i] = sum;
					continue;
				}
				if (a[i] > 0){
					for (int j = i; j < n + i && j < a.length - 1; j++){
						sum = sum + a[j + 1];
					}
					result[i] = sum;
				}
			}
			return result;
		}
}

