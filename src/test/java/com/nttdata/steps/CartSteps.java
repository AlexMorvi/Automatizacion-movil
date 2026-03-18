package com.nttdata.steps;

import com.nttdata.screens.CartScreen;
import com.nttdata.screens.MainScreen;
import com.nttdata.screens.ProductScreen;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    CartScreen cartScreen;
    ProductScreen productScreen;
    MainScreen mainScreen;
    private WebDriver driver;
    private int units;
    private String product;

    public void addProductToCart(Integer units, String product) {
        mainScreen.clickProduct(product);
        this.units = units;
        this.product = product;
        for (int i = 0; i < units-1; i++) {
            productScreen.clickIncreaseQuantityByOne();
        }
        Assert.assertEquals("No se aumento correctamente la cantidad del producto ", productScreen.getCounterUnits(), units);
        productScreen.clickAddToCart();
        productScreen.clickCart();
    }

    public void validateCartUpdate() {
        cartScreen.waitScreenCart();
        Assert.assertNotNull("Unidad con valor nulo", units);
        Assert.assertEquals("No se aumento correctamente la cantidad del producto ", java.util.Optional.of(cartScreen.getCounterUnits()), java.util.Optional.of(units));
        Assert.assertEquals("No se selecciono el producto correcto ",cartScreen.getProductTitle(), product);
    }
}
