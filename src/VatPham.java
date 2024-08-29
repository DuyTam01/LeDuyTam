public class VatPham {
    protected int chiSoSucManh;
    protected float heSoSucManh;
    protected int soVangQuyDoi;

    public int getChiSoSucManh() {
        return chiSoSucManh;
    }

    public void setChiSoSucManh(int chiSoSucManh) {
        this.chiSoSucManh = chiSoSucManh;
    }

    public float getHeSoSucManh() {
        return heSoSucManh;
    }

    public void setHeSoSucManh(float heSoSucManh) {
        this.heSoSucManh = heSoSucManh;
    }

    public int getSoVangQuyDoi() {
        return soVangQuyDoi;
    }

    public void setSoVangQuyDoi(int soVangQuyDoi) {
        this.soVangQuyDoi = soVangQuyDoi;
    }

    public VatPham() {
    }

    protected float sucCongPha(){
        return this.getHeSoSucManh()*this.getChiSoSucManh();
    }

    protected float vang(){
        return this.getSoVangQuyDoi()+this.sucCongPha();
    }

    public void xuat(){
        System.out.println("Chỉ số sức mạnh: " +this.getChiSoSucManh());
        System.out.println("Hệ số sức mạnh: " + this.getHeSoSucManh());
        System.out.println("Số vàng quy đổi trên 1 sức công phá: "+this.getSoVangQuyDoi());
        System.out.println("Sức công phá: " +this.sucCongPha());
    }


}
