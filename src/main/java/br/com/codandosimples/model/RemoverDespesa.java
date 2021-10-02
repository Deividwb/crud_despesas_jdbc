package br.com.codandosimples.model;

import br.com.codandosimples.dao.DespesaDAO;

public class RemoverDespesa {
    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
        dao.delete(48l);
    }
}
