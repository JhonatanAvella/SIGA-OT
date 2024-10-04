package co.com.colcomercio.siga.stepdefinitions;

import co.com.colcomercio.siga.models.users.Users;
import co.com.colcomercio.siga.tasks.Login;
import co.com.colcomercio.siga.utils.GetDataModel;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CommonStepdefinitions {
    private static final Logger logger = LogManager.getLogger(CommonStepdefinitions.class);
    private Users dataUser;
    @Before
    public void setUp() {
        logger.info("***********************************************************************************************************");
        logger.info("*********************[ Configuration ] - Initializing driver configuration*********************************");
        logger.info("***********************************************************************************************************");
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario inicia sesion como {string}")
    public void queUnAsesorPqrDeseaAccederAlCrmAlkomprar(String usuario) {
        dataUser = GetDataModel.user(usuario);
        theActorCalled("actor").wasAbleTo(
                Open.browserOn().  thePageNamed("pages.siga"),
                Login.addCredentials(dataUser)
        );
    }

    @After
    public void tearDown() {
        OnStage.drawTheCurtain();
    }
}