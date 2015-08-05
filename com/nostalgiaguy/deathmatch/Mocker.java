package com.nostalgiaguy.deathmatch;

import java.sql.SQLException;

public class Mocker<T extends Exception> {
	
	private void pleaseThrow(final Exception t) throws T
	{
		throw(T) t;
	}
	
	public static void main(final String[] args){
	//	try{
			new Mocker<RuntimeException>().pleaseThrow(new SQLException());
	//	}
		
		/*catch(final SQLException ex){
			ex.printStackTrace();
		}*/
	}

}
