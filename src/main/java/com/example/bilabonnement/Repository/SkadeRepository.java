package com.example.bilabonnement.Repository;

import com.example.bilabonnement.Model.Skade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SkadeRepository {
    @Autowired
    JdbcTemplate template;
    public List<Skade> fetchAllSkade(){
        String sql ="SELECT * FROM Skade";
        RowMapper<Skade> rowMapper=new BeanPropertyRowMapper<>(Skade.class);
        return template.query(sql,rowMapper);
    }
    public void addSkade(Skade s){
        String sql ="INSERT INTO Skade(skadeID,rapportID,pris) VALUES(?,?,?)";
        template.update(sql,s.getSkadeId(),s.getRapportID(),s.getPris());
    }
    public Skade findSkadeBySkadeId(int skadeID){
        String sql = "SELECT * FROM Skade WHERE skadeID= ?";
        RowMapper<Skade> rowMapper = new BeanPropertyRowMapper<>(Skade.class);
        try {
            return template.queryForObject(sql, rowMapper, skadeID);
        } catch (EmptyResultDataAccessException e){
            System.out.println("No Skade found for ID: " + skadeID);
            return null;
        }
    }





}

