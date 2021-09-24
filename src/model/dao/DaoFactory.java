package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	//factory = fábrica, terá operações estáticas para implementar os DAO
	
//método que retorna um tipo de interface, mas internamente instacia uma implementação, assim o programa
//não conhece a implementação, conhece somente a interface. É também uma forma de injeção de dependência
//sem expor a implementação.
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
