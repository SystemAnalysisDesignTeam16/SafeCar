import java.util.Scanner;

public class Dieuthintis extends Ipallilos {
    private KatalogosPaketwnAsfalisis katalogosPaketwnAsfalisis;

    public Dieuthintis(String onoma, String epwnimo, String email, String username, String kwdikos) {
        super(onoma, epwnimo, email, username, kwdikos);
        this.katalogosPaketwnAsfalisis = new KatalogosPaketwnAsfalisis();
    }

    public void editPaketo(Scanner in) {
    	
    	katalogosPaketwnAsfalisis.printData();
    	
        System.out.println("1. PROSTHIKI PAKETOU");
        System.out.println("2. EPEKSERGASIA PAKETOU");
        System.out.println("3. DIAGRAFI PAKETOU");

        int dieuthintisEpilogi = in.nextInt();
        in.nextLine();

        switch (dieuthintisEpilogi) {
            case 1:
                System.out.println("Dwse onoma paketou:");
                String onomaPaketou = in.nextLine();
                System.out.println("Dwse timi paketou:");
                double timiPaketou = in.nextDouble();
                in.nextLine();
                System.out.println("Dwse onoma asfalistikis:");
                String asfalistiki = in.nextLine();
                System.out.println("Perigrafi: ");
                String perigrafi = in.nextLine();
                System.out.println("Diarkeia: ");
                String diarkeia = in.nextLine();
                PaketoAsfalisis newPackage = new PaketoAsfalisis(onomaPaketou, timiPaketou, asfalistiki, perigrafi, diarkeia);
                katalogosPaketwnAsfalisis.addPaketo(newPackage);
                break;
            case 2:
            	System.out.println("Dwse onoma asfalistikis:");
            	String insuranceToEdit = in.nextLine();
            	
                System.out.println("Dwse onoma paketou gia epeksergasia:");
                String packageToEdit = in.nextLine();
                for (PaketoAsfalisis paketo : katalogosPaketwnAsfalisis.getPaketoAsfalisis()) {
                    if (paketo.getAsfalistiki().equals(insuranceToEdit) && paketo.getOnoma().equals(packageToEdit)) {
                    	System.out.println("Dwse nea timi:");
                        double newPrice = in.nextDouble();
                        in.nextLine();
                        System.out.println("Dwse nea perigrafi:");
                        String newPerigrafi = in.nextLine();
                        System.out.println("Dwse nea xroniki diarkeia:");
                        String newDiarkeia = in.nextLine();
                        
                        paketo.setTimi(newPrice);
                        paketo.setPerigrafi(newPerigrafi);
                        paketo.setDiarkeia(newDiarkeia);
                       
                        System.out.println("Epitiximeni epeksergasia.");
                        return;
                    }
                }
              
                System.out.println("De vrethike to paketo.");
                break;
            case 3:
            	System.out.println("Dwse onoma asfalistikis:");
            	String insuranceToDel = in.nextLine();
                System.out.println("Dwse onoma paketou gia diagrafi:");
                String packageToDelete = in.nextLine();
                for (PaketoAsfalisis paketo : katalogosPaketwnAsfalisis.getPaketoAsfalisis()) {
                    if (paketo.getAsfalistiki().equals(insuranceToDel) && paketo.getOnoma().equals(packageToDelete)) {
                        katalogosPaketwnAsfalisis.deletePaketo(paketo);
                        return;
                    }
                }
                System.out.println("De vrethike paketo me auta ta stoixeia.");
                break;
            default:
                System.out.println("Lathos epilogi.");
                break;
        }
    }
}
