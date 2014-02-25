package main;

import junit.framework.TestCase;

/**
 * @brief 課題8
 * @details
 * Eclipseのマーケットプレースから、JUnitヘルパーと、Quick JUnitのプラグインをインストールした上で、以下のメソッドを実装し、それをmain関数で呼び出しているクラスを実装してください。
 * @li int xを引数に持ち、0 <= x <= 100なら、その整数を、それ以外なら、”out of range”と出力するメソッド
 * @li Stringを引数に持ち、その内容を出力するメソッド。NULLが来た場合にだけ、”empty”と出力します
 * @li int x, yを引数として持ち、x/yの計算結果をDouble型で返すメソッド。ただし、y = 0の場合は、NULLを返す
 * 
 * 上記の3つの関数に関して、ユニットテストを行うクラスをJUnitヘルパーと、Quick JUnitで作成し、それぞれの単体テストをメソッド毎に実行しなさい。
 * @see main.TestJUnit
 * @author sugiyama
 */
public class TestJUnitTest extends TestCase {

	public void test_type() throws Exception {
		assertNotNull(TestJUnit.class);
	}

	public void test_instantiation() throws Exception {
		TestJUnit target = new TestJUnit();
		assertNotNull(target);
	}

	public void test_printInt_A$int() throws Exception {
		TestJUnit target = new TestJUnit();
		int x = 0;
		target.printInt(x);
	}

	public void test_printInt_A$out_of_range() throws Exception {
		TestJUnit target = new TestJUnit();
		int x = -100;
		target.printInt(x);
	}

	public void test_printString_A$String() throws Exception {
		TestJUnit target = new TestJUnit();
		String str = "hello world";
		target.printString(str);
	}

	public void test_printString_A$null() throws Exception {
		TestJUnit target = new TestJUnit();
		String str = null;
		target.printString(str);
	}

	public void test_calc_A$int$0() throws Exception {
		TestJUnit target = new TestJUnit();
		int x = 0;
		int y = 0;
		Double actual = target.calc(x, y);
		Double expected = null;
		assertEquals(expected, actual);
	}

	public void test_calc_A$int$int() throws Exception {
		TestJUnit target = new TestJUnit();
		int x = 1;
		int y = 10;
		Double actual = target.calc(x, y);
		Double expected = 0.10;
		assertEquals(expected, actual);
	}
}
