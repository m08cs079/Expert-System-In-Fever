
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.*;

import javax.swing.ButtonGroup;

@SuppressWarnings("serial")
public class Network extends javax.swing.JFrame  implements ActionListener{

    public Network() {
        initComponents();
    }
                       
    private void initComponents() {
    	
    	buttonGroup1= new ButtonGroup();
    	buttonGroup2= new ButtonGroup();
    	buttonGroup3= new ButtonGroup();
    	buttonGroup4= new ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        canclebutton = new javax.swing.JToggleButton();
        proceedbutton = new javax.swing.JToggleButton();
        more_than_week = new javax.swing.JRadioButton();
        less_than_week = new javax.swing.JRadioButton();
        continue_fever = new javax.swing.JRadioButton();
        discontinue_fever = new javax.swing.JRadioButton();
        fever_with_chill = new javax.swing.JRadioButton();
        fever_without_chill = new javax.swing.JRadioButton();
        high_fever = new javax.swing.JRadioButton();
        low_fever = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Please give the answer of these simple questions...");

        jLabel2.setText("Is fever last for more than 7 days");

        jLabel3.setText("Is fever continuous or discontinuous");

        jLabel4.setText("Is fever comes with chill and rigor");

        jLabel5.setText("If fever is high or low");

        canclebutton.setText("CANCLE");

        proceedbutton.setText("PROCEED");

        more_than_week.setText("YES");

        less_than_week.setText("NO");

        continue_fever.setText("continue");

        discontinue_fever.setText("discontinue");

        fever_with_chill.setText("with chill");

        fever_without_chill.setText("with no chill");

        high_fever.setText("high");

        low_fever.setText("low");
        
        buttonGroup1.add(more_than_week);
        buttonGroup1.add(less_than_week);
        
        buttonGroup2.add(continue_fever);
        buttonGroup2.add(discontinue_fever);
        
        buttonGroup3.add(fever_with_chill);
        buttonGroup3.add(fever_without_chill);
        
        buttonGroup4.add(high_fever);
        buttonGroup4.add(low_fever);
        proceedbutton.addActionListener(this);
        setVisible(true);


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(continue_fever)
                                    .addComponent(more_than_week))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(discontinue_fever)
                                    .addComponent(less_than_week)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(high_fever)
                                    .addComponent(fever_with_chill))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fever_without_chill)
                                    .addComponent(low_fever)))
                            .addComponent(proceedbutton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(canclebutton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(92, 92, 92)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(more_than_week)
                    .addComponent(less_than_week))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(continue_fever)
                    .addComponent(discontinue_fever))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fever_with_chill)
                    .addComponent(fever_without_chill))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(high_fever)
                    .addComponent(low_fever))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canclebutton)
                    .addComponent(proceedbutton))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
                         
    }

    // Variables declaration - do not modify  
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private ButtonGroup buttonGroup3;
    private ButtonGroup buttonGroup4;
    private javax.swing.JToggleButton canclebutton;
    private javax.swing.JRadioButton continue_fever;
    private javax.swing.JRadioButton discontinue_fever;
    private javax.swing.JRadioButton fever_with_chill;
    private javax.swing.JRadioButton fever_without_chill;
    private javax.swing.JRadioButton high_fever;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton less_than_week;
    private javax.swing.JRadioButton low_fever;
    private javax.swing.JRadioButton more_than_week;
    private javax.swing.JToggleButton proceedbutton;
    // End of variables declaration                   

        
	    
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	boolean mtw=more_than_week.isSelected();
	boolean ltw=less_than_week.isSelected();
	boolean fc=continue_fever.isSelected();
	boolean fdc=discontinue_fever.isSelected();
	boolean feh=high_fever.isSelected();
	boolean fel=low_fever.isSelected();
	boolean fwc=fever_with_chill.isSelected();
	boolean fwnc=fever_without_chill.isSelected();
	
	try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExpertSystem?useSSL=false","root" ,"password");
			Statement st= myConn.createStatement();
			String sqlQuery = "insert into fever values("+mtw+","+ltw+","+fc+","+fdc+","+feh+","+fel+","+fwc+","+fwnc+")";
			System.out.println("Sql query **************************"+sqlQuery);
			int i= st.executeUpdate(sqlQuery);
			System.out.println(i+"row inserted");
		    myConn.close();  
		     }
		catch(Exception ex){
			ex.printStackTrace();
				}
	          
	    canclebutton.addActionListener(new java.awt.event.ActionListener() {
	    	 public void actionPerformed(java.awt.event.ActionEvent evt) {
	    		 close();
	    	 }
	     });
     }
private void close(){
    WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
	}

}