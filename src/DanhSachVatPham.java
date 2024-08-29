import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachVatPham {

    private List<VatPham> ds;
    public DanhSachVatPham(){
        this.ds = new ArrayList<>();
    }

    public void nhap(){
        int n=5;
        for(int i = 1; i<=n ; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vật phẩm thứ "+i);
            System.out.println("1. Chiếc bứa thần");
            System.out.println("2. Bao tay sấm sét");
            System.out.println("3. Hòn đá kích nổ");
            System.out.println("4. Cây rìu phép thuật");
            System.out.println("5. Cây gậy chiến thần");
            System.out.println("Mời bạn chọn loại mật phẩm:");
            int temp = sc.nextInt();
            if (temp == 1) {
                VatPham bua = new ChiecBuaThan();
                ds.add(bua);
            } else if  (temp == 2) {
                VatPham bua = new BaoTaySamSet();
                ds.add(bua);
            }else if  (temp == 3) {
                VatPham bua = new HonDaKichNo();
                ds.add(bua);
            }else if  (temp == 4) {
                VatPham bua = new CayRiuPhepThuat();
                ds.add(bua);
            }else if  (temp == 5) {
                VatPham bua = new CayGayChienThan();
                ds.add(bua);
            }else {
                System.out.println("Nhập sai...");
                System.exit(1);
            }
        }
    }

//    public List<VatPham> maxVang(){
//        List<VatPham> arr = new ArrayList<>();
//
//        float maxVangQuyDoi = 0;
//        for (VatPham vp : ds){
//            if (vp.vang() > maxVangQuyDoi){
//                maxVangQuyDoi = vp.vang();
//            }
//        }
//        for (VatPham vp : ds){
//            if (vp.vang() == maxVangQuyDoi){
//                arr.add(vp);
//            }
//        }
//        return arr;
//    }
    public float maxVang(){
        float maxVangQuyDoi = 0;
        for (VatPham vp : ds){
            if (vp.vang() > maxVangQuyDoi){
                maxVangQuyDoi = vp.vang();
            }
        }
        return maxVangQuyDoi;
    }
    public void cau3(){
//        if (ds.isEmpty() )return;
        System.out.println("#########################################");
        System.out.println("Danh sách vật phẩm tốn nhiều xu vàng nhất");
        for (VatPham vp : ds){
            if (vp.vang() == maxVang()){
                vp.xuat();
            }
        }
    }

    public float sumVang(){
        float sum = 0;
        for (VatPham vp : ds){
            sum += vp.vang();
        }
        return sum;
    }

    public void cau4(){
//        if (ds.isEmpty() )return;
        Integer sl = null;
        Scanner sc =new Scanner(System.in);
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("Nhập số vàng mà Spon thu thập được: ");
        sl =sc.nextInt();
        System.out.println("+++++++++++++++++++++++++++++++++++");
        if (sumVang() < sl){
            System.out.println("Giải cứu thành công");;
        } else System.out.println("Giải cứu thất bại");
    }

    public void xuat(){
        for (VatPham vp :ds){
            vp.xuat();
        }
    }
}
