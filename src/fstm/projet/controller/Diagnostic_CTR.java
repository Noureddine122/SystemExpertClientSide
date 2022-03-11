package fstm.projet.controller;

import fstm.projet.model.*;
import fstm.projet.view.Acueil;

import java.io.*;
import java.net.Socket;
import java.util.Vector;

public class Diagnostic_CTR {
	Client client;
	public Diagnostic_CTR(Client c)
	{
		client=c;
		
		Acueil fram1= new Acueil(c);
		fram1.setVisible(true);
		
		 
	}
	
	public static void diagoniser(Client c, Vector<Symptoms> sys, Vector<Maladie_chronique> mal) throws IOException, ClassNotFoundException {
	Docteur doc=new Docteur(1,"alami","ahmed");
 	

	 c.setMaladies(mal);
	 //Diagnostic diag = new Diagnostic(1,c,sys,doc);
	Socket socket = new Socket("172.17.36.195", 7000);
	System.out.println("Connected.................");

	boolean fini = false;

		OutputStream os = socket.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);
		Socketinter n = new Socketinter(sys,c);

		oos.writeObject(n);
		System.out.println("Sending values to the ServerSocket");



		//Serialization


		InputStream is = socket.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(is);
		Double obj1=(Double)ois.readObject();
		System.out.println(obj1);
		Acueil.Resul.setText(String.valueOf(obj1));
		//System.out.println("wanna continue ?! fini if yes");




		/*Acueil.Resul.setText(resu*100 + " %100");*/
	 
	 
	 
	 
	 
		/*if(d.isEnvoy()==true)
		JOptionPane.showMessageDialog(jButton4, "possibilite de presence : " 
		+ resu*100 + " %100 vous etes une cas d'urgence !! vos informations ont envoy�es aux autorit�s compt�tentes",
		"Diagnostic", JOptionPane.INFORMATION_MESSAGE);
		else JOptionPane.showMessageDialog(jButton4, "possibilite de presence : " 
				+ resu*100 + " %100","Diagnostic", JOptionPane.INFORMATION_MESSAGE);*/
	 
	 
	 
}
	
	
}
