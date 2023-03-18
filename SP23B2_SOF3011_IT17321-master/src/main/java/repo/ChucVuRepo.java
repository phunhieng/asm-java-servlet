package repo;

import view_model.ChucVu;

import java.util.ArrayList;

public class ChucVuRepo {
    private ArrayList<ChucVu> listCV;

    public ChucVuRepo(){
        listCV = new ArrayList<>();
    }

    public void insert(ChucVu cv){
        this.listCV.add(cv);
    }

    public ArrayList<ChucVu> findAll(){
        return this.listCV;
    }

    public void delete(ChucVu cv){
        for (int i = 0; i < this.listCV.size(); i++) {
            ChucVu vm = this.listCV.get(i);
            if(vm.getMa().equalsIgnoreCase(cv.getMa())){
                this.listCV.remove(cv);
            }
        }
    }

    public void update(ChucVu cv){
        for (int i = 0; i < this.listCV.size(); i++) {
            ChucVu vm = this.listCV.get(i);
            if(vm.getMa().equalsIgnoreCase(cv.getMa())){
                this.listCV.set(i,cv);
            }
        }
    }

    public ChucVu findByMa(String ma){
        for (int i = 0; i < this.listCV.size(); i++) {
            ChucVu vm = this.listCV.get(i);
            if(vm.getMa().equalsIgnoreCase(ma)){
                return this.listCV.get(i);
            }
        }
        return null;
    }


}
