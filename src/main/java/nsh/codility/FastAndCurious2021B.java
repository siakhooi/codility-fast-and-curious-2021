package nsh.codility;

public class FastAndCurious2021B implements FastAndCurious2021Interface {
	public int solution(int[] A) {
		int N = A.length;
		long best = 100000000000000l;

		for (int x = 0; x < N; x++) {
			long cost = 0;
			for (int i = 0; i < N; i++) {
				if (i <= x)
					cost += A[x] - A[i];
				else
					cost += A[N - 1] - A[i];

			}
			best = Math.min(best, cost);
		}
		return (int) (best % 1000000007l);
	}
}
