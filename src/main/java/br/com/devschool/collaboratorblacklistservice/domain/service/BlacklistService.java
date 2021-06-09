package br.com.devschool.collaboratorblacklistservice.domain.service;

import br.com.devschool.collaboratorblacklistservice.domain.model.Blacklist;

public interface BlacklistService {
    Blacklist getBlacklistedCollaboratorByCpf(String cpf);
}
