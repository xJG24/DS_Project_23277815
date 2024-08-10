package ds.client;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import ds.SmartBedControlService.SmartBedControlServiceGrpc;
import ds.SmartClimateControlService.GetClimateReadingResponse;
import ds.SmartClimateControlService.SmartClimateControlServiceGrpc;
import ds.VitalSignsControlService.GetVitalSignsHistoryResponse;
import ds.VitalSignsControlService.GetVitalSignsHistoryResponseOrBuilder;
import ds.VitalSignsControlService.GetVitalSignsLatestResponse;
import ds.VitalSignsControlService.SetVitalSignsRequest;
import ds.VitalSignsControlService.SetVitalSignsResponse;
import ds.VitalSignsControlService.VitalSignsControlService;
import ds.VitalSignsControlService.VitalSignsControlServiceGrpc;
import ds.VitalSignsControlService.VitalSignsControlServiceGrpc.VitalSignsControlServiceBlockingStub;
import ds.VitalSignsControlService.VitalSignsMonitorRequest;
import ds.VitalSignsControlService.VitalSignsMonitorResponse;
import ds.VitalSignsControlService.OperationalStatus;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.internal.ServerStream;
import io.grpc.stub.StreamObserver;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class SmartHospitalRoomGui implements ActionListener{
    
    // used to close frames when swapping between services
    private JFrame frame; 
    
    //used to update text fields
    private JTextField bedHeadPositionReply, bedFootPositionReply,bedStatus,temperatureReply,humidityReply, climateStatus, 
    hrRequest, bodyTempRequest, Spo2Request, vitalStatus, hrReply, bodyTempReply, Spo2Reply, vitalSafetyStatus;

    //RoomID for demo purposes
    private int roomID = 485;
    
    // PatientID for demo purposes 
    private int patientID = 1103465;
    
    // to display history
    private JTextArea historyTextArea;

    
    // formatting panels
    private JPanel getVerticalSpacingPanel() {
		
		JPanel panel = new JPanel();
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		panel.add(Box.createRigidArea(new Dimension(50, 30)));
		panel.setLayout(boxlayout);
		return panel;
	}
    
    private JPanel getHorizontalSpacingPanel() {
		
		JPanel panel = new JPanel();
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.add(Box.createRigidArea(new Dimension(20,0)));
		panel.setLayout(boxlayout);
		return panel;
	}
    
//first page -> select services ################################################################################
    

    private JPanel getSmartBedControlServicePanel() {
		
		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		JLabel label = new JLabel("Smart Bed Control Suite:")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(50, 0)));
		
                
        JButton bedButton = new JButton("Enter");
        bedButton.setActionCommand("bedControl");
        bedButton.addActionListener(this);
        panel.add(bedButton);
                
        panel.add(Box.createRigidArea(new Dimension(50, 0)));
			
		panel.setLayout(boxlayout);
	
		return panel;
	}
	
    private JPanel getSmartClimateControlServicePanel() {
		
		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		JLabel label = new JLabel("Climate Control Suite:")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(66, 0)));
		
		JButton climateButton = new JButton("Enter");
                climateButton.setActionCommand("climateControl");
                climateButton.addActionListener(this); 
                panel.add(climateButton);
		panel.add(Box.createRigidArea(new Dimension(50, 0)));
		
		panel.setLayout(boxlayout);

		return panel;
	}
	
    private JPanel getVitalSignsControlServicePanel() {
		
		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		JLabel label = new JLabel("Vital Signs Control Suite:")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(50, 0)));
		
		JButton vitalButton = new JButton("Enter");
                vitalButton.setActionCommand("vitalControl");
		vitalButton.addActionListener(this);
		panel.add(vitalButton);
		panel.add(Box.createRigidArea(new Dimension(50, 0)));
		
		panel.setLayout(boxlayout);

		return panel;
	}

    // second page -> Smart Bed Controls ################################################################################
    //title
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    private JPanel smartBedControlServiceTitlePanel() {
	
		JPanel panel = new JPanel();
	
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		JLabel label = new JLabel("Smart Bed Control Suite:")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(450, 0)));
		
		JButton buttonReturn = new JButton("Return");
        buttonReturn.setActionCommand("Return");
		buttonReturn.addActionListener(this);
		panel.add(buttonReturn);
		panel.add(Box.createRigidArea(new Dimension(50, 0)));
	

		return panel;
	}
