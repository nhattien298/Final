// Tạo lớp Employess kế thừa Staff và interface 
public class Employee extends Staff implements ICalculator {
	private double soGioLamThem;

	// Tạo constructor
	public Employee() {

	}

	public Employee(String maNhanVien, String tenNhanVien, int tuoi, double heSoLuong, String ngayVaoLam,
			String boPhanLamViec, int soNgayNghiPhep, double soGioLamThem) {
		super(maNhanVien, tenNhanVien, tuoi, heSoLuong, ngayVaoLam, boPhanLamViec, soNgayNghiPhep);
		this.soGioLamThem = soGioLamThem;
		// TODO Auto-generated constructor stub
	}

	// Tạo getter và setter
	public double getSoGioLamThem() {
		return soGioLamThem;
	}

	public void setSoGioLamThem(double soGioLamThem) {
		this.soGioLamThem = soGioLamThem;
	}

	// Hàm hiện thị thông tin nhân viên
	@Override
	public void displayInformation() {
		System.out.printf("%-20s | %-15s | %-4d | %-10.1f | %-13s | %-20s | %-20f | %-23f | %15.1f\n", getTenNhanVien(),
				getMaNhanVien(), getTuoi(), getHeSoLuong(), getNgayVaoLam(), getBoPhanLamViec(), getSoNgayNghiPhep(),
				getSoGioLamThem(), calculateSalary());

//		System.out.println("bo phan lam viec ------> " + getBoPhanLamViec());

	}

	// Tạo hàm calculateSalary() trả về lương nhân viên
	@Override
	public double calculateSalary() {
		double luong;
		luong = getHeSoLuong() * 3000000 + getSoGioLamThem() * 200000;
		return luong;

	}

}
