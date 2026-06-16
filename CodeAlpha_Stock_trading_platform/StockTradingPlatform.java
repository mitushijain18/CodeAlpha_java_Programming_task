import java.util.Scanner;

public class StockTradingPlatform {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        int tcsShares = 0;
        int infosysShares = 0;

        double tcsPrice = 3500;
        double infosysPrice = 1500;

        int choice;

        do {
            System.out.println("\n===== STOCK TRADING PLATFORM =====");
            System.out.println("Balance: ₹" + balance);
            System.out.println("1. View Market");
            System.out.println("2. Buy TCS");
            System.out.println("3. Buy INFOSYS");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("\nMarket Data");
                    System.out.println("TCS : ₹" + tcsPrice);
                    System.out.println("INFOSYS : ₹" + infosysPrice);
                    break;

                case 2:
                    System.out.print("Enter TCS quantity: ");
                    int tcsQty = sc.nextInt();

                    double tcsCost = tcsQty * tcsPrice;

                    if(tcsCost <= balance) {
                        balance -= tcsCost;
                        tcsShares += tcsQty;
                        System.out.println("TCS purchased successfully!");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 3:
                    System.out.print("Enter INFOSYS quantity: ");
                    int infyQty = sc.nextInt();

                    double infyCost = infyQty * infosysPrice;

                    if(infyCost <= balance) {
                        balance -= infyCost;
                        infosysShares += infyQty;
                        System.out.println("INFOSYS purchased successfully!");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 4:
                    System.out.println("\n===== PORTFOLIO =====");
                    System.out.println("TCS Shares: " + tcsShares);
                    System.out.println("INFOSYS Shares: " + infosysShares);

                    double portfolioValue =
                            (tcsShares * tcsPrice) +
                            (infosysShares * infosysPrice);

                    System.out.println("Portfolio Value: ₹" + portfolioValue);
                    System.out.println("Available Balance: ₹" + balance);
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 5);

        sc.close();
    }
}