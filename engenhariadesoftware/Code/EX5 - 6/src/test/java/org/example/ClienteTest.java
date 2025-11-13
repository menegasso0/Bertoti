

package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ClienteTest {

    private Cliente cliente;
    private String nome = "João Silva";
    private String email = "joao.silva@email.com";


    @BeforeEach
    void setUp() {
        cliente = new Cliente(nome, email);
    }


    @Test
    void testGetNome() {
        // checa se o nome é o msm do getter
        assertEquals(nome, cliente.getNome(), "O nome do cliente não corresponde ao esperado.");
    }


    @Test
    void testGetEmail() {
        // ve se o email bate
        assertEquals(email, cliente.getEmail(), "O email do cliente não corresponde ao esperado.");
    }
}