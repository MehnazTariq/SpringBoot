
package com.tutorialspoint.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;


class EmployeePreparedStatementCallback implements PreparedStatementCallback<Object> {
	
	@Override  
	public Object doInPreparedStatement(PreparedStatement preparedStatement)
			throws SQLException, DataAccessException {
//		int rs = preparedStatement.execute();
//		Employee emp = new Employee();
//		while (rs.next()) {
//			emp.setId(rs.getInt("id"));
//			emp.setName(rs.getString("name"));
//			emp.setSalary(rs.getLong("salary"));
//		}
//		rs.close();
//		return rs;
		return preparedStatement.executeUpdate();
	}

}
