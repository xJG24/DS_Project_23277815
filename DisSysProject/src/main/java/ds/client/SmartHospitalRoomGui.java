package ds.client;

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

import ds.SmartBedControlService.SmartBedControlServiceGrpc;
import ds.SmartClimateControlService.SmartClimateControlServiceGrpc;
import ds.VitalSignsControlService.VitalSignsControlServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class SmartHospitalRoomGui implements ActionListener{

//first page -> select services 
	private JPanel getSmartBedControlServicePanel() {
		
		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		JLabel label = new JLabel("Smart Bed Control Suite:")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(50, 0)));
		
		JButton button = new JButton("Enter");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(50, 0)));
		
		panel.setLayout(boxlayout);

		return panel;
	}
	
	private JPanel getSmartClimateControlServicePanel() {
		
		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		JLabel label = new JLabel("Climate Control Suite:")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(50, 0)));
		
		JButton button = new JButton("Enter");
		button.addActionListener(this);
		panel.add(button);
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
		
		JButton button = new JButton("Enter");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(50, 0)));
		
		panel.setLayout(boxlayout);

		return panel;
	}

// second page -> Smart Bed Controls ################################################################################
//title
private JPanel smartBedControlServiceTitlePanel() {
	
	JPanel panel = new JPanel();

	BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
	
	JLabel label = new JLabel("Smart Bed Control Suite:")	;
	panel.add(label);
	panel.add(Box.createRigidArea(new Dimension(300, 0)));
	
	JButton buttonReturn = new JButton("Return");
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
	panel.add(Box.createRigidArea(new Dimension(300, 0)));
	
	JButton buttonReset = new JButton("Reset");
	buttonReset.addActionListener(this);
	panel.add(buttonReset);
	panel.add(Box.createRigidArea(new Dimension(50, 0)));
	

	return panel;
}

//third page -> Smart Climate Controls ################################################################################
//title
private JPanel smartClimateControlServiceTitlePanel() {
	
	JPanel panel = new JPanel();

	BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
	
	JLabel label = new JLabel("Climate Control Suite:")	;
	panel.add(label);
	panel.add(Box.createRigidArea(new Dimension(300, 0)));
	
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
	panel.add(Box.createRigidArea(new Dimension(300, 0)));
	
	
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

 // Create the submit button for setHeadPosition method
 JButton submitButtonTemperature = new JButton("Submit");
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

//fourth page -> Vital Monitor Controls ################################################################################

private JPanel vitalSignsServiceTitlePanel() {
	
	JPanel panel = new JPanel();

	BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
	
	JLabel label = new JLabel("Vital Monitor Suite:")	;
	panel.add(label);
	panel.add(Box.createRigidArea(new Dimension(300, 0)));
	
	JButton buttonReturn = new JButton("Return");
	buttonReturn.addActionListener(this);
	panel.add(buttonReturn);
	panel.add(Box.createRigidArea(new Dimension(50, 0)));
	

	return panel;
}
	

//sample code ################################################################################################################
	private JTextField entry1, reply1;
	private JTextField entry2, reply2;
	private JTextField entry3, reply3;
	private JTextField entry4, reply4;


	private JPanel getService1JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry1 = new JTextField("",10);
		panel.add(entry1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 1");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply1 = new JTextField("", 10);
		reply1 .setEditable(false);
		panel.add(reply1 );

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getService2JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry2 = new JTextField("",10);
		panel.add(entry2);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 2");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply2 = new JTextField("", 10);
		reply2 .setEditable(false);
		panel.add(reply2 );

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getService3JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry3 = new JTextField("",10);
		panel.add(entry3);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 3");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply3 = new JTextField("", 10);
		reply3 .setEditable(false);
		panel.add(reply3 );

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getService4JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter value")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry4 = new JTextField("",10);
		panel.add(entry4);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Invoke Service 4");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply4 = new JTextField("", 10);
		reply4 .setEditable(false);
		panel.add(reply4 );

		panel.setLayout(boxlayout);

		return panel;

	}
	public static void main(String[] args) {

		ControllerGUI gui = new ControllerGUI();

		gui.build();
	}

	private void build() { 

		JFrame frame = new JFrame("Smart Hospital Room App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
	
		panel.add( getService1JPanel() );
		panel.add( getService2JPanel() );
		panel.add( getService3JPanel() );


		// Set size for the frame
		frame.setSize(600, 600);

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		String label = button.getActionCommand();  

		if (label.equals("Invoke Service 1")) {
			System.out.println("service 1 to be invoked ...");

		
			/*
			 * 
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			Service1Grpc.Service1BlockingStub blockingStub = Service1Grpc.newBlockingStub(channel);

			//preparing message to send
			ds.service1.RequestMessage request = ds.service1.RequestMessage.newBuilder().setText(entry1.getText()).build();

			//retreving reply from service
			ds.service1.ResponseMessage response = blockingStub.service1Do(request);

			reply1.setText( String.valueOf( response.getLength()) );
		
		}else if (label.equals("Invoke Service 2")) {
			System.out.println("service 2 to be invoked ...");

		
			/*
			 * 
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
			Service2Grpc.Service2BlockingStub blockingStub = Service2Grpc.newBlockingStub(channel);

			//preparing message to send
			ds.service2.RequestMessage request = ds.service2.RequestMessage.newBuilder().setText(entry2.getText()).build();

			//retreving reply from service
			ds.service2.ResponseMessage response = blockingStub.service2Do(request);

			reply2.setText( String.valueOf( response.getLength()) );
			
		}else if (label.equals("Invoke Service 3")) {
			System.out.println("service 3 to be invoked ...");

		
			/*
			 * 
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
			Service3Grpc.Service3BlockingStub blockingStub = Service3Grpc.newBlockingStub(channel);

			//preparing message to send
			ds.service3.RequestMessage request = ds.service3.RequestMessage.newBuilder().setText(entry3.getText()).build();

			//retreving reply from service
			ds.service3.ResponseMessage response = blockingStub.service3Do(request);

			reply3.setText( String.valueOf( response.getLength()) );
		
		}else if (label.equals("Invoke Service 4")) {
			System.out.println("service 4 to be invoked ...");

		
			/*
			 * 
			 */
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50054).usePlaintext().build();
			Service4Grpc.Service4BlockingStub blockingStub = Service4Grpc.newBlockingStub(channel);

			//preparing message to send
			ds.service4.RequestMessage request = ds.service4.RequestMessage.newBuilder().setText(entry4.getText()).build();

			//retreving reply from service
			ds.service4.ResponseMessage response = blockingStub.service4Do(request);

			reply4.setText( String.valueOf( response.getLength()) );
		
		}else{
			
		}

	}

}
