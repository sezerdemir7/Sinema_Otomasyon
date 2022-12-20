package Entity;


public class filmInfo {
    
    private String ad;
    public static int id=1;
    private String süre;
    private String type;
    private String category;

    public filmInfo() {
    }

    public filmInfo(String ad, String süre, String type, String category) {
        this.ad = ad;
        
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

   

    public String getSüre() {
        return süre;
    }

    public void setSüre(String süre) {
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
        return   (id++)+"&"+ad + "&" + süre +" dk"+ "&" + type + "&" + category+"&" ;
    }
    
    
    
    
}
