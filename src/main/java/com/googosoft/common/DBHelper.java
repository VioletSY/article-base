package com.googosoft.common;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class DBHelper extends JdbcTemplate {

	public DBHelper(DataSource dataSource) {
		super(dataSource);
	}

}
