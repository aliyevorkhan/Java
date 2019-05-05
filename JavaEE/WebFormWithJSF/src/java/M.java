
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;



@ManagedBean
@RequestScoped
public class M {
    
    String isimSoyisim;
    String adres;
    String il;
    String parola;
    List<String>cinsiyet = new ArrayList<String>();
    boolean kabulEdildiMi;
    String mesaj;

    public String getMesaj() {
        if(!kabulEdildiMi){
            mesaj = "Sartlari kabul etmediniz!";
        }
        else{
            mesaj = "Sartlari kabul ettiniz";
        }
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public String getIsimSoyisim() {
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {
        this.isimSoyisim = isimSoyisim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public List<String> getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(List<String> cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public boolean isKabulEdildiMi() {
        return kabulEdildiMi;
    }

    public void setKabulEdildiMi(boolean kabulEdildiMi) {
        this.kabulEdildiMi = kabulEdildiMi;
    }
    
    
    
}
