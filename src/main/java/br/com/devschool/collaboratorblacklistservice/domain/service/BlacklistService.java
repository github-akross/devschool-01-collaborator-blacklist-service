package br.com.devschool.collaboratorblacklistservice.domain.service;

import br.com.devschool.collaboratorblacklistservice.domain.model.Blacklist;

import java.util.List;

public interface BlacklistService {
    List<Blacklist> getAllblacklisted();

    Blacklist getBlacklistedCollaboratorByCpf(String cpf);

    Blacklist createBlacklisted(Blacklist blacklist);

    void deleteBlacklistedByCpf(String cpf);
}
