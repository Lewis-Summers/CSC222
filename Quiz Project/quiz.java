import java.util.Scanner;

class quiz {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int score = 0;

    System.out.println("What is the most watched sport in the America?");
    System.out.println("1. Soccer\n2. Baseball\n3. Football\n4. Basketball");

    int correctAnswer1 = 3;
    int choiceNum1 = scan.nextInt();

    score += checkAnswer(choiceNum1, correctAnswer1);

    System.out.println("Who do you play as in Super Mario?");
    System.out.println("1. Mario Mario\n2. Dirty Dan\n3. Taylor Swift\n4. Luigi Mario");

    int correctAnswer2 = 1;
    int choiceNum2 = scan.nextInt();

    score += checkAnswer(choiceNum2, correctAnswer2);

    System.out.println("Which out of these car brands is American?");
    System.out.println("1. Toyota\n2. Ford\n3. BMW\n4. Lamborghini");

    int correctAnswer3 = 2;
    int choiceNum3 = scan.nextInt();

    score += checkAnswer(choiceNum3, correctAnswer3);

    System.out.println("What does 'etc' mean?");
    System.out.println("1. Extended text cut\n2. Et cetera\n3. Taylor swift\n4. Etables taste creative");

    int correctAnswer4 = 2;
    int choiceNum4 = scan.nextInt();

    score += checkAnswer(choiceNum4, correctAnswer4);

    System.out.println("How many people are in the US congress?");
    System.out.println("1. 535\n2. 424\n3. 100\n4. 435");

    int correctAnswer5 = 1;
    int choiceNum5 = scan.nextInt();

    score += checkAnswer(choiceNum5, correctAnswer5);

    System.out.println("How many continents exist?");
    System.out.println("1. 5\n2. 6\n3. 7\n4. 8");

    int correctAnswer6 = 3;
    int choiceNum6 = scan.nextInt();

    score += checkAnswer(choiceNum6, correctAnswer6);

    System.out.println("Aureolin is a shade of what color?");
    System.out.println("1. Blue\n2. Green\n3. Red\n4. Yellow");

    int correctAnswer7 = 4;
    int choiceNum7 = scan.nextInt();

    score += checkAnswer(choiceNum7, correctAnswer7);

    System.out.println("What car company manufactures the 911?");
    System.out.println("1. Bugatti\n2. Porsche\n3. Lamborghini\n4. Ferrari");

    int correctAnswer8 = 2;
    int choiceNum8 = scan.nextInt();

    score += checkAnswer(choiceNum8, correctAnswer8);

    System.out.println("Which country won the first FIFA world cup in 1930?");
    System.out.println("1. Brazil\n2. Argentina\n3. Uruguay\n4. Morocco");

    int correctAnswer9 = 3;
    int choiceNum9 = scan.nextInt();

    score += checkAnswer(choiceNum9, correctAnswer9);

    System.out.println("What city is known as the “eternal city”?");
    System.out.println("1. Kyoto\n2. Rome\n3. Jerusalem\n4. Varanasi");

    int correctAnswer10 = 2;
    int choiceNum10 = scan.nextInt();

    score += checkAnswer(choiceNum10, correctAnswer10);

    System.out.println("What is the capital of Bhutan?");
    System.out.println("1. Thimphu\n2. Ulaanbaatar\n3. Dushanbe\n4. Colombo");

    int correctAnswer11 = 4;
    int choiceNum11 = scan.nextInt();

    score += checkAnswer(choiceNum11, correctAnswer11);

    System.out.println("Which planet is known as the Red Planet");
    System.out.println("1. Venus\n2. Mars\n3. Jupiter\n4. Saturn");

    int correctAnswer12 = 2;
    int choiceNum12 = scan.nextInt();

    score += checkAnswer(choiceNum12, correctAnswer12);

    System.out.println("In what year did the Titanic sink?");
    System.out.println("1. 1908\n2. 1912\n3. 1923\n4. 1931");

    int correctAnswer13 = 2;
    int choiceNum13 = scan.nextInt();

    score += checkAnswer(choiceNum13, correctAnswer13);

    
    System.out.println("Which chemical element has the symbol 'K'?");
    System.out.println("1. Potassium\n2. Sodium\n3. Calcium\n4. Iron");

    int correctAnswer14 = 1;
    int choiceNum14 = scan.nextInt();

    score += checkAnswer(choiceNum14, correctAnswer14);

    
    System.out.println("What is the largest mammal in the world?");
    System.out.println("1. Elephant\n2. Blue Whale\n3. Giraffe\n4. Gorilla");

    int correctAnswer15 = 2;
    int choiceNum15 = scan.nextInt();

    score += checkAnswer(choiceNum15, correctAnswer15);

    
    System.out.println("Who wrote the play 'Romeo and Juliet'?");
    System.out.println("1. William Shakespeare\n2. Jane Austen\n3. Charles Dickens\n4. Mark Twain");

    int correctAnswer16 = 1;
    int choiceNum16 = scan.nextInt();

    score += checkAnswer(choiceNum16, correctAnswer16);

    
    System.out.println("What is the currency of Japan?");
    System.out.println("1. Yen\n2. Won\n3. Ringgit\n4. Baht");

    int correctAnswer17 = 1;
    int choiceNum17 = scan.nextInt();

    score += checkAnswer(choiceNum17, correctAnswer17);

    
    System.out.println("Which famous scientist developed the theory of general relativity?");
    System.out.println("1. Isaac Newton\n2. Galileo Galilei\n3. Albert Einstein\n4. Stephen Hawking");

    int correctAnswer18 = 2;
    int choiceNum18 = scan.nextInt();

    score += checkAnswer(choiceNum18, correctAnswer18);

    
    System.out.println("What is the world's largest ocean?");
    System.out.println("1. Atlantic Ocean\n2. 1912\n3. 1923\n4. 1931");

    int correctAnswer19 = 2;
    int choiceNum19 = scan.nextInt();

    score += checkAnswer(choiceNum19, correctAnswer19);

    
    System.out.println("Which planet is known as the 'Morning Star' or 'Evening Star' depending on its visibility?");
    System.out.println("1. Mars\n2. Venus\n3. Jupiter\n4. Saturn");

    int correctAnswer20 = 2;
    int choiceNum20 = scan.nextInt();

    score += checkAnswer(choiceNum20, correctAnswer20);
    
    System.out.println(score + " out of 20 correct!");
    scan.close();
  }

  public static int checkAnswer(int userGuess, int correctAnswer) {
    if (userGuess == correctAnswer) {
      System.out.println("Correct! \n");
      return 1;
    } else {
      System.out.println("Wrong! \n");
      return 0;
    }
}
}
