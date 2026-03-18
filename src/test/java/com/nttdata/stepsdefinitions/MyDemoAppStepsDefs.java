package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CartSteps;
import com.nttdata.steps.MainSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class MyDemoAppStepsDefs {
    @Steps
    MainSteps mainSteps;
    @Steps
    CartSteps cartSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoy_en_la_aplicación_de_sauce_labs() {
        mainSteps.waitEntryApplication();

    }

    @Given("valido que carguen correctamente los productos en la galeria")
    public void valido_que_carguen_correctamente_los_productos_en_la_galeria() {
        mainSteps.validateUploadedProducts();

    }

    @When("agrego {int} del siguiente producto {string}")
    public void agrego_del_siguiente_producto_producto(Integer units, String product) {
        cartSteps.addProductToCart(units, product);
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void valido_el_carrito_de_compra_actualice_correctamente() {
        cartSteps.validateCartUpdate();
    }


}
