package br.com.devschool.collaboratorblacklistservice.infrastructure.repository;

import br.com.devschool.collaboratorblacklistservice.domain.model.Blacklist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BlacklistRepository extends JpaRepository<Blacklist , Long> {
    Optional<Blacklist> findByCpf(String cpf);
}
