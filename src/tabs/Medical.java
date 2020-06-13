package tabs;

import java.awt.Button;
import java.awt.TextField;

import javax.swing.JPanel;

public class Medical extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4968706942581766041L;
	protected Button submitButton;
	protected TextField healthRestoredField;
	protected TextField manaRestoredField;
	protected TextField statusCuredField;

	public Medical() {
		setLayout(null);
		submitButton = new Button("Submit");
		healthRestoredField = new TextField("Health Restored", 100);
		manaRestoredField = new TextField("Mana Restored", 100);
		statusCuredField = new TextField("Status Cured", 100);

		healthRestoredField.setBounds(20, 70, 100, 40);
		manaRestoredField.setBounds(20, 115, 100, 40);
		statusCuredField.setBounds(20, 160, 100, 40);
		submitButton.setBounds(20, 350, 100, 30);

		add(healthRestoredField);
		add(manaRestoredField);
		add(statusCuredField);
		add(submitButton);

	}
}
