package purpleBox;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class AdminGUI extends JFrame
{
   

	private int row = 5;
	private int col = 40;
	
    private JButton addMovieB;
    private JButton removeMovieB;
    private JButton editMovieB;
    
    private JLabel editMovieTitleL;    
    private JLabel editMovieDescriptionL;
    private JLabel editMovieYearL;
    private JLabel editMovieTypeL;
    private JLabel editMoviePriceL;
    private JLabel editMovieQuantityL;
    private JLabel inputIDL;
    
    private JTextField editMovieTitleTF;
    private JTextField editMovieYearTF;
    private JTextField editMovieTypeTF;
    private JTextField editMoviePriceTF;
    private JTextField editMovieQuantityTF;
    private JTextField inputIDTF;
    private JTextArea editMovieDescriptionTF;	
    private JTextArea displayJTA;           
    
    private JPanel topPNL;     
    private JPanel middlePNL;
    private JPanel displayPNL;   
   	
  //Constructor, add all panels to JFrame
    public AdminGUI ()
    {
       	setTitle("Administer GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        buildTopPNL ();
        buildMiddlePNL ();
        buildDisplayPNL ();
       
        setLayout(new BorderLayout());
        add(topPNL, BorderLayout.NORTH);
        add(middlePNL, BorderLayout.CENTER);
        add(displayPNL, BorderLayout.SOUTH);
        pack();
        
        setVisible(true);
        setLocationRelativeTo(null);
    } 

    //build the top panel
	private void buildTopPNL() 
	{          
		topPNL = new JPanel();
		topPNL.setPreferredSize(new Dimension(600,100));

    	
    	
    	editMovieTitleL = new JLabel("Edit Title");
    	editMovieYearL = new JLabel("Edit Year");
    	editMovieTypeL = new JLabel("Edit Type");    	
    	editMoviePriceL = new JLabel("Edit Price");
    	editMovieQuantityL = new JLabel("Edit Quantity");

    	
    	editMovieTitleTF = new JTextField(20);
    	editMovieYearTF = new JTextField(20);
    	editMovieTypeTF = new JTextField(20);
    	editMoviePriceTF = new JTextField(20);
    	editMovieQuantityTF = new JTextField(10);
    	
    	topPNL.add(editMovieTitleL); 
    	topPNL.add(editMovieTitleTF);
        topPNL.add(editMovieYearL); 
        topPNL.add(editMovieYearTF);
        topPNL.add(editMovieTypeL);
        topPNL.add(editMovieTypeTF);
        topPNL.add(editMoviePriceL); 
        topPNL.add(editMoviePriceTF);
        topPNL.add(editMovieQuantityL);
        topPNL.add(editMovieQuantityTF);

        
       // this.setLayout(new GridLayout(3,4));
            	
	}


	//build the center panel
   private void buildMiddlePNL() 
    {
       
    	middlePNL = new JPanel();       
    	middlePNL.setPreferredSize(new Dimension(400,200));
   	
    	editMovieDescriptionL = new JLabel("Edit Description");   	
    	editMovieDescriptionTF = new JTextArea(row, col);
    	addMovieB = new JButton("Add Moive");
    	addMovieB.addActionListener(new addMovieButtonHandler());
    	inputIDL = new JLabel("Input ID here: ");
    	inputIDTF = new JTextField(30);
    	
   	  	removeMovieB = new JButton("Remove Moive");
 //  	  	removeMovieB.addActionListener(new removeButtonHandler());   	  
   	  	
   	  	editMovieB = new JButton("Edit Moive");
 //  	  	editMovieB.addActionListener(new editButtonHandler());
      
   	  	removeMovieB.setPreferredSize(new Dimension(120, 30));
   	  	editMovieB.setPreferredSize(new Dimension(100,30));
   	  	
   	    middlePNL.add(editMovieDescriptionL);
   	    middlePNL.add(editMovieDescriptionTF);   	    
   	    middlePNL.add(addMovieB);  	  	
   	    middlePNL.add(inputIDL);
   	    middlePNL.add(inputIDTF);  
   	    middlePNL.add(removeMovieB);
   	    middlePNL.add(editMovieB);
    }
    
    //build the panel displaying the result
    private void buildDisplayPNL() 
    {
    	displayPNL = new JPanel();	    	
    	displayJTA = new JTextArea(15,30);
		displayJTA.setEditable(false);
		displayJTA.setForeground(Color.blue);
		displayJTA.setFont(new Font("timesnewroman", Font.BOLD, 14));		
		displayJTA.setLineWrap(true);
		JScrollPane scrollPaneDisplay =  new JScrollPane(displayJTA);				
		scrollPaneDisplay.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		displayJTA.setLayout(new BorderLayout());	
		displayPNL.add(scrollPaneDisplay);			
	}
    	

    
    private class addMovieButtonHandler implements ActionListener 
    {
    	public void actionPerformed(ActionEvent arg0) 
    	{
    		
    		try
    		{
    			
    			for(int i = 0; i < 9999; i++)     
    			{                
    				//displayJTA.append(displayJTA.getText() + newline);  
    				displayJTA.setText("ID:" + inputIDTF.getText() +
    						"\nTitle: " + editMovieTitleTF.getText() +
    						"\nYear: " + editMovieYearTF.getText() +
    						"\nType: " + editMovieTypeTF.getText() +
    						"\nPrice: " + editMoviePriceTF.getText() +
    						"\nQuantity: " + editMovieQuantityTF.getText() +
    						"\nDescription: " + editMovieDescriptionTF.getText()); 	       		
    			}
    		}
    		catch(Exception e)
    		{
    			displayJTA.setText(e.getMessage()+" No movies.");
    		}
    	}
    }
}