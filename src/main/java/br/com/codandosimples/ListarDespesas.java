package br.com.codandosimples;

import br.com.codandosimples.dao.DespesaDAO;
import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ListarDespesas {

    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
        List<Despesa> despesas = dao.findAll();
       /* for(Despesa despesa:despesas){
            System.out.println("ID: "+despesa.getId());
            System.out.println("Descricao: "+despesa.getDescricao());
            System.out.println("Valor: "+despesa.getValor());

            System.out.println("=====================================");
        }*/

        /*System.out.println("***********************************");
        Optional<Despesa> despesaOptional = dao.findById(20L);
        despesaOptional.ifPresent(despesa -> {
              System.out.println("ID: "+despesa.getId());
              System.out.println("Descricao: "+despesa.getDescricao());
              System.out.println("Valor: "+despesa.getValor());
        });
        System.out.println("***********************************");*/

       List<Despesa> despesao = dao.findByCategoria(Categoria.ALIMENTACAO);
        for(Despesa despesa:despesao){
            System.out.println("ID: "+despesa.getId());
            System.out.println("Descricao: "+despesa.getDescricao());
            System.out.println("Categoria: "+despesa.getCategoria());
            System.out.println("Valor: "+despesa.getValor());

            System.out.println("=====================================");
        }
        /*DespesaDAO dao = new DespesaDAO();
        Despesa despesa = new Despesa();

        despesa.setDescricao("buenoDias");
        despesa.setCategoria(Categoria.OUTROS);
        despesa.setValor(30);
        despesa.setData(LocalDate.now());

        Despesa despesaInserida = dao.save(despesa);
        System.out.println("Foi inserido o id: " +despesaInserida.getId());*/
      

    }
}
