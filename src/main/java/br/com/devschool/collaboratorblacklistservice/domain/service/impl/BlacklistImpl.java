package br.com.devschool.collaboratorblacklistservice.domain.service.impl;


import br.com.devschool.collaboratorblacklistservice.domain.model.Blacklist;
import br.com.devschool.collaboratorblacklistservice.domain.service.BlacklistService;
import br.com.devschool.collaboratorblacklistservice.infrastructure.repository.BlacklistRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlacklistImpl implements BlacklistService {

    private  final BlacklistRepository blacklistRepository;

    @Override
    public Blacklist getBlacklistedCollaboratorByCpf(String cpf) {
        return  blacklistRepository.findByCpf(cpf).orElseThrow(RuntimeException::new);
    }
}
