package pl.bazadanychprzyrodniczych.kartowaniesiedlisk.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//written based on hibernate-tutorial-05-many-to-many-uni-from-episode-252 project

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "sdln2k", schema = "habitats_and_species")
public class HabitatFullNameByCode {

	@Id
	@Column(name = "id_sdln2k")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="kod")
	private String code;
	
	@Column(name = "nazwa")
	private String habitatFullName;
	
	@OneToMany(mappedBy = "habitatFullNameByCode", fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JsonBackReference
	private List<Habitat> habitats;
	
	
	public HabitatFullNameByCode() {
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getHabitatFullName() {
		return habitatFullName;
	}


	public void setHabitatFullName(String habitatFullName) {
		this.habitatFullName = habitatFullName;
	}


	public List<Habitat> getHabitats() {
		return habitats;
	}


	public void setHabitats(List<Habitat> habitats) {
		this.habitats = habitats;
	}


	@Override
	public String toString() {
		return "HabitatFullNameByCode [id=" + id + ", Code=" + code + ", habitatFullName=" + habitatFullName
				+ ", habitats=" + habitats + "]";
	}

	

}
