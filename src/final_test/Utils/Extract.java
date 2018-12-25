package final_test.Utils;

import final_test.Defendant;
import final_test.Judgment;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract {
	public void extract(String path,List<Judgment> allJudgments, List<Defendant> allDefendants) throws Exception {
		Read read = new Read();
		Regex regexUtils = new Regex();

		String rawString = Read.readWord(path);

		Judgment judgment = new Judgment();
		List<Defendant> defendants = new ArrayList<>();


        String pattern = "\\s+(被告人[\\u4e00-\\u9fa5]+(?:，|,|\\(|（)[A-z0-9\\u4e00-\\u9fa5\\，\\。\\○\\、\\；\\：\\(\\)\\（\\）\\.\\·\\,\\“\\”\\-\\－\\;\\s^\\x00-\\xff]+" +
		        "(?:看守所|逮捕|候审|在家|治疗|居住|戒毒|服刑|执行）|日|年|地)。\\s+(?:(?:指定辩护人|辩护人)[A-z0-9\\u4e00-\\u9fa5\\，\\。\\、\\（\\）]+\\。|))";


		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(rawString);
		String defendantinfo = "";
		if (m.find()) {
			defendantinfo = m.group(1);
		}else {
			return;
		}

		regexUtils.extractJudgment(judgment,rawString);
		regexUtils.batchExtractDefendants(defendants,defendantinfo);
		for (Defendant defendanta1:defendants
		     ) {
			defendanta1.setCaseNumber(judgment.getCaseNumber());
		}
		judgment.setDefendants(defendants);
		allJudgments.add(judgment);
		allDefendants.addAll(defendants);

	}
}
