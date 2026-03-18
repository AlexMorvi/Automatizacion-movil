package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement botonAumentarCantidad;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement unidades;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement botonAgregarAlCarrito;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement botonCarrito;

    public void clickIncreaseQuantityByOne(){
        botonAumentarCantidad.click();
    }

    public Integer getCounterUnits() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(unidades));
        String unidadesText = unidades.getText();
        try {
            return Integer.parseInt(unidadesText);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void clickAddToCart() {
        botonAgregarAlCarrito.click();
    }

    public void clickCart() {
        botonCarrito.click();
    }
}
