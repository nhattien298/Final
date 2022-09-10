
public class MayBay extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	public MayBay( HangSanXuat hangSanXuat, String loaiNhienLieu) {
		super("may bay", hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layvantoc() {
		// TODO Auto-generated method stub
		return 500;
	}

	public void catCanh() {
		System.out.println(" cat canh ......");
	}
	public void haCanh() {
		System.out.println(" ha cnah .........");
	}
	
	
	
	
}
