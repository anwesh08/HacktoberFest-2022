public class Subarray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, -30, 40 };
		logic2(arr);

	}

	public static void logic1(int[] arr) {
		int ans = Integer.MIN_VALUE;
		for (int s = 0; s < arr.length; s++) {
			for (int e = s; e < arr.length; e++) {
//				System.out.println(s + " " + e);
				int sum = 0;
				for (int idx = s; idx <= e; idx++) {
					System.out.print(arr[idx] + " ");
					sum = sum + arr[idx];
				}
				System.out.println("=>" + sum);
				if (sum > ans) {
					ans = sum;
				}
			}
		}
		System.out.println(ans);
	}

	public static void logic2(int[] arr) {
		int ans = Integer.MIN_VALUE;
		for (int s = 0; s < arr.length; s++) {
			int sum = 0;
			for (int e = s; e < arr.length; e++) {
//				System.out.println(s + " " + e);
				sum = sum + arr[e];
				System.out.println(sum);
				if (sum > ans) {
					ans = sum;
				}
			}
		}
		System.out.println("==" + ans);
		System.out.println(ans);
	}

	public static void logic3(int[] arr) {
		int sum = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum < 0) {
				sum = 0;
			}
			if (max < sum) {
				max = sum;
			}
		}
	}

}
