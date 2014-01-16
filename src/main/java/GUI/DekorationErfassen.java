package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import DienstleistungController.IDekorationHandler;
import DienstleistungController.MyDekoSpeichernActionListener;

public class DekorationErfassen extends JFrame {

	/**
	 * Definition der Variablen
	 */
	private static final long serialVersionUID = -2961786719061190178L;
	private String anbieter;
	private JPanel contentPane;
	private JTextField txt_DekoName;
	private JTextField txt_DekoBeschreibung;
	private JTextField txt_DekoPreis;
	private JCheckBox checkBoxDekoBlumen;
	private Boolean bDekoBlumen = false;

	/**
	 * Create the frame.
	 */
	// Konstruktor mit Uebergabe dekorationHandler und 'zugrundeliegender'
	// anbieter
	public DekorationErfassen(final IDekorationHandler dekorationHandler,
			final String anbieter) {
		setTitle("\"BIG-EVENT  -  Dienstleistung Dekoration hinzuf\u00FCgen\"");
		this.anbieter = anbieter;

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Labels

		JLabel lblNewLabel = new JLabel("Bitte Angaben zur Dekoration eingeben");
		lblNewLabel.setBounds(10, 11, 228, 14);
		contentPane.add(lblNewLabel);

		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 36, 76, 14);
		contentPane.add(lblName);

		JLabel lblBeschreibung = new JLabel("Beschreibung:");
		lblBeschreibung.setBounds(10, 73, 76, 14);
		contentPane.add(lblBeschreibung);

		JLabel lblNewLabel_1 = new JLabel("Preis:");
		lblNewLabel_1.setBounds(10, 184, 72, 14);
		contentPane.add(lblNewLabel_1);

		// Datenfelder

		txt_DekoName = new JTextField();
		txt_DekoName.setBounds(134, 33, 290, 20);
		contentPane.add(txt_DekoName);
		txt_DekoName.setColumns(10);

		txt_DekoBeschreibung = new JTextField();
		txt_DekoBeschreibung.setBounds(134, 70, 290, 58);
		contentPane.add(txt_DekoBeschreibung);
		txt_DekoBeschreibung.setColumns(10);

		checkBoxDekoBlumen = new JCheckBox("Mit Blumen");
		checkBoxDekoBlumen.setBounds(134, 141, 119, 23);
		contentPane.add(checkBoxDekoBlumen);
		// Um Zustandsänderung der Checkbox 'Blumen' auszulesen
		checkBoxDekoBlumen.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				if (checkBoxDekoBlumen.isSelected()) {
					bDekoBlumen = true;
				}
			}
		});

		txt_DekoPreis = new JTextField();
		txt_DekoPreis.setBounds(134, 181, 86, 20);
		contentPane.add(txt_DekoPreis);
		txt_DekoPreis.setColumns(10);

		// Instanzierung der Controller-Klasse und Uebergabe GUI-Objekt sowie
		// dekorationHandler
		MyDekoSpeichernActionListener btnSpeichernAC = new MyDekoSpeichernActionListener(
				this, dekorationHandler);

		JButton btnDekoSpeichern = new JButton("Angaben Speichern");
		btnDekoSpeichern.setBounds(10, 228, 189, 23);
		contentPane.add(btnDekoSpeichern);
		btnDekoSpeichern.addActionListener(btnSpeichernAC);

		JButton btnNewDeko = new JButton("Weitere Dekoration erfassen");
		btnNewDeko.setBounds(209, 228, 215, 23);
		contentPane.add(btnNewDeko);
		btnNewDeko.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				DekorationErfassen dekoErfa = new DekorationErfassen(
						dekorationHandler, anbieter);

				dekoErfa.setVisible(true);
			}
		});
	}

	// Getter-Methoden
	public String getAnbieterName() {
		return this.anbieter;
	}

	public String getName() {
		return txt_DekoName.getText();
	}

	public String getBeschreibung() {
		return txt_DekoBeschreibung.getText();
	}

	public boolean getBlumen() {
		return Boolean.parseBoolean(bDekoBlumen.toString());
	}

	public double getPreis() {
		return Double.parseDouble(txt_DekoPreis.getText());
	}

}
