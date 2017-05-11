package pizzaCli;

import java.util.Scanner;

public class ordersystem {
    public static void main(String[] args) {
        // Declarations
        Scanner in = new Scanner(System.in);

        double priceSm = 7.99;
        double priceMd = 11.99;
        double priceLg = 14.99;

        // Prompts
        System.out.println("*******************************");
        System.out.println("* Welcome to Jason's Pizzeria *");
        System.out.println("*******************************");
        System.out.println("");
        System.out.printf("Choose a pizza size:\n 1) Small - $7.99\n 2) Medium - $11.99\n 3) Large - $14.99%n");
        int sizeInput = in.nextInt();
        System.out.printf("Choose a pizza type:\n 1) Cheese\n 2) Pepperoni\n 3) Meat Lovers\n 4) Supreme\n 5) Margherita\n");
        int typeInput = in.nextInt();
        System.out.println("Choose your toppings (Toppings $1.50/each): ");
        System.out.println(" 1) Extra Cheese  4) Canadian Bac 7) Chicken");
        System.out.println(" 2) Peppers       5) Prosciutto   8) Olives ");
        System.out.println(" 3) Mushrooms     6) Sausage      9) Avocado");
        int extra1 = in.nextInt();
        int extra2 = in.nextInt();
        System.out.printf("To complete your order enter your Info: \n  \n");
        System.out.println("Name:");
        String name = in.nextLine();
        System.out.println("E-mail:");
        String email = in.nextLine();
        System.out.println("Phone #:");
        String phone = in.nextLine();
        System.out.printf("*******************************%n  %n*******************************");
        System.out.printf("Ticket Total: $.2f\n");


    }
}

//          the final price  (Make it look like a ticket). Use the proper data type for each
//          variable that you need to create for your app.