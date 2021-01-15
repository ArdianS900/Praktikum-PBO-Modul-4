package Ardian07159_Model;

import Ardian07159_Entity.Ardian07159_KorbanEntity;
import java.util.ArrayList;

public class Ardian07159_KorbanModel implements Ardian07159_ModelInterfaces {
    private ArrayList<Ardian07159_KorbanEntity> korbanEntityArrayList;
    
    public Ardian07159_KorbanModel(){
        korbanEntityArrayList = new ArrayList<Ardian07159_KorbanEntity>();
    }
public void insert(Ardian07159_KorbanEntity korban){
    korbanEntityArrayList.add(korban);  
}

    @Override
 public void login(){
        for(Ardian07159_KorbanEntity korbanEntity : korbanEntityArrayList){
            System.out.println("===========================================");
            System.out.println(" NIK : "+korbanEntity.getnik()+"\n Nama : "
            +korbanEntity.getnama()+"\n Pekerjaan : "+korbanEntity.getpekerjaan()+
            "\n Golongan Darah : "+korbanEntity.getgoldarah()+"\n Agama : "+korbanEntity.getagama()+
            "\n Jenis Kelamin : "+korbanEntity.getjeniskelamin()+"\n No Telp : "
            +korbanEntity.getnotelp()+"\n Tanggal Lahir : "+korbanEntity.getTglLahir());
            System.out.println("===========================================");
        }
    }
 public int cekData(String nik, String nama){
        int loop = 0;
        while (!korbanEntityArrayList.get(loop).getnik().equals(nik) && 
                !korbanEntityArrayList.get(loop).getnama().equals(nama)){
            loop++;
        }
        return loop;
    }
    public Ardian07159_KorbanEntity getkorbanEntityArrayList(int index){
        return korbanEntityArrayList.get(index);
    }
    private int carinik(String nik){
        int index=-1;
        for(int i=0;i <korbanEntityArrayList.size();i++) {
           if(nik.equals(korbanEntityArrayList.get(i).getnik()))
               index=i;
           break;
       }
       return index;
    }
    public int hapus(String nik){
            int data;
        if(carinik(nik)!=-1){
             korbanEntityArrayList.remove(carinik(nik));
             data=1;
        }else{
            data=0;
          }        
        return data;
    }
}
