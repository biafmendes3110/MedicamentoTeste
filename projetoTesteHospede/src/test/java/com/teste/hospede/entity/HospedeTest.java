package com.teste.hospede.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HospedeTest {
 
	private Hospede hospede;
	@BeforeEach
	void setUp() {
	hospede = new Hospede (1L, "Beatriz Ferreira", "beatriz@gmail.com", "(15)3736223652");
	}
	@Test
	@DisplayName ("Testando o id")
	void testId() {
	hospede.setId(2L);
	//Assert
	assertEquals(2L,hospede.getId());
	}

	@Test
	@DisplayName ("Testando o nome")
	void testNome() {
	hospede.setNome("Kaiky morelli");
	//Assert
	assertEquals("Kaiky morelli",hospede.getNome());
	}
	@Test
	@DisplayName ("Testando o email")
	void testEmail() {
	hospede.setEmail("morelli@gmail.com");
	//Assert
	assertEquals("morelli@gmail.com",hospede.getEmail());
	}
	@Test
	@DisplayName ("Testando o telefone")
	void testTelefone() {
	hospede.setTelefone("(15)3736223652");
	//Assert
	assertEquals("(15)3736223652",hospede.getTelefone());
	}
	@Test
	@DisplayName ("Testando o construtor")
	void testConstrutorAll () {
	Hospede novoHospede = new Hospede (3L, "Gustavo morelli", "gustavo@gmail.com", "(15)3736226203");
	assertAll("novoHospede",
	()-> assertEquals(3L, novoHospede.getId()),
	()-> assertEquals("Gustavo morelli", novoHospede.getNome()),
	()-> assertEquals("gustavo@gmail.com", novoHospede.getEmail()),
	()-> assertEquals( "(15)3736226203", novoHospede.getTelefone()));
	}

}
