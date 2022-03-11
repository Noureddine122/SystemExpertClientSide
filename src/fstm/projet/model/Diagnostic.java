package fstm.projet.model;

import java.io.Serializable;
import java.util.Vector;

public class Diagnostic implements Serializable {

	    	private int num_diag;
	    	public Vector<Symptoms> Mysymtoms;
	    	private double resultat=0;
	    	public Client MyClient;
	    	public Docteur d;
	    	public Diagnostic(int id , Client c) {
	    		num_diag=id;
	    		this.Mysymtoms = new Vector<Symptoms>();
	    		this.MyClient=c;
	    		
	    	}
	    	public Diagnostic(int id , Client c, Vector<Symptoms> sy, Docteur f) {
	    		num_diag=id;
	    		this.Mysymtoms = sy;
	    		this.MyClient=c;
	    		this.d=f;
	    	}
	    	
	    	public double get_possi_presence()
	    	{
	    		return resultat;
	    	}
	    	public void set_possi_presence(double r)
	    	{
	    		 resultat = r;
	    	}
	    	public void ajouter( Symptoms S) {
	    		Mysymtoms.add(S);
	    	}
	    	public void S( Symptoms S) {
	    		Mysymtoms.add(S);
	    	}

	public double traiter() {
		return 0;
	}


	public void envoyer() {
	    		d.setRemplie(true);
	    		d.setMsg("Ce patient est une cas d'urgent voici ces informations"+MyClient);
	    		
	    	}
	    
}
