package com.todo.todoList.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
/*



 */
@Data
@Entity
@Table(name="Evento")
@NoArgsConstructor
@AllArgsConstructor
public class Evento {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "empresa_evento")
    private Empresa empresa_evento;

    @Column(name = "dt_competencia")
    private Date dataCompetencia;

    @Column(name = "cd_evento")
    private String cdEvento;

    @Column(name = "editado")
    private boolean editado;

    @Column(name = "status")
    private String status;

    @Column(name = "dt_envio")
    private Date dataEnvio;

    @Column(name = "cd_proc_emi")
    private String proc_emi; // Substitua 'int' pela tipagem apropriada

    @Column(name = "cd_insc")
    private String cd_insc; // Substitua 'int' pela tipagem apropriada

    @Column(name = "dt_ini_val_inf")
    private Date dt_ini_val_inf;

    @Column(name = "dt_fim_val_inf")
    private Date dt_fim_val_inf;

    @Column(name = "cd_class_trib")
    private String cd_class_trib;

    @Column(name = "cd_ind_escrituracao")
    private int cd_ind_escrituracao;

    @Column(name = "cd_ind_desoneracao")
    private int cd_ind_desoneracao;

    @Column(name = "cd_acordo_isen_multa")
    private int cd_acordo_isen_multa;

    @Column(name = "ds_nm_ctt")
    private String cd_cpf_ctt; // Substitua 'int' pela tipagem apropriada

    @Column(name = "cd_fone_fixo")
    private String cd_fone_fixo; // Substitua 'int' pela tipagem apropriada

    @Column(name = "cd_fone_cel")
    private String cd_fone_cel; // Substitua 'int' pela tipagem apropriada

    @Column(name = "ds_email")
    private String ds_email; // Substitua 'int' pela tipagem apropriada

    @Column(name = "sn_ide_efr")
    private int sn_ide_efr;

    @Column(name = "ds_cnpj_efr")
    private String ds_cnpj_efr; // Substitua 'int' pela tipagem apropriada

    @Column(name = "tp_status_registro")
    private int tp_status_registro;

    @Column(name = "cd_ind_uniao")
    private int cd_ind_uniao;

    @Column(name = "dt_transf_fins_lucr")
    private int dt_transf_fins_lucr;
}
