package tabs;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import db.Database;

public class Skill extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6279814361602600780L;
	protected Button submitButton;
	protected TextField nameField;
	protected TextField descriptioField;
	protected TextField manaField;
	protected TextField damageField;
	protected TextField targetField;
	protected TextField elementalAffinityField;

	public Skill() {
		setLayout(null);
		submitButton = new Button("Submit4343");
		submitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Database database = new Database();
				database.addSkills(nameField.getText(),
						descriptioField.getText(),
						Integer.parseInt(manaField.getText()),
						Integer.parseInt(damageField.getText()),
						targetField.getText(),
						elementalAffinityField.getText());
				database.destory();

			}
		});
		nameField = new TextField("Name", 100);
		descriptioField = new TextField("Desscription", 100);
		manaField = new TextField("Mana", 100);
		damageField = new TextField("Damage", 100);
		targetField = new TextField("Target", 100);
		elementalAffinityField = new TextField("Elemental Affinity", 100);

		nameField.setBounds(20, 70, 100, 40);
		descriptioField.setBounds(20, 115, 100, 40);
		manaField.setBounds(20, 160, 100, 40);
		damageField.setBounds(20, 205, 100, 40);
		targetField.setBounds(20, 250, 100, 40);
		elementalAffinityField.setBounds(20, 295, 100, 40);
		submitButton.setBounds(20, 350, 100, 30);

		add(nameField);
		add(descriptioField);
		add(manaField);
		add(damageField);
		add(targetField);
		add(elementalAffinityField);
		add(submitButton);

	}
}
