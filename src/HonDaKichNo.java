public class HonDaKichNo extends VatPham{
    public HonDaKichNo(){
        this.chiSoSucManh = 40;
        this.heSoSucManh = 2;
        this.soVangQuyDoi = 12;
    }
    public void xuat(){
        System.out.println("---------------------------------------");
        System.out.println("Thông tin vật phẩm");
        System.out.println("Tên vật phẩm: Hòn đá kich nổ");
        super.xuat();
    }
}

