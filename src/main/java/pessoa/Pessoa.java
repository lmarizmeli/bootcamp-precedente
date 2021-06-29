package pessoa;

import precedente.Precedente;
import utils.SortUtil;

public class Pessoa implements Precedente<Pessoa> {
    String nome;
    String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public int precedeA(Pessoa pessoa) {
        return this.cpf.compareToIgnoreCase(pessoa.cpf);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Pessoa[] pessoas = {new Pessoa("aaaaaaa", "1"), new Pessoa("bbbbbb", "3"), new Pessoa("aaaaaaa", "2")};

        SortUtil.sort(pessoas);

        for (Pessoa p : pessoas
        ) {
            System.out.println(p);
        }
    }
}
