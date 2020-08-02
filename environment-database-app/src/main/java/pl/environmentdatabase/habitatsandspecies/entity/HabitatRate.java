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
@Table(name = "siedn2kwsk", schema = "habitats_and_species")
public class HabitatRate {

	@Id
	@Column(name = "id_siedn2kwsk")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JsonBackReference
	@JoinColumn(name="id_siedn2k_aft")
	private Habitat habitat;
	
	@Column(name = "wsknazw")
	private String nameOfRate;
	
	@Column(name = "wskocepop")
	private String previousAssessmentBasedOnAvailableSources;

	@Column(name = "wskoceobe")
	private String presentAssessmentAtTheSite;

	@Column(name = "wskoceref")
	private String referentialAssessment;

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

	public String getNameOfRate() {
		return nameOfRate;
	}

	public void setNameOfRate(String nameOfRate) {
		this.nameOfRate = nameOfRate;
	}

	public String getPreviousAssessmentBasedOnAvailableSources() {
		return previousAssessmentBasedOnAvailableSources;
	}

	public void setPreviousAssessmentBasedOnAvailableSources(String previousAssessmentBasedOnAvailableSources) {
		this.previousAssessmentBasedOnAvailableSources = previousAssessmentBasedOnAvailableSources;
	}

	public String getPresentAssessmentAtTheSite() {
		return presentAssessmentAtTheSite;
	}

	public void setPresentAssessmentAtTheSite(String presentAssessmentAtTheSite) {
		this.presentAssessmentAtTheSite = presentAssessmentAtTheSite;
	}

	public String getReferentialAssessment() {
		return referentialAssessment;
	}

	public void setReferentialAssessment(String referentialAssessment) {
		this.referentialAssessment = referentialAssessment;
	}

	@Override
	public String toString() {
		return "HabitatRate [id=" + id + ", habitat=" + habitat + ", nameOfRate=" + nameOfRate
				+ ", previousAssessmentBasedOnAvailableSources=" + previousAssessmentBasedOnAvailableSources
				+ ", presentAssessmentAtTheSite=" + presentAssessmentAtTheSite + ", referentialAssessment="
				+ referentialAssessment + "]";
	}
	
	
}
