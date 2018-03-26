import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

public class MainClass {
	final static String frameTitle="Ecompetencia-18 Desktop Application";
	final static int frameWidth=700;
	final static int frameHeight=600;
	static JFrame frame;
	static Dimension dim;
	static JPanel panel;
	static JComboBox<String> comboBox;
	static JTextArea textAreaDetails;
	static JLabel detailL;
	static JTextPane  textAreaRules;
	static JLabel RulesL;
	static JTextPane  textPaneTeams;
	static JLabel TeamsL;
	static JTree tree;
	static JScrollPane treeScroll;
	static JScrollPane scrollRule ;
	static JScrollPane scrollDetail;
	static JScrollPane scrollListNFS ;
	static JScrollPane scrollListFifa;
	static JList<String> listNFS;
	static JList<String> listFifa;
	
	final static String gameDescriptionCS=" Counter-Strike is a first-person shooter game in which players join either the terrorist team or the counter-terrorist "
			+ "\n team. Each team attempts to complete their mission objective and/or eliminate the opposing team. Each round "
			+ "\n starts with the two teams spawning simultaneously.";
	
	final static String gameRulesCs="1)  You should have 5 members to register a team (otherwise registration will be cancelled)\r\n" + 
			"2)  All participants must be registered/enrolled in any institute/university)\r\n" + 
			"3)  Team members from different institutes/universities are not allowed.\r\n" + 
			"4)  Replacement or change of member is not allowed.\r\n" + 
			"5)  Match Type : 5 vs 5.\r\n" + 
			"6)  Map pool: de_dust2, de_nuke, de_inferno, de_train, de_tuscan,.\r\n" + 
			"7)  Round time: 1 minute 45 seconds\r\n" + 
			"8)  C4 Timer : 35 sec.\r\n" + 
			"9)  Freeze time : 6 Sec..\r\n" + 
			"10) Silent or unreachable bomb plants are Not permitted.\r\n" + 
			"11) Scroll Ducking is PROHIBITED.\r\n" + 
			"12) Approved Grenade Amounts Per Round: Flashbangs: 2,  HE-Grenades: 1,  Smoke Grenades: 1\r\n" + 
			"13) Following Items Are NOT permitted During match : G3SG1 , SG-550 , Shield\r\n" + 
			"14) All 3rd party programs are NOT permitted (Including CFGS).\r\n" + 
			"15) Hiding/Running in a Knife-Toss Round is NOT permitted .\r\n" + 
			"16) Use of personal model/skins/map textures/scripts is NOT permitted.\r\n" + 
			"17) Bring CNIC (copy and original) or university id card (copy) and registration/confirmation slip and email on the day of event.\r\n" + 
			"18) The Course selection may be changed prior to the tournament. Players will be informed of any such changes before the tournament..\r\n" + 
			"19) In-case of Server failure the last Scores will be recorded , the score for the current round will be discarded and the match will continue (with starting money 10000$ for Greater Than 3 Rounds & 3000$ For Less than or Equal to 3 Rounds ).\r\n" + 
			"20) If a player gets disconnected the match will be paused when the current round is over & will be resumed on reconnection of the player.\r\n" + 
			"21) Report half an hour before your competition time.\r\n" + 
			"";

