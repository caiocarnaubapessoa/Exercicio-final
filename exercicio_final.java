public class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia() {}

    public Midia(int c, double p, String n) {
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }

    public String getTipo() {
        return "Midia";
    }

    public String getDetalhes() {
        return "Código: " + codigo + ", Preço: " + preco + ", Nome: " + nome;
    }

    public void printDados() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Detalhes: " + getDetalhes());
    }

    public void inserirDados() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class DVD extends Midia {
    private int nFaixas;

    public DVD() {
        super();
    }

    public DVD(int c, double p, String s, int f) {
        super(c, p, s);
        this.nFaixas = f;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", Número de Faixas: " + nFaixas;
    }

    public void setFaixas(int f) {
        this.nFaixas = f;
    }

    public int getFaixas() {
        return nFaixas;
    }

    
}

public class CD extends Midia {
    private int nMusicas;

    public CD() {
        super();
    }

    public CD(int c, double p, String s, int m) {
        super(c, p, s);
        this.nMusicas = m;
    }

    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", Número de Músicas: " + nMusicas;
    }

    public void setMusicas(int m) {
        this.nMusicas = m;
    }

    public int getMusicas() {
        return nMusicas;
    }

}

public class MainMidia {
    public static void main(String[] args) {
        DVD dvd = new DVD(1, 19.99, "Nome do DVD", 15);
        dvd.printDados();

        CD cd = new CD(2, 14.99, "Nome do CD", 10);
        cd.printDados();
    }
}