//head controls
    private JPanel smartBedHeadControlPanel() {
	
		JPanel panel = new JPanel();
	
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		JLabel label = new JLabel("Adjust Head Position: ")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(300, 0)));
		
		
		// create buttons to increment or decrement head position
		JButton minusButtonHead = new JButton("-");
		minusButtonHead.setActionCommand("decrementHeadPosition");
		minusButtonHead.addActionListener(this);
	    panel.add(minusButtonHead);
	
	    panel.add(Box.createRigidArea(new Dimension(10, 0)));
	
	    // Display current head position
	    // set text to getHeadPosition
	    // will break because null
	    bedHeadPositionReply = new JTextField("0.0", 5);
	    bedHeadPositionReply.setEditable(false);
	    panel.add(bedHeadPositionReply);
	
	    panel.add(Box.createRigidArea(new Dimension(10, 0)));
	
	    JButton plusButtonHead = new JButton("+");
	    plusButtonHead.setActionCommand("incrementHeadCounter");
	    plusButtonHead.addActionListener(this);
	    panel.add(plusButtonHead);
	
	    panel.add(Box.createRigidArea(new Dimension(20, 0)));

	    // Create the submit button for setHeadPosition method
	    JButton submitButtonHead = new JButton("Submit");
	    submitButtonHead.setActionCommand("submitHeadPosition");
	    submitButtonHead.addActionListener(this);
	    panel.add(submitButtonHead);
	    panel.add(Box.createRigidArea(new Dimension(50, 0)));
		
		panel.setLayout(boxlayout);
	
		return panel;
	}

//foot controls
    private JPanel smartBedFootControlPanel() {
	
		JPanel panel = new JPanel();
	
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		JLabel label = new JLabel("Adjust Foot Position: ")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(300, 0)));
		
		
		// create buttons to increment or decrement head position
		JButton minusButtonFoot = new JButton("-");
		minusButtonFoot.setActionCommand("decrementFootPosition");
		minusButtonFoot.addActionListener(this);
	    panel.add(minusButtonFoot);
	
	    panel.add(Box.createRigidArea(new Dimension(10, 0)));
	
	    // Display current head position
	    // set text to getFootPosition
	    bedFootPositionReply = new JTextField("0.0", 5);
	    bedFootPositionReply.setEditable(false);
	    panel.add(bedFootPositionReply);
	
	    panel.add(Box.createRigidArea(new Dimension(10, 0)));
	
	    JButton plusButtonFoot = new JButton("+");
	    plusButtonFoot.setActionCommand("incrementFootPosition");
	    plusButtonFoot.addActionListener(this);
	    panel.add(plusButtonFoot);
	
	    panel.add(Box.createRigidArea(new Dimension(20, 0)));
	
	    // Create the submit button for setHeadPosition method
	    JButton submitButtonFoot = new JButton("Submit");
	    submitButtonFoot.setActionCommand("submitFootPosition");
	    submitButtonFoot.addActionListener(this);
	    panel.add(submitButtonFoot);
	    panel.add(Box.createRigidArea(new Dimension(50, 0)));
		
		panel.setLayout(boxlayout);
	
		return panel;
	}

    
	private JPanel smartBedResetPanel() {
		
		JPanel panel = new JPanel();
	
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		JLabel label = new JLabel("Reset Smart Bed Position:")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(450, 0)));
		
		JButton buttonReset = new JButton("Reset");
		buttonReset.setActionCommand("resetBedPosition");
		buttonReset.addActionListener(this);
		panel.add(buttonReset);
		panel.add(Box.createRigidArea(new Dimension(50, 0)));
		
	
		return panel;
	}

    private JPanel smartBedStatusPanel() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        bedStatus = new JTextField(10);
        panel.add(bedStatus);
        
        panel.setLayout(boxlayout);

        return panel;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //third page -> Smart Climate Controls ################################################################################
    //title
    private JPanel smartClimateControlServiceTitlePanel() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel label = new JLabel("Climate Control Suite:")	;
        panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
     	JLabel labelRoom = new JLabel("(RoomID: 485)")	;
       	panel.add(labelRoom);
        panel.add(Box.createRigidArea(new Dimension(450, 0)));

        JButton buttonReturn = new JButton("Return");
        buttonReturn.addActionListener(this);
        panel.add(buttonReturn);
        panel.add(Box.createRigidArea(new Dimension(50, 0)));


        return panel;
    }
    //Temp controls
    private JPanel smartClimateTemperatureControlPanel() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel label = new JLabel("Adjust Temperature(C): ")	;
        panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(250, 0)));


        // create buttons to increment or decrement head position
        JButton minusButtonTemperature = new JButton("-");
        minusButtonTemperature.setActionCommand("decrementTemperature");
        minusButtonTemperature.addActionListener(this);
        panel.add(minusButtonTemperature);

        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        // Display current Temperature
        // set text to getTemperature 
        temperatureReply = new JTextField("23.0", 5);
        temperatureReply.setEditable(false);
        panel.add(temperatureReply);

        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton plusButtonTemperature = new JButton("+");
        plusButtonTemperature.setActionCommand("incrementTemperature");
        plusButtonTemperature.addActionListener(this);
        panel.add(plusButtonTemperature);

        panel.add(Box.createRigidArea(new Dimension(20, 0)));

        // Create the submit button for setHeadTemperature method
        JButton submitButtonTemperature = new JButton("Submit");
        submitButtonTemperature.setActionCommand("submitTemperature");
        submitButtonTemperature.addActionListener(this);
        panel.add(submitButtonTemperature);
        panel.add(Box.createRigidArea(new Dimension(50, 0)));

        panel.setLayout(boxlayout);

        return panel;
    }
    

    //humidity controls
    private JPanel smartClimateHumidityControlPanel() {

    	JPanel panel = new JPanel();

    	BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

    	JLabel label = new JLabel("Adjust Humidity(%): ")	;
    	panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(300, 0)));


        // create buttons to increment or decrement head position
        JButton minusButtonHumidity = new JButton("-");
        minusButtonHumidity.setActionCommand("decrementHumidity");
        minusButtonHumidity.addActionListener(this);
        panel.add(minusButtonHumidity);

        panel.add(Box.createRigidArea(new Dimension(10, 0)));

	    // Display current Humidity
	    // set text to getHumidity
	    humidityReply = new JTextField("0.0", 5);
	    humidityReply.setEditable(false);
	    panel.add(humidityReply);
	
	    panel.add(Box.createRigidArea(new Dimension(10, 0)));
	
	    JButton plusButtonHumidity = new JButton("+");
	    plusButtonHumidity.setActionCommand("incrementHumidity");
	    plusButtonHumidity.addActionListener(this);
	    panel.add(plusButtonHumidity);
	
	    panel.add(Box.createRigidArea(new Dimension(20, 0)));
	
	    // Create the submit button for setHumidity method
	    JButton submitButtonHumidity = new JButton("Submit");
	    submitButtonHumidity.setActionCommand("submitHumidity");
	    submitButtonHumidity.addActionListener(this);
	    panel.add(submitButtonHumidity);
	    panel.add(Box.createRigidArea(new Dimension(50, 0)));

        panel.setLayout(boxlayout);

        return panel;
    }
    
    private JPanel smartClimateStatusPanel() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        climateStatus = new JTextField(10);
        panel.add(climateStatus);
        
        panel.setLayout(boxlayout);

        return panel;
    }

