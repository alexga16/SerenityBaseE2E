package co.com.nombreproyecto.tasks;

import co.com.nombreproyecto.ui.GitHubLoginPage;
import co.com.nombreproyecto.ui.TodoList;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginGitHub implements Task {

    public static Performable iniciar() {
        return instrumented(LoginGitHub.class);
    }

    @Override
    @Step("{0} intenta iniciar sesion con credenciales erradas")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("hgfgfghfghf").into(GitHubLoginPage.CAMPO_TEXTO_USUARIO),
                Enter.theValue("jkhkgg").into(GitHubLoginPage.CAMPO_TEXTO_CLAVE),
                Click.on(GitHubLoginPage.BOTON_LOGIN)
        );
    }
}
