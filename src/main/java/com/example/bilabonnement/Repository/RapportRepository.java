package com.example.bilabonnement.Repository;

import com.example.bilabonnement.Model.Lejeaftale;
import com.example.bilabonnement.Model.Rapport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RapportRepository {
@Autowired
    JdbcTemplate template;
    public List<Rapport> fetchAllRapport(){
        String sql = "SELECT * FROM rapport";
        RowMapper<Rapport> rowMapper = new BeanPropertyRowMapper<>(Rapport.class);
        return template.query(sql,rowMapper);
    }
    public void addRapport(Rapport r){
        String sql = "INSERT INTO rapport(rapportID, beskrivelse, oprettetDato, stelnummer) VALUES (?,?,?,?)";
        template.update(sql,r.getRapportID(),r.getBeskrivelse(),r.getOprettetDato(),r.getStelnummer());
    }

    public Rapport findRapportByID(int rapportID){
        String sql = "SELECT * FROM rapport WHERE rapportID=?";
        RowMapper<Rapport> rowMapper= new BeanPropertyRowMapper<>(Rapport.class);
        try{
            return template.queryForObject(sql,rowMapper,rapportID);
        } catch (EmptyResultDataAccessException e){
            System.out.println("No rapport found for ID: " + rapportID);
            return null;
        }
    }
    public Boolean deleteRapport(int rapportID){
        String sql = "DELETE FROM rapport WHERE rapportID = ?";
        return template.update(sql, rapportID) > 0;
    }
    public void updateRapport(Rapport r){
        String sql = "UPDATE rapport SET beskrivelse = ?, oprettetDato = ?WHERE rapportID = ?";
        template.update(sql, r.getBeskrivelse(), r.getOprettetDato(), r.getRapportID());
    }



}
