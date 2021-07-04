package nsh.codility;

public class FastAndCurious2021A implements FastAndCurious2021Interface {

	public int solution(int[] A) {
		int N = A.length;
		long M = 0, s = 0, last = A[N - 1];

		for (int i = 0; i < N; i++) {
			M = Math.max(M, (last - A[i]) * (i + 1));
			s += (last - A[i]);
		}
		return (int) ((s - M) % 1000000007l);
	}
}
