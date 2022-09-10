// Tạo lớp abstract Staff
public abstract class Staff {
	// Khai báo thuộc tính
	protected String maNhanVien, tenNhanVien;
	protected int tuoi;
	protected double heSoLuong;
	protected String ngayVaoLam;
	protected String boPhanLamViec;
	protected double soNgayNghiPhep;

	// Tạo constructor
	public Staff() {

	}

	public Staff(String maNhanVien, String tenNhanVien, int tuoi, double heSoLuong, String ngayVaoLam,
			String boPhanLamViec, double soNgayNghiPhep) {

		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.tuoi = tuoi;
		this.heSoLuong = heSoLuong;
		this.ngayVaoLam = ngayVaoLam;
		this.boPhanLamViec = boPhanLamViec;
		this.soNgayNghiPhep = soNgayNghiPhep;
	}

	// Tạo getter và setter
	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public String getNgayVaoLam() {
		return ngayVaoLam;
	}

	public void setNgayVaoLam(String ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}

	public String getBoPhanLamViec() {
		return boPhanLamViec;
	}

	public void setBoPhanLamViec(String boPhanLamViec) {
		this.boPhanLamViec = boPhanLamViec;
	}

	public double getSoNgayNghiPhep() {
		return soNgayNghiPhep;
	}

	public void setSoNgayNghiPhep(double soNgayNghiPhep) {
		this.soNgayNghiPhep = soNgayNghiPhep;
	}

	// Tạo hàm abstract displayInformation()
	public abstract void displayInformation();

}
