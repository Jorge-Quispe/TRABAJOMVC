package pe.edu.upeu.biblioteca.modelo.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.biblioteca.modelo.dao.AutorDao;
import pe.edu.upeu.biblioteca.modelo.service.AutorService;
@Service
public class AutorServiceImp implements AutorService {
@Autowired
private AutorDao autorDao;
	@Override
	public List<Map<String,Object>> readAll() {
		// TODO Auto-generated method stub
		return autorDao.readAll();
	}

}