	final static String gameDescriptionNeedForSpeed="           The Need For Speed series has always been something of a chameleon. At various points, it's been a \n police  chase simulator, a realistic track racer, and even a Cannonball Run-style action movie on wheels.This \n latest Need  For Speed follows in the footsteps of the first Fast and Furious film by exploring the white-knuckled \n world of illegal street racing. While it's not a completely novel approach for the series   (Underground covered \n tuner car culture over a decade ago), it does open a few new avenues for Need For Speed's arcadey but nuance\n style of racing--most notably in its progression and customization systems.";
	final static String gameRulesNeedForSpeed=""
			+ "1)  Only 1 person allowed.\r\n" + 
			"2)  All participants must be registered/enrolled in any institute/university.\r\n" + 
			"3)  Replacement or change of competition is not allowed.\r\n" + 
			"4)  Participants are not allowed to discuss or sharing anything with the other participants. Otherwise you will be disqualified.\r\n" + 
			"5)  Game Version: NFS Most Wanted 2012\r\n" + 
			"6)  General Competition Method: 4 players.\r\n" + 
			"7)  Players getting the 1st position shall qualify for the next round.\r\n" + 
			"8)  Game Type : Circuit,Sprint.\r\n" + 
			"9)  Final Will be on Sprint.\r\n" + 
			"10) The player who wins their 1st stage match advances to the next stage.\r\n" + 
			"11) Courses: Course selection is done by the Game Administratord\r\n" + 
			"12) Car Settings: All cars are available.\r\n" + 
			"13) Race Mode Options\r\n" + 
			"14) Nitrous: On\r\n" + 
			"15) Collision Detection: On\r\n" + 
			"16) Performance Matching: Off\r\n" + 
			"17) Units: Player's own discretion\r\n" + 
			"18) Player Mode Options\r\n" + 
			"19) Game Moment Camera: Off\r\n" + 
			"20) Car Damage: Off\r\n" + 
			"21) Rear View Mirror: Player's own discretion.\r\n" + 
			"22) Players are provided with a standard keyboard and mouse. You can bring your own controller as well .\r\n" + 
			"23) Unfair play will cause disqualification.\r\n" + 
			"24) Use of any cheat program will cause disqualification.\r\n" + 
			"25) Intentional disconnection will cause disqualification.\r\n" + 
			"26) Use of any settings exceeding standard and permitted settings will cause disqualification\r\n" + 
			"27) If the match is disrupted due to unnecessary chatting, the player may be given a warning or lose by default at the referee’s sole discretion.Upon discovery of any player committing any violations regarded as unfair play, that player will bedisqualified from the Tournament/Preliminaries. During the course of any match, the operations staff and/or referee may determine other actions tobe unfair play at any time.Two warnings constitute being disqualified from the Tournament/Preliminaries.\r\n" + 
			"28) If the disconnection is deemed to be unintentional by the referee, the match will be restarted. If any player does not agree to a match restart, that player will lose by default.\r\n" + 
			"29) Upon discovery of any player committing any violations regarded as unfair play, that player will be disqualified from the tournament.\r\n" + 
			"30) Two warnings constitute being disqualified from the tournament.\r\n" + 
			"31) Personal save files are NOT allowed.\r\n" + 
			"32) Bring CNIC (original and copy) or university id (copy) and registration/confirmation slip on the day of event.\r\n" + 
			"33) Report half an hour before your competition time.";
	
	final static String FifaGameDescription=" FIFA has been reimagined to bring you the most authentic and exciting soccer game you'll ever experience! ";
	final static String FifaGameRules="1)  Only 1 person allowed.\r\n" + 
			"2)  All participants must be registered/enrolled in any institute/university.\r\n" + 
			"3)  Replacement or change of competition is not allowed.\r\n" + 
			"4)  Participants are not allowed to discuss or sharing anything with the other participants. Otherwise you will be disqualified.\r\n" + 
			"5)  Game: FIFA.\r\n" + 
			"6)  1v1.\r\n" + 
			"7)  Knockout.\r\n" + 
			"8)  Time Of Day: Day\r\n" + 
			"9)  Offside: On\r\n" + 
			"10) Weather: Dry.\r\n" + 
			"11) Handball: Off.\r\n" + 
			"12) Ball: Default.\r\n" + 
			"13) Injuries: Off.\r\n" + 
			"14) Bookings: On.\r\n" + 
			"15) Game Speed: Medium(Normal).\r\n" + 
			"16) Final: two legs, home and away.\r\n" + 
			"17) Cannot use custom teams (custom made) and can use custom tactics and use default formations.\r\n" + 
			"18) Half Length Time 6 minutes.\r\n" + 
			"19) Any player must not pause the game when the ball is in play and time wasting is not allowed\r\n" + 
			"20) Players wishing to make substitutions must wait until the ball is out of play before making any changes\r\n" + 
			"21) Difficulty Level will be World Class.\r\n" + 
			"22) Report half an hour before your competition time.\r\n" + 
			"23) Unfair play will cause disqualification\r\n" + 
			"24) Use of any cheat program will cause disqualification\r\n" + 
			"25) Intentional disconnection will cause disqualification\r\n" + 
			"26) Bring original CNIC (copy and (original) or university id card (copy) and confirmation/registration slip on the day of event\r\n" + 
			"27) Two warnings constitute being disqualified from the tournament.\r\n" + 
			"28) Personal save files are NOT allowed.";
	public static void main(String[] args) {
         InitializeIU();
         panelConfig();
         setPanelComponents();
         frameConfig();
         
         
	}

