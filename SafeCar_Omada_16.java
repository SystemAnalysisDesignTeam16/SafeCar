import java.util.Scanner;

public class SafeCar_Omada_16 {

    public static void main(String[] args) {
        String username, password;
        int epilogi;

        Ipallilos[] users = {
            new Dieuthintis("Makis", "Mitilineos", "ceo@safecar.gr", "makist", "makis_415!t"),
            new Praktoras("Tasos", "Papadopoulos", "tasospap@safecar.gr", "tasospap", "tasosp123456"),
            new Praktoras("Giannis", "Triantafillidis", "giannist@safecar.gr", "giannist", "giannis194155!")
        };
        
        EkthesiPragmatognomosinis ekthesi1 = new EkthesiPragmatognomosinis("14/04/2024", "Odos Lagkada 152", 124685934, 185365916, "Moisidis", "Oliki", "atixima1.jpg");
        EkthesiPragmatognomosinis ekthesi2 = new EkthesiPragmatognomosinis("20/04/2024", "Odos Egnatias 120", 164645921, 135315296, "Anastasiadis", "Xtipimeno Ftero", "atixima2.jpg");
        
        Scanner in = new Scanner(System.in);
        StatistikaStoixeia stats = StatistikaStoixeia.getInstance();

        while (true) {
            System.out.println("Username: ");
            username = in.nextLine();
            System.out.println("Password: ");
            password = in.nextLine();

            if (Ipallilos.eisodos(username, password, users)) {
                System.out.println("Epitixis sindesi!");
                break;
            } else {
                System.out.println("Apotiximeni sindesi. Dokimase ksana.");
            }
        }

        while (true) {
            System.out.println("1. NEA ASFALISI OXIMATOS");
            System.out.println("2. AKIRWSI ASFALISIS OXIMATOS");
            System.out.println("3. DIAXEIRISI PAKETWN");
            System.out.println("4. STATISTIKA STOIXEIA");
            System.out.println("5. DIAXEIRISI ZIMIWN");
            System.out.println("6. EKSODOS");

            epilogi = in.nextInt();
            in.nextLine();

            if (epilogi > 6 || epilogi < 1) {
                System.out.println("Lathos Epilogi");
            } else if (epilogi == 1) {
            	Praktoras.addCustomerVehicleAndInsurance(in, stats);
            } else if (epilogi == 2) {
                Praktoras.viewAndDeleteProposals(in, stats);
            } else if (epilogi == 3) {
                    Dieuthintis dieuthintis = null;
                    
                    for (Ipallilos user : users) {
                        if (user instanceof Dieuthintis) {
                            dieuthintis = (Dieuthintis) user;
                            break;
                        }
                    }
                    
                    if (dieuthintis != null) {
                        dieuthintis.editPaketo(in);
                    } else {
                        System.out.println("Den vrethike dieuthintis.");
                    }
                    
            }
             else if (epilogi == 4) {
            	 stats.printData();
            } else if (epilogi == 5) {
            	ekthesi1.printData();
            	ekthesi2.printData();
            } else if (epilogi == 6) {
                break;
            }
        }

        in.close();
    }

}
    
