package br.com.devschool.collaboratorblacklistservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Table(name = "blacklist")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Blacklist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String cpf ;
    private LocalDateTime createdDate;
}