	private static void setPanelComponents() {
		Font font = new Font("Times New Roman", Font.CENTER_BASELINE,20);
		comboBox.setBounds((frameWidth/2)-100,20,200,30);
		comboBox.addItem("-------- Select your Game --------");
		comboBox.addItem("CounterStrike 1.6");
		comboBox.addItem("Need For Speed Most Wanted");
		comboBox.addItem("FIFA");
		comboBox.setOpaque(true);
		((JLabel)comboBox.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(comboBox);
		
		comboBox.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	if(comboBox.getSelectedIndex()==0)
		    	{
		    		detailL.setVisible(false);
		    		scrollDetail.setVisible(false);
		    		scrollRule.setVisible(false);
		    		RulesL.setVisible(false);
		    		TeamsL.setVisible(false);
		    		treeScroll.setVisible(false);
		    		scrollListNFS.setVisible(false);
		    		scrollListFifa.setVisible(false);
		    		
		    	}
		    	if(comboBox.getSelectedIndex()==1)
		    	{
		    		
		    		detailL.setVisible(true);
		    		scrollDetail.setVisible(true);
		    		scrollRule.setVisible(true);
		    		RulesL.setVisible(true);
		    		TeamsL.setVisible(true);
		    		treeScroll.setVisible(true);
		    		scrollListNFS.setVisible(false);
		    		scrollListFifa.setVisible(false);
		    		
		    		TeamsL.setText("Teams: ");
		    		fillGameDetails(gameDescriptionCS,gameRulesCs);
		    		treeScroll.setVisible(true);
		    		
		    	}
		    	if(comboBox.getSelectedIndex()==2)
		    	{
		    		detailL.setVisible(true);
		    		scrollDetail.setVisible(true);
		    		scrollRule.setVisible(true);
		    		RulesL.setVisible(true);
		    		TeamsL.setVisible(true);
		    		treeScroll.setVisible(false);
		    		scrollListNFS.setVisible(true);
		    		scrollListFifa.setVisible(false);
		    		
		    		fillGameDetails(gameDescriptionNeedForSpeed,gameRulesNeedForSpeed);
		    		TeamsL.setText("Participants: ");
		    		listNFS.setVisible(true);
		    	}
		    	if(comboBox.getSelectedIndex()==3)
		    	{	
		    		detailL.setVisible(true);
	    		scrollDetail.setVisible(true);
	    		scrollRule.setVisible(true);
	    		RulesL.setVisible(true);
	    		TeamsL.setVisible(true);
	    		treeScroll.setVisible(false);
	    		scrollListNFS.setVisible(false);
	    		scrollListFifa.setVisible(true);
		    		fillGameDetails(FifaGameDescription,FifaGameRules);
		    		listFifa.setVisible(true);
		    	}
		    }

			private void fillGameDetails(String Details, String Rules) {
				textAreaDetails.setText(Details);
				textAreaDetails.setCaretPosition(0);
				textAreaRules.setText(Rules);
				textAreaRules.setCaretPosition(0);
				
			}
		});

		scrollDetail = new JScrollPane(textAreaDetails);
		textAreaDetails.setBounds(30, 93, 630, 80);
		scrollDetail.setBounds(30, 93, 630, 80);
		textAreaRules.setBounds(30, 208, 630, 150);
		detailL.setBounds(20, 70, 120,20);
		RulesL.setBounds(20, 185, 120,20);
		TeamsL.setBounds(20, 365, 120,20);
		textAreaRules.setEditable(false);
		textAreaDetails.setEditable(false);
		scrollRule = new JScrollPane(textAreaRules);
		scrollRule.setBounds(30, 208, 630, 150);
		
		// Creating JTree For CS Teams & Members
		DefaultMutableTreeNode parentNode=new DefaultMutableTreeNode("Team1");  
		DefaultMutableTreeNode childNode1=new DefaultMutableTreeNode("Member1");  
		DefaultMutableTreeNode childNode2=new DefaultMutableTreeNode("Member2");  
		DefaultMutableTreeNode childNode3=new DefaultMutableTreeNode("Member3");  
		DefaultMutableTreeNode childNode4=new DefaultMutableTreeNode("Member4");  
		DefaultMutableTreeNode childNode5=new DefaultMutableTreeNode("Member5");   

		parentNode.add(childNode1);
		parentNode.add(childNode2);
		parentNode.add(childNode3);
		parentNode.add(childNode4);
		parentNode.add(childNode5);
		
		tree = new JTree(parentNode);		
		DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) tree.getCellRenderer();
	    renderer.setLeafIcon(null);
	    renderer.setClosedIcon(null);
	    renderer.setOpenIcon(null);
		tree.setBounds(30, 390, 630, 150);
		tree.setFont(font);
		 treeScroll = new JScrollPane(tree);
		treeScroll.setBounds(30, 390, 630, 150);
		treeScroll.setVisible(false);
		
		//Adding Need For Speed Participants List
	
		 DefaultListModel<String> listModelNFS = new DefaultListModel<>();  
		 listModelNFS.addElement("Participant1");  
		 listModelNFS.addElement("Participant2");  
		 listModelNFS.addElement("Participant3");  
		 listModelNFS.addElement("Participant4");  
         listNFS = new JList<>(listModelNFS);  
         listNFS.setBounds(30, 390, 630, 150);  
         listNFS.setFont(font);
         scrollListNFS = new JScrollPane(listNFS);
         scrollListNFS.setBounds(30, 390, 630, 150);
     	//Adding FIFA Participants List
     	
		 DefaultListModel<String> listModelFIFA = new DefaultListModel<>();  
		 listModelFIFA.addElement("Participant1");  
		 listModelFIFA.addElement("Participant2");  
		 listModelFIFA.addElement("Participant3");  
		 listModelFIFA.addElement("Participant4");  
         listFifa = new JList<>(listModelNFS);  
         listFifa.setBounds(30, 390, 630, 150);  
         listFifa.setFont(font);
         scrollListFifa = new JScrollPane(listFifa);
         scrollListFifa.setBounds(30, 390, 630, 150);
         
         

         panel.add(scrollListFifa);
         panel.add(scrollListNFS);
		panel.add(treeScroll);
		panel.add(scrollDetail);
		panel.add(scrollRule);
		panel.add(detailL);
		panel.add(RulesL);
		panel.add(TeamsL);
		detailL.setVisible(false);
		scrollDetail.setVisible(false);
		scrollRule.setVisible(false);
		RulesL.setVisible(false);
		TeamsL.setVisible(false);
		treeScroll.setVisible(false);
		scrollListNFS.setVisible(false);
		scrollListFifa.setVisible(false);
		
	}

	private static void panelConfig() {
		//Font font = new Font("Times New Roman", Font.ITALIC, 12);
		
		panel.setBounds(3,3,frameWidth-23,frameHeight-47);
		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY), "Gaming Competetion"));
		panel.setLayout(null);
		frame.add(panel);
		
	}

	private static void frameConfig() {
		 frame.setSize(frameWidth, frameHeight);
		 frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
		 frame.setLayout(null);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setResizable(false);
		 ImageIcon img = new ImageIcon("logo.jpg");
		 frame.setIconImage(img.getImage());
		 frame.setVisible(true);
	}

	private static void InitializeIU() {
	 frame = new JFrame(frameTitle);
	 dim = Toolkit.getDefaultToolkit().getScreenSize();
	 panel= new JPanel();
	 comboBox = new JComboBox<>();
	 textAreaDetails = new JTextArea();
	 detailL = new JLabel("Game Description :");
	 textAreaRules = new JTextPane ();
	 RulesL = new JLabel("Game Rules :");
	 TeamsL= new JLabel("Teams :");
		
	}

}
