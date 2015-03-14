package School;

public enum CLASSSTATUS {
	Freshman,
	Sophomore,
	Junior,
	Senior;
	
	private String CLASSSTATUS;
	
	protected void setCLASSSTATUS(String classStatus) {
		this.CLASSSTATUS = classStatus;
	}

	protected String getCLASSSTATUS() {
		return this.CLASSSTATUS;
	}


}

