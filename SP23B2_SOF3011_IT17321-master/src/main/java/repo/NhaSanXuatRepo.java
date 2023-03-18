package repo;

import view_model.NhaSanXuat;
import view_model.SanPham;

import java.util.ArrayList;

public class NhaSanXuatRepo {
    private ArrayList<NhaSanXuat> listNSX;

    public NhaSanXuatRepo(){
        listNSX = new ArrayList<>();
    }

    public void insert(NhaSanXuat nsx){
        this.listNSX.add(nsx);
    }

    public ArrayList<NhaSanXuat> findAll(){
        return this.listNSX;
    }

    public void delete(NhaSanXuat nsx){
        for (int i = 0; i < this.listNSX.size(); i++) {
            NhaSanXuat vm = this.listNSX.get(i);
            if(vm.getMa().equalsIgnoreCase(nsx.getMa())){
                this.listNSX.remove(nsx);
            }
        }
    }

    public void update(NhaSanXuat nsx){
        for (int i = 0; i < this.listNSX.size(); i++) {
            NhaSanXuat vm = this.listNSX.get(i);
            if(vm.getMa().equalsIgnoreCase(nsx.getMa())){
                this.listNSX.set(i,nsx);
            }
        }
    }

    public NhaSanXuat findByMa(String nsx){
        for (int i = 0; i < this.listNSX.size(); i++) {
            NhaSanXuat vm = this.listNSX.get(i);
            if(vm.getMa().equalsIgnoreCase(nsx)){
                return this.listNSX.get(i);
            }
        }
        return null;
    }
}
