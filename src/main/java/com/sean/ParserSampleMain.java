package com.sean;

/**
 * https://stanfordnlp.github.io/CoreNLP/download.html
 */

import edu.stanford.nlp.simple.*;

public class ParserSampleMain {


    public static void main(String[] args){



                // Create a document. No computation is done yet.
                Document doc = new Document("San Diego is located in California.");
                for (Sentence sent : doc.sentences()) {  // Will iterate over all sentences

                    System.out.println("The third lemma (root verb) of the sentence '" + sent + "' is " + sent.lemma(2));
                    // When we ask for the parse, it will load and run the parser
                    // This shows the hierarchy of the sentence structure and the various parts of the POS (parts of speech)
                    System.out.println("The parse of the sentence '" + sent + "' is " + sent.parse());

                    //
                    // (ROOT
                    //      (S (NP (NNP San) (NNP Diego)) (VP (VBZ is) (ADJP (JJ located) (PP (IN in) (NP (NNP California)))))
                    //
                    // this shows that the first part is the Subject (S)
                    //      (S (NP (NNP San) (NNP Diego))
                    //     which is made up of NNP - proper noun singular
                    //
                    //     VP is Verb Phrase
                    //
                    //     etc.
                }

    }
}
