class MaxNum {
	public static void main(String[] args) {
		int[] numbers = new int[]{9,2,15,2,22,10,6};
		System.out.print(max(numbers));
	}
	public static int max(int[] m){
		int big = 0;
		for (int i = 0; i < m.length; i++){
			if (m[i] > big) big = m[i];
		}
		return big;
	}
}

