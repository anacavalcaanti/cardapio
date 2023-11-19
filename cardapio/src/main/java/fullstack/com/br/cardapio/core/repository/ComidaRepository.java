package fullstack.com.br.cardapio.core.repository;

import fullstack.com.br.cardapio.adapter.entity.Comidas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComidaRepository extends JpaRepository<Comidas, Long> {
}
