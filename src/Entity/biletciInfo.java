
package Entity;


public class biletciInfo extends Human{
    
    private int maas;

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return  super.toString()+ maas ;
    }
    
    
    
    
}
