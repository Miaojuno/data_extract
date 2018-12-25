package final_test.Utils;

import final_test.Defendant;
import final_test.Judgment;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

public class CSV {
	public void CSV_Write_defendants(List<Defendant> defendants) throws Exception{
		FileOutputStream fos = new FileOutputStream("G:\\new4j\\data\\neo4jDatabases\\database-1f587c22-a684-4bb5-b830-b588d3b391c5\\installation-3.4.9\\import\\People.csv");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");

		CSVFormat csvFormat = CSVFormat.DEFAULT.withHeader("姓名","性别","出生年月","省份","城市","民族","文化程度","职业","户籍地","居住地","案号");
		CSVPrinter csvPrinter = new CSVPrinter(osw,csvFormat);

		for (int i = 0; i < defendants.size(); i++){
			csvPrinter.printRecord(defendants.get(i).getName(),defendants.get(i).getGender(),defendants.get(i).getBirthDay(),
					defendants.get(i).getBirthProvince(),defendants.get(i).getBirthCity(),defendants.get(i).getNation(),
					defendants.get(i).getEducation(),defendants.get(i).getCareer(),defendants.get(i).getHouseholdReg(),
					defendants.get(i).getResidence(),defendants.get(i).getCaseNumber());
		}



		csvPrinter.flush();
		csvPrinter.close();
	}

	public void CSV_Write_Judgement(List<Judgment> judgments) throws Exception{
		FileOutputStream fos = new FileOutputStream("G:\\new4j\\data\\neo4jDatabases\\database-1f587c22-a684-4bb5-b830-b588d3b391c5\\installation-3.4.9\\import\\Case.csv");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");

		CSVFormat csvFormat = CSVFormat.DEFAULT.withHeader("案号","法院名称","一案人数","第一被告人","罪名","刑罚种类","刑期","财产刑种类","财产刑金额","联系方式","支付方式","交易方式","运输方式");
		CSVPrinter csvPrinter = new CSVPrinter(osw,csvFormat);
		for (int i = 0; i < judgments.size(); i++){
			if (judgments.get(i).getDefendants().size()>0){
				csvPrinter.printRecord(judgments.get(i).getCaseNumber(),judgments.get(i).getCourtName(),judgments.get(i).getDefendants().size(),
						judgments.get(i).getDefendants().get(0).getName(),judgments.get(i).getCrime(),judgments.get(i).getPropertyPunishment(),
						judgments.get(i).getSentence(),judgments.get(i).getPenaltyType(),judgments.get(i).getPenalty(),
						judgments.get(i).getContact(),judgments.get(i).getPayment(),judgments.get(i).getTrade(),judgments.get(i).getTransport());
			}
		}
		csvPrinter.flush();
		csvPrinter.close();
	}
}
