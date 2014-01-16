package GUI;

import java.awt.Font;
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

import DienstleistungController.IVerpflegungHandler;
import DienstleistungController.MyVerpfSpeichernActionListener;

public class VerpflegungErfassen extends JFrame {

	private String anbieter;
	private JPanel contentPane;
	private JTextField txt_VerpfName;
	private JTextField txt_VerpfBeschr;
	private JTextField txt_VerpfRegion;
	private JTextField txt_VerpfPreis;
	JCheckBox checkVerpfVegi;
	private Boolean bVerpfVegi = false;
	JCheckBox checkVerpfAllergie;
	private Boolean bVerpfAllergie = false;
	private JButton btnNewVerpf;

	/**
	 * Create the frame.
	 */
	public VerpflegungErfassen(final IVerpflegungHandler verpflegungHandler,
			final String anbieter) {
		this.anbieter = anbieter;

		setTitle("\"BIG-EVENT  -  Dienstleistung Verpflegung hinzuf\u00FCgen\"");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Labels

		JLabel lblNewLabel = new JLabel(
				"Bitte Angaben zur Verpflegung eingeben");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 11, 274, 20);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setBounds(10, 42, 113, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Beschreibung:");
		lblNewLabel_2.setBounds(10, 67, 113, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("K\u00FCche/Region:");
		lblNewLabel_3.setToolTipText("zB. Italienisch/Chinesisch");
		lblNewLabel_3.setBounds(10, 133, 113, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Preis:");
		lblNewLabel_4.setBounds(10, 224, 91, 14);
		contentPane.add(lblNewLabel_4);

		// Datenfelder

		txt_VerpfName = new JTextField();
		txt_VerpfName.setBounds(130, 39, 294, 20);
		contentPane.add(txt_VerpfName);
		txt_VerpfName.setColumns(10);

		txt_VerpfBeschr = new JTextField();
		txt_VerpfBeschr.setBounds(130, 64, 294, 56);
		contentPane.add(txt_VerpfBeschr);
		txt_VerpfBeschr.setColumns(10);

		txt_VerpfRegion = new JTextField();
		txt_VerpfRegion.setBounds(130, 130, 119, 20);
		contentPane.add(txt_VerpfRegion);
		txt_VerpfRegion.setColumns(10);

		txt_VerpfPreis = new JTextField();
		txt_VerpfPreis.setBounds(130, 221, 86, 20);
		contentPane.add(txt_VerpfPreis);
		txt_VerpfPreis.setColumns(10);

		checkVerpfVegi = new JCheckBox("Vegi");
		checkVerpfVegi.setBounds(130, 157, 97, 23);
		contentPane.add(checkVerpfVegi);
		checkVerpfVegi.addItemListener(new ItemListener() {
			// Zustandänderung der Checkbox abfragen
			public void itemStateChanged(ItemEvent ie) {
				if (checkVerpfVegi.isSelected()) {
					bVerpfVegi = true;
				}
			}
		});

		checkVerpfAllergie = new JCheckBox("Spez Allergiker Men\u00FCs");
		checkVerpfAllergie.setBounds(130, 183, 170, 23);
		contentPane.add(checkVerpfAllergie);
		checkVerpfAllergie.addItemListener(new ItemListener() {
			// Zustandänderung der Checkbox abfragen
			public void itemStateChanged(ItemEvent ie) {
				if (checkVerpfAllergie.isSelected()) {
					bVerpfAllergie = true;
				}
			}
		});

		// Instanzierung der Controller-Klasse und Uebergabe GUI-Objekt sowie
		// verpflegungHandler
		MyVerpfSpeichernActionListener btnSpeichernAC = new MyVerpfSpeichernActionListener(
				this, verpflegungHandler);

		JButton btnVerpfSpeichern = new JButton("Angaben Speichern");
		btnVerpfSpeichern.setBounds(10, 276, 206, 23);
		contentPane.add(btnVerpfSpeichern);

		btnVerpfSpeichern.addActionListener(btnSpeichernAC);

		btnNewVerpf = new JButton("Weitere Verpflegung erfassen");
		btnNewVerpf.setBounds(226, 276, 208, 23);
		contentPane.add(btnNewVerpf);
		btnNewVerpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				VerpflegungErfassen verpfErfa = new VerpflegungErfassen(
						verpflegungHandler, anbieter);

				verpfErfa.setVisible(true);
			}
		});
	}

	// Getter-Methoden

	public String getAnbieterName() {
		return this.anbieter;
	}

	public String getVerpfName() {
		return txt_VerpfName.getText();
	}

	public String getVerpfBeschr() {
		return txt_VerpfBeschr.getText();
	}

	public String getVerpfRegion() {
		return txt_VerpfRegion.getText();
	}

	public double getPreis() {
		return Double.parseDouble(txt_VerpfPreis.getText());
	}

	public boolean istVerpfVegi() {
		return bVerpfVegi;
	}

	public boolean istVerpfAllergie() {
		return bVerpfAllergie;
	}

}
