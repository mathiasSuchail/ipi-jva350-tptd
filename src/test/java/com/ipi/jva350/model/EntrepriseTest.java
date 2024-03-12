package com.ipi.jva350.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class EntrepriseTest {
    @Test
    public void testEstDansPlageTrue() {
        // Given :
        LocalDate date = LocalDate.of(2023, 6, 28);
        // When :
        boolean res = Entreprise.estDansPlage(date, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 30));
        // Then :
        Assertions.assertTrue(res);
    }

    @Test
    public void testEstDansPlageFalse() {
        // Given :
        LocalDate date = LocalDate.of(2023, 12, 28);
        // When :
        boolean res = Entreprise.estDansPlage(date, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 30));
        // Then :
        Assertions.assertFalse(res);
    }

    @Test
    public void testJoursFeriesTrue() {
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
    }

    @Test
    public void testJoursFeriesFalse() {
        // test non fériés :
        Assertions.assertFalse(Entreprise.estJourFerie(LocalDate.of(2024, 1, 2)));
    }



}
