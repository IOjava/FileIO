package exercise;

import java.io.PrintStream;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Storeapp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        PrintStream out = System.out;
        String receipt = "nothing to print";


        menuInput(in, out, receipt);
    }

        private static void menuInput(Scanner in, PrintStream out, String receipt){
            switch(printMenu(in)) {
                case "1":
                    createSale(in, out);
                    break;
                case "2":
                    printReceipt(receipt, out);
                    break;
                case "3":
                    out.println("Goodbye!");
                default:
                    out.println("Invalid option.");
            }
        }
        private static String printMenu(Scanner in) {
            System.out.printf(
                    "Welcome to Pinnacles Store\n" +
                    "Please select an option:\n" +
                    "--------------------------\n" +
                    "1) Sale\n" +
                    "2) Print receipt\n" +
                    "3) Exit\n");
            return in.next();
        }

        private static void printReceipt(String receipt, PrintStream out){
            out.print(receipt);
//            LocalDateTime date = LocalDateTime.now();
//            DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
//            String text = date.format(formatter);
//            LocalDateTime parsedDate = LocalDateTime.parse(text, formatter);
//            out.print(parsedDate);
        }

        private static void createSale(Scanner in, PrintStream out){
              String newItem = String.format("%-4s| %-9s| %-5s", "Qty", "Item Name", "Price\n");

            do {
                out.println("Enter the item's name");
                String itemName = in.next();

                out.println("Enter the item quantity");
                int itemCount = in.nextInt();

                out.println("Enter the item price");
                double itemPrice = in.nextDouble();
                newItem += String.format("%-4d| %-9s| $%-5.2f\n", itemCount, itemName, itemPrice);

                out.println("Enter another item? (y/n)");
            }while(in.next().equalsIgnoreCase("y"));
            menuInput(in, out, newItem);
        }

}

