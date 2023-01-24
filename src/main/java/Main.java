import model.Carro;
import  service.CarroService;
import service.CarroServiceImplem;

public class Main {

    public static void  main (String[]args) {

        CarroService carroService = new CarroServiceImplem();

        Carro carro01 = new Carro("Marca01", "Modelo01","Cor01", 10, 100);

        Carro carro02 = new Carro("Marca02", "Modelo02","Cor02", 10, 100);

        Carro carro03 = new Carro("Marca03", "Modelo03","Cor03", 10, 100);

        Carro carro04 = new Carro("Marca04", "Modelo04","Cor04", 10, 100);


    }


    /**
     * Um carro tem os seguintes atributos
     *
     *
     *
     * Enquanto o carro estiver desligado deve ser capaz de:
     * - Ligar
     * - Mostrar estado atual -> toString
     *
     * Enquanto o carro estiver ligado deve ser capaz de:
     * - Desligar -> isLagado = false
     *
     *
     * Só podemos desligar o carro quando elee parar totalmente (velocidadeAtual = 0)
     * - Não existe velocidade negativa
     * - O carro não pode passar de sua velocidade máxima
     *
     */

    // Cenário 1
    // Dado -> Given
    // um carro com potência 10

    // Quando -> When
    // ligar o carro
    // acelerar

    // Então -> Then
    // A velocidade do carro deve ser 10km/h

    // Cenário 2
    // Dado -> Given
    // um carro com potência 10

    // Quando -> When
    // ligar o carro
    // acelerar

    // Então -> Then
    // A velocidade do carro deve ser 10km/h


    // Cenário 3
    // Dado -> Given
    // um carro com potência 10

    // Quando -> When
    // ligar o carro
    // acelerar

    // Então -> Then
    // A velocidade do carro deve ser 10km/h

    /** GIVE | WHEN | THEN
        Dado
        Quando
        Então

        *  Enquanto o carro estiver desligado deve ser capaz de:
        *  - Ligar
        *  - Mostrar estado atual -> toString()
        -----
        * Enquanto o carro estiver ligado deve ser capaz de:
        * - Desligar -> isLigado = false
        * - Acelerar -> setVelocidadeAtual(...)
        * - Frear -> setVelocidadeAtual(...)
        * - Motrar estado atual -> toString()
    */

    // Cenário exemplo - Acelerar
    // Dado: Um carro com potencia 10
    // Quando: ligar o carro |  acelerar o carro
    // Então: a velocidade do carro deve ser 10km/h

    // Cenário #1
    // DADO carro em velocidade máxima igual a 100Km/h
    // QUANDO frear 10x (redução da potência)
    // ENTÃO Parar, Mostrar o estado

    // Cenário #2
    // DADO carro desligado, porém em aceleração 10
    // QUANDO Parar, permanecer parado
    // ENTÃO velocidade deve ser 0

    // Cenário #3
    // DADO o carro em velocidade
    // QUANDO o acelerar  o carro
    // ENTÃO A velocidade deve manter-se em 100km/h

    // Cenário #4
    // DADO carro desligado
    // QUANDO ligar o carro
    // ENTÃO o carro deve ligar e mostrar o estado

    // Cenário #5
    // DADO carro parado em 0km/h
    // QUANDO frear 3 vezes
    // ENTÃO o carro permanece parado,



}
