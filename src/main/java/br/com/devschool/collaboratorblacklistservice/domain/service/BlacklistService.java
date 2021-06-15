package br.com.devschool.collaboratorblacklistservice.domain.service;

import br.com.devschool.collaboratorblacklistservice.domain.model.Blacklist;
import br.com.devschool.collaboratorblacklistservice.domain.model.BlacklistResponse;

import java.util.List;

public interface BlacklistService {
    List<Blacklist> getAllblacklisted();

    BlacklistResponse checkIfBlacklistedCollaboratorByCpf(String cpf);

    Blacklist createBlacklisted(Blacklist blacklist);

    void deleteBlacklistedByCpf(String cpf);
}
