
# Unit 6 - Natural Language Processing Project

## Introduction

Natural language processing (NLP) is used in many apps and devices to interact with users and make meaning of text to determine how to respond, find information, or to create new text. Your goal is to use natural language processing techniques to identify structure, patterns, and meaning in a text to have conversations with a user, execute commands, perform manipulations on the text, or generate new text.

## Requirements

Use your knowledge of object-oriented programming, ArrayLists, the String class, and algorithms to create a program that uses natural language processing techniques:

- **Create at least two ArrayLists** – Create at least two ArrayLists to store the data used in your program, such as data from text files or entered by the user.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and conditionals to find or manipulate elements in an ArrayList or String object.
- **Use methods in the String classs** - Use one or more methods in the String class in your program, such as to divide text into sentences or phrases.
- **Use at least one natural language processing technique** – Use a natural language processing technique to process, analyze, and/or generate text.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one word, otherwise it might not properly get display on this README.

![UML DIAGRAM](image.png)
## Video

Record a short video of your project to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown code:

[![Thumbnail for my projet](images.png)](https://youtu.be/9RwTerslneU)

## Project Description

Write a description of the goal and/or problem that your application. Include descriptions of what text is being analyzed, either if its text files you are using to interpret text an how the user interacts with your project.

My project was made in order to create a basic translator for a single words from English to the romanization of the word in 4 different languages. The project will take the english word and will then return the selected language of either Spanish, Korean, Armenian, or Italian. It will do this by seperating the text file lines into 5 different array lists then matching the word from the english list to wor din the other lists. 

## NLP Techniques

Write a description of what natural lanugage technique (NLP) you implemented in your project. State which methods in your project are associated with this, and a brief explanation of how those methods word and how they are necessary in the NLP technique. 

Three key NLP techniques used were Tokenization, String Matching, and Text Normalization. Tokenization was the used in order to seperate each line of the file into 1 of 5 different arraylists through the use of methods such as split method to split the words at the comma and the trim method in order to physically seperate each of the words. String matching was another technique that was used, it was achieved through the use of the compareTo method in order to match the language wanted to the language returned in order to translate the word. The technique that I used was text normalization or more secifically case normalization in order to make each of the words that the user wants to be translated into an all lowercase form, it does this in order to match the english word to a word in the text file exactly allowing use of the compareTo method. 
