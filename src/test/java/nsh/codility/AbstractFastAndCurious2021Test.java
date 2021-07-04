package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public abstract class AbstractFastAndCurious2021Test {
	abstract FastAndCurious2021Interface getTestObject();

	@Test
	void test01() {
		int[] A = new int[] { 1, 5, 9, 12 };
		int E = 7;

		assertEquals(E, getTestObject().solution(A));
	}

	@Test
	void test02() {
		int[] A = new int[] { 5, 15 };
		int E = 0;

		assertEquals(E, getTestObject().solution(A));
	}

	@Test
	void test03() {
		int[] A = new int[] { 2, 6, 7, 8, 12 };
		int E = 9;

		assertEquals(E, getTestObject().solution(A));
	}

	@Test
	void test04() {
		final int B = 50000000; // 50m
		int[] A = new int[] { 0 * B, 1 * B, 2 * B, 3 * B, 4 * B, 5 * B, 6 * B, 7 * B, 8 * B, 9 * B, 10 * B, 11 * B,
				12 * B, 13 * B, 14 * B, 15 * B, 16 * B, 17 * B, 18 * B, 19 * B };
		int E = 499999972;

		assertEquals(E, getTestObject().solution(A));
	}

}
