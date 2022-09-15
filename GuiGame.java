/*
Simardeep Dulay
9/14/22
ICS4U0
GUI game assignment 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class GuiGame {

	static int rnum;//random number generated for game
	static String lateruseful;
	static int loss = 0, won = 0, guesses = 3; 
	static JButton button1, button2, button3, button4, button5, button6, playagainYes, playagainNo, newgame;//buttons 1-6 used for the number guessing, playagainyes and no used to replay or stop game 
	static JLabel label, label2, label3, wincount, losscount, play;//labels used to tell player amount of guesses, how to submit a guess, and what the correct number is if they lost
	static JTextArea wrongright, wins, losses, guesschecker;
	
	static JPanel panel;
	
	public static void main(String[] args) {
		rnum = (int) (Math.random () * 7);//7 so the maximum random number can be 6
		if (rnum<1) {
			rnum = rnum + 1;//makes it so the random number can't be 0
		}
		
		//lines 30-68 is instantiating and adding components to the panel
		label = new JLabel ("Click a button to submit your guess!");
		guesschecker = new JTextArea ("Amount of guesses left : " + guesses);
		label3 = new JLabel ("Correct number was " + rnum);
		wrongright = new JTextArea ("");
		wins = new JTextArea ("Wins : " + won);
		losses = new JTextArea ("Losses : " + loss);
		play = new JLabel ("Play Again?");
		newgame = new JButton ("New game?");
		button1 = new JButton ("1");
		button2 = new JButton ("2");
		button3 = new JButton ("3");
		button4 = new JButton ("4");
		button5 = new JButton ("5");
		button6 = new JButton ("6");
		playagainYes = new JButton  ("Yes");
		playagainNo = new JButton ("No");
		
		panel = new JPanel();
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(wrongright);
		panel.add(guesschecker);
		panel.add(newgame);
		panel.add(label3);
		label3.setVisible(false);
		panel.add(wins);
		panel.add(losses);
		panel.add(play);
		panel.add(playagainYes);
		panel.add(playagainNo);
		playagainNo.setVisible(false);
		playagainYes.setVisible(false);
		play.setVisible(false);
				
		JFrame frame = new JFrame ("GUI Guessing Game");//instantiates the frame and names it GUI guessing game
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250,300);//frame size
		frame.getContentPane ().add(panel);//adds components from the panel
		
		button1.addActionListener (new ActionListener ()  //adding action listener to the button component and creating a specific action performed method (override) for the button
				{
				    public void actionPerformed (ActionEvent e)
				    {
					if (rnum==1) {
						wrongright.append("Correct!");
						play.setVisible(true);
						playagainNo.setVisible(true);
						playagainYes.setVisible(true);
						won = won + 1;
						wins.setText("Wins : " + won);
						wins.setVisible(true);
					}
					else {
						guesses = guesses - 1;
						guesschecker.setText("Amount of guesses left : " + guesses);
						if(guesses<1) {
							label3.setVisible(true);
							play.setVisible(true);
							playagainNo.setVisible(true);
							playagainYes.setVisible(true);
							loss = loss + 1;
							losses.setText("Losses : " + loss);
							losses.setVisible(true);
						}
						else {
						wrongright.append("Wrong, " + guesses + " guesses left! ");
						button1.setVisible(false);
						}
					}
				    }
				}
				);
		
		button2.addActionListener (new ActionListener ()  //adding action listener to the button component and creating a specific action performed method (override) for the button
				{
				    public void actionPerformed (ActionEvent e)
				    {
					if (rnum==2) {
						wrongright.append("Correct!");
						play.setVisible(true);
						playagainNo.setVisible(true);
						playagainYes.setVisible(true);
						won = won + 1;
						wins.setText("Wins : " + won);
						wins.setVisible(true);
					}
					else {
						guesses = guesses - 1;
						guesschecker.setText("Amount of guesses left : " + guesses);
						if(guesses<1) {
							label3.setVisible(true);
							play.setVisible(true);
							playagainNo.setVisible(true);
							playagainYes.setVisible(true);
							loss = loss + 1;
							losses.setText("Losses : " + loss);
							losses.setVisible(true);
						}
						else {
						wrongright.append("Wrong, " + guesses + " guesses left! ");
						button2.setVisible(false);
						}
					}
				    }
				}
				);
		
		button3.addActionListener (new ActionListener ()  //adding action listener to the button component and creating a specific action performed method (override) for the button
				{
				    public void actionPerformed (ActionEvent e)
				    {
					if (rnum==3) {
						wrongright.append("Correct!");
						play.setVisible(true);
						playagainNo.setVisible(true);
						playagainYes.setVisible(true);
						won = won + 1;
						wins.setText("Wins : " + won);
						wins.setVisible(true);
					}
					else {
						guesses = guesses - 1;
						guesschecker.setText("Amount of guesses left : " + guesses);
						if(guesses<1) {
							label3.setVisible(true);
							play.setVisible(true);
							playagainNo.setVisible(true);
							playagainYes.setVisible(true);
							loss = loss + 1;
							losses.setText("Losses : " + loss);
							losses.setVisible(true);
						}
						else {
						wrongright.append("Wrong, " + guesses + " guesses left! ");
						button3.setVisible(false);
						}
					}
				    }
				}
				);
		
		button4.addActionListener (new ActionListener ()  //adding action listener to the button component and creating a specific action performed method (override) for the button
				{
				    public void actionPerformed (ActionEvent e)
				    {
					if (rnum==4) {
						wrongright.append("Correct!");
						play.setVisible(true);
						playagainNo.setVisible(true);
						playagainYes.setVisible(true);
						won = won + 1;
						wins.setText("Wins : " + won);
						wins.setVisible(true);
					}
					else {
						guesses = guesses - 1;
						guesschecker.setText("Amount of guesses left : " + guesses);
						if(guesses<1) {
							label3.setVisible(true);
							play.setVisible(true);
							playagainNo.setVisible(true);
							playagainYes.setVisible(true);
							loss = loss + 1;
							losses.setText("Losses : " + loss);
							losses.setVisible(true);
						}
						else {
						wrongright.append("Wrong, " + guesses + " guesses left! ");
						button4.setVisible(false);
						}
					}
				    }
				}
				);
		
		button5.addActionListener (new ActionListener ()  //adding action listener to the button component and creating a specific action performed method (override) for the button
				{
				    public void actionPerformed (ActionEvent e)
				    {
					if (rnum==5) {
						wrongright.append("Correct!");
						play.setVisible(true);
						playagainNo.setVisible(true);
						playagainYes.setVisible(true);
						won = won + 1;
						wins.setText("Wins : " + won);
						wins.setVisible(true);
					}
					else {
						guesses = guesses - 1;
						guesschecker.setText("Amount of guesses left : " + guesses);
						if(guesses<1) {
							label3.setVisible(true);
							play.setVisible(true);
							playagainNo.setVisible(true);
							playagainYes.setVisible(true);
							loss = loss + 1;
							losses.setText("Losses : " + loss);
							losses.setVisible(true);
						}
						else {
						wrongright.append("Wrong, " + guesses + " guesses left! ");
						button5.setVisible(false);
						}
					}
				    }
				}
				);
		
		button6.addActionListener (new ActionListener ()  //adding action listener to the button component and creating a specific action performed method (override) for the button
				{
				    public void actionPerformed (ActionEvent e)
				    {
					if (rnum==6) {
						wrongright.append("Correct!");
						play.setVisible(true);
						playagainNo.setVisible(true);
						playagainYes.setVisible(true);
						won = won + 1;
						wins.setText("Wins : " + won);
						wins.setVisible(true);
					}
					else {
						guesschecker.setText("Amount of guesses left : " + guesses);
						guesses = guesses - 1;
						if(guesses<1) {
							label3.setVisible(true);
							play.setVisible(true);
							playagainNo.setVisible(true);
							playagainYes.setVisible(true);
							loss = loss + 1;
							losses.setText("Losses : " + loss);
							losses.setVisible(true);
						}
						else {
						wrongright.append("Wrong, " + guesses + " guesses left! ");
						button6.setVisible(false);
						}
					}
				    }
				}
				);
		
		playagainYes.addActionListener (new ActionListener ()  //adding action listener to the button component and creating a specific action performed method (override) for the button
				{
				    public void actionPerformed (ActionEvent e)
				    {
				    	rnum = (int) (Math.random () * 7);//7 so the maximum random number can be 6
						if (rnum<1) {
							rnum = rnum + 1;//makes it so the random number can't be 0
						}
						guesses = 3;
						play.setVisible(false);
						playagainYes.setVisible(false);
						playagainNo.setVisible(false);
						wrongright.setText(null);//clears the wrongright text area
						button1.setVisible(true);
						button2.setVisible(true);
						button3.setVisible(true);
						button4.setVisible(true);
						button5.setVisible(true);
						button6.setVisible(true);
						label3.setVisible(false);
						guesschecker.setText("Amount of guesses left : " + guesses);
						//sets all as true so all buttons are visible again, and resets the guess checker back to 3 guesses
				    }
				}
				);
		
		playagainNo.addActionListener (new ActionListener ()  //adding action listener to the button component and creating a specific action performed method (override) for the button
				{
				    public void actionPerformed (ActionEvent e)
				    {
				    	frame.dispose();
				    }
				}
				);
		
		newgame.addActionListener (new ActionListener ()  //adding action listener to the button component and creating a specific action performed method (override) for the button
				{
				    public void actionPerformed (ActionEvent e)
				    {
				    	play.setVisible(false);
						playagainYes.setVisible(false);
						playagainNo.setVisible(false);
						//sets all to false in case player decides to press new game after game ends
				    	rnum = (int) (Math.random () * 7);//7 so the maximum random number can be 6
						if (rnum<1) {
							rnum = rnum + 1;//makes it so the random number can't be 0
						}
						guesses = 3;//resets guesses
						wrongright.setText(null);//clears text area
						button1.setVisible(true);
						button2.setVisible(true);
						button3.setVisible(true);
						button4.setVisible(true);
						button5.setVisible(true);
						button6.setVisible(true);
				    }
				}
				);
		frame.setVisible(true);//makes the frame with the panel visible 
	}

}



