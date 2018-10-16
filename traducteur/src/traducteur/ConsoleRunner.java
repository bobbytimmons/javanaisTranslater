package traducteur;

public class ConsoleRunner {

	public static void main(String[] args) {		
		try {	
			if (args==null||args.length !=2) throw new IllegalArgumentException();
			if (args[0].equalsIgnoreCase("javanaisToFr")) {
				System.out.println("traduction en français:"+Traduction.javanaisTofr(args[1]));
			} else if(args[0].equalsIgnoreCase("frToJavanais")){
				System.out.println("traduction en javanais:"+Traduction.frToJavanais(args[1]));
			}else {
				throw new IllegalArgumentException();
			}
			
		} catch (IllegalArgumentException e) {
			System.out.println("les arguments ne sont pas valides");
		}
	}

}
