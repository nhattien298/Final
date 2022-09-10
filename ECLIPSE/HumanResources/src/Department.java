
// Khởi tạo lớp Department
public class Department {
	private String maBoPhan, tenBoPhan;
	private int soLuongNvHienTai = 0;

	// Tạo constructor
	public Department() {

	}

	public Department(String maBoPhan, String tenBoPhan, int soLuongNvHienTai) {
		this.maBoPhan = maBoPhan;
		this.tenBoPhan = tenBoPhan;
		this.soLuongNvHienTai = soLuongNvHienTai;
	}

	// Tạp getter và setter
	public String getMaBoPhan() {
		return maBoPhan;
	}

	public void setMaBoPhan(String maBoPhan) {
		this.maBoPhan = maBoPhan;
	}

	public String getTenBoPhan() {
		return tenBoPhan;
	}

	public void setTenBoPhan(String tenBoPhan) {
		this.tenBoPhan = tenBoPhan;
	}

	public int getSoLuongNvHienTai() {
		return soLuongNvHienTai;
	}

	public void setSoLuongNvHienTai(int soLuongNvHienTai) {
		this.soLuongNvHienTai = soLuongNvHienTai;
	}

	// tạo hàm toString
	@Override
	public String toString() {
		return String.format("%-10s | %-20s | %-25d", getMaBoPhan(), getTenBoPhan(), getSoLuongNvHienTai());
	}

	// Tạo hàm để tăng số lượng nhân viên trong các phòng ban
	public void tangSoLuongNhanVien() {
		this.soLuongNvHienTai++;

	}
}
