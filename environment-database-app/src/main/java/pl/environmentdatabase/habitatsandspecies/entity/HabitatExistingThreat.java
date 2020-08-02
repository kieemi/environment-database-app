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
@Table(name = "siedn2kzagr_ist", schema = "habitats_and_species")
public class HabitatExistingThreat {

	@Id
	@Column(name = "id_siedn2kzagr_ist")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JsonBackReference
	@JoinColumn(name="id_siedn2k_aft")
	private Habitat habitat;
	
	@Column(name = "zagist")
	private String existingThreatCode;
		
	@Column(name = "zagistops")
	private String existingThreatDescription;

	
	public HabitatExistingThreat() {
	}

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

	public String getExistingThreatCode() {
		return existingThreatCode;
	}

	public void setExistingThreatCode(String existingThreatCode) {
		this.existingThreatCode = existingThreatCode;
	}

	public String getExistingThreatDescription() {
		return existingThreatDescription;
	}

	public void setExistingThreatDescription(String existingThreatDescription) {
		this.existingThreatDescription = existingThreatDescription;
	}

	@Override
	public String toString() {
		return "HabitatExistingThreat [id=" + id + ", habitat=" + habitat + ", existingThreatCode=" + existingThreatCode
				+ ", existingThreatDescription=" + existingThreatDescription + "]";
	}
	
	
	
}
