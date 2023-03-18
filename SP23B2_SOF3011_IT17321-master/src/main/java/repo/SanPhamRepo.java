package repo;

import view_model.ChucVu;
import view_model.SanPham;

import java.util.ArrayList;

public class SanPhamRepo {
    private ArrayList<SanPham> listSP;

    public SanPhamRepo(){
        listSP = new ArrayList<>();
    }

    public void insert(SanPham sp){
        this.listSP.add(sp);
    }

    public ArrayList<SanPham> findAll(){
        return this.listSP;
    }

    public void delete(SanPham sp){
        for (int i = 0; i < this.listSP.size(); i++) {
            SanPham vm = this.listSP.get(i);
            if(vm.getMa().equalsIgnoreCase(sp.getMa())){
                this.listSP.remove(sp);
            }
        }
    }

    public void update(SanPham sp){
        for (int i = 0; i < this.listSP.size(); i++) {
            SanPham vm = this.listSP.get(i);
            if(vm.getMa().equalsIgnoreCase(sp.getMa())){
                this.listSP.set(i,sp);
            }
        }
    }

    public SanPham findByMa(String ma){
        for (int i = 0; i < this.listSP.size(); i++) {
            SanPham vm = this.listSP.get(i);
            if(vm.getMa().equalsIgnoreCase(ma)){
                return this.listSP.get(i);
            }
        }
        return null;
    }
}
