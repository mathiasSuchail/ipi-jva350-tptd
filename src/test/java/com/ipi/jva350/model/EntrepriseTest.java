package com.ipi.jva350.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class EntrepriseTest {
    @Test
    public void testJoursFeries() {
        // test feriés :
        Assertions.assertTrue(Entreprise.estJourFerie(LocalDate.of(2024, 1, 1)));
        Assertions.assertTrue(Entreprise.estJourFerie(LocalDate.of(2024, 4, 1)));
        Assertions.assertTrue(Entreprise.estJourFerie(LocalDate.of(2024, 5, 1)));
        Assertions.assertTrue(Entreprise.estJourFerie(LocalDate.of(2024, 5, 8)));
        Assertions.assertTrue(Entreprise.estJourFerie(LocalDate.of(2024, 5, 20)));
        Assertions.assertTrue(Entreprise.estJourFerie(LocalDate.of(2024, 7, 14)));
        Assertions.assertTrue(Entreprise.estJourFerie(LocalDate.of(2024, 8, 15)));
        Assertions.assertTrue(Entreprise.estJourFerie(LocalDate.of(2024, 11, 1)));
        Assertions.assertTrue(Entreprise.estJourFerie(LocalDate.of(2024, 11, 11)));
        Assertions.assertTrue(Entreprise.estJourFerie(LocalDate.of(2024, 12, 25)));


        // test non fériés :
        Assertions.assertFalse(Entreprise.estJourFerie(LocalDate.of(2024, 1, 2)));
    }

}
