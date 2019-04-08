package App;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import javax.swing.JPasswordField;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class SignInFrame {

	protected Shell shell;
	private Text txtUsername;
	private Text txtPassword;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SignInFrame window = new SignInFrame();
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
		shell.setSize(616, 467);
		shell.setText("تسجيل الدخول");
		
		txtUsername = new Text(shell, SWT.BORDER);
		txtUsername.setBounds(142, 191, 324, 33);
		
		txtPassword = new Text(shell, SWT.BORDER);
		txtPassword.setBounds(142, 278, 324, 33);
		
		Label usernameLbl = new Label(shell, SWT.NONE);
		usernameLbl.setAlignment(SWT.RIGHT);
		usernameLbl.setBounds(328, 164, 138, 21);
		usernameLbl.setText("\u0627\u0633\u0645 \u0627\u0644\u0645\u0633\u062A\u062E\u062F\u0645");
		
		Label passwordLbl = new Label(shell, SWT.NONE);
		passwordLbl.setText("\u0627\u0644\u0631\u0642\u0645 \u0627\u0644\u0633\u0631\u064A");
		passwordLbl.setAlignment(SWT.RIGHT);
		passwordLbl.setBounds(328, 251, 138, 21);
		
		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			//pressing the logo will take you to main menu, here it is sign in or search menu
				MainMenuKaff mainSearchOrSignIn = new MainMenuKaff();
				mainSearchOrSignIn.open();
				shell.close();
			}
		});
		button.setImage(SWTResourceManager.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\img\\logo meduim.png"));
		button.setBounds(182, 10, 214, 133);
		
		Button SignINBtn = new Button(shell, SWT.NONE);
		SignINBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//check if username and password are correct, then show admin menu or error message
				
			}
		});
		SignINBtn.setBounds(142, 334, 138, 33);
		SignINBtn.setText("دخول");

	}
}
