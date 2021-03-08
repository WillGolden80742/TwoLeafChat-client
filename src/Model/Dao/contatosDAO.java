/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Dao;

import ConnectionFactory.ConnectionFactory;
import Model.Bean.Contato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author William
 */
public class contatosDAO {
    
    public List<Contato> read() {
        
        Connection con = ConnectionFactory.getConnection();

        PreparedStatement stmt;
        ResultSet rs;
        List<Contato> Contatos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("call contatos(1)");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Contato c = new Contato();
                c.setId(rs.getInt("idContato"));
                c.setNome(rs.getString("contato"));
                c.setUltimaMsg(rs.getString("Messages"));
                c.setData(rs.getString("Data"));
                Contatos.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(contatosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Contatos;
    }
}
