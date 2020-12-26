import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

//import sun.audio.*;
/* Trivia Pursuit
 * Marjan Ahmed
 * 6/18/2018
 */

public class TriviaPursuit
{
	

	// Creating constant score
    public static int score=0;
    
    // Creating constant to end topic of Generation Z
    public static int endTopicGenZ=0;
    
    // Creating constant to end topic of Japan
    public static int endTopicJ=0;

    // A status variable for controlling whether the game is over.
  	public static boolean gameOver = false;
  	
	// Heading method
		public static void printHeading() throws InterruptedException
		{
			// This method will store this address and we could output it at different intervals in out program
			// without having to re-type it all
			
			System.err.println ("\t\t_|_   __  o      o  __       __         __    __       o _|_  ");
			Thread.sleep(300);
			System.err.println("\t\t |_, |  ' | (__| | (__(     |__) (__(_ |  ' __)  (__(_ |  |_, ") ;
	        System.err.println("\t\t                            | ");
	        System.out.println ();
	        Thread.sleep(500);
	        System.err.println ("\t\t\t\tRules and Instuctions: \n\t\t\t\t1. Choose your topic \n\t\t 2. Roll dice, the die number will correspond to a catagory \n   (Geography, Entertainment, History, Arts & Literature, Science & Nature, Sports & Leisure)");
	        Thread.sleep(1000);
	        System.err.println ("\t\t\t3. Answer the question in the catagory \n\t    4. If answered correctly will attain points, otherwise will lose points");
	        Thread.sleep(1000);
	        System.err.println ("\t\t\t\t5. Roll dice again\n\t\t\t    Please do not Google answers");
	        Thread.sleep(1000);
	        System.err.println ("\t   PLEASE ANSWER USING THE NUMBERS GIVEN FOR EACH ANSWER OPTION");
	        Thread.sleep(1000);
	        System.err.println ("\t\t     Please only use answers given in brackets");
	        System.err.println ("        **************************************************************************");
	        System.out.println ();
		}
		
			// Method that will stimulate the results of rolling a single fair die 
			public static int rollDice()
			{
				System.out.println ("Your dice has rolled: ");
				 return (int)(Math.random() * 6) + 1;
			}
			
