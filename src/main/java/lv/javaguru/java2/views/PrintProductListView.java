package lv.javaguru.java2.views;

import lv.javaguru.java2.businesslogic.getproducts.GetProductService;
import lv.javaguru.java2.domain.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PrintProductListView implements ConsoleView {

    private GetProductService printProductService;

    public PrintProductListView(GetProductService printProductService) {
        this.printProductService = printProductService;
    }

    public void execute() {
        System.out.println();
        System.out.println("Print shopping list to console execution start!");

        List<Product> allProducts = printProductService.getAllProducts();

        for (Product product : allProducts) {
            System.out.println(product.getTitle() + "[" + product.getDescription() + "]");
        }

        System.out.println("Print shopping list to console execution end!");
        System.out.println();
    }

}
