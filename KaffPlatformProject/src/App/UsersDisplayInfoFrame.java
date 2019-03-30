package App;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.CoolBar;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class UsersDisplayInfoFrame {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
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
		shell.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\img\\Background.jpeg"));
		//shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shell.setSize(591, 647);
		shell.setText("عرض  معلومات المستخدمين");
		
		Label usersInfoLabel = new Label(shell, SWT.NONE);
		usersInfoLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		usersInfoLabel.setFont(SWTResourceManager.getFont("B Badr", 14, SWT.NORMAL));
		usersInfoLabel.setForeground(SWTResourceManager.getColor(210, 105, 30));
		usersInfoLabel.setAlignment(SWT.CENTER);
		usersInfoLabel.setBounds(0, 92, 585, 38);
		usersInfoLabel.setText("\u0645\u0639\u0644\u0648\u0645\u0627\u062A \u0627\u0644\u0645\u0633\u062A\u062E\u062F\u0645\u064A\u0646");
		
		Button backBtn = new Button(shell, SWT.NONE);
		backBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				AdminMenu am = new AdminMenu();
				am.open();
			}
		});
		backBtn.setFont(SWTResourceManager.getFont("B Badr", 9, SWT.NORMAL));
		backBtn.setBounds(491, 60, 65, 26);
		backBtn.setText("\u0631\u062C\u0648\u0639");
		
		Button logoBtn = new Button(shell, SWT.NONE);
		logoBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MainMenuKaff menu = new MainMenuKaff();
				menu.open();
			}
		});
		logoBtn.setImage(SWTResourceManager.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\img\\logo for header button.png"));
		logoBtn.setBounds(491, 0, 74, 42);
		
		Group group = new Group(shell, SWT.NONE);
		group.setBounds(99, 136, 364, 42);
		
		Button button = new Button(group, SWT.RADIO);
		button.setBounds(2, 21, 130, 21);
		button.setText("كل المستخدمين");
		
		Button button_1 = new Button(group, SWT.RADIO);
		button_1.setBounds(138, 21, 110, 21);
		button_1.setText("المستعيرين");
		
		Button button_2 = new Button(group, SWT.RADIO);
		button_2.setBounds(253, 21, 110, 21);
		button_2.setText("المشترين");
		
		Label headerLabel = new Label(shell, SWT.NONE);
		headerLabel.setImage(SWTResourceManager.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\img\\KaffPlatformheader.jpg"));
		headerLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		headerLabel.setBounds(0, 0, 585, 50);

	}
}
