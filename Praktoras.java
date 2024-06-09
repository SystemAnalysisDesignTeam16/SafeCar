import java.util.ArrayList;
import java.util.Scanner;

public class Praktoras extends Ipallilos {
	static ArrayList<Pelatis> pelatisList = new ArrayList<>();
    static ArrayList<Oxima> oximaList = new ArrayList<>();
    private static ArrayList<ProtasiAsfalisis> asfalisisList = new ArrayList<>();

    public Praktoras(String onoma, String epwnimo, String email, String username, String kwdikos) {
        super(onoma, epwnimo, email, username, kwdikos);
    }
    
    
    public static void addCustomerVehicleAndInsurance(Scanner in, StatistikaStoixeia stats) {
        System.out.println("---STOIXEIA PELATI---");
        System.out.println("Onomatepwnimo: ");
        String fullName = in.nextLine();
        System.out.println("Imerominia Gennisis: ");
        String dob = in.nextLine();
        System.out.println("Dieuthinsi Katoikias: ");
        String address = in.nextLine();
        System.out.println("Arithmos Diplwmatos Odigisis: ");
        int licenseNumber = in.nextInt();
        in.nextLine();

        Pelatis newPelatis = Praktoras.addPelatis(fullName, dob, address, licenseNumber);

        System.out.println("---STOIXEIA OXIMATOS---");
        System.out.println("ARITHMOS PINAKIDAS OXIMATOS: ");
        String plateNumber = in.nextLine();
        
        Oxima existingOxima = evresiOximatos(plateNumber);
        if (existingOxima != null) {
            System.out.println("To oxima me autin tin pinakida iparxei idi.");
            return;
        }

        System.out.println("Marka: ");
        String make = in.nextLine();
        System.out.println("Modelo: ");
        String model = in.nextLine();
        System.out.println("Kivika: ");
        int kivika = in.nextInt();
        in.nextLine(); 
        System.out.println("Xrwma: ");
        String color = in.nextLine();

        Oxima newOxima = Praktoras.addOxima(plateNumber, make, model, kivika, color);

        System.out.println("---STOIXEIA ASFALISIS---");
        System.out.println("Diarkeia (se mines): ");
        String duration = in.nextLine();
        System.out.println("Timi: ");
        double cost = in.nextDouble();
        in.nextLine(); 
        stats.addInsuranceRevenue(cost);

        Praktoras.addProtasiAsfalisis(newPelatis.getId(), newOxima.getId(), duration, cost, stats);
    }
    
    public static Pelatis addPelatis(String onomatepwnimoPelati, String imGennisis, String dieuthinsi, int arDiplwmatos) {
        for (Pelatis pelatis : pelatisList) {
            if (pelatis.getArDiplwmatos() == arDiplwmatos) {
                System.out.println("O pelatis me to sigkekrimeno arithmo diavatiriou iparxei idi.");
                return pelatis;
            }
        }
        Pelatis newPelatis = new Pelatis(onomatepwnimoPelati, imGennisis, dieuthinsi, arDiplwmatos);
        pelatisList.add(newPelatis);
        System.out.println("Neos pelatis prostethike: " + newPelatis);
        return newPelatis;
    }
    
    private static Oxima evresiOximatos(String plateNumber) {
        for (Oxima oxima : oximaList) {
            if (oxima.getPlateNum().equals(plateNumber)) {
                return oxima;
            }
        }
        return null;
    }
    
    public static Oxima addOxima(String plateNum, String marka, String model, int kivika, String xrwma) {
        Oxima newOxima = new Oxima(plateNum, marka, model, kivika, xrwma);
        oximaList.add(newOxima);
        System.out.println("Neo oxima prostethike: " + newOxima);
        return newOxima;
    }

    public static void addProtasiAsfalisis(int idPelatis, int idOximatos, String diarkeia, double kostos, StatistikaStoixeia stats) {
        ProtasiAsfalisis newProtasi = new ProtasiAsfalisis(idPelatis, idOximatos, diarkeia, kostos);
        asfalisisList.add(newProtasi);
        stats.addCustomer();
        System.out.println("Nea asfalistiki protasi: " + newProtasi);
    }

    public static void viewAndDeleteProposals(Scanner in, StatistikaStoixeia stats) {
        System.out.println("---Lista asfalisewn---");
        for (ProtasiAsfalisis protasi : asfalisisList) {
            System.out.println(protasi);
        }
        System.out.println("Dwse to id tis asfaleias pou thes na akirwseis: ");
        int idToDelete = in.nextInt();
        in.nextLine(); // Consume the newline character

        for (ProtasiAsfalisis protasi : asfalisisList) {
            if (protasi.getId() == idToDelete) {
                System.out.println("Eisai sigouros oti thes na akirw8ei? (nai/oxi)");
                String confirmation = in.nextLine();
                if (confirmation.equalsIgnoreCase("nai")) {
                    asfalisisList.remove(protasi);
                    stats.removeCustomer();
                    System.out.println("I asfaleia akirwthike.");
                } else {
                    System.out.println("I asfaleia DEN akirwthike.");
                }
                return;
            }
        }
        System.out.println("De vrethike i asfaleia.");
    }
}
