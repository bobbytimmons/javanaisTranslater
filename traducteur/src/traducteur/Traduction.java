package traducteur;

import java.util.regex.Pattern;

public class Traduction {

	private final static String voyelles = "aeiouyéèàêâùïüë";
	private final static String consonnes = "bcdfghjklmnpqrstvwxz";
	private final static String nonLettre = "^a-zA-Zéèàêâùïüë";
	
	/**
	 * cette méthode insert la chaine av entre une consonne et une voyelle
	 * 
	 * @param phraseFR
	 * @return
	 */
	private static String insertAVEntreConsonneVoyelle(String phraseFR){
		return Pattern.compile("([" + consonnes + "])([" + voyelles + "])", Pattern.CASE_INSENSITIVE).matcher(phraseFR).replaceAll("$1av$2");		
	}

	/**
	 * cette methode insert av devant une voyelle en début de mot
	 * 
	 * @param phraseFR
	 * @return
	 */
	private static String insertAVVoyelleDebutMot(String phraseFR){
		return Pattern.compile("(^|" + nonLettre + ")([" + voyelles + "])", Pattern.CASE_INSENSITIVE).matcher(phraseFR).replaceAll("$1av$2");
	}
	/**
	 * Cette methode retire la chaine av quand elle n'est pas précédée de av
	 * 
	 * @param phraseJavanais
	 * @return
	 */
	private static String retireAvNonPrecedeav(String phraseJavanais){
		return Pattern.compile("(?<!av)av", Pattern.CASE_INSENSITIVE).matcher(phraseJavanais).replaceAll("");
	}
	/**
	 * Cette méthode retire la chaine av quand elle est précédée de av
	 * 
	 * @param phraseJavanais
	 * @return
	 */
	private static String retireAvPrecedeav(String phraseJavanais){
		return Pattern.compile("(?<!av)av", Pattern.CASE_INSENSITIVE).matcher(phraseJavanais).replaceAll("");
	}
	/**
	 * @param phraseJavanais
	 * @return
	 */
	public static String javanaisTofr(String phraseJavanais) {
		if (phraseJavanais == null || phraseJavanais.equals("")) {
			throw new IllegalArgumentException();}
		return Traduction.retireAvPrecedeav(Traduction.retireAvNonPrecedeav(phraseJavanais));
	}
	/**
	 * @param phraseFR
	 * @return
	 */
	public static String frToJavanais(String phraseFR) {
		if (phraseFR == null || phraseFR.equals("")) {
			throw new IllegalArgumentException();}
		return Traduction.insertAVVoyelleDebutMot(Traduction.insertAVEntreConsonneVoyelle(phraseFR));
	}

}
