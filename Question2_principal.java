public class Question2_principal {
	
	    public static void main(String[] args){
	
	        Q2_post n1 = new Q2_post("As pessoas são alienadas pela sua ignorancia em meio há tantas versões da tal verdade", "https://www.youtube.com/watch?v=sv8jzuVxB0s");
	
	        n1.curtir();
	        n1.curtir();
	        n1.curtir();
	
	        System.out.println("\nNumero de curtidas: "+n1.getNumeroCurtidas());
	
	        n1.compartilhar();
	        n1.compartilhar();
	
	        System.out.println("\nNumero de compartilhamento: "+n1.getNumeroCompartilhamento());
