package entity;

import dto.Dto;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@jakarta.persistence.Entity
@Table(name = "times")
public class Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String estadio;
    private String pais;
    private String liga;
    
    
    


    public Entity(Long id, String nome, String estadio, String pais, String liga) {
		
		this.id = id;
		this.nome = nome;
		this.estadio = estadio;
		this.pais = pais;
		this.liga = liga;
	}
    
    
    public Entity(Dto data) {
    	this.nome = data.nome();
    	this.estadio = data.estadio();
    	this.pais = data.pais();
    	this.liga = data.liga();

    }
    
   

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
