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

public class UsersDisplayInfoFrame {

	protected Shell shell;
	private Table table;

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
		shell.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\Admin\\git\\KaffPlatform\\KaffPlatformProject\\img\\Background.jpeg"));
		//shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shell.setImage(SWTResourceManager.getImage("C:\\Users\\Admin\\git\\KaffPlatform\\KaffPlatformProject\\img\\منصة كاف.jpg"));
		shell.setSize(591, 647);
		shell.setText("عرض  معلومات المستخدمين");
		
		Label headerLabel = new Label(shell, SWT.NONE);
		headerLabel.setImage(SWTResourceManager.getImage("C:\\Users\\Admin\\git\\KaffPlatform\\KaffPlatformProject\\img\\KaffPlatformheader.jpg"));
		headerLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		headerLabel.setBounds(0, 0, 607, 50);
		
		Label usersInfoLabel = new Label(shell, SWT.NONE);
		usersInfoLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		usersInfoLabel.setFont(SWTResourceManager.getFont("B Badr", 14, SWT.NORMAL));
		usersInfoLabel.setForeground(SWTResourceManager.getColor(210, 105, 30));
		usersInfoLabel.setAlignment(SWT.CENTER);
		usersInfoLabel.setBounds(144, 92, 276, 38);
		usersInfoLabel.setText("\u0645\u0639\u0644\u0648\u0645\u0627\u062A \u0627\u0644\u0645\u0633\u062A\u062E\u062F\u0645\u064A\u0646");
		
		Button button = new Button(shell, SWT.NONE);
		button.setFont(SWTResourceManager.getFont("B Badr", 9, SWT.NORMAL));
		button.setBounds(494, 60, 65, 26);
		button.setText("\u0631\u062C\u0648\u0639");
		
		ViewForm viewForm = new ViewForm(shell, SWT.NONE);
		viewForm.setBounds(33, 217, 501, 330);
		
		table = new Table(viewForm, SWT.BORDER | SWT.FULL_SELECTION);
		viewForm.setContent(table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		Button borrowersButton = new Button(shell, SWT.NONE);
		borrowersButton.setBounds(318, 176, 105, 35);
		borrowersButton.setText("المستعيرين");
		
		Button allUsersButton = new Button(shell, SWT.NONE);
		allUsersButton.setBounds(429, 176, 105, 35);
		allUsersButton.setText("الجميع");
		
		Button button_1 = new Button(shell, SWT.NONE);
		button_1.setBounds(33, 176, 105, 35);
		button_1.setText("تعديل");
		
		Button button_2 = new Button(shell, SWT.NONE);
		button_2.setBounds(144, 176, 105, 35);
		button_2.setText("حذف");

	}
}