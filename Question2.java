Public class Question2 {
	
	    private String text, link; private int numeroCurtidas, numeroCompartilhamento;
	
	    public Q2_post(String text, String link){
	
	        this.text = text;
	        this.link = link;
	    }
	
	    public void curtir(){
	
	        this.numeroCurtidas-=-1;
	    }
	
	    public void compartilhar(){
	
	        this.numeroCompartilhamento-=-1;
	    }
	
	    public int getNumeroCurtidas(){
	        return this.numeroCurtidas;
	    }
	
	    public int getNumeroCompartilhamento(){
	        return this.numeroCompartilhamento;
