import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AutomotoraTest {

    Automotora automotora = new Automotora();
    Auto auto = new Auto("Toyota","Corolla",2018,15000,4);
    Camion camion = new Camion("Mercedes-Benz","Actros",2019,75000,18);
    Bicicleta bicicleta = new Bicicleta("Giant","Talon",2022,500,"Montania");

    @BeforeEach
    void setUp(){


    }

    @Test
    void listarAutos() {
        assertNotNull(automotora.ListarAutos());
    }

    @Test
    void listarCamiones() {
        assertNotNull(automotora.ListarCamiones());
    }

    @Test
    void listarBicicletas() {
        assertNotNull(automotora.ListarBicicletas());
    }

    @Test
    void buscarAuto() {
        assertNull(automotora.buscarAuto("a","a",1));
        assertEquals(auto.getMarca(),automotora.buscarAuto("Toyota","Corolla",4).getMarca());
    }

    @Test
    void buscarCamion() {
        assertNull(automotora.buscarCamion("b","b",1));
        assertEquals(camion.getMarca(),automotora.buscarCamion("Mercedes-Benz","Actros",18).getMarca());

    }

    @Test
    void buscarBicicleta() {
        assertNull(automotora.buscarBicicleta("c","c","c"));
        assertEquals(bicicleta.getMarca(),automotora.buscarBicicleta("Giant","Talon","Montania").getMarca());
    }
}