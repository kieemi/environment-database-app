package pl.environmentdatabase.habitatsandspecies.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonManagedReference;

//written based on hibernate-tutorial-05-many-to-many-uni-from-episode-252 project
@Entity
@Table(name = "siedn2k_aft", schema = "habitats_and_species")

public class Habitat {
	@Id
	@Column(name = "id_siedn2k_aft")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	@Column(name = "guid_")
	private String guid;

	// we don't want to delete cascaded entries from other reference table
	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JsonManagedReference
	@JoinColumn(name = "id_sdln2k")
	
	private HabitatFullNameByCode habitatFullNameByCode;

	@Column(name = "kodobsz")
	private String nameOfNatura2000Site;

	@Column(name = "datobs")
	private Date observationDate;

	@Column(name = "dokprz")
	private Float estimatedMappingPrecissionInMeters;

	@Column(name = "zrddan")
	private String TheDataSource;

	@Column(name = "uwg")
	private String comment;

	// TODO dodać enumy z ocenami
	@Column(name = "stnpoprec")
	private String actualAssessmentOfTheHabitatAreaParameterAtTheSite;

	@Column(name = "stnpopref")
	private String referentialAssessmentOfTheHabitatAreaParameterAtTheSite;

	@Column(name = "stnsierec")
	private String actualAssessmentOfTheHabitatStructureAndFunctionsParameterAtTheSite;

	@Column(name = "stnsieref")
	private String referentialAssessmentOfTheHabitatStructureAndFunctionsParameterAtTheSite;

	@Column(name = "perochrec")
	private String actualAssessmentOfTheHabitatProtectionPerspectivesParameterAtTheSite;

	@Column(name = "perochref")
	private String referentialAssessmentOfTheHabitatProtectionPerspectivesParameterAtTheSite;

	@Column(name = "oceogrec")
	private String actualAssessmentOfTheHabitatProtectionStateParameterAtTheSite;

	@Column(name = "oceogref")
	private String referentialAssessmentOfTheHabitatProtectionStateParameterAtTheSite;

