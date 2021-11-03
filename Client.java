// //package com.minhhuy.clientservermulti;

// import java.awt.EventQueue;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.PrintWriter;
// import java.net.InetAddress;
// import java.net.Socket;
// import java.net.UnknownHostException;
// import java.util.Scanner;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JScrollPane;
// import javax.swing.JTextArea;
// import javax.swing.JTextField;
// import java.awt.event.ActionListener;
// import java.awt.event.ActionEvent;

// public class Client {

// 	private JFrame frame;
// 	private JTextField txtPort;
// 	private JLabel lblIp;
// 	private JButton btnConnect;
// 	private JTextField txtHost;
// 	private JLabel lblHost;
// 	private JLabel lblClientsName;
// 	private JButton btnSend;
// 	private  JTextField txtSend;
// 	public JTextArea txtArea;
// 	private PrintWriter output;
// 	private Thread connectThread;
// 	private Socket socket;
// 	/**
// 	 * Launch the application.
// 	 */
// 	public static void main(String[] args) {
// 		EventQueue.invokeLater(new Runnable() {
// 			public void run() {
// 				try {
// 					Client window = new Client();
// 					window.frame.setVisible(true);
// 				} catch (Exception e) {
// 					e.printStackTrace();
// 				}
// 			}
// 		});
// 	}

// 	/**
// 	 * Create the application.
// 	 */
// 	public Client() {
// 		initialize();
// 	}

// 	/**
// 	 * Initialize the contents of the frame.
// 	 */
// 	private void initialize() {
// 		frame = new JFrame();
// 		frame.setSize(401, 289);
// 		frame.setLocationRelativeTo(null);
// 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 		frame.getContentPane().setLayout(null);
		
// 		JLabel lblPort = new JLabel("Port:");
// 		lblPort.setBounds(166, 59, 37, 14);
// 		frame.getContentPane().add(lblPort);
// 		frame.setTitle("Client");
		
// 		txtPort = new JTextField();
// 		txtPort.setBounds(201, 56, 86, 20);
// 		frame.getContentPane().add(txtPort);
// 		txtPort.setColumns(10);
		
// 		String host = "";
// 		try {
// 			host = InetAddress.getLocalHost().toString();
// 		} catch (UnknownHostException e1) {
// 			// TODO Auto-generated catch block
// 			e1.printStackTrace();
// 		}
// 		lblIp = new JLabel("IP Address: " + host.split("/")[1]);
// 		lblIp.setBounds(10, 11, 277, 14);
// 		frame.getContentPane().add(lblIp);
		
// 		btnConnect = new JButton("CONNECT");
// 		btnConnect.setBounds(293, 11, 89, 65);
// 		frame.getContentPane().add(btnConnect);
		
// 		txtArea = new JTextArea();
// 		txtArea.setEditable(false);
// 		txtArea.setBounds(10, 84, 372, 121);
		
// 		JScrollPane jScrollPane = new JScrollPane(txtArea);
// 		jScrollPane.setBounds(10, 84, 372, 121);
		
// 		frame.getContentPane().add(jScrollPane);
		
// 		txtHost = new JTextField();
// 		txtHost.setColumns(10);
// 		txtHost.setBounds(76, 56, 86, 20);
// 		frame.getContentPane().add(txtHost);
		
// 		lblHost = new JLabel("Host:");
// 		lblHost.setBounds(10, 59, 56, 14);
// 		frame.getContentPane().add(lblHost);
		
// 		lblClientsName = new JLabel("Client's name: " + host.split("/")[0]);
// 		lblClientsName.setBounds(10, 29, 277, 14);
// 		frame.getContentPane().add(lblClientsName);
		
// 		btnSend = new JButton("SEND");

// 		btnSend.setBounds(310, 216, 72, 23);
// 		frame.getContentPane().add(btnSend);
		
// 		txtSend = new JTextField();
// 		txtSend.setBounds(10, 218, 290, 20);
// 		frame.getContentPane().add(txtSend);
// 		txtSend.setColumns(10);
		
// 		frame.setResizable(false);
		
// 		btnConnect.addActionListener(new ActionListener() {
			
// 			@Override
// 			public void actionPerformed(ActionEvent e) {
// 				if (btnConnect.getText().equals("CONNECT")) {
// 					connectThread = new Thread(new Runnable() {
						
// 						@Override
// 						public void run() {
// 							connectServer();
							
// 						}
// 					});
// 					connectThread.start();
// 					btnConnect.setText("DISCONNECT");
// 				}
// 				else if (btnConnect.getText().equals("DISCONNECT")) {
// 					try {
// 						socket.close();
// 					} catch (IOException e1) {
// 						// TODO Auto-generated catch block
// 						e1.printStackTrace();
// 					}
// 					connectThread.stop();
// 					btnConnect.setText("CONNECT");
// 					txtArea.setText("Disconnected to server!\n");
// 				}
				
// 			}
// 		});
		
// 		btnSend.addActionListener(new ActionListener() {
			
// 			@Override
// 			public void actionPerformed(ActionEvent e) {
// 				output.println(txtSend.getText());
// 				txtArea.append("Client:" + txtSend.getText() + "\n");
				
// 			}
// 		});
// 	}
	
// 	public void connectServer() {
// 		int port = Integer.parseInt(txtPort.getText());
// 		try {
// 			socket = new Socket(txtHost.getText(), port);
// 			txtArea.setText("Conntected to server !\n");
			
// 			BufferedReader input = new BufferedReader(
// 					new InputStreamReader(socket.getInputStream())
// 			);
// 			output = new PrintWriter(socket.getOutputStream(), true);
				
// 			String respone = "";
// 			while(true) {
// 				System.out.println("111");
// 				respone = input.readLine();
// 				txtArea.append("Server:" + respone + "\n");	
// 			}
			
// 		} catch (IOException e) {
// 			// TODO Auto-generated catch block
// 			System.out.println("Can't connect to server");
// 			txtArea.setText("Can't connect to server\n");
// 		}
// 	}

// }
