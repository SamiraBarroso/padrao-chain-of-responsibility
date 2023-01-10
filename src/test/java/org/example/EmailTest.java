package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    GerenciadorTecnico gerenciadorTecnico;
    GerenciadorComercial gerenciadorComercial;

    @BeforeEach
    void setUp() {
        gerenciadorTecnico = new GerenciadorTecnico(gerenciadorComercial);
        gerenciadorComercial = new GerenciadorComercial(null);
    }

    @Test
    void deveRetornarEnvioEmailDepTecnico() {
        assertEquals("Enviado para departamento técnico.", gerenciadorTecnico.redirecionar(new Email(TipoEmailTecnico.getTipoEmailTecnico())));
    }
    @Test
    void deveRetornarEnvioEmailDepComercial() {
        assertEquals("Enviado para departamento comercial.", gerenciadorComercial.redirecionar(new Email(TipoEmailComercial.getTipoEmailComercial())));
    }
    @Test
    void deveRetornarSemVerificacoes() {
        assertEquals("Sem redirecionamento", gerenciadorTecnico.redirecionar(new Email(TipoEmailSpam.getTipoEmailSpam())));
    }




}