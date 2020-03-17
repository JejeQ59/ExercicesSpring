package com.exo;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Adresse {
	
	
    private String codePostal;
    private String rue;
    private String ville;
    private String pays;
    private final static Logger LOG = LogManager.getLogger();
    
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Adresse(String codePostal, String rue, String ville, String pays) {
		super();
		this.codePostal = codePostal;
		this.rue = rue;
		this.ville = ville;
		this.pays = pays;
		Client.LOG.info("Dans mon constructeur adresse {}", this);
	}

	@PostConstruct
	public void initialiser()
	{
		Client.LOG.info("Dans mon Init adresse {}", this);
	}
	
	@javax.annotation.PreDestroy
	public void detruire()
	{
		Client.LOG.info("Dans mon destroy adresse {}", this);
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}


	@Override
	public String toString() {
		return "Adresse [codePostal=" + codePostal + ", rue=" + rue + ", ville=" + ville + ", pays=" + pays + "]";
	}
    
    


}
