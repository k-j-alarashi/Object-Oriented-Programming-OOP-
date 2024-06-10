package lab.pkg8;

import java.util.Scanner;

public class Lab8 {

    public static void main(String[] args) {
//        run of the first exercise :
        Scanner in = new Scanner(System.in);
        Question q = new Question();
        ChoiceQuestion chq = new ChoiceQuestion();
        chq.setText("Which programming langauge is the best ? ");
        chq.addChoice("java", true);
        chq.addChoice("python", false);
        chq.addChoice("c#", false);
        chq.addChoice("c++", false);
        chq.display();

        System.out.println("Enter your answer : ");
        String a = in.next();
        System.out.println(chq.checkAnswer(a));

        //example of instanceof : 
        //System.out.println(chq instanceof Question);
        
        
//        run of the second exercise :
//        Author author = new Author();
//        author.setName("Khaled");
//        author.setAge(22);
//        author.setAddress("Sana'a");
//        Book book = new Book("Java", author, 1200.0);
//        System.out.println("Book Title : "+book.getTitle());
//        System.out.println("Auther Name : "+book.getAuthor().getName());
    }

}
