import database.Database;
import database.InMemoryDatabaseProduct;
import servicesProduct.AddProductService;
import servicesProduct.PrintProductService;
import servicesProduct.RemoveProductService;
import viewsProduct.*;

import java.util.*;

public class ShoppingListApplication {

    public static void main(String[] args) {
        // Use cases:
        // 1. Add product to list
        // 2. Remove product from list
        // 3. Print shopping list to console
        // 4. Exit

        Database database = new InMemoryDatabaseProduct();
        AddProductService addProductService = new AddProductService(database);
        RemoveProductService removeProductService = new RemoveProductService(database);
        PrintProductService printProductService = new PrintProductService(database);

        AddProductView addProductView = new AddProductView(addProductService);
        RemoveProductView removeProductView = new RemoveProductView(removeProductService);
        PrintProductListView printProductListView = new PrintProductListView(printProductService);


        Map<Integer, ConsoleView> menuMap = new HashMap<>();
        menuMap.put(1, addProductView);
        menuMap.put(2, removeProductView);
        menuMap.put(3, printProductListView);
        menuMap.put(4, new ExitView());

        while (true) {
            printProgramMenu();
            int menuItem = getFromUserMenuItemToExecute();
            ConsoleView consoleView = menuMap.get(menuItem);
            consoleView.execute();
        }

    }

    private static void printProgramMenu() {
        System.out.println("Program Menu:");
        System.out.println("1. Add product to list");
        System.out.println("2. Remove product from list");
        System.out.println("3. Print list to console");
        System.out.println("4. Exit");
    }

    private static int getFromUserMenuItemToExecute() {
        System.out.print("Please enter menu item number to execute:");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

}