//fourth page -> Vital Monitor Controls ################################################################################

	private JPanel vitalSignsServiceTitlePanel() {
		
		JPanel panel = new JPanel();
	
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		JLabel labelTitle = new JLabel("Vital Monitor Suite:")	;
		panel.add(labelTitle);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		JLabel labelPatient = new JLabel("(PatientID: 1103465)")	;
		panel.add(labelPatient);
		panel.add(Box.createRigidArea(new Dimension(400, 0)));
		
		JButton buttonReturn = new JButton("Return");
		buttonReturn.addActionListener(this);
		panel.add(buttonReturn);
		panel.add(Box.createRigidArea(new Dimension(50, 0)));
		
		panel.setLayout(boxlayout);
		
		return panel;
	}
	
	private JPanel vitalSignsCurrentLabelPanel() {
		
		JPanel panel = new JPanel();
	
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        
        
        JLabel labelHR = new JLabel("Current HeartRate(bpm):")	;
        panel.add(labelHR);
        

        panel.add(getVerticalSpacingPanel());
		JLabel labelTemp = new JLabel("Current Temperature(C)")	;
		panel.add(labelTemp);
        

        panel.add(getVerticalSpacingPanel());
        JLabel labelSpo2 = new JLabel("Current Blood Oxygen(%)");
        panel.add(labelSpo2);
        
	
        panel.setLayout(boxlayout);
	
        return panel;
	}

	private JPanel vitalSignsUpdateLabelPanel() {
	
		JPanel panel = new JPanel();
	
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        
        
        JLabel labelHR = new JLabel("Update HeartRate(bpm):")	;
        panel.add(labelHR);
        

        panel.add(getVerticalSpacingPanel());
		JLabel labelTemp = new JLabel("Update Temperature(C)")	;
		panel.add(labelTemp);
        

        panel.add(getVerticalSpacingPanel());
        JLabel labelSpo2 = new JLabel("Update Blood Oxygen(%)");
        panel.add(labelSpo2);
        
	
        panel.setLayout(boxlayout);
	
	return panel;
}

	private JPanel vitalSignsReadingsPanel() {
		
		JPanel panel = new JPanel();
	
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        
        hrRequest = new JTextField("68",3);
		panel.add(hrRequest);
	        
		panel.add(getVerticalSpacingPanel());
		bodyTempRequest = new JTextField("36.6",3);
		panel.add(bodyTempRequest);
	    
	    panel.add(getVerticalSpacingPanel());
	    Spo2Request = new JTextField("98",3);
	    panel.add(Spo2Request);
        
	
        panel.setLayout(boxlayout);
	
        return panel;
	}

	private JPanel vitalSignsCurrentReadingsPanel() {
	
		JPanel panel = new JPanel();
		
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
	    
		hrReply = new JTextField("68",3);
        hrReply.setEditable(false);
		panel.add(hrReply);
	        
		panel.add(getVerticalSpacingPanel());
		bodyTempReply = new JTextField("36.6",3);
		bodyTempReply.setEditable(false);
		panel.add(bodyTempReply);
        
        panel.add(getVerticalSpacingPanel());
        Spo2Reply = new JTextField("98",3);
        Spo2Reply.setEditable(false);
        panel.add(Spo2Reply);
	
	    panel.setLayout(boxlayout);
	
	    return panel;
	}

	private JPanel vitalSignsUpdatePanel() {
		
		JPanel panel = new JPanel();
	
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        
        panel.add(Box.createRigidArea(new Dimension(20, 100)));
        
        JPanel internalPanel = new JPanel();
        BoxLayout internalBoxLayout= new BoxLayout(internalPanel, BoxLayout.X_AXIS);
        
        JButton buttonHistory = new JButton("History");
        buttonHistory.setActionCommand("getHistory");
        buttonHistory.addActionListener(this);
        internalPanel.add(buttonHistory);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        
        JButton buttonUpdate = new JButton("Update");
        buttonUpdate.setActionCommand("submitVitals");
        buttonUpdate.addActionListener(this);
        internalPanel.add(buttonUpdate);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        
        panel.add(internalPanel);
        
        panel.setLayout(boxlayout);
	
        return panel;
	}

	private JPanel smartVitalSignsStatusPanel() {
	
	    JPanel panel = new JPanel();
	
	    BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
	
	    vitalStatus = new JTextField(10);
	    panel.add(vitalStatus);
	    
	    panel.setLayout(boxlayout);
	
	    return panel;
	}
	
	private JPanel smartVitalSignsSafetyPanel() {
		
	    JPanel panel = new JPanel();
	
	    BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
	
	    vitalSafetyStatus = new JTextField("Safety Status: ",10);
	    vitalSafetyStatus.setEditable(false);
	    panel.add(vitalSafetyStatus);
	    
	    panel.setLayout(boxlayout);
	
	    return panel;
	}

	
	
	//helper method to format stream of history responses
	private String formatResponseToString(GetVitalSignsHistoryResponse response) {
	   String returnable = String.format("HeartRate(BPM): %d | Temperature(C): %.2f | Blood Oxygen(SpO2): %d | Time: %s \n",
	            response.getHeartRateBPM(),
	            response.getBodyTemp(),
	            response.getSpo2(),
	            response.getTime());
	   return returnable;
	}
	
	// helper method to append record to text area
	private void addRecordToHistory(String record){
		
		historyTextArea.append(record);
	}
	
