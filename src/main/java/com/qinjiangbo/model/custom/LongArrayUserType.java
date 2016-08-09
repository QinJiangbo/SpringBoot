package com.qinjiangbo.model.custom;

import java.io.Serializable;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.usertype.UserType;

public class LongArrayUserType implements UserType{

	protected static final int[] SQL_TYPES = { Types.ARRAY };
	
	@Override
	public Object assemble(Serializable arg0, Object arg1) throws HibernateException {
		return this.deepCopy(arg0);
	}

	@Override
	public Object deepCopy(Object arg0) throws HibernateException {
		return arg0;
	}

	@Override
	public Serializable disassemble(Object arg0) throws HibernateException {
		return (Long[]) this.deepCopy(arg0);
	}

	@Override
	public boolean equals(Object arg0, Object arg1) throws HibernateException {
	    if (arg0 == null) {
	        return arg1 == null;
	    }
	    return arg0.equals(arg1);
	}

	@Override
	public int hashCode(Object arg0) throws HibernateException {
		return arg0.hashCode();
	}

	@Override
	public boolean isMutable() {
		return true;
	}

	@Override
	public Object nullSafeGet(ResultSet resultSet, String[] names, SessionImplementor session, Object owner)
			throws HibernateException, SQLException {
		 if (resultSet.wasNull()) {
		        return null;
		    }
		    if(resultSet.getArray(names[0]) == null){
		        return new Long[0];
		    }

		    Array array = resultSet.getArray(names[0]);
		    Long[] javaArray = (Long[]) array.getArray();
		    return javaArray;
	}

	@Override
	public void nullSafeSet(PreparedStatement statement, Object value, int index, SessionImplementor session)
			throws HibernateException, SQLException {
		Connection connection = statement.getConnection();
	    if (value == null) {
	        statement.setNull(index, SQL_TYPES[0]);
	    } else {
	        Long[] castObject = (Long[]) value;
	        Array array = connection.createArrayOf("Long", castObject);
	        statement.setArray(index, array);
	    }
	}

	@Override
	public Object replace(Object arg0, Object arg1, Object arg2) throws HibernateException {
		return arg0;
	}

	@Override
	public Class<Long[]> returnedClass() {
		return Long[].class;
	}

	@Override
	public int[] sqlTypes() {
		return new int[] { Types.ARRAY };
	}

}
