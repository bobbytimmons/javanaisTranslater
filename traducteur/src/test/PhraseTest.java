package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import traducteur.Traduction;

class PhraseTest {
	
	String phraseFrançais1 = "bonjour";
	String phraseJavanais1 =  "bavonjavour";
	
	String phraseFrançais2 = "caravane";
	String phraseJavanais2 =  "cavaravavavanave";
	
	String phraseFrançais3 = "exemple";
	String phraseJavanais3 =  "avexavemplave";
	
	String phraseFrançais4 = "chante";
	String phraseJavanais4 =  "chavantave";
	
	String phraseFrançais5 = "au";
	String phraseJavanais5 = "avau";
	
	String phraseFrançais6 = "BonJour";
	String phraseJavanais6 =  "BavonJavour";
	
	
	

	@Test
	void testFrancaisToJavanais() {
		assertEquals(phraseJavanais1, Traduction.frToJavanais(phraseFrançais1), "la traduction en javanais ne fonctionne pas");
		assertEquals(phraseJavanais4, Traduction.frToJavanais(phraseFrançais4), "la traduction en javanais ne fonctionne pas");
		assertEquals(phraseJavanais5, Traduction.frToJavanais(phraseFrançais5), "la traduction en javanais ne fonctionne pas");
	}
	
	@Test
	void testJavanaisToFrancais() {
		assertEquals(phraseFrançais1, Traduction.javanaisTofr(phraseJavanais1), "la traduction en français ne fonctionne pas");
		assertEquals(phraseFrançais4, Traduction.javanaisTofr(phraseJavanais4), "la traduction en français ne fonctionne pas");
		assertEquals(phraseFrançais5, Traduction.javanaisTofr(phraseJavanais5), "la traduction en français ne fonctionne pas");
	}

	@Test
	void testFrancaisToJavanaisMotContenantAV() {
		assertEquals(phraseJavanais2, Traduction.frToJavanais(phraseFrançais2), "la traduction en javanais ne fonctionne pas");
	}
	
	@Test
	void testJavanaisToFrancaisMotContenantAV() {
		assertEquals(phraseFrançais2, Traduction.javanaisTofr(phraseJavanais2), "la traduction en français ne fonctionne pas");
	}
	
	@Test
	void testFrancaisToJavanaisMotVoyelleDebut() {
		assertEquals(phraseJavanais3, Traduction.frToJavanais(phraseFrançais3), "la traduction en javanais ne fonctionne pas");
	}
	
	@Test
	void testJavanaisToFrancaisMotVoyelleDebut() {
		assertEquals(phraseFrançais3, Traduction.javanaisTofr(phraseJavanais3), "la traduction en français ne fonctionne pas");
	}
	
	@Test
	void testFrancaisToJavanaisIgnoreCase() {
		assertEquals(phraseJavanais6, Traduction.frToJavanais(phraseFrançais6), "la traduction en javanais ne fonctionne pas");
	}
	
	@Test
	void testJavanaisToFrancaisIgnoreCase() {
		assertEquals(phraseFrançais6, Traduction.javanaisTofr(phraseJavanais6), "la traduction en français ne fonctionne pas");
	}

}
