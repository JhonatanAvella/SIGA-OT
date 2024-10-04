package co.com.colcomercio.siga.stepdefinitions;

import co.com.colcomercio.siga.tasks.Login;
import co.com.colcomercio.siga.tasks.MenuOptions;
import co.com.colcomercio.siga.utils.GetDataModel;
import io.cucumber.java.an.Y;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class MenuStepDefinitions {
    @Y("en el menu selecciona {string} y el submenu {string}")
    public void queUnAsesorPqrDeseaAccederAlCrmAlkomprar(String menu, String submenu) {
        theActorCalled("actor").wasAbleTo(
                MenuOptions.selectOption(menu, submenu)
        );
    }
}