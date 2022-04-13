package homework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CartService {
    @Autowired
    private Cart cart;

    private Scanner scanner;
    private String command;


    private Long identifyIdFromInput() {
        return Long.valueOf(command.substring(command.lastIndexOf(' ') + 1));
    }

    public void doShop() {
        boolean flag = true;
        Long id = null;
        scanner = new Scanner(System.in);
        while (flag) {
            command = scanner.nextLine();
            if (command.startsWith("add")) {
                id = identifyIdFromInput();
                cart.addProduct(id);
                System.out.println(cart);
            } else if (command.startsWith("remove")) {
                id = identifyIdFromInput();
                cart.removeProduct(id);
                System.out.println(cart);
            } else if (command.startsWith("end")) {
                System.out.println(cart + "\nSee you next time!");
                flag = false;
            }
        }
        scanner.close();
    }
}
