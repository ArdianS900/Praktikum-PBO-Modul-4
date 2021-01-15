package Ardian07159_Controller;

import Ardian07159_Entity.Ardian07159_DataKorbanEntity;
import Ardian07159_Entity.Ardian07159_KorbanEntity;
import java.util.Date;

public class Ardian07159_KorbanController implements Ardian07159_ControllerInterfaces {
    int indexLogin=0;
    
        
    public Ardian07159_KorbanEntity getData(){
        return Ardian07159_AllObjectModel.korbanModel.getkorbanEntityArrayList(indexLogin);
       }
    
    public void daftarstatus (int indexStatus, Ardian07159_KorbanEntity korban){
      Ardian07159_AllObjectModel.datakorbanModel.insertDataDataKorban(new Ardian07159_DataKorbanEntity(indexStatus,korban));
    }
    
    @Override
    public void login (String nik , String nama){
        indexLogin = Ardian07159_AllObjectModel.korbanModel.cekData(nik, nama);
    }
      
    public void insert (String nik, String nama,
               String pekerjaan,String goldarah,String agama,
               String jeniskelamin,String notelp,Date TglLahir,
               String bantuan){
      Ardian07159_AllObjectModel.korbanModel.insert(new Ardian07159_KorbanEntity(nik,nama,pekerjaan,goldarah,
            agama,jeniskelamin, notelp,TglLahir,bantuan));
    }
    
     public Ardian07159_KorbanEntity korban(){
        return Ardian07159_AllObjectModel.korbanModel.getkorbanEntityArrayList(indexLogin);
    }
    
    public int cekDataKorban(String nik){
        int cek = Ardian07159_AllObjectModel.datakorbanModel.cekData(nik, null);
        return cek;
    }
    
    public Ardian07159_DataKorbanEntity showDataKorban (int index){
        return Ardian07159_AllObjectModel.datakorbanModel.showDataKorban(index);
    }

    public int update(String nik, int statusbaru) {
       return Ardian07159_AllObjectModel.datakorbanModel.update(nik, statusbaru);
    }
    
    public int hapus(String nik){
      return Ardian07159_AllObjectModel.korbanModel.hapus(nik);
    }
}
