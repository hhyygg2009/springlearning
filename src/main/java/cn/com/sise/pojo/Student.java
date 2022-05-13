package cn.com.sise.pojo;

public class Student {

	private String STUNO;
	private String STUPWD;
	private String STUNAME;
	private String STUSEX;
	public String getSTUNO() {
		return STUNO;
	}
	public void setSTUNO(String sTUNO) {
		STUNO = sTUNO;
	}
	public String getSTUPWD() {
		return STUPWD;
	}
	public void setSTUPWD(String sTUPWD) {
		STUPWD = sTUPWD;
	}
	public String getSTUNAME() {
		return STUNAME;
	}
	public void setSTUNAME(String sTUNAME) {
		STUNAME = sTUNAME;
	}
	public String getSTUSEX() {
		return STUSEX;
	}
	public void setSTUSEX(String sTUSEX) {
		STUSEX = sTUSEX;
	}
	@Override
	public String toString() {
		return "Student [STUNO=" + STUNO + ", STUPWD=" + STUPWD + ", STUNAME=" + STUNAME + ", STUSEX=" + STUSEX + "]";
	}
	
}
