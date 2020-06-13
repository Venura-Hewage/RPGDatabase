package tabs;

import java.awt.Button;
import java.awt.TextField;

import javax.swing.JPanel;

public class WeakEntity extends JPanel {

	protected Button submitButton;
	protected TextField nameField;
	protected TextField descriptioField;
	protected TextField salesPriceField;
	protected TextField typeField;

	public WeakEntity() {
		setLayout(null);
		submitButton = new Button("Submit");
		nameField = new TextField("Name", 100);
		descriptioField = new TextField("Desscription", 100);
		salesPriceField = new TextField("Price", 100);
		typeField = new TextField("Type", 100);

		nameField.setBounds(20, 70, 100, 40);
		descriptioField.setBounds(20, 115, 100, 40);
		salesPriceField.setBounds(20, 160, 100, 40);
		typeField.setBounds(20, 205, 100, 40);
		submitButton.setBounds(20, 350, 100, 30);

		add(nameField);
		add(descriptioField);
		add(salesPriceField);
		add(typeField);
		add(submitButton);

	}
}
