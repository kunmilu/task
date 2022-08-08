package task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.*;
import java.util.List;

public class TextReader {
	private String path;

	private static Logger logger = Logger.getLogger(TextReader.class.getName());

	public enum Mark {
		START, END
	}

	private TextReader(String path) {
		this.path = path;
	}

	private void execute() {
		List<Integer> valueList = new ObjectList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path));) {
			String line = null;
			while ((line = br.readLine()) != null) {
				valueList.add(Integer.parseInt(line)); // ラッパークラスからプリミティブ型へ変換
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (Integer value : valueList) {
			System.out.println(value);
		}

	}

	public static void main(String... args) {
		logger.info(Mark.START.name());
		new TextReader(args[0]).execute();
		logger.info(Mark.END.name());
	}

}
