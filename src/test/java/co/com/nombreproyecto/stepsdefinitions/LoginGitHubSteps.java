package co.com.nombreproyecto.stepsdefinitions;

import co.com.nombreproyecto.tasks.IniciarGitHub;
import co.com.nombreproyecto.tasks.LoginGitHub;
import co.com.nombreproyecto.tasks.ValidacionLogin;
import co.com.nombreproyecto.ui.GitHubLoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

public class LoginGitHubSteps {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el {string} esta en la pagina de github")
    public void queElEstaEnLaPaginaDeGithub(String usuario) {
        OnStage.theActorCalled(usuario)
                .attemptsTo(
                        IniciarGitHub.enLogin()
                );
    }

    @Cuando("el usuario se loguea con credenciales erradas")
    public void elUsuarioSeLogueaConCredencialesErradas() {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        LoginGitHub.iniciar()
                );
    }

    @Entonces("se validara que se presente un mensaje informando el error")
    public void seValidaraQueSePresenteUnMensajeInformandoElError() {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        ValidacionLogin.errado()
                );
    }
}
