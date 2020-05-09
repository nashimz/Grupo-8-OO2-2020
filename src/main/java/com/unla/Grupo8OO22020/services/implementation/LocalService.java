package com.unla.Grupo8OO22020.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.Grupo8OO22020.entities.Local;
import com.unla.Grupo8OO22020.services.ILocalService;
import com.unla.Grupo8OO22020.repositories.ILocalRepository;
import com.unla.Grupo8OO22020.converters.LocalConverter;
import com.unla.Grupo8OO22020.models.LocalModel;

@Service("localService")
public class LocalService  implements ILocalService{
	@Autowired
	@Qualifier("localRepository")
	private ILocalRepository localRepository;
	
	@Autowired
	@Qualifier("localConverter")
	private LocalConverter localConverter;
	
	@Override
	public List<Local> getAll() {
		return localRepository.findAll();
	}
	
	@Override
	public LocalModel insertOrUpdate(LocalModel localModel) {
		Local local = localRepository.save(localConverter.modelToEntity(localModel));
		return localConverter.entityToModel(local);
	}

	@Override
	public LocalModel findById(int id) {
		return localConverter.entityToModel(localRepository.findById(id));
	}

	@Override
	public boolean remove(int id) {
		try {
			localRepository.deleteById(id);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	

	
}
