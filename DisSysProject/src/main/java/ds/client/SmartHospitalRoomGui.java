package ds.client;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ds.SmartBedControlService.SmartBedControlServiceGrpc;
import ds.SmartClimateControlService.SmartClimateControlServiceGrpc;
import ds.VitalSignsControlService.VitalSignsControlServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class SmartHospitalRoomGui implements ActionListener{
    
        // used to close frames when swappig between services
    private JFrame frame; 
    
    //used to update textfields
    private JTextField bedStatus, climateStatus, vitalStatus, hrReply, bodyTempReply, Spo2Reply;

//first page -> select services 
    
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
                
                
//		JButton button = new JButton("Enter");
//		button.addActionListener(this);
//              button.setActionCommand(actionCommand);
//		panel.add(button);
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
	minusButtonHead.addActionListener(this);
    panel.add(minusButtonHead);

    panel.add(Box.createRigidArea(new Dimension(10, 0)));

    // Display current head position
    // set text to getHeadPosition
    JTextField headPosition = new JTextField("0.0", 5);
    headPosition.setEditable(false);
    panel.add(headPosition);

    panel.add(Box.createRigidArea(new Dimension(10, 0)));

    JButton plusButtonHead = new JButton("+");
    plusButtonHead.addActionListener(this);
    panel.add(plusButtonHead);

    panel.add(Box.createRigidArea(new Dimension(20, 0)));

    // Create the submit button for setHeadPosition method
    JButton submitButtonHead = new JButton("Submit");
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
	minusButtonFoot.addActionListener(this);
    panel.add(minusButtonFoot);

    panel.add(Box.createRigidArea(new Dimension(10, 0)));

    // Display current head position
    // set text to getFootPosition
    JTextField footPosition = new JTextField("0.0", 5);
    footPosition.setEditable(false);
    panel.add(footPosition);

    panel.add(Box.createRigidArea(new Dimension(10, 0)));

    JButton plusButtonFoot = new JButton("+");
    plusButtonFoot.addActionListener(this);
    panel.add(plusButtonFoot);

    panel.add(Box.createRigidArea(new Dimension(20, 0)));

    // Create the submit button for setHeadPosition method
    JButton submitButtonFoot = new JButton("Submit");
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
	buttonReset.addActionListener(this);
	panel.add(buttonReset);
	panel.add(Box.createRigidArea(new Dimension(50, 0)));
	

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
            minusButtonTemperature.addActionListener(this);
            panel.add(minusButtonTemperature);

            panel.add(Box.createRigidArea(new Dimension(10, 0)));

            // Display current Temperature
            // set text to getTemperature 
            JTextField currentTemperature = new JTextField("0.0", 5);
            currentTemperature.setEditable(false);
            panel.add(currentTemperature);

            panel.add(Box.createRigidArea(new Dimension(10, 0)));

            JButton plusButtonTemperature = new JButton("+");
            plusButtonTemperature.addActionListener(this);
            panel.add(plusButtonTemperature);

            panel.add(Box.createRigidArea(new Dimension(20, 0)));

     // Create the submit button for setHeadTemperature method
     JButton submitButtonTemperature = new JButton("Submit");
     submitButtonTemperature.addActionListener(this);
     panel.add(submitButtonTemperature);
     panel.add(Box.createRigidArea(new Dimension(50, 0)));

            panel.setLayout(boxlayout);

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

    //humidity controls
    private JPanel smartClimateHumidityControlPanel() {

            JPanel panel = new JPanel();

            BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

            JLabel label = new JLabel("Adjust Humidity(%): ")	;
            panel.add(label);
            panel.add(Box.createRigidArea(new Dimension(300, 0)));


            // create buttons to increment or decrement head position
            JButton minusButtonHumidity = new JButton("-");
            minusButtonHumidity.addActionListener(this);
     panel.add(minusButtonHumidity);

     panel.add(Box.createRigidArea(new Dimension(10, 0)));

     // Display current Humidity
     // set text to getHumidity
     JTextField currentHumidity = new JTextField("0.0", 5);
     currentHumidity.setEditable(false);
     panel.add(currentHumidity);

     panel.add(Box.createRigidArea(new Dimension(10, 0)));

     JButton plusButtonHumidity = new JButton("+");
     plusButtonHumidity.addActionListener(this);
     panel.add(plusButtonHumidity);

     panel.add(Box.createRigidArea(new Dimension(20, 0)));

     // Create the submit button for setHumidity method
     JButton submitButtonHumidity = new JButton("Submit");
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

private JPanel vitalSignsPanel() {
	
	JPanel panel = new JPanel();
	
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        
        
        JLabel labelHR = new JLabel("HeartRate(bpm):")	;
	panel.add(labelHR);
        

        panel.add(getVerticalSpacingPanel());
	JLabel labelTemp = new JLabel("Temperature(C)")	;
	panel.add(labelTemp);
        

        panel.add(getVerticalSpacingPanel());
        JLabel labelSpo2 = new JLabel("Blood Oxygen(%)");
	panel.add(labelSpo2);
        
	
        panel.setLayout(boxlayout);
	
	return panel;
}
private JPanel vitalSignsReadingPanel() {
	
	JPanel panel = new JPanel();
	
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        
        hrReply = new JTextField(3);
	panel.add(hrReply);
        
	panel.add(getVerticalSpacingPanel());
	bodyTempReply = new JTextField(3);
	panel.add(bodyTempReply);
        
        panel.add(getVerticalSpacingPanel());
        Spo2Reply = new JTextField(3);
	panel.add(Spo2Reply);
	
        panel.setLayout(boxlayout);
	
	return panel;
}

private JPanel vitalSignsUpdatePanel() {
	
	JPanel panel = new JPanel();
	
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        
        panel.add(Box.createRigidArea(new Dimension(20, 100)));
        
        JButton buttonUpdate = new JButton("Update");
            buttonUpdate.setActionCommand("setVitals");
            buttonUpdate.addActionListener(this);
            panel.add(buttonUpdate);
            panel.add(Box.createRigidArea(new Dimension(50, 0)));
        
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
		panel.add( smartClimateTemperatureControlPanel() );
                panel.add(getVerticalSpacingPanel());
                panel.add( smartClimateHumidityControlPanel() );
                panel.add(getVerticalSpacingPanel());
                panel.add(smartClimateStatusPanel());


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
                
                contentPanel.add(vitalSignsPanel());
                contentPanel.add(getHorizontalSpacingPanel());
                contentPanel.add(vitalSignsReadingPanel());
                contentPanel.add(getHorizontalSpacingPanel());
                contentPanel.add(vitalSignsUpdatePanel());
                
                panel.add(contentPanel);
                panel.add(getVerticalSpacingPanel());
                panel.add(smartVitalSignsStatusPanel());
                
                frame.add(panel);
                frame.pack();
                frame.setVisible(true);
                
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "bedControl":
                closeFrame();
                buildBedPage();
                break;
            case "climateControl":
                closeFrame();
                buildClimatePage();
                break;
            case "vitalControl":
                closeFrame();
                buildVitalPage();
                break;
            case "resetBed":
                // Reset bed logic
                break;
            case "incrementheadPosition":
                // Increment head position
                break;
            case "decrementheadPosition":
                // Decrement head position
                break;
            case "submitheadPosition":
                // Submit head position
                break;
            case "incrementfootPosition":
                // Increment foot position
                break;
            case "decrementfootPosition":
                // Decrement foot position
                break;
            case "submitfootPosition":
                // Submit foot position
                break;
            case "incrementtemperatureField":
                // Increment temperature
                break;
            case "decrementtemperatureField":
                // Decrement temperature
                break;
            case "submittemperatureField":
                // Submit temperature
                break;
            case "incrementhumidityField":
                // Increment humidity
                break;
            case "decrementhumidityField":
                // Decrement humidity
                break;
            case "submithumidityField":
                // Submit humidity
                break;
            case "Return":
                closeFrame();
                buildHomePage();
                break;
        }
    }
}