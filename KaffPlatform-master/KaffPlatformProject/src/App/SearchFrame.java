package App;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.awt.Color;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Composite;

public class SearchFrame {

	protected Shell shell;
	private Text nkn;
	private Text text_1;
	private Text text_2;
	private Text text_3;

	public static void main(String[] args) {
		try {
			SearchFrame window = new SearchFrame();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	TestConnection test=new TestConnection();
	 ArrayList<BookInformation> results;
	 int numberOfEntries=0;
	 int currentEntrieIndex=0;
	 BookInformation currentEnrty;

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\KaffPlatformheader.jpg"));
		shell.setText("\u0645\u0639\u0644\u0648\u0645\u0627\u062A \u0627\u0644\u0643\u062A\u0627\u0628");
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		shell.setSize(582, 497);
		
		
		Button btnNewButton_3 = new Button(shell, SWT.NONE);
		btnNewButton_3.setBounds(289, 433, 75, 25);
		btnNewButton_3.setText("التالي");
		btnNewButton_3.setEnabled(false);
		
		Button button_1 = new Button(shell, SWT.NONE);
		button_1.setBounds(173, 433, 75, 25);
		button_1.setText("السابق");
		button_1.setEnabled(false);

		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(62, 147, 316, 31);

		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(256, 205, 122, 31);


		Button button = new Button(shell, SWT.NONE);
		button.setToolTipText("رجــوع");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				MainMenuKaff main = new MainMenuKaff();
				shell.close();
				main.open();

			}
		});
		button.setImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\KaffPlatformheader.jpg"));
		button.setBounds(499, 0, 57, 42);

		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		lblNewLabel.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.BOLD));
		lblNewLabel.setBounds(403, 54, 76, 31);
		lblNewLabel.setText("\u0627\u0644\u0628\u062D\u062B");

		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setAlignment(SWT.CENTER);
		lblNewLabel_1.setForeground(SWTResourceManager.getColor(210, 105, 30));
		lblNewLabel_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Arial (Arabic)", 20, SWT.NORMAL));
		lblNewLabel_1.setBounds(110, 99, 322, 42);
		lblNewLabel_1.setText(
				"\u0645\u0639\u0644\u0648\u0645\u0640\u0640\u0640\u0640\u0640\u0627\u062A \u0627\u0644\u0643\u062A\u0627\u0628");

		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		lblNewLabel_2.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		lblNewLabel_2.setBounds(408, 147, 84, 31);
		lblNewLabel_2.setText(":\u0623\u0633\u0645 \u0627\u0644\u0643\u062A\u0627\u0628");

		Label label = new Label(shell, SWT.NONE);
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		label.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		label.setBounds(426, 199, 66, 31);
		label.setText(":\u0627\u0644\u0645\u0633\u062A\u0648\u0649");

		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		label_1.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		label_1.setBounds(449, 252, 43, 31);
		label_1.setText(":\u0627\u0644\u062D\u0627\u0644\u0647");

		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		label_2.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		label_2.setBounds(448, 303, 44, 31);
		label_2.setText(":\u0627\u0644\u0633\u0639\u0631");

		nkn = new Text(shell, SWT.BORDER | SWT.RIGHT);
		nkn.setToolTipText("أدخل أسم الكتاب");

		nkn.setForeground(SWTResourceManager.getColor(169, 169, 169));
		nkn.setBounds(62, 58, 296, 25);

		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.BOLD));
		btnNewButton.setForeground(SWTResourceManager.getColor(255, 255, 255));
		btnNewButton.setBounds(279, 251, 99, 35);
		btnNewButton.setText("\u0645\u062A\u0648\u0641\u0631");

		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		btnNewButton_1.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.BOLD));
		btnNewButton_1.setForeground(SWTResourceManager.getColor(255, 255, 255));
		btnNewButton_1.setBounds(152, 251, 99, 35);
		btnNewButton_1.setText("\u063A\u064A\u0631 \u0645\u062A\u0648\u0641\u0631");

		Label label_3 = new Label(shell, SWT.NONE);
		label_3.setImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\KaffPlatformheaderrr.jpg"));
		label_3.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\KaffPlatformheade.jpeg"));
		label_3.setBounds(0, 0, 566, 48);

		Group group = new Group(shell, SWT.NONE);
		group.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		group.setBounds(136, 363, 242, 52);

		Button btnRadioButton_2 = new Button(group, SWT.RADIO);
		btnRadioButton_2.setBounds(91, 10, 90, 31);
		btnRadioButton_2.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		btnRadioButton_2.setText("\u0645\u062C\u0627\u0646\u0627\u064B");
		btnRadioButton_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		Button btnRadioButton_1 = new Button(group, SWT.RADIO);
		btnRadioButton_1.setBounds(10, 10, 75, 31);

		btnRadioButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnRadioButton_1.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		btnRadioButton_1.setText("\u0644\u0644\u0625\u0639\u0627\u0631\u0647");
		btnRadioButton_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		Button btnRadioButton = new Button(group, SWT.RADIO);
		btnRadioButton.setBounds(167, 10, 65, 31);
		btnRadioButton.setSelection(true);
		btnRadioButton.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		btnRadioButton.setText("\u0644\u0644\u0628\u064A\u0639");
		btnRadioButton.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(246, 309, 132, 31);
		
		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.setBackgroundImage(
				SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\Picture\\search-icon-.png"));
		btnNewButton_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		btnNewButton_2.setImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\Picture\\search-icon-.png"));

		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				// search
				try {
				
					
					results=test.get(nkn.getText());
					numberOfEntries=results.size();
					while (currentEntrieIndex!=0) {
					int index=0;
		
					
						currentEntrieIndex=index;
						currentEnrty=results.get(currentEntrieIndex);
						text_1.setText(currentEnrty.BooksTitle);
						text_2.setText(currentEnrty.price);
						/*if(btnNewButton.getText()==currentEnrty.state)
							btnNewButton.setBackground(SWTResourceManager.getColor(154, 205, 50));
						else if(btnRadioButton_1.getText()==currentEnrty.state)
							btnNewButton.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
						text_3.setText(currentEnrty.price);*/
						
						btnNewButton_3.setEnabled(true);
						button_1.setEnabled(true);
						/*if(btnNewButton_3.getSelection()) {
							index++;
							SearchFrame s=new SearchFrame();
							shell.close();
							s.open();
						}*/
					}
					
					
						
					

					

				} catch (SQLException e1) {
					System.out.println("Error");
					Error error=new Error();
					error.open();
				e1.printStackTrace();
				}
				
				//error				
			}
		});
		btnNewButton_2.setBounds(353, 58, 25, 25);
	}
}
