package pl.environmentdatabase.habitatsandspecies.repository;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.datatables.repository.DataTablesRepositoryFactoryBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import pl.environmentdatabase.habitatsandspecies.entity.Habitat;

@Repository("habitatRepository")
@EnableJpaRepositories(repositoryFactoryBeanClass = DataTablesRepositoryFactoryBean.class)
public interface HabitatRepository extends DataTablesRepository<Habitat, Integer>  {
	

}
