package br.com.isaac.crudserie.repository;

import br.com.isaac.crudserie.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Long> {


}
