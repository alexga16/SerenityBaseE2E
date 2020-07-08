package co.com.nombreproyecto.tasks;

import co.com.nombreproyecto.ui.PaginaPrincipalFacebook;
import co.com.nombreproyecto.ui.PaginaPrincipalGoogle;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class BuscarGoogle implements Task {

    private final String palabraClave;

    public BuscarGoogle(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    public static Performable porPalabra(String palabraClave) {
        return Instrumented.instanceOf((BuscarGoogle.class)).withProperties(palabraClave);
    }


    @Step("{0} buscar por palabra ")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(palabraClave).into(PaginaPrincipalGoogle.CAMPO_TEXTO_BUSCAR),
                Click.on(PaginaPrincipalGoogle.BOTON_BUSCAR)
        );
    }

}
