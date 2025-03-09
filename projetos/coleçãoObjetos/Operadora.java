package projetos.coleçãoObjetos;

import projetos.associação.Plano;

public class Operadora {
    private String nome;
    private Plano planos[];
    private int proximoElemento;

    public Operadora (String nome) {
        planos = new Plano[10];
        proximoElemento = 0;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }   

    public void adicionarPlano(Plano plano) {
        if (proximoElemento < planos.length) {
            planos[proximoElemento] = plano;
            proximoElemento++;
        } else {
            System.out.println("Não é possível adicionar mais planos.");
        }
    }

    public Plano[] getPlanos() {
        return planos;
    }
}
