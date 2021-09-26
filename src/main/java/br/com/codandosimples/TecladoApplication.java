package br.com.codandosimples;

import br.com.codandosimples.dao.DespesaDAO;
import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

import java.time.LocalDate;
import java.util.Scanner;

public class TecladoApplication {

    private static Object Enum;

    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
        Despesa despesa = new Despesa();
        Scanner scanner = new Scanner(System.in);
        Categoria[] categoria = Categoria.values() ;



        System.out.println("Digite a Descricão do gasto");
       // despesa.setDescricao("conta gasolina");
        despesa.setDescricao(scanner.nextLine());
        System.out.println("Digite 1ALIMENTAÇÃO; 2SAUDE; 3TRANSPORTE; 4MORADIA; 5OUTROS");

        switch (scanner.nextInt()) {
            case 1:
                despesa.setCategoria(Categoria.ALIMENTACAO);
                break;
            case 2:
                despesa.setCategoria(Categoria.SAUDE);
                break;
            case 3:
                despesa.setCategoria(Categoria.TRANSPORTE);
                break;
            case 4:
                despesa.setCategoria(Categoria.MORADIA);
                break;
            default:
                despesa.setCategoria(Categoria.OUTROS);
        }

        System.out.println("Digite o valor");
        despesa.setValor(scanner.nextFloat());
        despesa.setData(LocalDate.now());
        Despesa despesaInserida = dao.save(despesa);
        System.out.println("Foi inserido o id: " +despesaInserida.getId());

        //dao.save(despesa);

    }
}
