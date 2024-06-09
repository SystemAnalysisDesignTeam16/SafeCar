public class StatistikaStoixeia {
    private static StatistikaStoixeia instance;

    private int totalCustomers;
    private double totalRevenue;

    private StatistikaStoixeia() {
        totalCustomers = 0;
        totalRevenue = 0.0;
    }

    public static StatistikaStoixeia getInstance() {
        if (instance == null) {
            instance = new StatistikaStoixeia();
        }
        return instance;
    }

    public void addCustomer() {
        totalCustomers++;
    }

    public void removeCustomer() {
        totalCustomers--;
    }

    public void addInsuranceRevenue(double revenue) {
        totalRevenue += revenue;
    }

    public int getTotalCustomers() {
        return totalCustomers;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void printData() {
        System.out.println("Sinolo Pelatwn: " + totalCustomers);
        System.out.println("Sinolika Esoda: " + totalRevenue);
    }
}
