class DrawTriangle {

	public static void main(String[] args) {

		drawTriangle(10);

	}

	

	public static void drawTriangle(int N){

		for (int i = 1; i < N; i++){

			for (int j = 0; j < i; j++){

				System.out.print("*");

			}

			System.out.println();

		}

	}

}