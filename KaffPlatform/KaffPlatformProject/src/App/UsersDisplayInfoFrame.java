package App;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.CoolBar;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class UsersDisplayInfoFrame {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Table table;

	public static void main(String[] args) {
		try {
			UsersDisplayInfoFrame window = new UsersDisplayInfoFrame();
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

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shell.setBackgroundImage(null);
		// shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shell.setImage(SWTResourceManager
				.getImage("C:\\Users\\Admin\\git\\KaffPlatform\\KaffPlatformProject\\img\\منصة كاف.jpg"));
		shell.setSize(1128, 636);
		shell.setText("عرض  معلومات المستخدمين");
		shell.setLayout(new FormLayout());

		Label headerLabel = new Label(shell, SWT.NONE);
		FormData fd_headerLabel = new FormData();
		fd_headerLabel.right = new FormAttachment(0, 1106);
		fd_headerLabel.top = new FormAttachment(0);
		fd_headerLabel.left = new FormAttachment(0);
		headerLabel.setLayoutData(fd_headerLabel);
		headerLabel.setImage(SWTResourceManager.getImage(
				"C:\\Users\\Admin\\eclipse-workspace\\clone\\KaffPlatform\\KaffPlatformProject\\img\\KaffPlatformheader.jpg"));
		headerLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		Label usersInfoLabel = new Label(shell, SWT.NONE);
		FormData fd_usersInfoLabel = new FormData();
		fd_usersInfoLabel.top = new FormAttachment(headerLabel, 40);
		fd_usersInfoLabel.left = new FormAttachment(0, 214);
		fd_usersInfoLabel.right = new FormAttachment(0, 508);
		usersInfoLabel.setLayoutData(fd_usersInfoLabel);
		usersInfoLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		usersInfoLabel.setFont(SWTResourceManager.getFont("B Badr", 14, SWT.NORMAL));
		usersInfoLabel.setForeground(SWTResourceManager.getColor(210, 105, 30));
		usersInfoLabel.setAlignment(SWT.CENTER);
		usersInfoLabel.setText("عرض معلومات المستخدمين");

		Button button = new Button(shell, SWT.NONE);
		FormData fd_button = new FormData();
		fd_button.bottom = new FormAttachment(0, 82);
		fd_button.right = new FormAttachment(0, 75);
		fd_button.top = new FormAttachment(0, 56);
		fd_button.left = new FormAttachment(0, 10);
		button.setLayoutData(fd_button);
		button.setFont(SWTResourceManager.getFont("B Badr", 9, SWT.NORMAL));
		button.setText("\u0631\u062C\u0648\u0639");

		ViewForm viewForm = new ViewForm(shell, SWT.NONE);
		fd_usersInfoLabel.bottom = new FormAttachment(viewForm, -89);
		FormData fd_viewForm = new FormData();
		fd_viewForm.bottom = new FormAttachment(0, 547);
		fd_viewForm.right = new FormAttachment(0, 687);
		fd_viewForm.top = new FormAttachment(0, 217);
		fd_viewForm.left = new FormAttachment(0, 33);
		viewForm.setLayoutData(fd_viewForm);

		String Query = "select userID,fname,phone,userLevel,email from kaff.user";
		table = new Table(viewForm, SWT.BORDER | SWT.FULL_SELECTION);

		TableColumn column1 = new TableColumn(table, SWT.RIGHT);
		TableColumn column2 = new TableColumn(table, SWT.RIGHT);
		TableColumn column3 = new TableColumn(table, SWT.RIGHT);
		TableColumn column4 = new TableColumn(table, SWT.RIGHT);
		TableColumn column5 = new TableColumn(table, SWT.RIGHT);

		column1.setText("الرقم الأكاديمي");
		column2.setText("الاسم");
		column3.setText("رقم الهاتف");
		column4.setText("المستوى");
		column5.setText("البريد الإلكتروني");

		column1.setWidth(140);
		column2.setWidth(140);
		column3.setWidth(110);
		column4.setWidth(80);
		column5.setWidth(170);

//		TableItem item1 = new TableItem(table, SWT.NONE);
	//	item1.setText(new String[] { "2170008191", "مريم", "05522334444", "6", "meme@g.com" });
		//TableItem item2 = new TableItem(table, SWT.NONE);
//		item2.setText(new String[] { "2170008191", "مريم", "05522334444", "6", "meme@g.com" });
	//	TableItem item3 = new TableItem(table, SWT.NONE);
		//item3.setText(new String[] { "2170008191", "مريم", "05522334444", "6", "meme@g.com" });
//		TableItem item4 = new TableItem(table, SWT.NONE);
	//	item4.setText(new String[] { "2170008191", "مريم", "05522334444", "6", "meme@g.com" });

		viewForm.setContent(table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		table.addListener(SWT.SetData, new Listener() {
			public void handleEvent(Event event) {
				try {
					Database.openConnection();
					ResultSet RS = Database.getStatment().executeQuery(Query);
					TableItem item;

					// Create a new TableItem for each entry in the result set (each row)
					item = new TableItem(table, SWT.NONE);

					while (RS.next()) {
						System.out.println("test");
						item.setText(new String[] { RS.getString(1), RS.getString(2), RS.getString(5), RS.getString(6),
								RS.getString(7) });
					}

					Database.closeConnection();

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				try {
					String sql = "SELECT userID,fname,phone,userLevel,email from kaff.user";
					Database.openConnection();
					ResultSet rs = Database.getStatment().executeQuery(sql);

					if (rs.next()) {
						String ID = rs.getString("userID");
						text.setText(ID);
						String FN = rs.getString("fname");
						text_1.setText(FN);
						String LN = rs.getString("phone");
						text_2.setText(LN);
						String Des = rs.getString("userLevel");
						// combo.setText(Des);
						String BS = rs.getString("email");
						text_3.setText(BS);

					}
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});

		Button button_1 = new Button(shell, SWT.NONE);
		FormData fd_button_1 = new FormData();
		fd_button_1.right = new FormAttachment(0, 822);
		button_1.setLayoutData(fd_button_1);
		button_1.setText("تعديل");

		Button button_2 = new Button(shell, SWT.NONE);
		FormData fd_button_2 = new FormData();
		fd_button_2.top = new FormAttachment(button_1, 0, SWT.TOP);
		fd_button_2.right = new FormAttachment(0, 953);
		button_2.setLayoutData(fd_button_2);
		button_2.setText("حذف");

		Label label = new Label(shell, SWT.NONE);
		FormData fd_label = new FormData();
		fd_label.top = new FormAttachment(headerLabel, 43);
		fd_label.right = new FormAttachment(100, -72);
		fd_label.left = new FormAttachment(0, 765);
		label.setLayoutData(fd_label);
		label.setText("معلومات المستخدم");
		label.setForeground(SWTResourceManager.getColor(210, 105, 30));
		label.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.BOLD));
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label.setAlignment(SWT.CENTER);

		Label label_1 = new Label(shell, SWT.NONE);
		FormData fd_label_1 = new FormData();
		fd_label_1.bottom = new FormAttachment(0, 251);
		fd_label_1.right = new FormAttachment(0, 1090);
		fd_label_1.top = new FormAttachment(0, 217);
		fd_label_1.left = new FormAttachment(0, 952);
		label_1.setLayoutData(fd_label_1);
		label_1.setText("الرقم الأكاديمي");
		label_1.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		text = new Text(shell, SWT.BORDER);
		fd_button_1.left = new FormAttachment(text, 0, SWT.LEFT);
		FormData fd_text = new FormData();
		fd_text.bottom = new FormAttachment(0, 241);
		fd_text.right = new FormAttachment(0, 940);
		fd_text.top = new FormAttachment(0, 217);
		fd_text.left = new FormAttachment(0, 717);
		text.setLayoutData(fd_text);

		Label label_2 = new Label(shell, SWT.NONE);
		FormData fd_label_2 = new FormData();
		fd_label_2.bottom = new FormAttachment(0, 302);
		fd_label_2.right = new FormAttachment(0, 1096);
		fd_label_2.top = new FormAttachment(0, 274);
		fd_label_2.left = new FormAttachment(0, 958);
		label_2.setLayoutData(fd_label_2);
		label_2.setText("الاسم");
		label_2.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		label_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		text_1 = new Text(shell, SWT.BORDER);
		FormData fd_text_1 = new FormData();
		fd_text_1.bottom = new FormAttachment(0, 298);
		fd_text_1.right = new FormAttachment(0, 940);
		fd_text_1.top = new FormAttachment(0, 274);
		fd_text_1.left = new FormAttachment(0, 717);
		text_1.setLayoutData(fd_text_1);

		Label label_3 = new Label(shell, SWT.NONE);
		FormData fd_label_3 = new FormData();
		fd_label_3.bottom = new FormAttachment(0, 350);
		fd_label_3.right = new FormAttachment(0, 1090);
		fd_label_3.top = new FormAttachment(0, 323);
		fd_label_3.left = new FormAttachment(0, 952);
		label_3.setLayoutData(fd_label_3);
		label_3.setText("رقم الجوال");
		label_3.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		label_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		text_2 = new Text(shell, SWT.BORDER);
		FormData fd_text_2 = new FormData();
		fd_text_2.left = new FormAttachment(text, 0, SWT.LEFT);
		fd_text_2.bottom = new FormAttachment(label_3, 0, SWT.BOTTOM);
		fd_text_2.right = new FormAttachment(0, 940);
		fd_text_2.top = new FormAttachment(0, 323);
		text_2.setLayoutData(fd_text_2);

		Label label_4 = new Label(shell, SWT.NONE);
		FormData fd_label_4 = new FormData();
		fd_label_4.bottom = new FormAttachment(0, 402);
		fd_label_4.right = new FormAttachment(0, 1096);
		fd_label_4.top = new FormAttachment(0, 371);
		fd_label_4.left = new FormAttachment(0, 958);
		label_4.setLayoutData(fd_label_4);
		label_4.setText("المستوى");
		label_4.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		label_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		Combo combo = new Combo(shell, SWT.NONE);
		fd_button_2.left = new FormAttachment(combo, 0, SWT.LEFT);
		FormData fd_combo = new FormData();
		fd_combo.top = new FormAttachment(label_4, -3, SWT.TOP);
		fd_combo.right = new FormAttachment(text, 0, SWT.RIGHT);
		fd_combo.left = new FormAttachment(0, 848);
		combo.setLayoutData(fd_combo);
		combo.setItems(new String[] { "3", "4", "5", "6", "7", "8", "9", "10" });
		combo.select(0);

		Label label_5 = new Label(shell, SWT.NONE);
		FormData fd_label_5 = new FormData();
		fd_label_5.bottom = new FormAttachment(0, 456);
		fd_label_5.right = new FormAttachment(0, 1096);
		fd_label_5.top = new FormAttachment(0, 418);
		fd_label_5.left = new FormAttachment(0, 958);
		label_5.setLayoutData(fd_label_5);
		label_5.setText("البريد الإلكتروني");
		label_5.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		label_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		text_3 = new Text(shell, SWT.BORDER);
		fd_button_1.top = new FormAttachment(text_3, 40);
		FormData fd_text_3 = new FormData();
		fd_text_3.left = new FormAttachment(text, 0, SWT.LEFT);
		fd_text_3.top = new FormAttachment(label_5, 0, SWT.TOP);
		fd_text_3.right = new FormAttachment(text, 0, SWT.RIGHT);
		text_3.setLayoutData(fd_text_3);
		
		Button btnVu = new Button(shell, SWT.NONE);
		btnVu.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				AdminMenu am = new AdminMenu();
				shell.close();
				am.open();
			}
		});
		btnVu.setText("رجوع");
		FormData fd_btnVu = new FormData();
		fd_btnVu.right = new FormAttachment(button_2, 112, SWT.RIGHT);
		fd_btnVu.top = new FormAttachment(button_1, 0, SWT.TOP);
		fd_btnVu.left = new FormAttachment(button_2, 20);
		btnVu.setLayoutData(fd_btnVu);

	}
}
