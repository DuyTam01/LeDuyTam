public class BaoTaySamSet extends VatPham{
    public BaoTaySamSet(){
        this.chiSoSucManh = 30;
        this.heSoSucManh = 1;
        this.soVangQuyDoi = 7;
    }
    public void xuat(){
        System.out.println("---------------------------------------");
        System.out.println("Thông tin vật phẩm");
        System.out.println("Tên vật phẩm: Bao tay sấm sét");
        super.xuat();
    }
}