			// Game code if Japan chosen as topic 
			public static void Japan() throws InterruptedException
			{
				// Storing questions in an array per catagory 
				
			     String [] questionsJGEO = new String[] {"What country is geographically closest to Japan? (1. Vietnam, 2. South Korea, 3. North Korea, 4. China)",
						"Which of the following is not an island of Japan? (5. Okinawa, 6. Hokkaido, 7. Fukushima, 8. Shikoku) ",
						"Where would you find the international Airport of Narita (NRT)? (9. Tokyo, 10. Saitama, 11. Chiba, 12. Kanagawa)",
						"Where would you find domestic airport, Haneda? (13. Yokohama, 14. Tokyo Bay, 15. Kakone, 16. Ibaraki)",
						"On January 17, 1995, which Japanese city suffered from a major natural disaster? (17. Sendai, 18. Kobe, 19. Iwate, 20. Kagoshima)"};
			     
				ArrayList<String> JGeo = new ArrayList<String>(Arrays.asList(questionsJGEO)); // Putting the array contents into a array list because otherwise cannot modify the array to delete elements
				
				String [] questionsJEnt = new String []{"Which subculture can Kawaii be associated with? (1. Shojo, 2. Otaku, 3. Lolita, 4. Visual Kei)",
						"Which mascot’s name translates to the “Lazy Egg”? (5. Gudetama, 6. Anpanman, 7. Kumamon, 8. Pipo-Kun)",
						"Which anime is the most popular in Japan? (9. Dragon Ball, 10. One Piece, 11. Death Note, 12. Gintama)"};
				
				ArrayList<String> JEnt = new ArrayList<String>(Arrays.asList(questionsJEnt)); // Putting the array contents into a array list because otherwise cannot modify the array to delete elements
				
				String [] questionsSci = new String[] {"Japan turns which of the following into renewable energy? (1. Crowd noise at sumo wrestling matches, 2. Stationary bikes in spinning classes, 3. footsteps at Tokyo trains stations, 4. Leftover sushi rice",
						"When was the last time Mount Fuji erupted? (5. 685, 6. 1707, 7. 2003, 8. it has never erupted)",
						"How many earthquakes does Japan experience in a year? (9. More than 1000, 10. 2000, 11. More than 2500, 12. Less than 800)"};
				
				ArrayList<String> Sci = new ArrayList<String>(Arrays.asList(questionsSci)); // Putting the array contents into a array list because otherwise cannot modify the array to delete elements
				
				String [] questionsRan = new String[] {"Which area in Tokyo is famous for its colorful street fashion? (1. Harajuku, 2. Toneri, 3. Ichigaya, 4. Mizue)",
						"What is the average weight for top-level sumo wrestlers? (5. 270  pounds, 6. 350 pounds, 7. 480 pounds, 8. 530 pounds)",
						"What is the Japanese macaque's claim to fame? (9. It’s the northernmost (non-human) primate on the planet, 10. It’s the largest monkey, 11. It’s the fastest monkey, 12. it regularly eats charcoal)",
						"How do people greet each other in Japan? (13. Handshake, 14. Bow, 15. Hug, 16. kiss on cheek)",
						"What is a 'kotatsu' (17. Low table with a heater below it, 18. fish eaten raw as a delicacy, 19. herb found in japan and used in Japan, 20. A bird)"};
				
				ArrayList<String> Ran = new ArrayList<String>(Arrays.asList(questionsRan)); // Putting the array contents into a array list because otherwise cannot modify the array to delete elements
				
				String [] questionsFood = new String[] {"This Japanese snack is a crunchy rice cracker that comes in many flavors. (1. Tamago, 2. Onigiri, 3. Osembe, 4. Katsudon)",
						"This pickled Japanese radish is yellow in color and eaten with rice. It is also used in Oshinko Maki (5. Daikon, 6. Shiso, 7. Wasabe, 8. Takuan)",
						"This sour and salty pickle is make from the ume fruit and is generally eaten with rice (9. Hana, 10. Shitake, 11. Umeboshi, 12. Donguri)",
						"In English gobo is called: (13. Burdock root, 14. celery, 15. green onion, 16. pork)",
						"What is shiso? (17. A dark yellow lettuce, 18. A Vegetable similar to carrot, 19. green or deep purple beefsteak leaf)"};
				
				ArrayList<String> Food = new ArrayList<String>(Arrays.asList(questionsFood)); // Putting the array contents into a array list because otherwise cannot modify the array to delete elements
				
				String [] questionsSports = new String[] {"Which of the following Japanese sports is NOT a form of martial arts? (1. Kyotei, 2. Kendo, 3. Judo, 4. Jujutsu)",
						"Which activity do the Japanese, typically youth, take part in regularly? (5. Karaoke, 6. Karate, 7. Sumo, 8. dancing)",
						"What is the most popular sport in Japan? (9. Soccer, 10. Sumo, 11. Baseball, 12. Tennis)"};
				
				ArrayList<String> Sports = new ArrayList<String>(Arrays.asList(questionsSports)); // Putting the array contents into a array list because otherwise cannot modify the array to delete elements
				
			// While statement to loop method until gameOver	
			while (gameOver==false)
			{
				if (endTopicJ==24) 
				{
					gameOver=true;
					break;
				}
				
				// Returning the dice method
				int userRoll = rollDice();

				// Outputting the return value
				System.out.println ();
				System.out.println(userRoll);

				if (userRoll==1)
				{					
					System.out.println("Catagory: Geography");	// If dice rolls 1 then Geography
					System.out.println ();
					Thread.sleep(2000);
					
					// If statement to determine if the array is empty
					if(JGeo.isEmpty()) 
					{
						System.out.println("You have answered all questions from this category. Finding another category...");
					}
					else 
					{
						// Choosing a random element of the array
						int idx = new Random().nextInt(JGeo.size());
						String random = (JGeo.get(idx));
						
						// Removing the random question that has been asked from the array so it doesn't repeat 
						JGeo.remove(random);
						
						System.out.println("Your question is: "+random);	// Asking question
						endTopicJ++;				
					
						// Getting answer
						Scanner sc=new Scanner (System.in); // Create a Scanner to retrieve input
						int answer=sc.nextInt();
						
						if (answer==2 || answer==7 || answer==11 || answer==14 || answer==18) // The correct answers
						{
							System.out.println ("Correct! Your dice will now roll again.");
							score=score+10; // Adding points
						}
						else
						{
							System.err.println("Sorry, incorrect. Your dice will now roll again.");
							score=score-5; // Subtracting points
						}
						
						System.out.println ();
						 
					    System.out.println ("Your score is: "+score);
						Thread.sleep(1000);					
					}
				}
				else if (userRoll==2)
				{
					System.out.println("Catagory: Entertainment");	// If dice rolls 2 then Entertainment
					System.out.println ();
					Thread.sleep(2000);
					
					// If statement to determine if the array is empty
					if(JEnt.isEmpty()) 
					{
						System.out.println("You have answered all questions from this category. Finding another category...");
					}
					else 
					{
						// Choosing a random element of the array
						int idx = new Random().nextInt(JEnt.size());
						String random = (JEnt.get(idx));
						
						// Removing the random question that has been asked from the array so it doesn't repeat 
						JEnt.remove(random);
					
						System.out.println("Your question is: "+random);	// Asking question
						endTopicJ++;
					
						// Getting answer
						Scanner sc=new Scanner (System.in); // Create a Scanner to retrieve input
						int answer=sc.nextInt();
						if (answer==1 || answer==5 || answer==10)
						{
							System.out.println ("Correct! Your dice will now roll again.");
							score=score+10;
						}
						else
						{
							System.err.println("Sorry, incorrect. Your dice will now roll again.");
							score=score-5;
						}
						System.out.println ();
						
						System.out.println ("Your score is: "+score);
						Thread.sleep(1000);
					}
				}
				else if (userRoll==3)
				{
					System.out.println("Catagory: Science and Nature");	// If dice rolls 3 then Sci/Nature
					System.out.println ();
					Thread.sleep(2000);
					
					// If statement to determine if the array is empty to roll again
					if(Sci.isEmpty()) 
					{
						System.out.println("You have answered all questions from this category. Finding another category...");
					}
					else 
					{
						// Choosing a random element of the array
						int idx = new Random().nextInt(Sci.size());
						String random = (Sci.get(idx));
						
						// Removing element from array
						Sci.remove(random);
					
						System.out.println("Your question is: "+random);	// Asking question
						endTopicJ++;
					
						// Getting answer
						Scanner sc=new Scanner (System.in); // Create a Scanner to retrieve input
						int answer=sc.nextInt();
						if (answer==3 || answer==6 || answer==9)
						{
							System.out.println ("Correct! Your dice will now roll again.");
							score=score+10;
						}
						else
						{
							System.err.println("Sorry, incorrect. Your dice will now roll again.");
							score=score-5;
						}
						System.out.println ();
						
					    System.out.println ("Your score is: "+score);
						Thread.sleep(1000);
					}
				}
				else if (userRoll==4)
				{
					System.out.println("Catagroy: Random");	// If dice rolls 4 then Random
					System.out.println ();
					Thread.sleep(2000);
					
					// Determining if empty to roll again
					if(Ran.isEmpty()) 
					{
						System.out.println("You have answered all questions from this category. Finding another categroy...");
					}
					else 
					{
						// Choosing a random element of the array
						int idx = new Random().nextInt(Ran.size());
						String random = (Ran.get(idx));
						
						// Removing element
						Ran.remove(random);
					
						System.out.println("Your question is: "+random);	// Asking question
						endTopicJ++;
					
						// Getting answer
						Scanner sc=new Scanner (System.in); // Create a Scanner to retrieve input
						int answer=sc.nextInt();
						if (answer==1 || answer==6 || answer==9 || answer==14 || answer==17)
						{
							System.out.println ("Correct! Your dice will now roll again.");
							score=score+10;
						}
						else
						{
							System.err.println("Sorry, incorrect. Your dice will now roll again.");
							score=score-5;
						}
						System.out.println ();
						
					    
					    System.out.println ("Your score is: "+score);
						Thread.sleep(1000);
					}
				}
				else if (userRoll==5)
				{
					System.out.println("Catagory: Food/Cuisine");	// If dice rolls 5 then food
					System.out.println ();
					Thread.sleep(2000);
					
					// Determining if category is empty to roll again
					if(Food.isEmpty()) 
					{
						System.out.println("You have answered all questions from this category. Finding another category...");
					}
					else 
					{
						// Choosing a random element of the array
						int idx = new Random().nextInt(Food.size());
						String random = (Food.get(idx));
						
						// Removing element
						Food.remove(random);
					
						System.out.println("Your question is: "+random);	// Asking question
						endTopicJ++;					
					
						// Getting answer
						Scanner sc=new Scanner (System.in); // Create a Scanner to retrieve input
						int answer=sc.nextInt();
						if (answer==3 || answer==8 || answer==11 || answer==13 || answer==19)
						{
							System.out.println ("Correct! Your dice will now roll again.");
							score=score+10;
						}
						else
						{
							System.err.println("Sorry, incorrect. Your dice will now roll again.");
							score=score-5;
						}
						
						System.out.println ();
			
					    System.out.println ("Your score is: "+score);
						Thread.sleep(1000);
					}
				
				}
				else 
				{
					System.out.println("Catagroy: Sports/Leisure");	// If dice rolls 6 then sports
					System.out.println ();
					Thread.sleep(2000);
					
					// Determining if empty to change roll again
					if(Sports.isEmpty()) 
					{
						System.out.println("You have answered all questions from this category. Fining another category...");
					}
					else 
					{
						// Choosing a random element of the array
						int idx = new Random().nextInt(Sports.size());
						String random = (Sports.get(idx));
						
						// Removing element
						Sports.remove(random);
					
						System.out.println("Your question is: "+random); // Asking question
					
						endTopicJ++;					
					
						// Getting answer
						Scanner sc=new Scanner (System.in); // Create a Scanner to retrieve input
						int answer=sc.nextInt();
						if (answer==1 || answer==5 || answer==11)
						{
							System.out.println ("Correct! Your dice will now roll again.");
							score=score+10;
						}
						else
						{
							System.err.println("Sorry, incorrect. Your dice will now roll again.");
							score=score-5;
						}
						System.out.println ();
						
					    System.out.println ("Your score is: "+score);
						Thread.sleep(1000);		
				
					}					
			}
		}
	}
			
