package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("=== TESTE 1: seller findById ===");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\n=== TESTE 2: seller findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);

		}
	}

}
