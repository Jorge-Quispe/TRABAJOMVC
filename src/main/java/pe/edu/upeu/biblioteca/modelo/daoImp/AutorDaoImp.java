package pe.edu.upeu.biblioteca.modelo.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.biblioteca.modelo.dao.AutorDao;
@Repository
public class AutorDaoImp implements AutorDao{
@Autowired
private JdbcTemplate jdbctemplate;
@Override
public List<Map<String, Object>> readAll(){
		// TODO Auto-generated method stub
		return jdbctemplate.queryForList("select * from autores");
	}

}
