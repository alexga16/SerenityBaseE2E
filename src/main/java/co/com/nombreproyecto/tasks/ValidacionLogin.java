package co.com.nombreproyecto.tasks;

import co.com.nombreproyecto.ui.GitHubLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidacionLogin implements Task {

    public static Performable errado() {
        return instrumented(ValidacionLogin.class);
    }

    @Override
    @Step("{0} valida la presencia del mensaje de error")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(GitHubLoginPage.MENSAJE_ERROR).isDisplayed()
        );
    }
}