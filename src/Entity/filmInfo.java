package Entity;


public class filmInfo {
    
    private String ad;
    private int id;
    private int süre;
    private String type;
    private String category;

    public filmInfo() {
    }

    public filmInfo(String ad, int id, int süre, String type, String category) {
        this.ad = ad;
        this.id = id;
        this.süre = süre;
        this.type = type;
        this.category = category;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSüre() {
        return süre;
    }

    public void setSüre(int süre) {
        this.süre = süre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return   ad + " " + id + " " + süre + " " + type + " " + category ;
    }
    
    
    
    
}
