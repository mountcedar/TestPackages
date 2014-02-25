package main;

/**
 * @brief 課題8
 * @details
 * Eclipseのマーケットプレースから、JUnitヘルパーと、Quick JUnitのプラグインをインストールした上で、以下のメソッドを実装し、それをmain関数で呼び出しているクラスを実装してください。
 * @li int xを引数に持ち、0 <= x <= 100なら、その整数を、それ以外なら、”out of range”と出力するメソッド
 * @li Stringを引数に持ち、その内容を出力するメソッド。NULLが来た場合にだけ、”empty”と出力します
 * @li int x, yを引数として持ち、x/yの計算結果をDouble型で返すメソッド。ただし、y = 0の場合は、NULLを返す
 * 
 * 上記の3つの関数に関して、ユニットテストを行うクラスをJUnitヘルパーと、Quick JUnitで作成し、それぞれの単体テストをメソッド毎に実行しなさい。
 * @see main.TestJUnitTest
 * @author sugiyama
 */
public class TestJUnit {
	
	public void printInt (int x) {
		if (x < 0 || 100 < x) System.out.println ("out of range");
		System.out.println(x);
	}
	
	public void printString (String str) {
		if (str == null) System.out.println ("empty");
		System.out.println (str);;
	}
	
	public Double calc (int x, int y) {
		if (y == 0) return null;
		return (double)x / (double)y;
	}
	public static void main (String[] args) {
		TestJUnit unit = new TestJUnit();
		unit.printInt(100);
		unit.printString("hello world");
		System.out.println(unit.calc(1, 10));;
	}
}
