import java.util.Scanner;
import java.util.Random;

public class questionGen {

    public static void main (String[] args) {

        String[] papersQuestionArray = {"Theoretical and methodological strengths of ", "A new study building on the research in "};
        String[] genericQuestionArray = {"What is ", "Explain "};
        String[] typicalQuestionArray = {"Challenges faced by the child in learning "};
        String[] atypicalQuestionArray = {"Evidence for phonological impairments in ","Evidence for similarities and differences between "};

        String[] papersArray = {"Nunez del Prado.", "Kedar et al.", "Fernald and Hurtado.", "Gelman and Coley.", "Bialystok et al.", "Bishop and Edmundson."};
        String[] genericArray = {"MLU.", "a Truth Value Judgment Task.", "the Act-Out Method.", "fast mapping.", "categorical perception of speech.", " the Elicited Production Method.", "the Elicited Imitation Method.", "Spontaneous Speech."};
        String[] typicalArray = {"phonology.", "syntax.", "semantics."};
        String[] atypicalArray = {"SLI/Dyslexia.", "SLI/Autism.", "Dyslexia/Autism.", "Developmental Dyslexia."};

        String[][] questionArrays = {papersQuestionArray, genericQuestionArray, typicalQuestionArray, atypicalQuestionArray};
        String[][] topicArrays = {papersArray, genericArray, typicalArray, atypicalArray};

        int i = 0;

        Scanner reader = new Scanner(System.in);

        System.out.println("Press ENTER to generate questions.");

        while(i != 1){

            String n = null;

            if(reader.hasNextLine()) {
                n = reader.nextLine();
            }
            else {

            }

            if(n.equals("")) {
                Random generator = new Random();
                int arrayIndex = generator.nextInt(questionArrays.length);
                String[] specificQuestionArray = questionArrays[arrayIndex];
                String[] specificTopicArray = topicArrays[arrayIndex];
                int questionIndex = generator.nextInt(specificQuestionArray.length);
                int topicIndex = generator.nextInt(specificTopicArray.length);

                System.out.println(specificQuestionArray[questionIndex] + specificTopicArray[topicIndex]);
            }
            else{
                break;
            }
        }
        reader.close();
    }
}