	// with lazy loading additional tables will be loaded on demand at later time
	// (232 ep. of course and few more) so i left it this way
	// in master wiew we only want to retrieve only data (233 ep.) for habitat
	// table, then when we click view Detalis, it will show joined tables
	@OneToMany(mappedBy = "habitat", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<HabitatRate> habitatRates;

	@OneToMany(mappedBy = "habitat", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<HabitatExistingThreat> habitatExistingThreats;

	@OneToMany(mappedBy = "habitat", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<HabitatPotentialThreat> habitatPotentialThreats;

	@OneToMany(mappedBy = "habitat", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<HabitatProtectiveAction> habitatProtectiveActions;

	public Habitat() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = "{" + UUID.randomUUID().toString() + "}";
	}

	public HabitatFullNameByCode getHabitatFullNameByCode() {
		return habitatFullNameByCode;
	}

	public void setCode(HabitatFullNameByCode habitatFullNameByCode) {
		this.habitatFullNameByCode = habitatFullNameByCode;
	}

	public String getNameOfNatura2000Site() {
		return nameOfNatura2000Site;
	}

	public void setNameOfNatura2000Site(String nameOfNatura2000Site) {
		this.nameOfNatura2000Site = nameOfNatura2000Site;
	}

	public Date getObservationDate() {
		return observationDate;
	}

	public void setObservationDate(Date observationDate) {
		this.observationDate = observationDate;
	}

	public Float getEstimatedMappingPrecissionInMeters() {
		return estimatedMappingPrecissionInMeters;
	}

	public void setEstimatedMappingPrecissionInMeters(Float estimatedMappingPrecissionInMeters) {
		this.estimatedMappingPrecissionInMeters = estimatedMappingPrecissionInMeters;
	}

	public String getTheDataSource() {
		return TheDataSource;
	}

	public void setTheDataSource(String theDataSource) {
		TheDataSource = theDataSource;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getActualAssessmentOfTheHabitatAreaParameterAtTheSite() {
		return actualAssessmentOfTheHabitatAreaParameterAtTheSite;
	}

	public void setActualAssessmentOfTheHabitatAreaParameterAtTheSite(
			String actualAssessmentOfTheHabitatAreaParameterAtTheSite) {
		this.actualAssessmentOfTheHabitatAreaParameterAtTheSite = actualAssessmentOfTheHabitatAreaParameterAtTheSite;
	}

	public String getReferentialAssessmentOfTheHabitatAreaParameterAtTheSite() {
		return referentialAssessmentOfTheHabitatAreaParameterAtTheSite;
	}

	public void setReferentialAssessmentOfTheHabitatAreaParameterAtTheSite(
			String referentialAssessmentOfTheHabitatAreaParameterAtTheSite) {
		this.referentialAssessmentOfTheHabitatAreaParameterAtTheSite = referentialAssessmentOfTheHabitatAreaParameterAtTheSite;
	}

	public String getActualAssessmentOfTheHabitatStructureAndFunctionsParameterAtTheSite() {
		return actualAssessmentOfTheHabitatStructureAndFunctionsParameterAtTheSite;
	}

	public void setActualAssessmentOfTheHabitatStructureAndFunctionsParameterAtTheSite(
			String actualAssessmentOfTheHabitatStructureAndFunctionsParameterAtTheSite) {
		this.actualAssessmentOfTheHabitatStructureAndFunctionsParameterAtTheSite = actualAssessmentOfTheHabitatStructureAndFunctionsParameterAtTheSite;
	}

	public String getReferentialAssessmentOfTheHabitatStructureAndFunctionsParameterAtTheSite() {
		return referentialAssessmentOfTheHabitatStructureAndFunctionsParameterAtTheSite;
	}

	public void setReferentialAssessmentOfTheHabitatStructureAndFunctionsParameterAtTheSite(
			String referentialAssessmentOfTheHabitatStructureAndFunctionsParameterAtTheSite) {
		this.referentialAssessmentOfTheHabitatStructureAndFunctionsParameterAtTheSite = referentialAssessmentOfTheHabitatStructureAndFunctionsParameterAtTheSite;
	}

	public String getActualAssessmentOfTheHabitatProtectionPerspectivesParameterAtTheSite() {
		return actualAssessmentOfTheHabitatProtectionPerspectivesParameterAtTheSite;
	}

	public void setActualAssessmentOfTheHabitatProtectionPerspectivesParameterAtTheSite(
			String actualAssessmentOfTheHabitatProtectionPerspectivesParameterAtTheSite) {
		this.actualAssessmentOfTheHabitatProtectionPerspectivesParameterAtTheSite = actualAssessmentOfTheHabitatProtectionPerspectivesParameterAtTheSite;
	}

	public String getReferentialAssessmentOfTheHabitatProtectionPerspectivesParameterAtTheSite() {
		return referentialAssessmentOfTheHabitatProtectionPerspectivesParameterAtTheSite;
	}

	public void setReferentialAssessmentOfTheHabitatProtectionPerspectivesParameterAtTheSite(
			String referentialAssessmentOfTheHabitatProtectionPerspectivesParameterAtTheSite) {
		this.referentialAssessmentOfTheHabitatProtectionPerspectivesParameterAtTheSite = referentialAssessmentOfTheHabitatProtectionPerspectivesParameterAtTheSite;
	}

	public String getActualAssessmentOfTheHabitatProtectionStateParameterAtTheSite() {
		return actualAssessmentOfTheHabitatProtectionStateParameterAtTheSite;
	}

	public void setActualAssessmentOfTheHabitatProtectionStateParameterAtTheSite(
			String actualAssessmentOfTheHabitatProtectionStateParameterAtTheSite) {
		this.actualAssessmentOfTheHabitatProtectionStateParameterAtTheSite = actualAssessmentOfTheHabitatProtectionStateParameterAtTheSite;
	}

	public String getReferentialAssessmentOfTheHabitatProtectionStateParameterAtTheSite() {
		return referentialAssessmentOfTheHabitatProtectionStateParameterAtTheSite;
	}

	public void setReferentialAssessmentOfTheHabitatProtectionStateParameterAtTheSite(
			String referentialAssessmentOfTheHabitatProtectionStateParameterAtTheSite) {
		this.referentialAssessmentOfTheHabitatProtectionStateParameterAtTheSite = referentialAssessmentOfTheHabitatProtectionStateParameterAtTheSite;
	}

	public void addHabitatRate(HabitatRate habitatRate) {
		if (habitatRates == null) {
			habitatRates = new ArrayList<>();
		}
		habitatRates.add(habitatRate);
		habitatRate.setHabitat(this);
	}

	public List<HabitatRate> getHabitatRates() {
		return habitatRates;
	}

	public void addHabitatExistingThreat(HabitatExistingThreat habitatExistingThreat) {
		if (habitatExistingThreats == null) {
			habitatExistingThreats = new ArrayList<>();
		}
		habitatExistingThreats.add(habitatExistingThreat);
		habitatExistingThreat.setHabitat(this);
	}

	public List<HabitatExistingThreat> getHabitatExistingThreats() {
		return habitatExistingThreats;
	}

	public void addHabitatPotentialThreat(HabitatPotentialThreat habitatPotentialThreat) {
		if (habitatPotentialThreats == null) {
			habitatPotentialThreats = new ArrayList<>();
		}
		habitatPotentialThreats.add(habitatPotentialThreat);
		habitatPotentialThreat.setHabitat(this);
	}

	public List<HabitatPotentialThreat> getHabitatPotentialThreats() {
		return habitatPotentialThreats;
	}

	public void addHabitatProtectiveAction(HabitatProtectiveAction habitatProtectiveAction) {
		if (habitatProtectiveActions == null) {
			habitatProtectiveActions = new ArrayList<>();
		}
		habitatProtectiveActions.add(habitatProtectiveAction);
		habitatProtectiveAction.setHabitat(this);
	}

	public List<HabitatProtectiveAction> getHabitatProtectiveActions() {
		return habitatProtectiveActions;
	}

	@Override
	public String toString() {
		return "Habitat [guid=" + guid + ", habitatFullNameByCode=" + habitatFullNameByCode + ", nameOfNatura2000Site="
				+ nameOfNatura2000Site + ", observationDate=" + observationDate
				+ ", estimatedMappingPrecissionInMeters=" + estimatedMappingPrecissionInMeters + ", TheDataSource="
				+ TheDataSource + ", comment=" + comment + ", actualAssessmentOfTheHabitatAreaParameterAtTheSite="
				+ actualAssessmentOfTheHabitatAreaParameterAtTheSite
				+ ", referentialAssessmentOfTheHabitatAreaParameterAtTheSite="
				+ referentialAssessmentOfTheHabitatAreaParameterAtTheSite
				+ ", actualAssessmentOfTheHabitatStructureAndFunctionsParameterAtTheSite="
				+ actualAssessmentOfTheHabitatStructureAndFunctionsParameterAtTheSite
				+ ", referentialAssessmentOfTheHabitatStructureAndFunctionsParameterAtTheSite="
				+ referentialAssessmentOfTheHabitatStructureAndFunctionsParameterAtTheSite
				+ ", actualAssessmentOfTheHabitatProtectionPerspectivesParameterAtTheSite="
				+ actualAssessmentOfTheHabitatProtectionPerspectivesParameterAtTheSite
				+ ", referentialAssessmentOfTheHabitatProtectionPerspectivesParameterAtTheSite="
				+ referentialAssessmentOfTheHabitatProtectionPerspectivesParameterAtTheSite
				+ ", actualAssessmentOfTheHabitatProtectionStateParameterAtTheSite="
				+ actualAssessmentOfTheHabitatProtectionStateParameterAtTheSite
				+ ", referentialAssessmentOfTheHabitatProtectionStateParameterAtTheSite="
				+ referentialAssessmentOfTheHabitatProtectionStateParameterAtTheSite + "]";
	}

}
