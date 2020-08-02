package pl.environmentdatabase.habitatsandspecies.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "siedn2kzagr_pot", schema = "habitats_and_species")
public class HabitatPotentialThreat {

	@Id
	@Column(name = "id_siedn2kzagr_pot")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JsonBackReference
	@JoinColumn(name="id_siedn2k_aft")
	private Habitat habitat;
	
	@Column(name = "zagpot")
	private String potentialThreatCode;
		
	@Column(name = "zagpotops")
	private String potentialThreatDescription;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Habitat getHabitat() {
		return habitat;
	}

	public void setHabitat(Habitat habitat) {
		this.habitat = habitat;
	}

	public String getPotentialThreatCode() {
		return potentialThreatCode;
	}

	public void setPotentialThreatCode(String potentialThreatCode) {
		this.potentialThreatCode = potentialThreatCode;
	}

	public String getPotentialThreatDescription() {
		return potentialThreatDescription;
	}

	public void setPotentialThreatDescription(String potentialThreatDescription) {
		this.potentialThreatDescription = potentialThreatDescription;
	}

	@Override
	public String toString() {
		return "HabitatPotentialThreat [id=" + id + ", habitat=" + habitat + ", potentialThreatCode="
				+ potentialThreatCode + ", potentialThreatDescription=" + potentialThreatDescription + "]";
	}
	
	
}
