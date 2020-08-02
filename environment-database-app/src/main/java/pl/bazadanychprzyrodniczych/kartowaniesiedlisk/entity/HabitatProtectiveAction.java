package pl.bazadanychprzyrodniczych.kartowaniesiedlisk.entity;

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
@Table(name = "siedn2kdziaochr", schema = "habitats_and_species")
public class HabitatProtectiveAction {
	@Id
	@Column(name = "id_siedn2kdziaochr")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JoinColumn(name="id_siedn2k_aft")
	@JsonBackReference
	private Habitat habitat;
	
	@Column(name = "dziaochr")
	private String nameOfTheAction;
	
	@Column(name = "podmiot")
	private String institutionResponsibleForAction;
	
	@Column(name = "termin")
	private String realizationTime;

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

	public String getNameOfTheAction() {
		return nameOfTheAction;
	}

	public void setNameOfTheAction(String nameOfTheAction) {
		this.nameOfTheAction = nameOfTheAction;
	}

	public String getInstitutionResponsibleForAction() {
		return institutionResponsibleForAction;
	}

	public void setInstitutionResponsibleForAction(String institutionResponsibleForAction) {
		this.institutionResponsibleForAction = institutionResponsibleForAction;
	}

	public String getRealizationTime() {
		return realizationTime;
	}

	public void setRealizationTime(String realizationTime) {
		this.realizationTime = realizationTime;
	}

	@Override
	public String toString() {
		return "HabitatProtectiveAction [id=" + id + ", habitat=" + habitat + ", nameOfTheAction=" + nameOfTheAction
				+ ", institutionResponsibleForAction=" + institutionResponsibleForAction + ", realizationTime="
				+ realizationTime + "]";
	}
	
	
}
