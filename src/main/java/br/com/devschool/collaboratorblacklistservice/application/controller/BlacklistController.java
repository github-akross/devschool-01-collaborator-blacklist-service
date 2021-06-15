package br.com.devschool.collaboratorblacklistservice.application.controller;


import br.com.devschool.collaboratorblacklistservice.domain.model.Blacklist;
import br.com.devschool.collaboratorblacklistservice.domain.model.BlacklistResponse;
import br.com.devschool.collaboratorblacklistservice.domain.service.BlacklistService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BlacklistController {
    private  final BlacklistService blacklistService;

    // list blacklist
    @GetMapping("/blacklist")
    public ResponseEntity<List<Blacklist>> getAllBlacklisted() {
        return ResponseEntity.ok(blacklistService.getAllblacklisted());
    }

    // show blacklist by cpf
    @GetMapping("/blacklist/{cpf}")
    public ResponseEntity<BlacklistResponse> checkIfBlacklistedCollaboratorByCpf(@PathVariable String cpf){
        return ResponseEntity.ok(blacklistService.checkIfBlacklistedCollaboratorByCpf(cpf));
    }

    // create blacklist
    @PostMapping("/blacklist")
    public ResponseEntity<Blacklist> createBlacklisted(@RequestBody Blacklist blacklist) {
        return ResponseEntity.ok(blacklistService.createBlacklisted(blacklist));
    }

    //  delete blacklist
    @DeleteMapping("/blacklist/{cpf}")
    public ResponseEntity deleteCollaboratorByCpf(@PathVariable String cpf) {
        blacklistService.deleteBlacklistedByCpf(cpf);
        return ResponseEntity.ok().build();
    }
}
