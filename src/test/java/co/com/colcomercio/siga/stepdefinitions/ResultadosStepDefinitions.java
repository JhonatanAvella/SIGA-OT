package co.com.colcomercio.siga.stepdefinitions;

import co.com.colcomercio.siga.interactions.ClickOnElement;
import co.com.colcomercio.siga.interactions.Wait;
import co.com.colcomercio.siga.tasks.MenuOptions;
import io.cucumber.java.an.Y;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.colcomercio.siga.userinterfaces.BusquedaVehiculoPage.TEXTBOX_OT_CHASIS;
import static co.com.colcomercio.siga.userinterfaces.LoginPage.BUTTON_CERRAR_SESION;
import static co.com.colcomercio.siga.utils.WaitingTime.LOW_TIME;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ResultadosStepDefinitions {
    @Entonces("Genera el numero de la otden de trabajo")
    public void queUnAsesorPqrDeseaAccederAlCrmAlkomprar() {
        theActorCalled("actor").wasAbleTo(
                Switch.toDefaultContext(),
                WaitUntil.the(BUTTON_CERRAR_SESION, isVisible()).forNoMoreThan(LOW_TIME).seconds(),
                ClickOnElement.on(BUTTON_CERRAR_SESION),
                Wait.withDuration(10)
        );
    }

    @Entonces("la orden de trabajo pasa a estado En ejecucion")
    public void laOrdenDeTrabajoPasaAEstadoEnEjecucion() {
        theActorCalled("actor").wasAbleTo(
                Switch.toDefaultContext(),
                WaitUntil.the(BUTTON_CERRAR_SESION, isVisible()).forNoMoreThan(LOW_TIME).seconds(),
                ClickOnElement.on(BUTTON_CERRAR_SESION)
        );
    }

    @Entonces("se crea la novedad TP")
    public void seCreaLaNovedadTP() {
    }
}