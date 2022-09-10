package test;

public class ThoiKhoaBieu {
	private Date thu;
	private String cacMonHoc;

	public Date getThu() {
		return thu;
	}

	public void setThu(Date thu) {
		this.thu = thu;
	}

	public String getCacMonHoc() {
		return cacMonHoc;
	}

	public void setCacMonHoc(String cacMonHoc) {
		this.cacMonHoc = cacMonHoc;
	}

	public ThoiKhoaBieu(Date thu, String cacMonHoc) {
		super();
		this.thu = thu;
		this.cacMonHoc = cacMonHoc;
	}
}
