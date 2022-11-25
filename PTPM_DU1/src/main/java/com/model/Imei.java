 
package newpackage;

 
public class Imei {
    private String id,ma;
    private Long soImei;

    public Imei() {
    }

    public Imei(String id, String ma, Long soImei) {
        this.id = id;
        this.ma = ma;
        this.soImei = soImei;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Long getSoImei() {
        return soImei;
    }

    public void setSoImei(Long soImei) {
        this.soImei = soImei;
    }
    
    
}
