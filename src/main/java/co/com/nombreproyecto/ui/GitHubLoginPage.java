package co.com.nombreproyecto.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:github.login.page")
public class GitHubLoginPage extends PageObject {

    public static final Target MENSAJE_ERROR=Target.the("Mensaje error")
            .located(By.id("js-flash-container"));

    public static final Target CAMPO_TEXTO_USUARIO=Target.the("Campo de texto usuario")
            .located(By.id("login_field"));

    public static final Target CAMPO_TEXTO_CLAVE=Target.the("Campo de texto clave")
            .located(By.id("password"));

    public static final Target BOTON_LOGIN=Target.the("boton login github")
            .located(By.name("commit"));
}

