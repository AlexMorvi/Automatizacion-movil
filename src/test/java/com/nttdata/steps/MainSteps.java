package com.nttdata.steps;

import com.nttdata.screens.MainScreen;
import org.junit.Assert;


public class MainSteps {

    MainScreen mainScreen;

    public void validateUploadedProducts() {
        Assert.assertTrue("Error al cargar productos en galería ", mainScreen.isProductsDisplayed());
    }

    public void waitEntryApplication() {
        Assert.assertTrue("Error al cargar pantalla de productos ", mainScreen.isProductsTitleDisplayed());
    }
}
