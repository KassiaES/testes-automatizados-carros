package service;

import model.Carro;

public interface CarroService {

    void desligar(Carro carro);
    void ligar(Carro carro);
    void acelerar(Carro carro, int velocidadeAMais);
    void frear (Carro carro, int velocidadeAMenos);
    String mostrarEstado(Carro carro);

}
