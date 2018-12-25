package final_test;

import final_test.Utils.CSV;
import final_test.Utils.Extract;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class main {
	private static Extract extract = new Extract();
	private static List<Defendant> defendants = new ArrayList<>();
	private static List<Judgment> judgments = new ArrayList<>();
	public static void main(String[] args) throws Exception {

		String path = "resources/";
		File file = new File(path);
		if (file.exists())
			ExtractFiles(file);

		CSV csvUtils = new CSV();
		csvUtils.CSV_Write_defendants(defendants);
		csvUtils.CSV_Write_Judgement(judgments);

	}
	private static void ExtractFiles(File file){
		File[] files = file.listFiles();
		for (File f:files
		) {
			if (f.isDirectory())
				ExtractFiles(f);
			if (f.isFile()) {
				try {
					extract.extract(f.getPath(),judgments,defendants);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
	}
}
