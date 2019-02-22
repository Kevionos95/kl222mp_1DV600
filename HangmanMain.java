package project_Hangman;

import java.util.Scanner;

public class HangmanMain 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Hangman the Video Game!");
		System.out.println("__________________________________");
		System.out.println();
		System.out.println("Main menu!");
		System.out.println("__________");
		System.out.println();
		System.out.println("Start new game (Press n)       Quit Program (Press q)");
		
		Scanner in = new Scanner (System.in);
		String input = in.next();
		if(input.charAt(0)=='n'||input.charAt(0)=='N') 
		{
			System.out.println("_________________________________________________________________");
			System.out.println("New game selected! Please choose one of the following categories: ");
			System.out.println("Animals (Press A)      Cities (Press C)    Astronomy (Press A)     Vehicles (Press V)");
			
			String cat= in.next();
			if(cat.charAt(0)=='a'||cat.charAt(0)=='A') 
			{
				String word = ("monkey");
				System.out.println("______________________");
				System.out.println("The category you selected is animals and the word has " + word.length() +" letters");
			
				for(int count=0;count<word.length();count++) 
				{
					System.out.print(" _ ");
				}
				System.out.println();
				System.out.println("___________________");
				System.out.print("Please enter a letter you think is in the word");
				System.out.println();
				String guese = in.next();
				boolean match=false;
				int triesLeft = 10;
				boolean fullMatch=false;
				int amount = 0;
				int amountCorrect=0;
				for(int counter = 0;counter<word.length();counter++) 
				{
					if(word.charAt(counter)==guese.charAt(0)) 
					{
						match=true;
						amount++;
					}
					else;
				}
				if(match==true) 
				{
					System.out.println("_________________________________");
					System.out.println("You have guesed correct! The letter "+ guese + " is in the word "+ amount +" of times");
					amountCorrect++;
					for(int counter=0;counter<word.length();counter++) 
					{
						if(word.charAt(counter)==guese.charAt(0)) 
						{
							System.out.print(" " + guese);
						}
						else System.out.print(" _ ");
					}
					
				}
				else 
				{
					triesLeft--;
					System.out.println("__________________________________");
					System.out.println("You have guesed wrong! You have: " + triesLeft + " tries Left");
					System.out.println("                                                  ____________________________");
					for(int counter=0;counter<word.length();counter++) 
					{
						System.out.print(" _ ");
					}
					
				}
				System.out.println();
				System.out.println("___________________");
				System.out.print("Please enter a letter you think is in the word");
				System.out.println();
				amount=0;
				match=false;
				String guese2 = in.next();
				
				for(int counter = 0;counter<word.length();counter++) 
				{
					if(word.charAt(counter)==guese2.charAt(0)) 
					{
						match=true;
						amount++;
					}
					else;
				}
				if(match==true) 
				{
					System.out.println("_________________________________");
					System.out.println("You have guesed correct! The letter "+ guese2 + " is in the word "+ amount +" of times");
					amountCorrect++;
					for(int counter=0;counter<word.length();counter++) 
					{
						if(word.charAt(counter)==guese.charAt(0)) 
						{
							System.out.print(" " + guese);
						}
						else if(word.charAt(counter)==guese2.charAt(0)) 
						{
							System.out.print(" " + guese2);
						}
						else System.out.print(" _ ");
					}
					
				}
				else 
				{
					triesLeft--;
					System.out.println("__________________________________");
					System.out.println("You have guesed wrong! You have: " + triesLeft + " tries Left");
					for(int counter =0;counter<5;counter++) 
					{
						System.out.println("                                                                     |");
					}
					System.out.println("                                                  ____________________________");
					for(int counter=0;counter<word.length();counter++) 
					{
						System.out.print(" _ ");
					}
					
				}
				System.out.println();
				System.out.println("___________________");
				System.out.print("Please enter a letter you think is in the word");
				System.out.println();
				amount=0;
				match=false;
				String guese3 = in.next();
				
				for(int counter = 0;counter<word.length();counter++) 
				{
					if(word.charAt(counter)==guese3.charAt(0)) 
					{
						match=true;
						amount++;
					}
					else;
				}
				if(match==true) 
				{
					System.out.println("_________________________________");
					System.out.println("You have guesed correct! The letter "+ guese3 + " is in the word "+ amount +" of times");
					amountCorrect++;
					for(int counter=0;counter<word.length();counter++) 
					{
						if(word.charAt(counter)==guese.charAt(0)) 
						{
							System.out.print(" " + guese);
						}
						else if(word.charAt(counter)==guese2.charAt(0)) 
						{
							System.out.print(" " + guese2);
						}
						else if(word.charAt(counter)==guese3.charAt(0)) 
						{
							System.out.print(" " + guese3);
						}
						else System.out.print(" _ ");
					}
					
				}
				else 
				{
					triesLeft--;
					System.out.println("__________________________________");
					System.out.println("You have guesed wrong! You have: " + triesLeft + " tries Left");
					System.out.print("                                                            __________");
					System.out.println();
					for(int counter =0;counter<5;counter++) 
					{
						System.out.println("                                                                     |");
					}
					System.out.println("                                                  ____________________________");
					for(int counter=0;counter<word.length();counter++) 
					{
						System.out.print(" _ ");
					}
			}
			System.out.println();
			System.out.println("___________________");
			System.out.print("Please enter a letter you think is in the word");
			System.out.println();
			amount=0;
			match=false;
			String guese4 = in.next();
			
			for(int counter = 0;counter<word.length();counter++) 
			{
				if(word.charAt(counter)==guese4.charAt(0)) 
				{
					match=true;
					amount++;
				}
				else;
			}
			if(match==true) 
			{
				System.out.println("_________________________________");
				System.out.println("You have guesed correct! The letter "+ guese4 + " is in the word "+ amount +" of times");
				amountCorrect++;
				for(int counter=0;counter<word.length();counter++) 
				{
					if(word.charAt(counter)==guese.charAt(0)) 
					{
						System.out.print(" " + guese);
					}
					else if(word.charAt(counter)==guese2.charAt(0)) 
					{
						System.out.print(" " + guese2);
					}
					else if(word.charAt(counter)==guese3.charAt(0)) 
					{
						System.out.print(" " + guese3);
					}
					else if(word.charAt(counter)==guese4.charAt(0)) 
					{
						System.out.print(" " + guese4);
					}
					else System.out.print(" _ ");
				}
				
			}
			else 
			{
				triesLeft--;
				System.out.println("__________________________________");
				System.out.println("You have guesed wrong! You have: " + triesLeft + " tries Left");
				System.out.print("                                                            __________");
				System.out.println();
				
				for(int counter =0;counter<5;counter++) 
				{   if(counter<2) 
					{
					System.out.print("                                   			    |");
					System.out.println("        |");
					}
					else 
					{
					System.out.println("                                                                     |");
					}
				}
				System.out.println("                                                  ____________________________");
				for(int counter=0;counter<word.length();counter++) 
				{
					System.out.print(" _ ");
				}
		}
			System.out.println();
			System.out.println("___________________");
			System.out.print("Please enter a letter you think is in the word");
			System.out.println();
			amount=0;
			match=false;
			String guese5 = in.next();
			
			for(int counter = 0;counter<word.length();counter++) 
			{
				if(word.charAt(counter)==guese5.charAt(0)) 
				{
					match=true;
					amount++;
				}
				else;
			}
			if(match==true) 
			{
				System.out.println("_________________________________");
				System.out.println("You have guesed correct! The letter "+ guese5 + " is in the word "+ amount +" of times");
				amountCorrect++;
				for(int counter=0;counter<word.length();counter++) 
				{
					if(word.charAt(counter)==guese.charAt(0)) 
					{
						System.out.print(" " + guese);
					}
					else if(word.charAt(counter)==guese2.charAt(0)) 
					{
						System.out.print(" " + guese2);
					}
					else if(word.charAt(counter)==guese3.charAt(0)) 
					{
						System.out.print(" " + guese3);
					}
					else if(word.charAt(counter)==guese4.charAt(0)) 
					{
						System.out.print(" " + guese4);
					}
					else if(word.charAt(counter)==guese5.charAt(0)) 
					{
						System.out.print(" " + guese5);
					}
					else System.out.print(" _ ");
				}
				
			}
			else 
			{
				triesLeft--;
				System.out.println("__________________________________");
				System.out.println("You have guesed wrong! You have: " + triesLeft + " tries Left");
				System.out.print("                                                            __________");
				System.out.println();
				
				for(int counter =0;counter<5;counter++) 
				{   if(counter<2) 
					{
					System.out.print("                                   			    |");
					System.out.println("        |");
					}
					else if (counter==2) 
					{
						System.out.print("                                     			    O");
						System.out.println("        |");
					}
					else 
					{
					System.out.println("                                                                     |");
					}
				}
				System.out.println("                                                  ____________________________");
				for(int counter=0;counter<word.length();counter++) 
				{
					System.out.print(" _ ");
				}
				
		    }
			System.out.println();
			System.out.println("___________________");
			System.out.print("Please enter a letter you think is in the word");
			System.out.println();
			amount=0;
			match=false;
			String guese6 = in.next();
			
			for(int counter = 0;counter<word.length();counter++) 
			{
				if(word.charAt(counter)==guese6.charAt(0)) 
				{
					match=true;
					amount++;
				}
				else;
			}
			
				if(amountCorrect==word.length())
				{
					System.out.println("Victory! You found the right word!");
					fullMatch=true;
				}
			
			if(match==true && fullMatch==false) 
			{
				System.out.println("_________________________________");
				System.out.println("You have guesed correct! The letter "+ guese6 + " is in the word "+ amount +" of times");
				amountCorrect++;
				for(int counter=0;counter<word.length();counter++) 
				{
					if(word.charAt(counter)==guese.charAt(0)) 
					{
						System.out.print(" " + guese);
					}
					else if(word.charAt(counter)==guese2.charAt(0)) 
					{
						System.out.print(" " + guese2);
					}
					else if(word.charAt(counter)==guese3.charAt(0)) 
					{
						System.out.print(" " + guese3);
					}
					else if(word.charAt(counter)==guese4.charAt(0)) 
					{
						System.out.print(" " + guese4);
					}
					else if(word.charAt(counter)==guese5.charAt(0)) 
					{
						System.out.print(" " + guese5);
					}
					else if(word.charAt(counter)==guese6.charAt(0)) 
					{
						System.out.print(" " + guese6);
					}
					else System.out.print(" _ ");
				}
			}
				else if(match==false && fullMatch==false)
				{
					triesLeft--;
					System.out.println("__________________________________");
					System.out.println("You have guesed wrong! You have: " + triesLeft + " tries Left");
					System.out.print("                                                            __________");
					System.out.println();
					
					for(int counter =0;counter<5;counter++) 
					{   if(counter<2) 
						{
						System.out.print("                                   			    |");
						System.out.println("        |");
						}
						else if (counter==2) 
						{
							System.out.print("                                     			    O");
							System.out.println("        |");
						}
						else if (counter==3) 
						{
							System.out.print("                                                            |");
							System.out.println("        |");
						}
						else 
						{
						System.out.println("                                                                     |");
						}
					}
					System.out.println("                                                  ____________________________");
					for(int counter=0;counter<word.length();counter++) 
					{
						System.out.print(" _ ");
					}
					
			    }
				System.out.println();
				System.out.println("___________________");
				if(amountCorrect==word.length())
				{
					System.out.println("Victory! You found the right word!");
					fullMatch=true;
				}
				else 
				{
					System.out.print("Please enter a letter you think is in the word");
					System.out.println();
					amount=0;
					match=false;
					String guese7 = in.next();
				
					for(int counter = 0;counter<word.length();counter++) 
					{
						if(word.charAt(counter)==guese7.charAt(0)) 
						{
							match=true;
							amount++;
						}
					else;
					}
					if(match==true && fullMatch==false) 
					{
						System.out.println("_________________________________");
						System.out.println("You have guesed correct! The letter "+ guese7 + " is in the word "+ amount +" of times");
						amountCorrect++;
						for(int counter=0;counter<word.length();counter++) 
						{
							if(word.charAt(counter)==guese.charAt(0)) 
							{
								System.out.print(" " + guese);
							}
							else if(word.charAt(counter)==guese2.charAt(0)) 
							{
								System.out.print(" " + guese2);
							}
							else if(word.charAt(counter)==guese3.charAt(0)) 
							{
								System.out.print(" " + guese3);
							}
							else if(word.charAt(counter)==guese4.charAt(0)) 
							{
								System.out.print(" " + guese4);
							}
							else if(word.charAt(counter)==guese5.charAt(0)) 
							{
								System.out.print(" " + guese5);
							}
							else if(word.charAt(counter)==guese6.charAt(0)) 
							{
								System.out.print(" " + guese6);
							}
							else if(word.charAt(counter)==guese7.charAt(0)) 
							{
								System.out.print(" " + guese7);
							}
							else System.out.print(" _ ");
						}
					}
					else if(match==false && fullMatch==false)
					{
						triesLeft--;
						System.out.println("__________________________________");
						System.out.println("You have guesed wrong! You have: " + triesLeft + " tries Left");
						System.out.print("                                                            __________");
						System.out.println();
						
						for(int counter =0;counter<5;counter++) 
						{   if(counter<2) 
							{
							System.out.print("                                   			    |");
							System.out.println("        |");
							}
							else if (counter==2) 
							{
								System.out.print("                                     			    O");
								System.out.println("        |");
							}
							else if (counter==3) 
							{	System.out.print("                                                           /");
								System.out.print("|");
								System.out.println("        |");
							}
							else 
							{
							System.out.println("                                                                     |");
							}
						}
						System.out.println("                                                  ____________________________");
						for(int counter=0;counter<word.length();counter++) 
						{
							System.out.print(" _ ");
						}
					
					}
					System.out.println();
					System.out.println("___________________");
					if(amountCorrect==word.length())
					{
						System.out.println("Victory! You found the right word!");
						fullMatch=true;
					}
					else 
					{
						System.out.print("Please enter a letter you think is in the word");
						System.out.println();
						amount=0;
						match=false;
						String guese8 = in.next();
					
						for(int counter = 0;counter<word.length();counter++) 
						{
							if(word.charAt(counter)==guese8.charAt(0)) 
							{
								match=true;
								amount++;
							}
						else;
						}
						if(match==true && fullMatch==false) 
						{
							System.out.println("_________________________________");
							System.out.println("You have guesed correct! The letter "+ guese8 + " is in the word "+ amount +" of times");
							amountCorrect++;
							for(int counter=0;counter<word.length();counter++) 
							{
								if(word.charAt(counter)==guese.charAt(0)) 
								{
									System.out.print(" " + guese);
								}
								else if(word.charAt(counter)==guese2.charAt(0)) 
								{
									System.out.print(" " + guese2);
								}
								else if(word.charAt(counter)==guese3.charAt(0)) 
								{
									System.out.print(" " + guese3);
								}
								else if(word.charAt(counter)==guese4.charAt(0)) 
								{
									System.out.print(" " + guese4);
								}
								else if(word.charAt(counter)==guese5.charAt(0)) 
								{
									System.out.print(" " + guese5);
								}
								else if(word.charAt(counter)==guese6.charAt(0)) 
								{
									System.out.print(" " + guese6);
								}
								else if(word.charAt(counter)==guese7.charAt(0)) 
								{
									System.out.print(" " + guese7);
								}
								else if(word.charAt(counter)==guese8.charAt(0)) 
								{
									System.out.print(" " + guese8);
								}
								else System.out.print(" _ ");
							}
						}
						else if(match==false && fullMatch==false)
						{
							triesLeft--;
							System.out.println("__________________________________");
							System.out.println("You have guesed wrong! You have: " + triesLeft + " tries Left");
							System.out.print("                                                            __________");
							System.out.println();
							
							for(int counter =0;counter<5;counter++) 
							{   if(counter<2) 
								{
								System.out.print("                                   			    |");
								System.out.println("        |");
								}
								else if (counter==2) 
								{
									System.out.print("                                     			    O");
									System.out.println("        |");
								}
								else if (counter==3) 
								{	System.out.print("                                                           /|\\");
									
									System.out.println("       |");
								}
								else 
								{
								System.out.println("                                                                     |");
								}
							}
							System.out.println("                                                  ____________________________");
							for(int counter=0;counter<word.length();counter++) 
							{
								System.out.print(" _ ");
							}
						}
						System.out.println();
						System.out.println("___________________");
						if(amountCorrect==word.length())
						{
							System.out.println("Victory! You found the right word!");
							fullMatch=true;
						}
						else 
						{
							System.out.print("Please enter a letter you think is in the word");
							System.out.println();
							amount=0;
							match=false;
							String guese9 = in.next();
						
							for(int counter = 0;counter<word.length();counter++) 
							{
								if(word.charAt(counter)==guese9.charAt(0)) 
								{
									match=true;
									amount++;
								}
							else;
							}
							if(match==true && fullMatch==false) 
							{
								System.out.println("_________________________________");
								System.out.println("You have guesed correct! The letter "+ guese9 + " is in the word "+ amount +" of times");
								amountCorrect++;
								for(int counter=0;counter<word.length();counter++) 
								{
									if(word.charAt(counter)==guese.charAt(0)) 
									{
										System.out.print(" " + guese);
									}
									else if(word.charAt(counter)==guese2.charAt(0)) 
									{
										System.out.print(" " + guese2);
									}
									else if(word.charAt(counter)==guese3.charAt(0)) 
									{
										System.out.print(" " + guese3);
									}
									else if(word.charAt(counter)==guese4.charAt(0)) 
									{
										System.out.print(" " + guese4);
									}
									else if(word.charAt(counter)==guese5.charAt(0)) 
									{
										System.out.print(" " + guese5);
									}
									else if(word.charAt(counter)==guese6.charAt(0)) 
									{
										System.out.print(" " + guese6);
									}
									else if(word.charAt(counter)==guese7.charAt(0)) 
									{
										System.out.print(" " + guese7);
									}
									else if(word.charAt(counter)==guese8.charAt(0)) 
									{
										System.out.print(" " + guese8);
									}
									else if(word.charAt(counter)==guese9.charAt(0)) 
									{
										System.out.print(" " + guese9);
									}
									else System.out.print(" _ ");
								}
							}
							else if(match==false && fullMatch==false)
							{
								triesLeft--;
								System.out.println("__________________________________");
								System.out.println("You have guesed wrong! You have: " + triesLeft + " tries Left");
								System.out.print("                                                            __________");
								System.out.println();
								
								for(int counter =0;counter<5;counter++) 
								{   if(counter<2) 
									{
									System.out.print("                                   			    |");
									System.out.println("        |");
									}
									else if (counter==2) 
									{
										System.out.print("                                     			    O");
										System.out.println("        |");
									}
									else if (counter==3) 
									{	System.out.print("                                                           /|\\");
										
										System.out.println("       |");
									}
									else if (counter==4) 
									{
										System.out.print("                                                           /");
										System.out.println("         |");
									}
									else 
									{
									System.out.println("                                                                     |");
									}
								}
								System.out.println("                                                  ____________________________");
								for(int counter=0;counter<word.length();counter++) 
								{
									System.out.print(" _ ");
								}
							}
							System.out.println();
							System.out.println("___________________");
							if(amountCorrect==word.length())
							{
								System.out.println("Victory! You found the right word!");
								fullMatch=true;
							}
							else 
							{
								System.out.print("Please enter a letter you think is in the word");
								System.out.println();
								amount=0;
								match=false;
								String guese10 = in.next();
							
								for(int counter = 0;counter<word.length();counter++) 
								{
									if(word.charAt(counter)==guese10.charAt(0)) 
									{
										match=true;
										amount++;
									}
								else;
								}
								if(match==true && fullMatch==false) 
								{
									System.out.println("_________________________________");
									System.out.println("You have guesed correct! The letter "+ guese10 + " is in the word "+ amount +" of times");
									amountCorrect++;
									for(int counter=0;counter<word.length();counter++) 
									{
										if(word.charAt(counter)==guese.charAt(0)) 
										{
											System.out.print(" " + guese);
										}
										else if(word.charAt(counter)==guese2.charAt(0)) 
										{
											System.out.print(" " + guese2);
										}
										else if(word.charAt(counter)==guese3.charAt(0)) 
										{
											System.out.print(" " + guese3);
										}
										else if(word.charAt(counter)==guese4.charAt(0)) 
										{
											System.out.print(" " + guese4);
										}
										else if(word.charAt(counter)==guese5.charAt(0)) 
										{
											System.out.print(" " + guese5);
										}
										else if(word.charAt(counter)==guese6.charAt(0)) 
										{
											System.out.print(" " + guese6);
										}
										else if(word.charAt(counter)==guese7.charAt(0)) 
										{
											System.out.print(" " + guese7);
										}
										else if(word.charAt(counter)==guese8.charAt(0)) 
										{
											System.out.print(" " + guese8);
										}
										else if(word.charAt(counter)==guese9.charAt(0)) 
										{
											System.out.print(" " + guese9);
										}
										else if(word.charAt(counter)==guese10.charAt(0)) 
										{
											System.out.print(" " + guese10);
										}
										else System.out.print(" _ ");
									}
								}
								else if(match==false && fullMatch==false)
								{
									triesLeft--;
									System.out.println("__________________________________");
									System.out.println("You have guesed wrong! You have: " + triesLeft + " tries Left");
									System.out.println("Game Over!");
									System.out.print("                                                            __________");
									System.out.println();
									
									for(int counter =0;counter<5;counter++) 
									{   if(counter<2) 
										{
										System.out.print("                                   			    |");
										System.out.println("        |");
										}
										else if (counter==2) 
										{
											System.out.print("                                     			    O");
											System.out.println("        |");
										}
										else if (counter==3) 
										{	System.out.print("                                                           /|\\");
											
											System.out.println("       |");
										}
										else if (counter==4) 
										{
											System.out.print("                                                           / \\");
											System.out.println("       |");
										}
										else 
										{
										System.out.println("                                                                     |");
										}
									}
									System.out.println("                                                  ____________________________");
									for(int counter=0;counter<word.length();counter++) 
									{
										System.out.print(" _ ");
									}
								}
	}
	}
	}
	
}
}} in.close();
} 
}