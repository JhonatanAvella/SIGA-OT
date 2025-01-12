package co.com.colcomercio.siga.interactions.RegistrarRecepcion;

import co.com.colcomercio.siga.interactions.EnterText;
import co.com.colcomercio.siga.interactions.ScrollToElement;
import co.com.colcomercio.siga.utils.DateGenerator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.colcomercio.siga.userinterfaces.RegistrarRecepcionPage.*;
import static co.com.colcomercio.siga.utils.Constantes.CONDICION_VEHICULO;
import static co.com.colcomercio.siga.utils.WaitingTime.LOW_TIME;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FechaRegistro implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TEXTBOX_FECHA_ENTREGA, isVisible()).forNoMoreThan(LOW_TIME).seconds(),
                ScrollToElement.to(TEXTBOX_FECHA_ENTREGA),
                EnterText.intoField(DateGenerator.getTodayDate(),TEXTBOX_FECHA_ENTREGA),
                Hit.the(Keys.ENTER).into(TEXTBOX_FECHA_ENTREGA),
                EnterText.intoField(CONDICION_VEHICULO,TEXTBOX_CONDICION)
        );
    }
    public static FechaRegistro addFecha(){return Tasks.instrumented(FechaRegistro.class);
    }
}
