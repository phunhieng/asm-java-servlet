package repo;

import view_model.CuaHang;
import view_model.MauSac;

import java.util.ArrayList;

public class MauSacRepo {
    private ArrayList<MauSac> listMS;

    public MauSacRepo(){
        listMS = new ArrayList<>();
    }

    public void insert(MauSac ms){
        this.listMS.add(ms);
    }

    public ArrayList<MauSac> findAll(){
        return this.listMS;
    }

    public void delete(MauSac ms){
        for (int i = 0; i < this.listMS.size(); i++) {
            MauSac vm = this.listMS.get(i);
            if(vm.getMa().equalsIgnoreCase(ms.getMa())){
                this.listMS.remove(ms);
            }
        }
    }

    public void update(MauSac ms){
        for (int i = 0; i < this.listMS.size(); i++) {
            MauSac vm = this.listMS.get(i);
            if(vm.getMa().equalsIgnoreCase(ms.getMa())){
                this.listMS.set(i,ms);
            }
        }
    }

    public MauSac findByMa(String ma){
        for (int i = 0; i < this.listMS.size(); i++) {
            MauSac vm = this.listMS.get(i);
            if(vm.getMa().equalsIgnoreCase(ma)){
                return this.listMS.get(i);
            }
        }
        return null;
    }
}
