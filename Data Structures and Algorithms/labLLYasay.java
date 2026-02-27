package Chapter1;

import java.util.*;

class labLLYasay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        list.add("banana");
        list.add("apple");
        list.add("mango");
        list.add("orange");
        list.add("guava");
        list.add("grape");
        list.add("peach");
        list.add("cherry");
        list.add("melon");
        list.add("papaya");

        while (true) {
            System.out.println("\n============================");
            System.out.println(" MAIN MENU ");
            System.out.println("============================");
            System.out.println("[1] Insert");
            System.out.println("[2] Delete");
            System.out.println("[3] Display");
            System.out.println("[4] Search");
            System.out.println("[5] Exit");
            System.out.println("============================");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter fruit to insert: ");
                    String insertData = sc.nextLine();
                    list.add(insertData);
                    System.out.println("Inserted " + insertData);
                    break;

                case 2:
                    System.out.print("Enter fruit to delete: ");
                    String deleteData = sc.nextLine();
                    if (list.remove(deleteData)) {
                        System.out.println("Deleted " + deleteData);
                    } else {
                        System.out.println("Fruit not found.");
                    }
                    break;

                case 3:
                    System.out.println("Current Fruits: " + list);
                    break;

                case 4:
                    System.out.print("Enter fruit to search: ");
                    String searchData = sc.nextLine();
                    if (list.contains(searchData)) {
                        System.out.println(searchData + " is found in the list.");
                    } else {
                        System.out.println(searchData + " is not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}