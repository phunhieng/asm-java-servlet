package repo;

import view_model.ChucVu;
import view_model.CuaHang;

import java.util.ArrayList;

public class CuaHangRepo {

    private ArrayList<CuaHang> listCH;

    public CuaHangRepo(){
        listCH = new ArrayList<>();
    }

    public void insert(CuaHang ch){
        this.listCH.add(ch);
    }

    public ArrayList<CuaHang> findAll(){
        return this.listCH;
    }

    public void delete(CuaHang ch){
        for (int i = 0; i < this.listCH.size(); i++) {
            CuaHang vm = this.listCH.get(i);
            if(vm.getMa().equalsIgnoreCase(ch.getMa())){
                this.listCH.remove(ch);
            }
        }
    }

    public void update(CuaHang ch){
        for (int i = 0; i < this.listCH.size(); i++) {
            CuaHang vm = this.listCH.get(i);
            if(vm.getMa().equalsIgnoreCase(ch.getMa())){
                this.listCH.set(i,ch);
            }
        }
    }

    public CuaHang findByMa(String ma){
        for (int i = 0; i < this.listCH.size(); i++) {
            CuaHang vm = this.listCH.get(i);
            if(vm.getMa().equalsIgnoreCase(ma)){
                System.out.println("1");
                return this.listCH.get(i);
            }
        }
        return null;
    }

}
