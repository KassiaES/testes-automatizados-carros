package model;


//Tesla
public class Carro {

        private String  marca;
        private String modelo;
        private String cor;
        private int potencia;
        private boolean isLigado;
        private int velocidadeAtual;
        private int velocidadeMaxima;

    public Carro(String marca, String modelo, String cor, int potencia, int velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.potencia = potencia;
        this.isLigado = false;
        this.velocidadeAtual = 0;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", potencia='" + potencia + '\'' +
                ", isLigado=" + isLigado +
                ", velocidadeAtual=" + velocidadeAtual +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }
}
