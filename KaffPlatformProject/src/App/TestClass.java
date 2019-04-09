package App;

import java.awt.Button;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class TestClass {

	 public static void main(String[] args) {
	 // TODO Auto-generated method stub
	 String Query = "Select * from kaff.admin";
	 String us = "Select fname from kaff.admin where adminID = 1";
	 try {
	 Database.openConnection();
	 ResultSet resultSet = Database.getStatment().executeQuery(us);
	 ResultSetMetaData metaData = resultSet.getMetaData();
	 int num = metaData.getColumnCount();
	
	 for(int i = 1; i < num; i++){
	 System.out.printf("%-8s\t", metaData.getColumnName(i));
	 }
	
	 while(resultSet.next()){
	 System.out.println(resultSet.getObject(1));
	 for(int i = 1; i < num; i++){
	 System.out.printf("%-8s\t", resultSet.getObject(i));
	 }
	 System.out.println();
	 }
	
	 Database.closeConnection();
	
	 } catch (SQLException e) {
	 // TODO Auto-generated catch block
	 System.out.println("Error...");
	 e.printStackTrace();
	 }
	 }

}

