import java.util.Scanner;

public class GarageBillingApp {
    public static void main(String[] args) {
        GarageService garageService = new GarageService();
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Thakur Car Service Centre----------");

        while (true) {
            System.out.println("1. Add Customer");
            System.out.println("2. Display Services");
            System.out.println("3. Exit");
            System.out.println("Enter your Choice:");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Customer Name:");
                    String name = sc.nextLine();
                    System.out.println("Enter Phone number:");
                    String phone = sc.nextLine();
                    System.out.println("Enter Car number:");
                    String carNum = sc.nextLine();
                    System.out.println("Enter Car Model:");
                    String model = sc.nextLine();
                    garageService.addCustomer(name, phone, carNum, model);
                    break;
                case 2:
                    System.out.println("Enter car number:");
                    String carNo = sc.nextLine();
                    garageService.createInvoice(carNo);
                    break;
                case 3:
                    System.out.println("Exiting.... Thank You!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
