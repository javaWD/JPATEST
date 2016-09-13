package cn.com.esrichina.product;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("productManager")
public class ProductManagerImpl implements ProductManager {

//	private ProductDao productDao = new ProductDaoImpl();
	
	@Resource
	private ProductDao productDao;

	@Transactional
	@Override
	public void save(Product p) {

		productDao.save(p);

	}

}
