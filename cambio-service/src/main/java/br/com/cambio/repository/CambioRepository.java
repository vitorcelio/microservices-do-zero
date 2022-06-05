package br.com.cambio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cambio.model.Cambio;

@Repository
public interface CambioRepository extends JpaRepository<Cambio, Long>{
	Cambio findByDeAndPara(String de, String para);
}
