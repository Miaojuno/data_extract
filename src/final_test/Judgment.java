package final_test;

import java.util.List;

public class Judgment {
	private String caseNumber;  //案号
	private String courtName;   //法院名称
	private List<Defendant> defendants;    //涉案被告人
	private String crime;       //罪名
	private String propertyPunishment;      //刑法种类
	private String sentence;        //刑期
	private String penaltyType;     //财产刑种类
	private String penalty;     //财产刑金额
	private String drugType;    //毒品种类
	private String quantity;    //毒品数量
	private String contact;     //联系方式
	private String payment;     //支付方式
	private String trade;       //交易方式
	private String transport;   //运输方式

	public Judgment() {
	}

	public String getCaseNumber() {
		if(caseNumber==null)
			return "无";
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getCourtName() {
		if(courtName==null)
			return "无";
		return courtName;
	}

	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}

	public List<Defendant> getDefendants() {
		return defendants;
	}

	public void setDefendants(List<Defendant> defendants) {
		this.defendants = defendants;
	}

	public String getCrime() {
		if(crime==null)
			return "无";
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}

	public String getPenaltyType() {
		if(penaltyType==null)
			return "无";
		return penaltyType;
	}

	public void setPenaltyType(String penaltyType) {
		this.penaltyType = penaltyType;
	}

	public String getSentence() {
		if(sentence==null)
			return "无";
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public String getPropertyPunishment() {
		if(propertyPunishment==null)
			return "无";
		return propertyPunishment;
	}

	public void setPropertyPunishment(String propertyPunishment) {
		this.propertyPunishment = propertyPunishment;
	}

	public String getPenalty() {
		if(penalty==null)
			return "无";
		return penalty;
	}

	public void setPenalty(String penalty) {
		this.penalty = penalty;
	}

	public String getDrugType() {
		return drugType;
	}

	public void setDrugType(String drugType) {
		this.drugType = drugType;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getContact() {
		if(contact==null)
			return "无";
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPayment() {
		if(payment==null)
			return "无";
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getTrade() {
		if(trade==null)
			return "无";
		return trade;
	}

	public void setTrade(String trade) {

		this.trade = trade;
	}

	public String getTransport() {
		if(transport==null)
			return "无";
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}
}
