package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Jardines_BonitoTest {

    @Test
    void jardinVacio() {
        char[][] jardin = {
                {'.', '.'},
                {'.', '.'}
        };

        int resultado = Jardines_Bonito.contarCesped(jardin, 2, 2);

        assertEquals(0, resultado);
    }

    @Test
    void unSoloBloque() {
        char[][] jardin = {
                {'.', '.'},
                {'.', '#'}
        };

        int resultado = Jardines_Bonito.contarCesped(jardin, 2, 2);

        assertEquals(1, resultado);
    }

    @Test
    void dosBloquesSeparados() {
        char[][] jardin = {
                {'#', '.'},
                {'.', '#'}
        };

        int resultado = Jardines_Bonito.contarCesped(jardin, 2, 2);

        assertEquals(2, resultado);
    }

    @Test
    void bloqueConectado() {
        char[][] jardin = {
                {'#', '#'},
                {'.', '.'}
        };

        int resultado = Jardines_Bonito.contarCesped(jardin, 2, 2);

        assertEquals(1, resultado);
    }
}
