package repo;

import view_model.KhachHang;

import java.util.ArrayList;

public class KhachHangRepo {
    private ArrayList<KhachHang> listKH;

    public KhachHangRepo(){
        listKH = new ArrayList<>();
    }

    public void insert(KhachHang kh){
        this.listKH.add(kh);
    }

    public void update(KhachHang kh){
        for (int i = 0; i < this.listKH.size(); i++) {
            KhachHang vm = this.listKH.get(i);
            if(vm.getMa().equalsIgnoreCase(kh.getMa())){
                this.listKH.set(i,kh);
            }
        }
    }

    public void delete(KhachHang kh){
        for (int i = 0; i < this.listKH.size(); i++) {
            KhachHang vm = this.listKH.get(i);
            if(vm.getMa().equalsIgnoreCase(kh.getMa())){
                this.listKH.remove(kh);
            }
        }
    }

    public ArrayList<KhachHang> findAll(){
        return this.listKH;
    }

    public KhachHang findByMa(String ma){
        for (int i = 0; i < this.listKH.size(); i++) {
            KhachHang vm = this.listKH.get(i);
            if(vm.getMa().equalsIgnoreCase(ma)){
                return this.listKH.get(i);
            }
        }
        return null;
    }
}
