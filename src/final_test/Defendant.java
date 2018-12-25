package final_test;

public class Defendant {
	private String name;
	private String gender;
	private String birthDay;
	private String birthProvince;
	private String birthCity;
	private String nation;
	private String education;
	private String career;
	private String householdReg;    //户籍地
	private String residence;       //居住地

	private String caseNumber;

	public Defendant() {
	}

	public String getCaseNumber() {
		if(caseNumber==null)
			return "无";
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getName() {
		if(name==null)
			return "无";
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		if(gender==null)
			return "无";
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthDay() {
		if(birthDay==null)
			return "无";
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getBirthProvince() {
		if(birthProvince==null)
			return "无";
		return birthProvince;
	}

	public void setBirthProvince(String birthProvince) {
		this.birthProvince = birthProvince;
	}

	public String getBirthCity() {
		if(birthCity==null)
			return "无";
		return birthCity;
	}

	public void setBirthCity(String birthCity) {
		this.birthCity = birthCity;
	}

	public String getNation() {
		if(nation==null)
			return "无";
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getEducation() {
		if(education==null)
			return "无";
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getCareer() {
		if(career==null)
			return "无";
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getHouseholdReg() {
		if(householdReg==null)
			return "无";
		return householdReg;
	}

	public void setHouseholdReg(String householdReg) {
		this.householdReg = householdReg;
	}

	public String getResidence() {
		if(residence==null)
			return "无";
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}


}
