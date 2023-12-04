public class Veiculo {
    private String modelo;
    private double preco;

    public Veiculo(String name, double preco) {
        this.modelo = name;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void printDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: " + preco);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

public class Carro extends Veiculo {
    private double km;

    public Carro(String n, double p, double k) {
        super(n, p);
        this.km = k;
    }

    @Override
    public void printDados() {
        super.printDados();
        System.out.println("Kilometragem: " + km);
    }

    public void setKm(double k) {
        this.km = k;
    }

    public double getKm() {
        return km;
    }

}

public class Moto extends Veiculo {
    private int ano;

    public Moto(String n, double p, int a) {
        super(n, p);
        this.ano = a;
    }

    @Override
    public void printDados() {
        super.printDados();
        System.out.println("Ano: " + ano);
    }

    public void setAno(int a) {
        this.ano = a;
    }

    public int getAno() {
        return ano;
    }

}

public class MainVeiculo {
    public static void main(String[] args) {
        Carro carro = new Carro("ModeloCarro", 25000.0, 98000);
        carro.printDados();

        Moto moto = new Moto("ModeloMoto", 12000.0, 2010);
        moto.printDados();
    }
}
