package com.example.bilabonnement.Repository;

import com.example.bilabonnement.Model.Lejeaftale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LejeaftaleRepository {
    @Autowired
    JdbcTemplate template;
    public List<Lejeaftale> fetchAllLejeaftale () {
        String sql = "SELECT * FROM lejeaftale";
        RowMapper<Lejeaftale> rowMapper = new BeanPropertyRowMapper<>(Lejeaftale.class);
        return template.query(sql, rowMapper);
    }
    public void addLejeaftale(Lejeaftale l){
        String sql ="INSERT INTO lejeaftale(lejeaftal_id, kunde_nr,stelnummer,start_dato,slut_dato,pris) VALUES(?,?,?,?,?,?) ";
        template.update(sql,l.getLejeaftale_id(),l.getKunde_nr(),l.getStelnummer(),l.getStart_dato(),l.getSlut_dato(),l.getPris());
    }
    public Lejeaftale findLejeaftaleById(int id){
        String sql ="SELECT * FROM lejeaftale WHERE lejeaftal_id =?";
        RowMapper<Lejeaftale>rowMapper=new BeanPropertyRowMapper<>(Lejeaftale.class);
       try {
           return template.queryForObject(sql, rowMapper, id);
       } catch (Exception e){
       return null;
        }
    }
    public Boolean deleteLejeaftale(int id){
        String sql = "DELETE FROM lejeaftale WHERE  lejeaftal_id =?";
        return template.update(sql,id)>0;

    }
    public void updateLejeaftale(Lejeaftale l){
        String sql = "UPDATE lejeaftale SET kunde_nr=?,stelnummer=?, start_dato=?,slut_dato=?,pris=? WHERE lejeaftal_id=? " ;
        template.update(sql,l.getKunde_nr(),l.getStelnummer(),l.getStart_dato(),l.getSlut_dato(),l.getPris(),l.getLejeaftale_id());
    }
}
