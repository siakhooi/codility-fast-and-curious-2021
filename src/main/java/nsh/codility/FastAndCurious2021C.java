package nsh.codility;

public class FastAndCurious2021C implements FastAndCurious2021Interface {
	public int solution(int[] A) {
		int N = A.length;
		long cost = 0;

		for (int i = 1; i < N; i++)
			cost += A[N - 1] - A[i];
		long best = cost;
		for (int x = 0; x < N - 1; x++) {
			cost -= A[N - 1] - A[x + 1];
			cost += ((long) x + 1) * (A[x + 1] - A[x]);
			best = Math.min(best, cost);
		}
		return (int) (best % 1000000007l);
	}
}
