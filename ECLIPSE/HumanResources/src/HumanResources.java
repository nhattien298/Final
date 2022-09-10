import java.util.ArrayList;
import java.util.Scanner;

public class HumanResources {
	// Tạo mảng nhân viên
	static ArrayList<Staff> listEmploy = new ArrayList<>();

	// Tạo mảng các bộ phận

	static ArrayList<Department> listDepart = new ArrayList<>();

	// Tạo biến truyền vào
	static Scanner sc = new Scanner(System.in);

	// Tạo biến để chạy chuong trình.
	static boolean run = true;

	// Hàm chính của chương trình
	public static void main(String[] args) {

//		// nạp thông tin vào hệ thống
		danhsach();
		bophan();

		// Chạy chương trình
		while (run) {
			menu();
		}
	}

	private static void bophan() {
		// Tạo ra các bộ phận
		Department bp1 = new Department("IT", "Công nghệ thông tin", 5);
		Department bp2 = new Department("MKT", "Marketing", 2);
		Department bp3 = new Department("HC", "Hành chính nhân sự", 2);

		// ADD các bộ phận vào danh sách mảng
		listDepart.add(bp1);
		listDepart.add(bp2);
		listDepart.add(bp3);
	}

//
	private static void danhsach() {
		// Danh sách nhân viên
		Employee nv1 = new Employee("001", "nguyễn văn bảo", 27, 5.0, "16/2/2019", "Công nghệ thông tin", 1, 10);
		Employee nv2 = new Employee("002", "lê hồng tuân", 29, 6.0, "09/1/2015", "Marketing", 1, 20);
		Employee nv3 = new Employee("003", "vy nhật tiên", 25, 5.0, "22/11/2019", "Công nghệ thông tin", 1, 10);
		Employee nv4 = new Employee("004", "nguyễn thị huyền", 24, 3.0, "17/8/2021", "Hành chính nhân sự", 1, 0);
		Employee nv5 = new Employee("005", "phan nhật vượng", 26, 5.0, "29/9/2019", "Công nghệ thông tin", 1, 10);
		Employee nv6 = new Employee("006", "lê thị mai", 30, 7.0, "10/3/2015", "Công nghệ thông tin", 1, 30);
		// Danh sách quản lý
		Manager ql1 = new Manager("007", "đào văn trình", 35, 10.0, "1/8/2010", "Công nghệ thông tin", 2,
				"Technical Leader");
		Manager ql2 = new Manager("008", "bùi đức vỹ", 37, 9.0, "9/3/2010", "Hành chính nhân sự", 2, "Project Leader ");
		Manager ql3 = new Manager("009", "cao thị trang", 34, 10.0, "28/12/2010", "Marketing", 2, "Business Leader");
		// Thêm nhân viên và quản lý vào danh sách mảng
		listEmploy.add(nv1);
		listEmploy.add(nv2);
		listEmploy.add(nv3);
		listEmploy.add(nv4);
		listEmploy.add(nv5);
		listEmploy.add(nv6);
		listEmploy.add(ql1);
		listEmploy.add(ql2);
		listEmploy.add(ql3);

	}

