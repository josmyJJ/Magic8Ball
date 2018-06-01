package com.company;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            char stopLoop;
            char userAnswer = 'n';
            stopLoop = 'y';

            String[] responses = {
                    "It is certain", "It is decidedly so", "Without a doubt", "Yes definitely",
                    "You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Yes",
                    "Signs point to yes", "Reply hazy try again", "Ask again later", "Better not tell you now",
                    "Cannot predict now", "Concentrate and ask again", "Don't count on it", "My reply is no",
                    "My sources say no", "Outlook not so good", "Very doubtful"

            };
            while(userAnswer != stopLoop){
                System.out.println("Ask a question: ");
                String userResponse = input.nextLine();

                Random random = new Random();
                int index = random.nextInt(responses.length);
                System.out.println("MAGIC 8-BALL SAYS: " + responses[index]);

                System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");
                stopLoop = input.nextLine().charAt(0);
            }

            input.close();
    }
}
