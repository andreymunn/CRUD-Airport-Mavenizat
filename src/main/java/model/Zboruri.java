package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//jpa anotatii
@Entity
public class Zboruri {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //pt autogenerare de ID
	private Integer id;
	@Column
    private String orasPlecare;
	@Column
	private String orasSosire;
	@Column
    private String oraPlecare;
	@Column
    private String oraSosire;
	@Column
	private String numeAvion;
	@Column
	private String dataPlecare;
	@Column
    private String numarRuta;
    
    public Zboruri(){
    	
    	
    }
    
	public Zboruri(Integer id, String orasPlecare, String orasSosire, String oraPlecare, String oraSosire,
			String numeAvion, String dataPlecare, String numarRuta) {
		super();
		this.id = id;
		this.orasPlecare = orasPlecare;
		this.orasSosire = orasSosire;
		this.oraPlecare = oraPlecare;
		this.oraSosire = oraSosire;
		this.numeAvion = numeAvion;
		this.dataPlecare = dataPlecare;
		this.numarRuta = numarRuta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrasPlecare() {
		return orasPlecare;
	}

	public void setOrasPlecare(String orasPlecare) {
		this.orasPlecare = orasPlecare;
	}

	public String getOrasSosire() {
		return orasSosire;
	}

	public void setOrasSosire(String orasSosire) {
		this.orasSosire = orasSosire;
	}

	public String getOraPlecare() {
		return oraPlecare;
	}

	public void setOraPlecare(String oraPlecare) {
		this.oraPlecare = oraPlecare;
	}

	public String getOraSosire() {
		return oraSosire;
	}

	public void setOraSosire(String oraSosire) {
		this.oraSosire = oraSosire;
	}

	public String getNumeAvion() {
		return numeAvion;
	}

	public void setNumeAvion(String numeAvion) {
		this.numeAvion = numeAvion;
	}

	public String getDataPlecare() {
		return dataPlecare;
	}

	public void setDataPlecare(String dataPlecare) {
		this.dataPlecare = dataPlecare;
	}

	public String getNumarRuta() {
		return numarRuta;
	}

	public void setNumarRuta(String numarRuta) {
		this.numarRuta = numarRuta;
	}
	
}
