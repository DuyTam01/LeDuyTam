public class CayGayChienThan extends VatPham{
    public CayGayChienThan(){
        this.chiSoSucManh = 20;
        this.heSoSucManh = 1;
        this.soVangQuyDoi = 7;
    }
    public void xuat(){
        System.out.println("---------------------------------------");
        System.out.println("Thông tin vật phẩm");
        System.out.println("Tên vật phẩm: Cây gậy chiến thuật");
        super.xuat();
    }

}
