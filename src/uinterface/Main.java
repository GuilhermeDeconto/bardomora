package uinterface;

import business.Bar;
import persistence.Cliente;
import persistence.Socio;

public class Main {

    public static void main(String[] args){
        Cliente c1 = new Cliente("Vitor Luiz", "98261823713", 22, "M");
        Cliente c2 = new Cliente("Alicia", "42365375458", 25, "F");
        Cliente c5 = new Cliente("Yuri","16786254901",30,"M");
        Cliente c3 = new Socio("Debora", "13245982712", 18, "F", 001);
        Cliente c4 = new Socio("Guilherme", "72530172531", 18, "M", 000);
        Cliente c6 = new Cliente("Joao","15627314614",69,"M");
        Bar mora = new Bar();

        mora.entrada(c1);
        mora.entrada(c2);
        mora.entrada(c3);
        mora.entrada(c4);
        mora.entrada(c5);
        mora.entrada(c6);

        System.out.println("quantidade de clientes: "+ mora.publico());
        System.out.println("quantidade de clientes socios: "+mora.publicoSocio());
        System.out.println("quantidade de clientes homens: "+ mora.publicoMasculino());
        System.out.println("quantidade de clientes mulheres: "+ mora.publicoFeminino());
        System.out.println("percentual de homens no estabelecimento: "+mora.percentHomens());
        System.out.println("percentual de mulheres no estabelecimento: "+ mora.percentMulheres());
        System.out.println("percentual de publico normal no estabelecimento: "+mora.percentNormal());
        System.out.println("percentual de socios no estabelecimento: "+ mora.percentSocios());

        System.out.println(mora.getClientePorCPF("98261823713"));
    }
}