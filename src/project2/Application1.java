package project2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Frame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Application1 {

	private JFrame frmApplication;
	private final JDesktopPane desktopPane = new JDesktopPane();
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenu mnNewMenu_3;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application1 window = new Application1();
					window.frmApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmApplication = new JFrame();
		frmApplication.setResizable(false);
		frmApplication.setExtendedState(Frame.MAXIMIZED_BOTH);
		frmApplication.setTitle("Application 1");
		frmApplication.setBounds(100, 100, 450, 300);
		frmApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmApplication.getContentPane().setLayout(null);
		desktopPane.setBounds(0, 38, 1918, 972);
		frmApplication.getContentPane().add(desktopPane);
		
		menuBar = new JMenuBar();
		frmApplication.setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Activities");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Activity 1");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_2 = new JMenu("Activity 2");
		mnNewMenu.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Development");
		mnNewMenu_2.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Production");
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		mnNewMenu_3 = new JMenu("Others");
		mnNewMenu_2.add(mnNewMenu_3);
		
		mntmNewMenuItem_3 = new JMenuItem("Practice 1");
		mnNewMenu_3.add(mntmNewMenuItem_3);
		
		mntmNewMenuItem_4 = new JMenuItem("Practice 2");
		mnNewMenu_3.add(mntmNewMenuItem_4);
		
		mnNewMenu_1 = new JMenu("About Us");
		menuBar.add(mnNewMenu_1);
	}
}