			// Game code if Generation Z chosen as topic
			public static void GenZ() throws InterruptedException
			{
				// Questions stored into an array
				String[] questionsZRan = new String[] {"Gen Z is best described as (1. the most diverse generation, 2. the largest generation by population, 3. the most anti-social generation, 4. less dependent on technology than millennials)",
						"Their social network of choice is? (5. Facebook, 6. Twitter, 7. Snapchat, 8. Pinterest)",
						"Which is not a nickname of Gen Z (9. Centennials, 10. Post-millennials, 11. IGeneration, 12. The Z Squad)",
						"Fill in the blank: Gen Z spends approx. __ hours a week on their smartphones( 13. 5, 14. 10, 15. 15, 16. 20)",
						"When it comes to technology, Gen Z uses __ screens on average (17. 3 , 18. 4 , 19. 5 , 20. 6)" };
				
				ArrayList<String> ZRan = new ArrayList<String>(Arrays.asList(questionsZRan)); // Putting the array contents into a array list because otherwise cannot modify the array to delete elements
				
				String [] questionsZSlang = new String [] {"Please select the phrase that best defines ‘draking’ (1. When someone listens to emotional and romantic songs while deeply invested in their feelings 2. The act of being extremely lazy all day long due to a wild night out 3. When someone posts a selfie on social media with a 'duck face', 4. When someone is very upset and proceeds to cause a  scene in public)",
						"Please select the phrase that best defines ‘cuffed’ (5. Being in a serious relationship with someone 6. Getting arrested, 7. A popular fashion trend, 8. When someone fails an exam)",
						"Please select the phrase that best defines 'Bye Felicia' (9. A joking way to say 'hello!', 10. Said to someone whose presence is no longer wanted, 11. Another way of saying break a leg or wishing someone luck, 12. Used when parting from your loved one in a romantic way)",
						"What is the meaning of ‘you t-paining too much’ (13. Using too much auto tune, 14. being in a lot of pain, 15. When you show your love for t-pain, 16. complaining)",
						"What does the following phrase mean? Why you so salty? (17. Why are you so agressive, 18. Why are you so rude/mean? 18. Why are you so sad? 20. Why are you so ugly?)"};
				
				ArrayList<String> ZSlang = new ArrayList<String>(Arrays.asList(questionsZSlang)); // Putting the array contents into a array list because otherwise cannot modify the array to delete elements
				
				String [] questionsZMusic = new String []{"Which artist created the song Gods Plan? (1. Justin Beiber, 2. Kanye West, 3. Drake, 4. Selena Gomez)",
						"Which artist created the song Psycho? (5. Cardi B, 6. J Balvin, 7. Maroon 5, 8. Post Malone)",
						"Which artist created the song This Is America? (9. Zedd, 10. Childish Gambino, 11. Marshmello, 12. Miley Cyrus)",
						"Which artist created the song Walk It Talk It (13. PARTYNEXTDOOR, 14. BlocBoy JB, 15. Migos, 16. Camila Cabello)",
						"Which artist created the song New Rules (17. Taylor Swift, 18. Dua Lipa, 19. Khalid, 20. The Weeknd)"};
				
				ArrayList<String> ZMusic = new ArrayList<String>(Arrays.asList(questionsZMusic)); // Putting the array contents into a array list because otherwise cannot modify the array to delete elements
				
				String [] questionsZCeleb = new String []{"Which of the following is a Generation Z'er? (1. Millie Bobbie Brown, 2. Selena Gomez, 3. Taylor Lautner, 4. Chris Hemsworth)",
						"Which of the following is a Generation Z'er? (5. Kim Kardashion, 6. Yara Shahidi, 7. Emma Watson, 8. Ed Sheeran)",
						"Which of the following is a Generation Z'er? (9. Rihanna, 10. Katy Perry, 11. Rowan Blanchard, 12. Zayn Malik)",
						"Which of the following is a Generation Z'er? (13. Jacob Sartorius, 14. Cameron Dallas, 15. Zac Efron, 16. Demi Lovato)",
						"Which of the following is a Generation Z'er? (17. Adele, 18. Beyonce, 19. Cara Delavine, 20. Sabrina Carpenter)"};
				
				ArrayList<String> ZCeleb = new ArrayList<String>(Arrays.asList(questionsZCeleb)); // Putting the array contents into a array list because otherwise cannot modify the array to delete elements
				
				String [] questionsZMemes = new String []{"What is the name of the famous Gorilla that died? (1. Haram, 2. Harambe, 3. Hareembe, 4. Hamhambae)",
						"Who's ya bae? (5. Sweet Bae, 6. Sprinkle Bae, 7. Mirch Bae, 8. Salt Bae)",
						"Finish the phrase Catch me outside .... (9. How is it?, 10. Whats the weather like?, 11. Howbow dat?, 12. Throwing hands.)",
						"Fill in the blank space Damn ____, back at it again with them white vans (13. Dan, 14. John, 15. Daniel, 16. David)",
						"What is a dank meme (17. A really bad meme, 18. Exceptionally good meme, 19. A meme that is overused, 20. A meme that smells bad)"};
				
				ArrayList<String> ZMemes = new ArrayList<String>(Arrays.asList(questionsZMemes)); // Putting the array contents into a array list because otherwise cannot modify the array to delete elements
				
				String [] questionsZAc = new String [] {"What does OTP mean? (1. One True Penguin, 2. Only the People, 3. One True Pair, 4. Once they Plop)",
						"What does GOAT mean? (5. Greatest of All Time, 6. Got Opinions All the Time, 7. Greatest of Any Time, 8. Greatest of Almost Time)",
						"What does WYM mean? (9. When yall moving?, 10. What you mean?, 11. What ya managing?, 12. Why you mean?)",
						"What does DKM mean? (13. Don’t know man, 14. Don’t kill me, 15. Didn’t know man, 16. Don’t kick me)",
						"What does NP mean? (17. No problem, 18. No please, 19. Not present, 20. Not popular)"};
				
				ArrayList<String> ZAc = new ArrayList<String>(Arrays.asList(questionsZAc));// Putting the array contents into a array list because otherwise cannot modify the array to delete elements
				
				while (gameOver==false)
				{					
					if (endTopicGenZ==30) 
					{
						gameOver=true;
						break;
					}
					
				// Returning the dice method
				int userRoll = rollDice();

				// Outputting the return value
				System.out.println(userRoll);	
				
				if (userRoll==1)
				{
					System.out.println("Catagory: Random");	// If dice rolls 1 then Random
					System.out.println ();
					Thread.sleep(2000);
					
					// Determines if the category is empty to roll again
					if(ZRan.isEmpty()) 
					{
						System.out.println("You have answered all questions from this category. Finding another category...");
					}
					else 
					{
						// Choosing a random element of the array
						int idx = new Random().nextInt(ZRan.size());
						String random = (ZRan.get(idx));
						
						// Removing element
						ZRan.remove(random);
					
						System.out.println("Your question is: "+random);	// Asking question
						
						endTopicGenZ++;
						
						// Getting answer
						Scanner sc=new Scanner (System.in); // Create a Scanner to retrieve input
						int answer=sc.nextInt();
						if (answer==1 || answer==7 || answer==12 || answer==15 || answer==19)
						{
							System.out.println ("Correct! Your dice will now roll again.");
							score=score+10;
						}
						else
						{
							System.err.println("Sorry, incorrect. Your dice will now roll again.");
							score=score-5;
						}
						System.out.println ();
						System.out.println ("Your score is: "+score);
						Thread.sleep(1000);
					}
				}
				else if (userRoll==2)
				{
					System.out.println("Catagory: Slang");	// If dice rolls 2 then Slang
					System.out.println ();
					Thread.sleep(2000);
					
					// Determines if its empty to move onto another category
					if(ZSlang.isEmpty()) 
					{
						System.out.println("You have answered all questions from this category. Fininding another category...");
					}
					else 
					{
						// Choosing a random element of the array
						int idx = new Random().nextInt(ZSlang.size());
						String random = (ZSlang.get(idx));
						
						// Removing element
						ZSlang.remove(random);
					
						System.out.println("Your question is: "+random); // Asking question
						endTopicGenZ++;	

						// Getting answer
						Scanner sc=new Scanner (System.in); // Create a Scanner to retrieve input
						int answer=sc.nextInt();
						if (answer==1 || answer==5 || answer==9 || answer==13 || answer==18)
						{
							System.out.println ("Correct! Your dice will now roll again.");
							score=score+10;
						}
						else
						{
							System.err.println("Sorry, incorrect. Your dice will now roll again.");
							score=score-5;
						}
						System.out.println ();
						System.out.println ("Your score is: "+score);
						Thread.sleep(1000);
					}
				}
				else if (userRoll==3)
				{
					System.out.println("Catagory: Music");	// If dice rolls 3 then Music
					System.out.println ();
					Thread.sleep(2000);
					
					// Determines if category empty to roll die again
					if(ZMusic.isEmpty()) 
					{
						System.out.println("You have answered all questions from this category. Finding another category...");
					}
					else 
					{
						// Choosing a random element of the array
						int idx = new Random().nextInt(ZMusic.size());
						String random = (ZMusic.get(idx));
					
						// Removing element
						ZMusic.remove(random);
						
						System.out.println("Your question is: "+random); // Output question
						endTopicGenZ++;
					
						// Getting answer
						Scanner sc=new Scanner (System.in); // Create a Scanner to retrieve input
						int answer=sc.nextInt();
						if (answer==3 || answer==8 || answer==10 || answer==15 || answer==18)
						{
							System.out.println ("Correct! Your dice will now roll again.");
							score=score+10;
						}
						else
						{
							System.err.println("Sorry, incorrect. Your dice will now roll again.");
							score=score-5;
						}
						System.out.println ();
						System.out.println ("Your score is: "+score);
						Thread.sleep(1000);
					}
				}
				else if (userRoll==4)
				{
					System.out.println("Catagroy: Celebrities");	// If dice rolls 4 then Celebrities
					System.out.println ();
					Thread.sleep(2000);
					
					// If category empty then roll die again
					if(ZCeleb.isEmpty()) 
					{
						System.out.println("You have answered all questions from this category. Finding another category...");
					}
					else 
					{
						// Choosing a random element of the array
						int idx = new Random().nextInt(ZCeleb.size());
						String random = (ZCeleb.get(idx));
					
						// Removing element
						ZCeleb.remove(random);
					
						System.out.println("Your question is: "+random); // Asking question
						endTopicGenZ++;
					
						// Getting answer
						Scanner sc=new Scanner (System.in); // Create a Scanner to retrieve input
						int answer=sc.nextInt();
						if (answer==1 || answer==6 || answer==11 || answer==13 || answer==20)
						{
						System.out.println ("Correct! Your dice will now roll again.");
						score=score+10;
						}
						else
						{
							System.err.println("Sorry, incorrect. Your dice will now roll again.");
							score=score-5;
						}
							
						System.out.println ();
						System.out.println ("Your score is: "+score);
						Thread.sleep(1000);
					}
				}
				else if (userRoll==5)
				{
					System.out.println("Catagory: Memes");	// If dice rolls 5 then Memes
					System.out.println ();
					Thread.sleep(2000);
					
					// If category empty to roll dice again
					if(ZMemes.isEmpty()) 
					{
						System.out.println("You have answered all questions from this category. Finding another category...");
					}
					else 
					{
						// Choosing a random element of the array
						int idx = new Random().nextInt(ZMemes.size());
						String random = (ZMemes.get(idx));
						
						// Removing element
						ZMemes.remove(random);
						
						System.out.println("Your question is: "+random); // Asking question
						endTopicGenZ++;					
						
						// Getting answer
						Scanner sc=new Scanner (System.in); // Create a Scanner to retrieve input
						int answer=sc.nextInt();
						if (answer==2 || answer==8 || answer==11 || answer==15 || answer==18)
						{
							System.out.println ("Correct! Your dice will now roll again.");
							score=score+10;
						}
						else
						{
							System.err.println("Sorry, incorrect. Your dice will now roll again.");
							score=score-5;
						}
						System.out.println ();
						System.out.println ("Your score is: "+score);
						Thread.sleep(1000);
					
					}
				}
				else 
				{
					System.out.println("Catagroy: Acronyms");	// If dice rolls 6 then Acronyms
					System.out.println ();
					Thread.sleep(2000);
					
					// If category empty to roll die again
					if(ZAc.isEmpty()) 
					{
						System.out.println("You have answered all questions from this category. Finding another category...");
					}
					else 
					{
						// Choosing a random element of the array
						int idx = new Random().nextInt(ZAc.size());
						String random = (ZAc.get(idx));
						
						// Removing element
						ZAc.remove(random);
						
						System.out.println("Your question is: "+random); // Asking question
						endTopicGenZ++;
						
						// Getting answer
						Scanner sc=new Scanner (System.in); // Create a Scanner to retrieve input
						int answer=sc.nextInt();
						if (answer==3 || answer==5 || answer==10 || answer==14 || answer==17)
						{
							System.out.println ("Correct! Your dice will now roll again.");
							score=score+10;
						}
						else
						{
							System.err.println("Sorry, incorrect. Your dice will now roll again.");
							score=score-5;
						}
						System.out.println ();
						System.out.println ("Your score is: "+score);
						Thread.sleep(1000);
					}					
				}
				
			}
		}
			
