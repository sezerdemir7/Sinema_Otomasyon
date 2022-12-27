package Entity;

public class yoneticiInfo extends Human {

    private String Ysifre;

    public yoneticiInfo() {
        this.setAd("yazılım");
        this.setSoyad("mühendisi");
        this.setTlfon("999");
        this.setYsifre("12345");
    }

    public String getYsifre() {
        if (this.Ysifre == null) {
            this.Ysifre = "12345";
        }
        return Ysifre;
    }

    public void setYsifre(String Ysifre) {

        this.Ysifre = Ysifre;
    }

    @Override
    public String toString() {
        return this.getAd() + " " + this.getSoyad() + " " + this.getTlfon() + " " + this.getYsifre();
    }

}
