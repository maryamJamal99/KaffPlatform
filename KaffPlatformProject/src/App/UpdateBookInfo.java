package App;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Group;

public class UpdateBookInfo {

	protected Shell shell;
	private Text text_3;
	private Text text_4;
	private Text text_5;
	private Text text_6;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			UpdateBookInfo window = new UpdateBookInfo();
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
		shell.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\img\\Background.jpeg"));
		shell.setImage(SWTResourceManager.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\img\\logo small.png"));
		shell.setBackground(SWTResourceManager.getColor(255, 255, 255));
		shell.setSize(590, 627);
		shell.setText("\u062A\u0639\u062F\u064A\u0644 \u0645\u0639\u0644\u0648\u0645\u0627\u062A \u0627\u0644\u0643\u062A\u0627\u0628 ");
		
		Label label_4 = new Label(shell, SWT.NONE);
		label_4.setAlignment(SWT.CENTER);
		label_4.setText("\u062A\u0639\u062F\u064A\u0644 \u0645\u0639\u0644\u0640\u0640\u0640\u0640\u0640\u0640\u0648\u0645\u0627\u062A \u0627\u0644\u0643\u062A\u0627\u0628");
		label_4.setForeground(SWTResourceManager.getColor(0, 0, 0));
		label_4.setFont(SWTResourceManager.getFont("Dubai", 16, SWT.BOLD));
		label_4.setBackground(SWTResourceManager.getColor(255, 255, 255));
		label_4.setBounds(0, 47, 574, 50);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setForeground(SWTResourceManager.getColor(255, 255, 255));
		btnNewButton.setBackground(SWTResourceManager.getColor(128, 128, 128));
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setFont(SWTResourceManager.getFont("Dubai", 13, SWT.BOLD));
		btnNewButton.setBounds(59, 509, 76, 35);
		btnNewButton.setText("\u0625\u0644\u063A\u0627\u0621");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setForeground(SWTResourceManager.getColor(255, 255, 255));
		btnNewButton_1.setBackground(SWTResourceManager.getColor(128, 128, 128));
		btnNewButton_1.setFont(SWTResourceManager.getFont("Dubai", 13, SWT.BOLD));
		btnNewButton_1.setBounds(152, 509, 76, 35);
		btnNewButton_1.setText("\u062A\u0639\u062F\u064A\u0644");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\img\\KaffPlatformheader.jpg"));
		lblNewLabel_1.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblNewLabel_1.setBounds(0, 0, 574, 50);
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(240, 127, 119, 24);
		
		Label label_5 = new Label(shell, SWT.NONE);
		label_5.setText("رمز الكتاب");
		label_5.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		label_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label_5.setBounds(384, 124, 119, 32);
		
		Label label_6 = new Label(shell, SWT.NONE);
		label_6.setText("عنوان الكتاب");
		label_6.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		label_6.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label_6.setBounds(384, 165, 119, 28);
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setBounds(92, 165, 267, 24);
		
		Label label_7 = new Label(shell, SWT.NONE);
		label_7.setText("إصدار الكتاب");
		label_7.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		label_7.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label_7.setBounds(384, 208, 119, 28);
		
		text_5 = new Text(shell, SWT.BORDER);
		text_5.setBounds(240, 211, 119, 24);
		
		Label label_8 = new Label(shell, SWT.NONE);
		label_8.setText("المستوى");
		label_8.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		label_8.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label_8.setBounds(384, 320, 64, 27);
		
		Combo combo = new Combo(shell, SWT.NONE);
		combo.setItems(new String[] {"3", "4", "5", "6", "7", "8", "9", "10"});
		combo.setBounds(295, 324, 64, 25);
		combo.select(0);
		
		Group group = new Group(shell, SWT.NONE);
		group.setBounds(120, 376, 334, 24);
		
		Button button_5 = new Button(group, SWT.RADIO);
		button_5.setText("مجاناً");
		button_5.setSelection(true);
		button_5.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		button_5.setBounds(21, 0, 73, 21);
		
		Button button_6 = new Button(group, SWT.RADIO);
		button_6.setText("إعارة");
		button_6.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		button_6.setBounds(130, 0, 73, 21);
		
		Button button_7 = new Button(group, SWT.RADIO);
		button_7.setText("للبيع");
		button_7.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		button_7.setBounds(233, 0, 80, 21);
		
		Label label_9 = new Label(shell, SWT.NONE);
		label_9.setText("السعر");
		label_9.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		label_9.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label_9.setBounds(384, 421, 119, 28);
		
		text_6 = new Text(shell, SWT.BORDER);
		text_6.setBounds(295, 424, 64, 24);
		
		Button button = new Button(shell, SWT.NONE);
		button.setText("\u0631\u062C\u0648\u0639");
		button.setForeground(SWTResourceManager.getColor(255, 255, 255));
		button.setFont(SWTResourceManager.getFont("Dubai", 13, SWT.BOLD));
		button.setBackground(SWTResourceManager.getColor(128, 128, 128));
		button.setBounds(240, 509, 76, 35);
		
		Group group_1 = new Group(shell, SWT.NONE);
		group_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		group_1.setBounds(92, 257, 267, 35);
		
		Button button_1 = new Button(group_1, SWT.RADIO);
		button_1.setText("متوفر");
		button_1.setSelection(true);
		button_1.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		button_1.setBounds(42, 10, 73, 21);
		
		Button button_2 = new Button(group_1, SWT.RADIO);
		button_2.setText("غير متوفر");
		button_2.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		button_2.setBounds(148, 10, 98, 21);

	}
}
