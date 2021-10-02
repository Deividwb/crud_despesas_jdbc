package br.com.codandosimples.model;

import br.com.codandosimples.dao.DespesaDAO;

import java.time.LocalDate;
import java.util.Optional;

public class AtualizarDespesa {
    public static void main(String[] args) {
        DespesaDAO dao = new DespesaDAO();
        Optional<Despesa>despesaOptional = dao.findById(5l);

        Despesa despesa = despesaOptional.get();
        System.out.println(despesa.getId());
        System.out.println(despesa.getDescricao());
        System.out.println(despesa.getData());
        System.out.println(despesa.getValor());
        System.out.println(despesa.getCategoria());

        System.out.println("===========UPDATE===========================");

        despesa.setDescricao("DE OLHO");
        despesa.setData(LocalDate.of(2021,06,06));
        despesa.setValor(452);
        despesa.setCategoria(Categoria.ALIMENTACAO);

        System.out.println(despesa.getId());
        System.out.println(despesa.getDescricao());
        System.out.println(despesa.getData());
        System.out.println(despesa.getValor());
        System.out.println(despesa.getCategoria());

        dao.update(despesa);
    }
}
