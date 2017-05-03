package bootsample1.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import bootsample1.dao.TinTucRepository;
import bootsample1.model.TinTuc;

@Service
@Transactional
public class TinTucService {

	private final TinTucRepository tinTucRepositor;

	public TinTucService(TinTucRepository tinTucRepositor) {
		super();
		this.tinTucRepositor = tinTucRepositor;
	}
	public List<TinTuc> findAll(){
		List<TinTuc> tintuc = new ArrayList<TinTuc>();
		for(TinTuc tt: tinTucRepositor.findAll()){
			tintuc.add(tt);
		}
		return tintuc;
	}
	public void save(TinTuc tintuc){
		tinTucRepositor.save(tintuc);
	}
}
