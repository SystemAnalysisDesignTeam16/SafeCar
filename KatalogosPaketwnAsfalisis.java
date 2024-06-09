import java.util.ArrayList;

public class KatalogosPaketwnAsfalisis {
    private ArrayList<PaketoAsfalisis> paketoAsfalisisList;

    public KatalogosPaketwnAsfalisis() {
        this.paketoAsfalisisList = new ArrayList<>();
    }

    public void addPaketo(PaketoAsfalisis paketo) {
        paketoAsfalisisList.add(paketo);
    }

    public ArrayList<PaketoAsfalisis> getPaketoAsfalisis() {
        return paketoAsfalisisList;
    }

    public void deletePaketo(PaketoAsfalisis paketo) {
        paketoAsfalisisList.remove(paketo);
    }

    public void printData() {
    	System.out.println("--------------------------------");
        System.out.println("Diathesima Paketa Asfalisis:");
        System.out.println("--------------------------------");
        for (PaketoAsfalisis paketo : paketoAsfalisisList) {
            System.out.println("Onoma Paketou: " + paketo.getOnoma());
            System.out.println("Timi: " + paketo.getTimi());
            System.out.println("Asfalistiki: " + paketo.getAsfalistiki());
            System.out.println("Perigrafi: " + paketo.getPerigrafi());
            System.out.println("Diarkeia: " + paketo.getDiarkeia());
            System.out.println("--------------------------------");
        }
    }
}
