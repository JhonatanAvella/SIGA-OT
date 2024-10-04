package co.com.colcomercio.siga.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EnterText implements Interaction {

    private static final Logger logger = LogManager.getLogger(EnterText.class);
    private final String text;
    private final Target target;

    public EnterText(String text, Target target) {
        this.text = text;
        this.target = target;
    }

    public static EnterText intoField(String text, Target target) {
        return Tasks.instrumented(EnterText.class, text, target);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        if (target.isVisibleFor(actor)){
            logger.info("ingresar texto en  " + target);
            actor.attemptsTo(
                Enter.theValue(text).into(target)
            );
        }else {
            logger.error("No se encontro el elemento" + target);
        }

    }
}