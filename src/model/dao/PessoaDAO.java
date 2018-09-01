/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Pessoa;

/**
 *
 * @author alan
 */
public class PessoaDAO {

    public void create(Pessoa p) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("insert into Pessoa (Nome, CPF, RG, Telefone, Email, Endereco, DataDeNascimento, Ativo) values (?,?,?,?,?,?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCpf());
            stmt.setString(3, p.getRg());
            stmt.setString(4, p.getTelefone());
            stmt.setString(5, p.getEmail());
            stmt.setString(6, p.getEndereco());
            stmt.setString(7, p.getDataDeNascimento());
            stmt.setBoolean(8, p.isAtivo());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

}
