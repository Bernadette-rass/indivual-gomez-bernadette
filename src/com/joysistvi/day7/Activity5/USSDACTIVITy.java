package com.joysistvi.day7.Activity5;

import java.util.Scanner;

public class USSDACTIVITy {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String ussdCode;

        // 1. Dial the USSD Code
        while (true) {
            System.out.println("Dial *143# to access Globe Services");
            System.out.print("Enter USSD Code: ");
            ussdCode = scanner.nextLine().trim();

            if (ussdCode.equals("*143#")) {
                break;
            }

            System.out.println("Invalid USSD Code. Please try again.\n");
        }

        // 2. Main Menu
        while (true) {
            System.out.println("\n* Load Registration *");
            System.out.println("[1] Go+");
            System.out.println("[2] Go");
            System.out.println("[3] GoEXTRA");
            System.out.println("[4] UNLI 5G");
            System.out.println("[5] ALLNET");
            System.out.print("Enter a choice: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    showPromos("Go+",
                            new String[]{"Go+99", "Go+129", "Go+149"},
                            new String[]{
                                    "Get 8 GB for all sites + 8GB",
                                    "Get 10 GB for all sites + 8GB",
                                    "Get 12 GB for all sites + 8GB"
                            });
                    return;

                case "2":
                    showPromos("Go",
                            new String[]{"Go50", "Go90", "Go120"},
                            new String[]{
                                    "Get 5 GB for all sites",
                                    "Get 8 GB for all sites",
                                    "Get 10 GB for all sites"
                            });
                    return;

                case "3":
                    showPromos("GoEXTRA",
                            new String[]{"GoEXTRA99", "GoEXTRA129",
                                    "GoEXTRA149"},
                            new String[]{
                                    "Get extra data with GoEXTRA99",
                                    "Get extra data with GoEXTRA129",
                                    "Get extra data with GoEXTRA149"
                            });
                    return;

                case "4":
                    showPromos("UNLI 5G",
                            new String[]{"UNLI 5G 99", "UNLI 5G 149",
                                    "UNLI 5G 199"},
                            new String[]{
                                    "UNLI 5G 99",
                                    "UNLI 5G 149",
                                    "UNLI 5G 199"
                            });
                    return;

                case "5":
                    showPromos("ALLNET",
                            new String[]{"ALLNET99", "ALLNET149",
                                    "ALLNET199"},
                            new String[]{
                                    "ALLNET99",
                                    "ALLNET149",
                                    "ALLNET199"
                            });
                    return;

                default:
                    System.out.println(
                            "Invalid choice. Please select 1-5.\n");
            }
        }
    }

    // 3. Display the selected promo submenu
    public static void showPromos(String category,
                                  String[] promos,
                                  String[] details) {

        while (true) {
            System.out.println("\n*** " + category + " Promos ***");

            for (int i = 0; i < promos.length; i++) {
                System.out.println("[" + (i + 1) + "] " + promos[i]);
            }

            System.out.println("[0] Back to Main Menu");
            System.out.print("Enter a choice: ");

            String choice = scanner.nextLine().trim();

            if (choice.equals("0")) {
                mainMenuAgain();
                return;
            }

            int selected;

            try {
                selected = Integer.parseInt(choice);
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please try again.\n");
                continue;
            }

            if (selected >= 1 && selected <= promos.length) {
                showPromoDetails(promos[selected - 1],
                        details[selected - 1]);
                return;
            } else {
                System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }

    // Helper method to return to the main menu
    public static void mainMenuAgain() {
        System.out.println("\nReturning to the main menu...");
        main(null);
    }

    // 4. Promo Details Menu
    public static void showPromoDetails(String promoName,
                                        String promoDetails) {

        while (true) {
            System.out.println("\n*** " + promoName + " Promo ***");
            System.out.println("-> " + promoDetails);
            System.out.println("[1] Subscribe");
            System.out.println("[2] Exit");
            System.out.print("Enter a choice: ");

            String choice = scanner.nextLine().trim();

            if (choice.equals("1")) {
                System.out.println(
                        "\nYou are now subscribed to " + promoName);
                return;
            } else if (choice.equals("2")) {
                System.out.println("Exiting program...");
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }

}
