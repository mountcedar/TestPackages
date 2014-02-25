package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @brief 課題7
 * @details
 * 第7問 Javaの最強ロガーの使い方について学ぼう！
 * 
 * slf4jとlogbackの関係についてjavadocコメントで述べ、debug, error, info, warningの出力を行うmain関数を含んだクラスを設計しなさい。
 * 
 * 7-1: 出力内容に、出力時間（ミリ秒まで）、デバッグレベル、実行スレッド、呼ばれたクラス、呼ばれたメソッドを含めてください
 * 7-2: 上記のdebug, error, info, warningをファイル出力に書き出すようにしましょう。
 * 7-3: 上記のdebug, error, info, warningを２つのスレッドで一秒間に一度、出力する無限ループを作成した上で、出力先のファイル名を作成された日時・時間にし、かつ、60秒に一回、出力されるファイルを更新するようにしてください
 * 
 * ヒント：7-1, 7-2はコードの変更は一切、必要ありません。
 * @author sugiyama
 */
public class Logging {
	static Logger logger = LoggerFactory.getLogger(Logging.class);

	public static void main (String[] args) {
		logger.debug ("hello world");
		logger.info ("hello world");
		logger.warn ("hello world");
		logger.error ("hello world");
		
		try {
			while (true) {
				Thread.sleep(1000);
				logger.debug ("hello world");
				logger.info ("hello world");
				logger.warn ("hello world");
				logger.error ("hello world");
			}
		} catch (Exception e) {			
		}
	}
}