public static void main(String[] args) {

	SmartHospitalRoomGui gui = new SmartHospitalRoomGui();

	gui.buildHomePage();
}

	private void closeFrame() {
        if (frame != null) {
            frame.dispose();
        }
}


	private void buildHomePage() { 

		frame = new JFrame("Smart Hospital Room App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
	
		panel.add( getSmartBedControlServicePanel() );
                panel.add(getVerticalSpacingPanel());
		panel.add( getSmartClimateControlServicePanel() );
                panel.add(getVerticalSpacingPanel());
                panel.add( getVitalSignsControlServicePanel() );


		// Set size for the frame
		frame.setSize(600, 600);

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
        
 
        
        private void buildBedPage() { 

		frame = new JFrame("Smart Bed Control App");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
	
		panel.add( smartBedControlServiceTitlePanel() );
                panel.add(getVerticalSpacingPanel());
		panel.add( smartBedHeadControlPanel() );
                panel.add(getVerticalSpacingPanel());
                panel.add( smartBedFootControlPanel() );
                panel.add(getVerticalSpacingPanel());
                panel.add(smartBedResetPanel());
                panel.add(getVerticalSpacingPanel());
                panel.add(smartBedStatusPanel());

		// Set size for the frame
		frame.setSize(600, 600);

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

        private void buildClimatePage() { 

		frame = new JFrame("Climate Control App");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
	
		panel.add( smartClimateControlServiceTitlePanel() );
        panel.add(getVerticalSpacingPanel());
		


		// Set size for the frame
		frame.setSize(600, 600);

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
        
        private void buildVitalPage() { 

		frame = new JFrame("Vital Monitor Control App");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        
        panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
	
		panel.add( vitalSignsServiceTitlePanel() );
                panel.add(getVerticalSpacingPanel());
                
                JPanel contentPanel = new JPanel();
                
                BoxLayout contentBoxLayout = new BoxLayout(contentPanel, BoxLayout.X_AXIS);
                contentPanel.setLayout(contentBoxLayout);
                
                contentPanel.add(vitalSignsCurrentLabelPanel());
                contentPanel.add(getHorizontalSpacingPanel());
                
                contentPanel.add(vitalSignsCurrentReadingsPanel());
                contentPanel.add(getHorizontalSpacingPanel());
                
                contentPanel.add(vitalSignsUpdateLabelPanel());
                contentPanel.add(getHorizontalSpacingPanel());
                
                contentPanel.add(vitalSignsReadingsPanel());
                contentPanel.add(getHorizontalSpacingPanel());
                
                contentPanel.add(vitalSignsUpdatePanel());
                
                
                
                
                
                panel.add(contentPanel);
                panel.add(getVerticalSpacingPanel());
                panel.add(smartVitalSignsStatusPanel());
                panel.add(getVerticalSpacingPanel());
                panel.add(smartVitalSignsSafetyPanel());
                
                frame.add(panel);
                frame.pack();
                frame.setVisible(true);
                
        }
        
        private void buildHistoryPage() {
        	
        	frame = new JFrame("Vital Monitor History");
    		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        	// Set the panel to add buttons
    		JPanel panel = new JPanel();

    		// Set the BoxLayout to be X_AXIS: from left to right
    		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
    		
    		historyTextArea = new JTextArea(100,100);
    		historyTextArea.setEditable(false);
    		panel.add(historyTextArea);
    		
    		
    		// Set size for the frame
    		frame.setSize(300, 300);

    		// Set the window to be visible as the default to be false
    		frame.add(panel);
    		frame.pack();
    		frame.setVisible(true);
        	
        } 
        
        

   
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
        
        	// init bed control suite and call get method
            case "bedControl":
                closeFrame();
                
    			buildBedPage();
    			
                ManagedChannel channel1 = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
    			SmartBedControlServiceGrpc.SmartBedControlServiceBlockingStub blockingStub1 = 
    					SmartBedControlServiceGrpc.newBlockingStub(channel1);

    			try {
    				//empty message to reset
        			ds.SmartBedControlService.Empty request1 = ds.SmartBedControlService.Empty.newBuilder().build();

        			//retrieving reply from service
        			ds.SmartBedControlService.GetBedPositionResponse response1 = blockingStub1.getBedPositionDo(request1);

        			bedHeadPositionReply.setText( String.valueOf( response1.getBedHeadPosition()) );
        			bedFootPositionReply.setText( String.valueOf( response1.getBedFootPosition()) );

    			} catch (Exception ex) {
    	            ex.printStackTrace(); 
    	        } finally {
    	            if (channel1 != null) {
    	                try {
    	                	channel1.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    	                } catch (InterruptedException ex) {
    	                	channel1.shutdownNow();
    	                }
    	            }
    	        }
    			break;
    			
    			// init climate control suite and call get method
            case "climateControl":
                closeFrame();
                
                buildClimatePage();
                
                ManagedChannel channel5 = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
                SmartClimateControlServiceGrpc.SmartClimateControlServiceBlockingStub blockingStub5 = 
                		SmartClimateControlServiceGrpc.newBlockingStub(channel5);

    			try {
    				//RoomID in message to get
        			ds.SmartClimateControlService.GetClimateReadingRequest request5 = ds.SmartClimateControlService.GetClimateReadingRequest
        					.newBuilder()
        					.setRoomID(roomID)
        					.build();

        			//retrieving reply from service
        			GetClimateReadingResponse response5 = blockingStub5.getClimateReadingDo(request5);

        			temperatureReply.setText( String.valueOf( response5.getTemperature()) );
        			humidityReply.setText( String.valueOf( response5.getHumidity()) );
    			} catch (Exception ex) {
    	            ex.printStackTrace(); 
    	        } finally {
    	            if (channel5 != null) {
    	                try {
    	                	channel5.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    	                } catch (InterruptedException ex) {
    	                	channel5.shutdownNow();
    	                }
    	            }
    	        }
                break;
                
             // init vital control suite and call get method
            case "vitalControl":
                closeFrame();
                buildVitalPage();
                
                ManagedChannel channel8 = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
                VitalSignsControlServiceGrpc.VitalSignsControlServiceBlockingStub blockingStub8 = 
                		VitalSignsControlServiceGrpc.newBlockingStub(channel8);
    			try {
    				//PatientID in message to get
        			ds.VitalSignsControlService.GetVitalSignsRequest request8 = ds.VitalSignsControlService.GetVitalSignsRequest
        					.newBuilder()
        					.setPatientID(patientID)
        					.build();

        			//retrieving reply from service
        			GetVitalSignsLatestResponse response8 = blockingStub8.getVitalSignsLatestDo(request8);

        			hrReply.setText( String.valueOf( response8.getHeartRateBPM()) );
        			bodyTempReply.setText( String.valueOf( response8.getBodyTemp()) );
        			Spo2Reply.setText( String.valueOf( response8.getSpo2()) );
        			//vitalStatus.setText(response8.getStatusMessage());
	    			} catch (Exception ex) {
				            ex.printStackTrace();
				        } finally {
				            if (channel8 != null) {
				                try {
				                	channel8.shutdown().awaitTermination(5, TimeUnit.SECONDS);
				                } catch (InterruptedException ex) {
				                	channel8.shutdownNow();
				                }
				            }
				        }
    			
    			
    			
                break;
                
                
                //Begin Bed Controls
            case "resetBedPosition":
            	ManagedChannel channel4 = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
    			SmartBedControlServiceGrpc.SmartBedControlServiceBlockingStub blockingStub4 = 
    					SmartBedControlServiceGrpc.newBlockingStub(channel4);
    			try {
    				//empty message to reset
        			ds.SmartBedControlService.Empty request4 = ds.SmartBedControlService.Empty.newBuilder().build();

        			//retrieving reply from service
        			ds.SmartBedControlService.ResetBedPositionResponse response4 = blockingStub4.resetBedPositionDo(request4);

        			bedHeadPositionReply.setText( String.valueOf( response4.getBedHeadPosition()) );
        			bedFootPositionReply.setText( String.valueOf( response4.getBedFootPosition()) );
        			bedStatus.setText(response4.getStatusMessage());
                    
                    
	    			} catch (Exception ex) {
	    	            ex.printStackTrace();
	    	        } finally {
	    	            if (channel4 != null) {
	    	                try {
	    	                	channel4.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	    	                } catch (InterruptedException ex) {
	    	                	channel4.shutdownNow();
	    	                }
	    	            }
	    	        }
    			break;
                //Bed Head Controls GUI methods
            case "incrementHeadCounter":
            	double currentHeadValue = Double.parseDouble(bedHeadPositionReply.getText());
            	double increment = 0.5;
            	
            	double newValue1 = currentHeadValue + increment;
            	
            	bedHeadPositionReply.setText(Double.toString(newValue1));
                break;
                
            case "decrementHeadPosition":
            	double currentHeadValue2 = Double.parseDouble(bedHeadPositionReply.getText());
            	double decrement = 0.5;
            	
            	double newValue2 = currentHeadValue2 - decrement;
            	
            	bedHeadPositionReply.setText(Double.toString(newValue2));

                break;
                
            case "submitHeadPosition":
            	ManagedChannel channel2 = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
    			SmartBedControlServiceGrpc.SmartBedControlServiceBlockingStub blockingStub2 = 
    					SmartBedControlServiceGrpc.newBlockingStub(channel2);

    			//building message to set
    			ds.SmartBedControlService.SetBedHeadPositionRequest request2 = ds.SmartBedControlService.SetBedHeadPositionRequest
    					.newBuilder()
    					.setBedHeadPosition(Float.parseFloat(bedHeadPositionReply.getText()))
    					.build();

    			//retrieving reply from service
    			ds.SmartBedControlService.SetBedHeadPositionResponse response2 = blockingStub2.setBedHeadPositionDo(request2);

    			bedHeadPositionReply.setText( String.valueOf( response2.getBedHeadPosition()) );
    			bedStatus.setText(response2.getStatusMessage());
                break;
                
                // Bed Foot Controls GUI methods
            case "incrementFootPosition":
            	double currentFootValue = Double.parseDouble(bedFootPositionReply.getText());
            	increment = 0.5;
            	
            	double newValue3 = currentFootValue + increment;
            	
            	bedFootPositionReply.setText(Double.toString(newValue3));
                break;
                
            case "decrementFootPosition":
            	double currentFootValue2 = Double.parseDouble(bedFootPositionReply.getText());
            	increment = 0.5;
            	
            	double newValue4 = currentFootValue2 - increment;
            	
            	bedFootPositionReply.setText(Double.toString(newValue4));
                break;
                
            case "submitFootPosition":
            	ManagedChannel channel3 = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
    			SmartBedControlServiceGrpc.SmartBedControlServiceBlockingStub blockingStub3 = 
    					SmartBedControlServiceGrpc.newBlockingStub(channel3);

    			try {
    				//building message to set
        			ds.SmartBedControlService.SetBedFootPositionRequest request3 = ds.SmartBedControlService.SetBedFootPositionRequest
        					.newBuilder()
        					.setBedFootPosition(Float.parseFloat(bedFootPositionReply.getText()))
        					.build();

        			//retrieving reply from service
        			ds.SmartBedControlService.SetBedFootPositionResponse response3 = blockingStub3.setBedFootPositionDo(request3);

        			bedFootPositionReply.setText( String.valueOf( response3.getBedFootPosition()) );
        			bedStatus.setText(response3.getStatusMessage());
    			} catch (Exception ex) {
    	            ex.printStackTrace();
    	        } finally {
    	            if (channel3 != null) {
    	                try {
    	                	channel3.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    	                } catch (InterruptedException ex) {
    	                	channel3.shutdownNow();
    	                }
    	            }
    	        }
                break;
                
                
                
                
                
                
                
                //Begin Climate Controls
            case "incrementTemperature":
            	double currentTemperatureValue = Double.parseDouble(temperatureReply.getText());
            	increment = 0.5;
            	
            	double newValue5 = currentTemperatureValue + increment;
            	
            	temperatureReply.setText(Double.toString(newValue5));

                break;
            case "decrementTemperature":
            	double currentTemperatureValue2 = Double.parseDouble(temperatureReply.getText());
            	increment = 0.5;
            	
            	double newValue6 = currentTemperatureValue2 - increment;
            	
            	temperatureReply.setText(Double.toString(newValue6));
                break;
            case "submitTemperature":
            	ManagedChannel channel6 = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
                SmartClimateControlServiceGrpc.SmartClimateControlServiceBlockingStub blockingStub6 = 
                		SmartClimateControlServiceGrpc.newBlockingStub(channel6);

    			try {
    				//message to set Temperature field
        			ds.SmartClimateControlService.SetTemperatureRequest request6 = ds.SmartClimateControlService.SetTemperatureRequest
        					.newBuilder()
        					.setTemperature(Float.parseFloat(temperatureReply.getText()))
        					.build();

        			//retrieving reply from service
        			ds.SmartClimateControlService.SetTemperatureResponse response6 = blockingStub6.setTemperatureDo(request6);

        			temperatureReply.setText( String.valueOf( response6.getTemperature()) );
        			climateStatus.setText( response6.getStatusMessage());
        			
    			} catch (Exception ex) {
    	            ex.printStackTrace();
    	        } finally {
    	            if (channel6 != null) {
    	                try {
    	                	channel6.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    	                } catch (InterruptedException ex) {
    	                	channel6.shutdownNow();
    	                }
    	            }
    	        }
    			break;
                
                //Humidity Controls
            case "incrementHumidity":
            	double currentHumidityValue = Double.parseDouble(humidityReply.getText());
            	increment = 0.5;
            	
            	double newValue7 = currentHumidityValue + increment;
            	
            	humidityReply.setText(Double.toString(newValue7));
                break;
            case "decrementHumidity":
            	double currentHumidityValue2 = Double.parseDouble(humidityReply.getText());
            	increment = 0.5;
            	
            	double newValue8 = currentHumidityValue2 - increment;
            	
            	humidityReply.setText(Double.toString(newValue8));
                break;
            case "submitHumidity":
            	ManagedChannel channel7 = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
                SmartClimateControlServiceGrpc.SmartClimateControlServiceBlockingStub blockingStub7 = 
                		SmartClimateControlServiceGrpc.newBlockingStub(channel7);

    			try {
    				//message to set Humidity field
        			ds.SmartClimateControlService.SetHumidityRequest request7 = ds.SmartClimateControlService.SetHumidityRequest
        					.newBuilder()
        					.setHumidity(Float.parseFloat(humidityReply.getText()))
        					.build();

        			//retrieving reply from service
        			ds.SmartClimateControlService.SetHumidityResponse response7 = blockingStub7.setHumidityDo(request7);

        			humidityReply.setText( String.valueOf( response7.getHumidity()) );
        			climateStatus.setText( response7.getStatusMessage());
    			} catch (Exception ex) {
    	            ex.printStackTrace();
    	        } finally {
    	            if (channel7 != null) {
    	                try {
    	                	channel7.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    	                } catch (InterruptedException ex) {
    	                	channel7.shutdownNow();
    	                }
    	            }
    	        }
    			
    			
                break;
                
                //generic app home return button
            case "Return":
                closeFrame();
                buildHomePage();
                break;
                
                //Begin Vital Controls
            case "getHistory":
            	
            	buildHistoryPage();
            	
            	ManagedChannel channel9 = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
                VitalSignsControlServiceGrpc.VitalSignsControlServiceBlockingStub blockingStub9 = 
                 		VitalSignsControlServiceGrpc.newBlockingStub(channel9);

     			try {
     				// Patient Id in Message to get record history
         			ds.VitalSignsControlService.GetVitalSignsRequest request9 = ds.VitalSignsControlService.GetVitalSignsRequest
         					.newBuilder()
         					.setPatientID(patientID)
         					.build();

         			//retrieving and handling replies from service
         			 Iterator<GetVitalSignsHistoryResponse> responses = blockingStub9.getVitalSignsHistoryDo(request9);

                     // Process and append each response from the server
                     while (responses.hasNext()) {
                         GetVitalSignsHistoryResponse response = responses.next();
                         addRecordToHistory(formatResponseToString(response));
	     			}
	     				} catch (Exception ex) {
		                    ex.printStackTrace(); 
		                } finally {
		                    if (channel9 != null) {
		                        try {
		                        	channel9.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		                        } catch (InterruptedException ex) {
		                        	channel9.shutdownNow();
		                        }
		                    }
		                } 	
		            break;
            	
            	// includes monitor method
            case "submitVitals":
            	ManagedChannel channel10 = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
                VitalSignsControlServiceGrpc.VitalSignsControlServiceBlockingStub blockingStub10 = 
                		VitalSignsControlServiceGrpc.newBlockingStub(channel10);
            	try {
            		
        			SetVitalSignsRequest request10 = ds.VitalSignsControlService.SetVitalSignsRequest
        					.newBuilder()
        					.setPatientID(patientID)
        					.setHeartRateBPM(Integer.parseInt(hrRequest.getText()))
        					.setBodyTemp(Double.parseDouble(bodyTempRequest.getText()))
        					.setSpo2(Integer.parseInt(Spo2Request.getText()))
        					.setTime(java.time.LocalDateTime.now().toString())
        					.build();

        			//retrieving reply from service
        			SetVitalSignsResponse response10 = blockingStub10.setVitalSignsDo(request10);

        			if(response10.getResult() == OperationalStatus.Success) {
        				hrReply.setText( String.valueOf( (request10.getHeartRateBPM())) );
            			bodyTempReply.setText( String.valueOf( request10.getBodyTemp()));
            			Spo2Reply.setText( String.valueOf( request10.getSpo2()));
            			vitalStatus.setText(response10.getStatusMessage());
        			} else {
        				vitalStatus.setText(response10.getStatusMessage());
        			}
        			
            	} catch (Exception ex) {
                    ex.printStackTrace(); 
                } finally {
                    if (channel10 != null) {
                        try {
                        	channel10.shutdown().awaitTermination(5, TimeUnit.SECONDS);
                        } catch (InterruptedException ex) {
                        	channel10.shutdownNow();
                        }
                    }
                } 	
            	
            	//bidirectional streaming method to monitor safety range for vitals
    			ManagedChannel channel11 = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
                VitalSignsControlServiceGrpc.VitalSignsControlServiceStub asyncStub11 = 
                		VitalSignsControlServiceGrpc.newStub(channel11);
                
  

                	StreamObserver<VitalSignsMonitorResponse> responseObserver = new StreamObserver<VitalSignsMonitorResponse>() {
                        @Override
                        public void onNext(VitalSignsMonitorResponse response) {
                            
                        	//Handle each response from the server
                        	vitalSafetyStatus.setText(response.getStatusMessage());
                        }

						@Override
						public void onError(Throwable t) {
							t.printStackTrace();
							
						}

						@Override
						public void onCompleted() {

						}
					};
					
					StreamObserver<VitalSignsMonitorRequest> requestObserver = asyncStub11.monitorVitalSignsReading(responseObserver);
					try {
						requestObserver.onNext(VitalSignsMonitorRequest.newBuilder()
					            .setPatientID(patientID)
					            .setHeartRateBPM(Integer.parseInt(hrRequest.getText()))
					            .setBodyTemp(Double.parseDouble(bodyTempRequest.getText()))
					            .setSpo2(Integer.parseInt(Spo2Request.getText()))
					            .setTime(java.time.LocalDateTime.now().toString())
					            .build());
						
						
				        requestObserver.onCompleted();

					} catch (Exception ex) {
			            ex.printStackTrace();
			        } finally {
			            if (channel11 != null) {
			                try {
			                	channel11.shutdown().awaitTermination(5, TimeUnit.SECONDS);
			                } catch (InterruptedException ex) {
			                	channel11.shutdownNow();
			                }
			            }
			        }
            	break;
        }
    }
}