package com.bridgelabz;

public class TestMaximum {
	int x, y, z;

	//constructor testmax
		public TestMaximum(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}

	
		public static Float testMaximum(Float x, Float y, Float z) {
			Float max = x;// Initializing x as greater value
			if (y.compareTo(max) > 0)
				max = y;// as of now y is greater in value

			if (z.compareTo(max) > 0)
				max = z;// now z is greater in value
			printMax(x, y, z, max);
			return max;

		}

		public static void printMax(Float x, Float y, Float z, Float max) {
			System.out.printf("The maximum of Given Float values  %s , %s and %s is %s\n", x, y, z, max);
		}
}
