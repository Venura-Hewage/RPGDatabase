package tabs;

import java.awt.Button;
import java.awt.TextField;

import javax.swing.JPanel;

public class Grenade extends JPanel {

	protected Button submitButton;
	protected TextField damageField;
	protected TextField targetField;
	protected TextField elementalAffinityField;

	public Grenade() {
		setLayout(null);
		submitButton = new Button("Submit");
		damageField = new TextField("Damage", 100);
		targetField = new TextField("Target", 100);
		elementalAffinityField = new TextField("Elemental Affinity", 100);

		damageField.setBounds(20, 70, 100, 40);
		targetField.setBounds(20, 115, 100, 40);
		elementalAffinityField.setBounds(20, 160, 100, 40);
		submitButton.setBounds(20, 350, 100, 30);

		add(damageField);
		add(targetField);
		add(elementalAffinityField);
		add(submitButton);

	}
}
