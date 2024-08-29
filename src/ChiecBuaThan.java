public class ChiecBuaThan extends VatPham{
    public ChiecBuaThan(){
        this.chiSoSucManh = 25;
        this.heSoSucManh = 2;
        this.soVangQuyDoi = 10;
    }
    public void xuat(){
        System.out.println("---------------------------------------");
        System.out.println("Thông tin vật phẩm");
        System.out.println("Tên vật phẩm: Chiếc búa thần kì");
        super.xuat();
    }
}
