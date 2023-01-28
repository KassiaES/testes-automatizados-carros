package service;

import model.Carro;
import org.junit.Assert;
import org.junit.Test;


/**
 * o JUnit busca por asserts no metodo para validar que o teste passou
 */

public class CarroServiceImplTest {

    @Test
    public void deveAcelerarCorretamente() {

        CarroService carroService = new CarroServiceImpl();

        // Given
        Carro carroTeste01 = new Carro("Azul", "Fiat", "Uno", 2015, 150);
        carroService.ligar(carroTeste01);

        // When
        carroService.acelerar(carroTeste01, 10);

        // Then
        // Assertions
        Assert.assertTrue(carroTeste01.getVelocidadeAtual() == 10);

    }


    @Test
    public void deveLigarCorretamente() {

        CarroService carroService = new CarroServiceImpl();

        // Given
        Carro carro = new Carro("vermelho", "marca", "modelo", 1990, 100);

        // When
        carroService.ligar(carro);

        // Then
        Assert.assertTrue(carro.isLigado());

    }

    @Test
    public void velocidadeNaoDeveSerMenorQueZero() {

        CarroService carroService = new CarroServiceImpl();

        // Given
        Carro carro = new Carro("vermelho", "marca", "modelo", 1990, 100);
        carroService.ligar(carro);
        carroService.acelerar(carro,20);

        // When
        carroService.frear(carro,50);

        // Then
        Assert.assertEquals(0,carro.getVelocidadeAtual());
    }



}
