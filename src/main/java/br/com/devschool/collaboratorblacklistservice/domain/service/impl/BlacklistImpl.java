package br.com.devschool.collaboratorblacklistservice.domain.service.impl;


import br.com.devschool.collaboratorblacklistservice.domain.model.Blacklist;
import br.com.devschool.collaboratorblacklistservice.domain.model.BlacklistResponse;
import br.com.devschool.collaboratorblacklistservice.domain.service.BlacklistService;
import br.com.devschool.collaboratorblacklistservice.infrastructure.repository.BlacklistRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BlacklistImpl implements BlacklistService {

    private  final BlacklistRepository blacklistRepository;

    @Override
    public List<Blacklist> getAllblacklisted() {
        return blacklistRepository.findAll();
    }

    @Override
    public BlacklistResponse checkIfBlacklistedCollaboratorByCpf(String cpf) {
       return BlacklistResponse.builder()
               .result(blacklistRepository.findByCpf(cpf).isPresent())
               .build();

    }

    @Override
    public Blacklist createBlacklisted(Blacklist blacklist) {
        Optional<Blacklist> blacklistExists = blacklistRepository.findByCpf(blacklist.getCpf());

        if (blacklistExists.isPresent()) {
            throw new RuntimeException();
        }

        Blacklist newBlacklist = Blacklist.builder()
                .cpf(blacklist.getCpf())
                .createdDate(LocalDateTime.now())
                .build();

        return blacklistRepository.save(newBlacklist);
    }

    @Override
    @Transactional
    public void deleteBlacklistedByCpf(String cpf) {
        blacklistRepository.deleteByCpf(cpf);
    }
}
