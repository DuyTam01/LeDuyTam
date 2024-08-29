public class CayRiuPhepThuat extends VatPham{
    public CayRiuPhepThuat(){
        this.chiSoSucManh = 30;
        this.heSoSucManh = 1.5F;
        this.soVangQuyDoi = 10;
    }
    public void xuat(){
        System.out.println("---------------------------------------");
        System.out.println("Thông tin vật phẩm");
        System.out.println("Tên vật phẩm: Cây rìu phép thuật");
        super.xuat();
    }
}
