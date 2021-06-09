package br.com.devschool.collaboratorblacklistservice.application.controller;


import br.com.devschool.collaboratorblacklistservice.domain.model.Blacklist;
import br.com.devschool.collaboratorblacklistservice.domain.service.BlacklistService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BlacklistController {
    private  final BlacklistService blacklistService;

    @GetMapping("/blacklist/{cpf}")
    public ResponseEntity<Blacklist> getBlacklistedCollaboratorByCpf(@PathVariable String cpf){
        return ResponseEntity.ok(blacklistService.getBlacklistedCollaboratorByCpf(cpf));
    }

}
