
public class XeOto extends PhuongTienDiChuyen {
	private  String loaiNhienLieu;

	public XeOto( HangSanXuat hangSanXuat, String loaiNhienLieu) {
		super("xe o to to", hangSanXuat);
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
		return 100;
	}

	
	
	
	
}
