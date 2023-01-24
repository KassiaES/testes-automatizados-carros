package service;

import model.Carro;

public class CarroServiceImplem implements CarroService {

    @Override
    public void desligar(Carro carro) {
        carro.setLigado(false);

    }

    @Override
    public void ligar(Carro carro) {
        carro.setLigado(true);
    }

    @Override
    public void acelerar(Carro carro, int velocidadeAMais) {
        carro.setVelocidadeAtual(carro.getVelocidadeAtual() + velocidadeAMais);

    }

    @Override
    public void frear(Carro carro, int velocidadeAMenos) {
        carro.setVelocidadeAtual(carro.getVelocidadeAtual() + velocidadeAMenos);

    }

    @Override
    public String mostrarEstado(Carro carro) {
        return carro.toString();
    }
}
