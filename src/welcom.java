import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.*;

import javax.swing.*;
@SuppressWarnings("serial")
public class welcom extends javax.swing.JFrame implements ActionListener  {
    int patient_id = 0;
	public welcom() {
        initComponents();
    }
                          
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        pt_name = new JLabel();
        patient_name = new JTextField();
        canclebutton = new JButton();
        submitbutton = new JButton();
        fever_= new JCheckBox();
        head_ache = new JCheckBox();
        vomit = new JCheckBox();
        abd_pain = new JCheckBox();
        joint_pain = new JCheckBox();
        body_ache = new JCheckBox();
        burning_mict = new JCheckBox();
        breath = new JCheckBox();
        cough = new JCheckBox();
        sore_throat = new JCheckBox();
        chest_pain = new JCheckBox();
        diarrhea = new JCheckBox();
        rash = new JCheckBox();
        chill_rigor = new JCheckBox();
        hemorrhages = new JCheckBox();
        serial_no = new JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
       
        
        jLabel1.setText("WELCOME DOCTOR");

        pt_name.setText("ENTER NAME OF PATIENT");

        canclebutton.setText("CANCEL");

        submitbutton.setText("SUBMIT");

        fever_.setText("FEVER");

        head_ache.setText("HEADACHE");

        vomit.setText("VOMITING");

        abd_pain.setText("ABDOMINAL PAIN");

        joint_pain.setText("JOINT PAIN");

        body_ache.setText("BODY ACHE");

        burning_mict.setText("BURNING MICTURITION");

        breath.setText("DIFFICULTY IN BREATHING");

        cough.setText("COUGH");

        sore_throat.setText("SORE THROAT");
        chest_pain.setText("CHEST PAIN");
        diarrhea.setText("DIARRHEA");
        rash.setText("RASHES");
        chill_rigor.setText("CHILL AND RIGOR");
        hemorrhages.setText("HEMORRHAGES");

        //serial_no.setText("000");
        
        submitbutton.addActionListener(this);
        setVisible(true);
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cough)
                    .addComponent(burning_mict)
                    .addComponent(head_ache)
                    .addComponent(abd_pain)
                    .addComponent(canclebutton)
                    .addComponent(fever_)
                     .addComponent( chest_pain)
                      .addComponent(diarrhea)
                       .addComponent( rash)
                    .addComponent(pt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitbutton)
                    .addComponent(vomit)
                    .addComponent(sore_throat)
                    .addComponent(body_ache)
                    .addComponent(breath)
                    .addComponent(joint_pain)
                    .addComponent(chill_rigor)
                    .addComponent(hemorrhages)
                    .addComponent(patient_name, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serial_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serial_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patient_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vomit)
                    .addComponent(fever_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abd_pain)
                    .addComponent(joint_pain))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(burning_mict)
                    .addComponent(body_ache))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cough)
                    .addComponent(breath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(head_ache)
                    .addComponent(sore_throat))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chest_pain)
                    .addComponent(chill_rigor))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diarrhea)
                    .addComponent(hemorrhages))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rash))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canclebutton)
                    .addComponent(submitbutton)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }                        
        
        
        @SuppressWarnings("unused")
		private void canclebuttonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        close();
                  
        }
       
       @Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String patientname=patient_name.getText();
			int id=0;
			boolean fever=fever_.isSelected();
			boolean headache=head_ache.isSelected();
			boolean vomiting=vomit.isSelected();
			boolean fe4=abd_pain.isSelected();
			boolean fe5=joint_pain.isSelected();
			boolean fe6=body_ache.isSelected();
			boolean fe7=burning_mict.isSelected();
			boolean fe8=breath.isSelected();
			boolean fe9=cough.isSelected();
			boolean fe10=sore_throat.isSelected();
			boolean fe11=chest_pain.isSelected();
			boolean fe12=diarrhea.isSelected();
			boolean fe13=rash.isSelected();
			boolean fe14=chill_rigor.isSelected();
			boolean fe15=hemorrhages.isSelected();
			
			
			try{
	   			Class.forName("com.mysql.jdbc.Driver");
	   			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExpertSystem?useSSL=false","root" ,"password");
	   			Statement st= myConn.createStatement();
	   			String sqlQuery = "insert into patient values("+id+",'"+patientname+"',"+fever+","+headache+","+vomiting+","+fe4+","+fe5+","+fe6+","+fe7+","+fe8+","+fe9+","+fe10+","+fe11+","+fe12+","+fe13+","+fe14+","+fe15+")";
	   			System.out.println("Sql query **************************"+sqlQuery);
	   			int i= st.executeUpdate(sqlQuery);
	   			
	   			ResultSet rs = st.executeQuery("Select LAST_INSERT_ID() from patient limit 1");
	   			while(rs.next()) {
	   				patient_id = rs.getInt("LAST_INSERT_ID()");
	   				System.out.println("Patient  id !!!" +patient_id);
	   			}
	   			System.out.println(i+"row inserted");
	   		    myConn.close();  
	   		     }
	   		catch(Exception e){
	   			e.printStackTrace();
	   				}
			        
			        if(fever_.isSelected())
			        { 
			            Network nt = new Network();
			            nt.setVisible(true);
			            close();
			            }
			        }
	    	       

   	   
    	       // Variables declaration - do not modify                     
    private javax.swing.JCheckBox abd_pain;
    private javax.swing.JCheckBox body_ache;
    private javax.swing.JCheckBox breath;
    private javax.swing.JCheckBox burning_mict;
    private javax.swing.JButton canclebutton;
    private javax.swing.JCheckBox fever_;
    private javax.swing.JCheckBox head_ache;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox joint_pain;
    private javax.swing.JTextField patient_name;
    private javax.swing.JLabel pt_name;
    private javax.swing.JCheckBox cough;
    static javax.swing.JTextField serial_no;
    private javax.swing.JCheckBox sore_throat;
    private javax.swing.JButton submitbutton;
    private javax.swing.JCheckBox vomit;
    private javax.swing.JCheckBox chest_pain;
    private javax.swing.JCheckBox diarrhea;
    private javax.swing.JCheckBox rash;
    private javax.swing.JCheckBox chill_rigor;
    private javax.swing.JCheckBox hemorrhages;
    // End of variables declaration                   

private void close(){
    WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
       }
} 


