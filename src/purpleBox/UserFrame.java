package purpleBox;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;



@SuppressWarnings("serial")
public class UserFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtSearchByMovie;
	private JTextField txtEnterIdTo;
	private JTextArea areaJT;
	
	public static AdminADT admin = new Admin();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserFrame frame = new UserFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserFrame() {
		setTitle("Purple Box User");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setResizable(false);
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblWelcomeToPurple = new JLabel("Welcome to Purple Box. Please make your selection below.");
		GridBagConstraints gbc_lblWelcomeToPurple = new GridBagConstraints();
		gbc_lblWelcomeToPurple.gridwidth = 8;
		gbc_lblWelcomeToPurple.insets = new Insets(0, 0, 5, 5);
		gbc_lblWelcomeToPurple.gridx = 1;
		gbc_lblWelcomeToPurple.gridy = 0;
		contentPane.add(lblWelcomeToPurple, gbc_lblWelcomeToPurple);
		
		txtSearchByMovie = new JTextField();
		txtSearchByMovie.setText("Search by Movie title, or Year.");
		GridBagConstraints gbc_txtSearchByMovie = new GridBagConstraints();
		txtSearchByMovie.addFocusListener(new txtSearchByMovieFocusAdapter());
		txtSearchByMovie.addActionListener(new btnSearchByTitleActionListener());
		gbc_txtSearchByMovie.gridwidth = 7;
		gbc_txtSearchByMovie.insets = new Insets(0, 0, 5, 5);
		gbc_txtSearchByMovie.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSearchByMovie.gridx = 1;
		gbc_txtSearchByMovie.gridy = 1;
		contentPane.add(txtSearchByMovie, gbc_txtSearchByMovie);
		txtSearchByMovie.setColumns(10);
		
		txtEnterIdTo = new JTextField();
		txtEnterIdTo.setText("Enter ID to return.");
		GridBagConstraints gbc_txtEnterIdTo = new GridBagConstraints();
		txtEnterIdTo.addFocusListener(new txtEnterIdToFocusAdapter());
		gbc_txtEnterIdTo.insets = new Insets(0, 0, 5, 5);
		gbc_txtEnterIdTo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnterIdTo.gridx = 10;
		gbc_txtEnterIdTo.gridy = 1;
		contentPane.add(txtEnterIdTo, gbc_txtEnterIdTo);
		txtEnterIdTo.setColumns(10);
		
		JButton btnSearchByTitle = new JButton("Search by Title");
		btnSearchByTitle.addActionListener(new btnSearchByTitleActionListener());
		GridBagConstraints gbc_btnSearchByTitle = new GridBagConstraints();
		gbc_btnSearchByTitle.anchor = GridBagConstraints.WEST;
		gbc_btnSearchByTitle.insets = new Insets(0, 0, 5, 5);
		gbc_btnSearchByTitle.gridx = 1;
		gbc_btnSearchByTitle.gridy = 2;
		contentPane.add(btnSearchByTitle, gbc_btnSearchByTitle);

		
		JButton btnSearchByYear = new JButton("Search by Year");
		btnSearchByYear.addActionListener(new btnSearchByYearActionListener());
		GridBagConstraints gbc_btnSearchByYear = new GridBagConstraints();
		gbc_btnSearchByYear.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSearchByYear.gridwidth = 4;
		gbc_btnSearchByYear.insets = new Insets(0, 0, 5, 5);
		gbc_btnSearchByYear.gridx = 3;
		gbc_btnSearchByYear.gridy = 2;
		contentPane.add(btnSearchByYear, gbc_btnSearchByYear);
		
		JButton btnReturnMovie = new JButton("Return movie");
		GridBagConstraints gbc_btnReturnMovie = new GridBagConstraints();
		gbc_btnReturnMovie.insets = new Insets(0, 0, 5, 5);
		gbc_btnReturnMovie.gridx = 10;
		gbc_btnReturnMovie.gridy = 2;
		contentPane.add(btnReturnMovie, gbc_btnReturnMovie);
		
		areaJT = new JTextArea(display());
		
		JScrollPane scrollPane = new JScrollPane(areaJT);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 7;
		gbc_scrollPane.gridheight = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 4;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		JButton btnCheckOut = new JButton("Check Out");
		btnCheckOut.addActionListener(new btnCheckOutActionListener());
		GridBagConstraints gbc_btnCheckOut = new GridBagConstraints();
		gbc_btnCheckOut.insets = new Insets(0, 0, 5, 5);
		gbc_btnCheckOut.gridx = 10;
		gbc_btnCheckOut.gridy = 4;
		contentPane.add(btnCheckOut, gbc_btnCheckOut);
		
		JButton btnAdminAccess = new JButton("Admin Access");
		GridBagConstraints gbc_btnAdminAccess = new GridBagConstraints();
		gbc_btnAdminAccess.insets = new Insets(0, 0, 5, 5);
		gbc_btnAdminAccess.gridx = 10;
		gbc_btnAdminAccess.gridy = 6;
		contentPane.add(btnAdminAccess, gbc_btnAdminAccess);
		btnAdminAccess.addActionListener(new adminActionListener());

	}
	
	private String display(){
		ArrayList<MovieADT> list = admin.getMovieList();
		MovieADT movie;
		String output = "Title\tYear\tType\tDescription\tPrice\tID\tQuantity\n";
		for (int i = 0;i < list.size(); i++){
			movie = list.get(i);
			output += movie.toString() + "\n";
		}
		return output;
	}
	
	private class btnSearchByTitleActionListener implements ActionListener {
		public void actionPerformed(ActionEvent ae){
			ArrayList<MovieADT> list;
			list = admin.search(txtSearchByMovie.getText());
			MovieADT movie;
			String output = "";
			for (int i = 0;i < list.size(); i++){
				movie = list.get(i);
				output += movie.toString() + "\n";
			}
			areaJT.setText(output);
		}
	}
	
	private class btnSearchByYearActionListener implements ActionListener {
		public void actionPerformed(ActionEvent ae){
			ArrayList<MovieADT> list;
			String output = "";
			MovieADT movie;
			try {
			list = admin.search((Integer.parseInt(txtSearchByMovie.getText())));
			for (int i = 0;i < list.size(); i++){
				movie = list.get(i);
				output += movie.toString() + "\n";
			}
			} catch (Exception e){
			}
			areaJT.setText(output);
		}
	}
	
	private class btnCheckOutActionListener implements ActionListener {
		public void actionPerformed(ActionEvent ae){
			try {
			admin.checkOut(Integer.parseInt(txtEnterIdTo.getText()));
			} catch (Exception e){
			}
			areaJT.setText(display());
		}
	}
	
	
	private class adminActionListener implements ActionListener {
		public void actionPerformed(ActionEvent ae){
			AdminGUI frame2 = new AdminGUI();
			frame2.setVisible(true);
		}
		
	}

	private class txtSearchByMovieFocusAdapter extends FocusAdapter {
		public void focusGained(FocusEvent fe) {
			JTextField text = (JTextField) fe.getSource();
			text.setText("");
		} public void focusLost(FocusEvent fe) {
			JTextField text = (JTextField) fe.getSource();
			if (text.getText().equals("")) {
				text.setText("Search by Movie title, or Year.");
				areaJT.setText(display());
			}
		}
	}
	
	private class txtEnterIdToFocusAdapter extends FocusAdapter {
		public void focusGained(FocusEvent fe) {
			JTextField text = (JTextField) fe.getSource();
			text.setText("");
		} public void focusLost(FocusEvent fe) {
			JTextField text = (JTextField) fe.getSource();
			if (text.getText().equals("")){
				text.setText("Enter ID to return.");
				areaJT.setText(display());
			}
		}
	}
}