	public static void main(String[] args) throws InterruptedException 
	{
		// Printing the heading method
				printHeading();
						
				// Choosing topic 
				Scanner sc=new Scanner (System.in); // Create a Scanner to retrieve input
				System.out.println ("Please choose your topic (Japan, Generation Z)");
				
				String topic =sc.nextLine();
				if (topic.equalsIgnoreCase("Japan"))
				{
					Japan();
					System.out.println ("Would you like to try the other topic?");				
					String yesorno =sc.nextLine();
					
						if(yesorno.equalsIgnoreCase("yes")) 
						{
							gameOver = false;
							GenZ();
						}
						else 
						{
							gameOver=true;
	        
						}
				}
				else if (topic.equalsIgnoreCase("Generation Z"))
				{
					GenZ();
					
					System.out.println ("Would you like to try the other topic?");				
					String yesorno =sc.nextLine();
					
						if(yesorno.equalsIgnoreCase("yes")) 
						{
							gameOver = false;
							Japan();
						}
						else 
						{
							gameOver=true;
	        
						}
				}						

				// For loop for countdown
				System.out.println("You have answered all questions in the topic. The game will end in");
				System.out.println("Your final score is "+score);
				for(int i=5; i>=0; i--)
				{
					// Outputting the countdown
					System.out.println ();
					Thread.sleep(500);
					System.out.println(i);
				}
				
				System.err.println(" _____       ___       ___  ___   _____        _____   _     _   _____   _____   \r\n" + 
						"/  ___|     /   |     /   |/   | | ____|      /  _  \\ | |   / / | ____| |  _  \\  \r\n" + 
						"| |        / /| |    / /|   /| | | |__        | | | | | |  / /  | |__   | |_| |  \r\n" + 
						"| |  _    / / | |   / / |__/ | | |  __|       | | | | | | / /   |  __|  |  _  /  \r\n" + 
						"| |_| |  / /  | |  / /       | | | |___       | |_| | | |/ /    | |___  | | \\ \\  \r\n" + 
						"\\_____/ /_/   |_| /_/        |_| |_____|      \\_____/ |___/     |_____| |_|  \\_\\ ");
					
	}

		
	

}
