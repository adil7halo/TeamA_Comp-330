# HW1_Comp-330

9/22 - Added more .txt files

9/20 - Got URLs working, Raed and I are working on trying to add more .txt files.

9/19 - Did a lot of big changes to the code, and added some .txt files. 

9/18 - Discussed with Raed on how to reformat some of the hw, code changes.

9/17 - Attempted to configure how to do URL's using Boolean.

9/16 - More booleans, worked with Raed on how to move forward with the hw, and exchanged some notes.

9/14 - Removed some files and added booleans.

9/12 - Initial setup of c9, and making some basic files.

______________________________________________________________________________________________________________

Instructions to Run Code: 

The Project is in 2 classes. NoteSystem.java contains the main system which loads all the notes (txt files in the present directory) and allows the user to generate different reports through a menu.

Note.java contains a Note class which loads a File object.

Once the NoteSystem.java and Note.java files are open, run the program, choose a number from the menu and generate the reports. There are already Identifiers, Mentions, and Keywords given in the .txt files.
________________________________________________________________________________________________________________

Hw1 Pair Assignment 


This is an assignment aimed at ensuring you are prepared for the challenging work we'll be doing in COMP 330 this year. It is also an example of what to expect from real-world software engineering: where you and your team may find yourself having to fill in many missing details, even to understand the assignment.

Teams of 2 students will work on this assignment so the notion of teamwork is instilled from the beginning. These assignments will be made on the day this assignment is unveiled.

In this assignment, you will develop a simple note-taking system. The notes are a collection of files that will be provided as a folder. Your program will read the notes into an appropriate data structure and be able to generate a number of reports as output. I must stress that this is not a database assignment. You may not assume the presence of databases or any server software when completing this assignment. Your program must load the notes into memory and organize them in such a way that you can generate each of the reports.


Note Syntax
Notes are stored as plaintext files. A note may contain arbitrary text.

There is special syntax for marking up your notes to support certain features.

For the purpose of this assignment, an identifier is defined as a letter followed by zero or more letters or digits. We will also allow underscores and hyphens to be used in identifiers anywhere a letter is permitted.

Examples of valid identifiers include:

MickeyMouse
Mickey123
Mickey-Mouse
Mickey_Mouse
Mickey123
m
m_
_Mickey
__
-
_
This list is by no means exhaustive but shows the possibilities.

To recognize these cases, you will need to learn about regular expressions. An excellent resource for this is http://www.regular-expressions.info/charclass.html. You will want to read about character classes, which allow you to match an entire set of characters.

In addition to learning about regular expressions, you will need to learn about how the language itself supports regular expressions. For example, Python supports regular expression processing through its re module: https://docs.python.org/3/library/re.html.

Java supports regular expressions, too. The tutorial at https://www.javaworld.com/article/3188545/learn-java/java-101-regular-expressions-in-java-part-1.html presents an excellent overview!

Identifiers are important, because we need them just about everywhere in actual notes. We'll now take a look at the syntax for various ways that we'll use them.

@identifier - Make a mention of an individual named by identifier. Think of this as the equivalent of a Twitter mention. An example is
@gkthiruvathukal
(but I don't use Twitter anymore).

#identifier - Make a mention of a topic. Think of this as the equivalent of a Twitter hashtag. An example is
#History-of-Computing
.

!identifier - Create unique identifier for the note. One an identifier has been used in a note, it may not appear in any other note. It is ok for the identifier to be reused within the same note, but subsequent definitions are ignored.

^id - Create a reference to an identifier in another note. This is the mechanism for linking two notes together.

URLs - Used to making a link to a web resource.

To keep things "simple", id, individual, and topic are all

Features/Requirements

This is very preliminary...

Functional requirements

Be able to report of all notes containing one or more mentions
Be able to generate a report of all notes, organized by mention
Be able to generate a report of all keywords
Be able to generate a report of all notes, organized by keyword
Be able to report notes by mention/keywords selectively
Report of all notes in topological order