package com.tutorialspoint.jdbc;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import java.util.*;

import javax.sql.DataSource;

public class EmployeeDAO {

	private DataSource dataSource;
	private NamedParameterJdbcTemplate template;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.template = new NamedParameterJdbcTemplate(dataSource);
	}

	public void save(Employee emp) {
		String query = "insert into employee (name, salary) values (:name,:salary)";

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", emp.getName());
		map.put("salary", emp.getSalary());

		// The callback action can return a result object,
		// for example a domain object or a collection of domain objects.

		template.execute(query, map, new EmployeePreparedStatementCallback());
	}
}
