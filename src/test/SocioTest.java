package test;

import org.junit.Before;
import org.junit.Test;
import persistence.Socio;

import static org.junit.Assert.assertEquals;

public class SocioTest {
    private Socio socio;

    @Before
    public void setUp() throws Exception {
        socio = new Socio("Guilherme", "72530172531", 18, "M", 000);
    }

    @Test
    public void testaGetNome() {
        String nome = socio.getNome();
        assertEquals(nome, socio.getNome());
    }

    @Test
    public void testaSetNome() {
        socio.setNome("Jonas");
        String nome = socio.getNome();
        assertEquals(nome, socio.getNome());
    }

    @Test
    public void testaGetCPF() {
        String cpf = socio.getCpf();
        assertEquals(cpf, socio.getCpf());
    }

    @Test
    public void testaSetCPF() {
        socio.setCpf("12345");
        String cpf = socio.getCpf();
        assertEquals(cpf, socio.getCpf());
    }

    @Test
    public void testaGetIdade() {
        int idade = socio.getIdade();
        assertEquals(idade, socio.getIdade());
    }

    @Test
    public void testaSetIdade() {
        socio.setIdade(35);
        int idade = socio.getIdade();
        assertEquals(idade, socio.getIdade());
    }

    @Test
    public void testaGetGenero() {
        String genero = socio.getGenero();
        assertEquals(genero, socio.getGenero());
    }

    @Test
    public void testaSetGenero() {
        socio.setGenero("F");
        String genero = socio.getGenero();
        assertEquals(genero, socio.getGenero());
    }

    @Test
    public void testaGetCodSocio() {
        int cod = socio.getCodSocio();
        assertEquals(cod, socio.getCodSocio());
    }

    @Test
    public void testaSetCodSocio() {
        socio.setCodSocio(172);
        int cod = socio.getCodSocio();
        assertEquals(cod, socio.getCodSocio());
    }

    @Test
    public void testaToString() {
        String msg = socio.toString();
        assertEquals(msg, socio.toString());
    }

}
