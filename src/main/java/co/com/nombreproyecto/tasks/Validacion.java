package co.com.nombreproyecto.tasks;

import co.com.nombreproyecto.ui.PaginaPrincipalGoogle;
import co.com.nombreproyecto.ui.PaginaResultados;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;

public class Validacion implements Task {
    private final String palabraClave;

    public Validacion(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    public static Performable primerResultado(String palabraClave) {
        return Instrumented.instanceOf((Validacion.class)).withProperties(palabraClave);
    }


    @Step("{0} valida que el primer resultado contenga la palabra #palabraClave ")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(PaginaResultados.PRIMER_RESULTADO_MUSICA).text().containsIgnoringCase(palabraClave),
                Ensure.that(PaginaResultados.PRIMER_RESULTADO_MUSICA_DESC).text().containsIgnoringCase(palabraClave)
        );
    }

}