	public static void menu() {
		System.out.println("1. Hiển thị danh sách nhân viên hiện có trong công ty.");
		System.out.println("2. Hiện thị các bộ phận trong công ty.");
		System.out.println("3. Hiện thị các nhân viên theo từng bộ phận.");
		System.out.println("4. Thêm nhân viên mới vào công ty");
		System.out.println("5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên.");
		System.out.println("6. Hiển thị bảng lương của nhân viên toàn công ty có sắp sêp giảm dần.");
		System.out.println("7. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần.");
		System.out.println("0. Thoát chương trình.");
		System.out.print("lựa chọn của bạn: ");

		// Tạo biến giá trị nhập vào
		int choice = sc.nextInt();

		// dùng hàm switch để chuyển giữa các lựa chọn
		switch (choice) {

		// 1. Hiển thị danh sách nhân viên hiện có trong công ty.
		case 1:
			System.out.println("danh sách nhân viên hiện có trong công ty: ");
			System.out.printf("%-20s | %-15s | %-4s | %-10s | %-13s | %-20s | %-20s | %-23s | %15s\n", "Họ và tên",
					"Mã nhân viên", "Tuổi", "HS Lương", "Ngày vào làm", "Bộ phận làm việc", "Số ngày nghỉ phép",
					"Số giờ làm thêm/Chức vụ", "Lương");
			System.out.println(
					"----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			inDanhSach();
			break;

		// 2. Hiện thị các bộ phận trong công ty.
		case 2:
			System.out.println("Các bộ phận trong công ty : ");
			System.out.printf("%-10s | %-20s | %-25s\n", "Mã bộ phận ", "Tên bộ phận", "Số Lượng nhân viên hiện tại");
			outputBP();
			break;

		// 3. Hiện thị các nhân viên theo từng bộ phận.
		case 3:
			System.out.printf("%-20s | %-15s | %-4s | %-10s | %-13s | %-20s | %-20s | %-23s | %15s\n", "Họ và tên",
					"Mã nhân viên", "Tuổi", "HS Lương", "Ngày vào làm", "Bộ phận làm việc", "Số ngày nghỉ phép",
					"Số giờ làm thêm/Chức vụ", "Lương");
			System.out.println(
					"----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			outputNVBP();
			break;

		// 4 .Thêm nhân viên mới vào công ty
		case 4:
			addNhanVien();
			break;

		// 5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên.
		case 5:
			timKiemNhanVien();
			break;

		// 6. Hiển thị bảng lương của nhân viên toàn công ty theo thứ tự giảm dần.
		case 6:
			System.out.println("Bảng lương công ty sắp xếp giảm dần: ");
			System.out.printf("%-20s | %-15s | %-4s | %-10s | %-13s | %-20s | %-20s | %-23s | %15s\n", "Họ và tên",
					"Mã nhân viên", "Tuổi", "HS Lương", "Ngày vào làm", "Bộ phận làm việc", "Số ngày nghỉ phép",
					"Số giờ làm thêm/Chức vụ", "Lương");
			System.out.println(
					"----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			sapXepTheoLuong(true);
			break;

		case 7:
			System.out.println("Bảng lương công ty sắp xếp tăng dần: ");
			System.out.printf("%-20s | %-15s | %-4s | %-10s | %-13s | %-20s | %-20s | %-23s | %15s\n", "Họ và tên",
					"Mã nhân viên", "Tuổi", "HS Lương", "Ngày vào làm", "Bộ phận làm việc", "Số ngày nghỉ phép",
					"Số giờ làm thêm/Chức vụ", "Lương");
			System.out.println(
					"----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			sapXepTheoLuong(false);
			break;
		case 0:
			run = false;
			break;
		}

	}

	// 1. Hiển thị danh sách nhân viên hiện có trong công ty.
	public static void outputBP() {
		for (Department department : listDepart) {
			System.out.println(department.toString());
			System.out.println(department.getTenBoPhan());

		}

	}

	// 2. Hiện thị các bộ phận trong công ty.
	public static void inDanhSach() {
		for (Staff x : listEmploy) {
			x.displayInformation();
		}

	}

	// 3. Hiện thị các nhân viên theo từng bộ phận.
	public static void outputNVBP() {
		for (Department department : listDepart) {
			System.out.println(department.getTenBoPhan());
			System.out.println(
					"----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			for (Staff staff : listEmploy) {
				if (staff.getBoPhanLamViec().equalsIgnoreCase(department.getTenBoPhan())) {
					staff.displayInformation();
				}
			}
			System.out.println("");
		}

	}

	// 4 .Thêm nhân viên mới vào công ty
	public static void addNhanVien() {
		while (true) {
			// tạo kiểu biến Departement
			System.out.println("Chọn 1 để thêm nhân viên thông thường.");
			System.out.println("Chọn 2 để thêm quản lý ( có chức vụ)");
			int luachon;
			luachon = sc.nextInt();

			if (luachon == 1) {

				// trường nhập liệu vào list
				Employee addList = new Employee();
				System.out.println("Bạn chọn 1.");
				sc.nextLine();

				System.out.print("Nhập mã nhân viên.");
				addList.setMaNhanVien(sc.nextLine());

				System.out.print("Nhập họ và tên.");
				addList.setTenNhanVien(sc.nextLine());

				System.out.print("Nhập tuổi.");
				addList.setTuoi(sc.nextInt());

				System.out.print("Nhập hệ số lương.");
				addList.setHeSoLuong(sc.nextDouble());
				sc.nextLine();

				System.out.print("Nhập ngày vào làm.");
				addList.setNgayVaoLam(sc.nextLine());

				System.out.println("Nhập bộ phận làm việc. ");
				System.out.println("Chon 1. Hành chính nhận sự.");
				System.out.println("Chon 2. Công nghệ thông tin.");
				System.out.println("Chon 3. Maketing.");
				int chonBoPhan = sc.nextInt();
				if (chonBoPhan == 1) {
					System.out.println("Bộ phận làm việc:" + "Hành chính nhân sự");
					addList.setBoPhanLamViec("Hành chính nhân sự");
					for (Department department : listDepart) {
						if (department.getMaBoPhan().equalsIgnoreCase("hc")) {
							department.tangSoLuongNhanVien();
						}
					}

				} else if (chonBoPhan == 2) {
					System.out.println("Bộ phận làm việc:" + "Công nghệ thông tin");
					addList.setBoPhanLamViec("Công nghệ thông tin");
					for (Department department : listDepart) {
						if (department.getMaBoPhan().equalsIgnoreCase("it")) {
							department.tangSoLuongNhanVien();
						}
					}
				} else if (chonBoPhan == 3) {
					System.out.println("Bộ phận làm việc:" + "Marketing");
					addList.setBoPhanLamViec("Marketing");
					for (Department department : listDepart) {
						if (department.getMaBoPhan().equalsIgnoreCase("mkt")) {
							department.tangSoLuongNhanVien();
						}
					}
				}
				System.out.print("Nhập số ngày nghỉ phép: ");
				addList.setSoNgayNghiPhep(sc.nextInt());
				System.out.print("Nhập số giờ làm thêm: ");
				addList.setSoGioLamThem(sc.nextInt());

				// thêm vào danh sách nhân viên
				listEmploy.add(addList);

			} else if (luachon == 2) {
				System.out.println("Bạn chọn 2");
				Manager addManager = new Manager();
				sc.nextLine();
				System.out.print("Nhập mã nhân viên: ");
				addManager.setMaNhanVien(sc.nextLine());
				System.out.print("Nhập họ và tên. ");
				addManager.setTenNhanVien(sc.nextLine());
				System.out.print("Nhập tuổi. ");
				addManager.setTuoi(sc.nextInt());
				System.out.print("Nhập hệ số lương.");
				addManager.setHeSoLuong(sc.nextDouble());
				sc.nextLine();
				System.out.print("Nhập ngày vào làm. ");
				addManager.setNgayVaoLam(sc.nextLine());
				System.out.print("Nhập số ngày nghỉ phép.");
				addManager.setSoNgayNghiPhep(sc.nextInt());
				System.out.println("Nhập bộ phận.");
				System.out.println("1: Hành chính nhân sự.");
				System.out.println("2: Công nghệ thông tin.");
				System.out.println("3: Maketing.");
				int chonPhong = sc.nextInt();
				if (chonPhong == 1) {
					System.out.println("Bộ phận làm việc:" + "Hành chính nhân sự");
					addManager.setBoPhanLamViec("Hành chính nhân sự");
					for (Department department : listDepart) {
						if (department.getTenBoPhan().equalsIgnoreCase("hc")) {
							department.setSoLuongNvHienTai(department.getSoLuongNvHienTai() + 1);
						}
					}
				} else if (chonPhong == 2) {
					System.out.println("Bộ phận làm việc: " + "Công nghệ thông tin");
					addManager.setBoPhanLamViec("Công nghệ thông tin");
					for (Department department : listDepart) {
						if (department.getMaBoPhan().equalsIgnoreCase("it")) {
							department.tangSoLuongNhanVien();
						}
					}

				} else if (chonPhong == 3) {
					System.out.println("Bộ phận làm việc: " + "Marketing");
					addManager.setBoPhanLamViec("Marketing");
					for (Department department : listDepart) {
						if (department.getMaBoPhan().equalsIgnoreCase("mkt")) {
							department.tangSoLuongNhanVien();
						}
					}

				}
				System.out.println("Nhập chức danh");
				System.out.println("1: Business Leader");
				System.out.println("2: Project Leader");
				System.out.println("3: Technical Leader");
				int chonChucDanh = sc.nextInt();
				if (chonChucDanh == 1) {
					System.out.println("Chức danh: " + "Business Leader");
					addManager.setChucDanh("Business Leader");
				} else if (chonChucDanh == 2) {
					System.out.println("Chức danh: " + "Project Leader");
					addManager.setChucDanh("Project Leader");
				} else if (chonChucDanh == 3) {
					System.out.println("Chức danhChức danh: " + "Technical Leader");
					addManager.setChucDanh("Technical Leader");
				}

				// thêm vào danh sách nhân viên.
				listEmploy.add(addManager);

			}

			// lựa chọn thoát khỏi vòng lặp
			System.out.println("Bạn có muốn tiếp tục thêm nhân viên không ? chọn Y/N");
			if (sc.next().equalsIgnoreCase("n")) {
				break;
			}
		}
	}

//	5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên.
	public static void timKiemNhanVien() {
		System.out.println("Nhập lựa chọn để :");
		System.out.println("1: Tìm kiếm bằng tên nhân viên");
		System.out.println("2: Tìm kiếm bằng mã nhân viên");
		int chon;
		chon = sc.nextInt();
		sc.nextLine();
		if (chon == 1) {
			System.out.println("Mời bạn nhập tên:");
			String ten;
			ten = sc.nextLine();
			for (Staff e : listEmploy) {
				if (ten.equalsIgnoreCase(e.getTenNhanVien())) {
					System.out.println("Đã tìm thấy nhân viên : " + ten);
					System.out.printf("%-20s | %-15s | %-4s | %-10s | %-13s | %-20s | %-20s | %-23s | %15s\n",
							"Họ và tên", "Mã nhân viên", "Tuổi", "Hệ số lương", "Ngày vào làm", "Bộ phận làm việc",
							"Số ngày nghỉ phép", "Số giờ làm thêm/Chức vụ", "Lương");
					System.out.println(
							"----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					e.displayInformation();
					break;

				}

			}

		} else if (chon == 2) {
			System.out.println("Mời bạn nhập mã nhân viên:");
			String maNV;
			maNV = sc.nextLine();
			for (Staff e : listEmploy) {
				if (maNV.equalsIgnoreCase(e.getMaNhanVien())) {
					System.out.println("Đã tìm thấy nhân viên: " + maNV);
					System.out.printf("%-20s | %-15s | %-4s | %-10s | %-13s | %-20s | %-20s | %-23s | %15s\n",
							"Họ và tên", "Mã nhân viên", "Tuổi", "Hệ số lương", "Ngày vào làm", "Bộ phận làm việc",
							"Số ngày nghỉ phép", "Số giờ làm thêm/Chức vụ", "Lương");
					System.out.println(
							"----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					e.displayInformation();
					break;
				}

			}

		} else {
			System.out.println("Không tìm thấy thôn tin như đã tìm kiếm");
		}

	}

//	6, 7.sắp xếp theo lương
	public static void sapXepTheoLuong(boolean desc) {
		listEmploy.sort((p1, p2) -> {
			double p1Salary = p1 instanceof Manager ? ((Manager) p1).calculateSalary()
					: ((Employee) p1).calculateSalary();
			double p2Salary = p2 instanceof Manager ? ((Manager) p2).calculateSalary()
					: ((Employee) p2).calculateSalary();

			if (desc) {
				return (int) (p2Salary - p1Salary);
			} else {
				return (int) (p1Salary - p2Salary);
			}
		});
		inDanhSach();
	}

}
