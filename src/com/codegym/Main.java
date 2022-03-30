package com.codegym;

public class Main {
    public static void main(String[] args) {
        int countlanguageJAVA = 0;
        double totalMoneyProgrammingBook = 0;
        double totalMoneyFictionBook = 0;
        ProgrammingBook[] programmingBooks = new ProgrammingBook[5];
        programmingBooks[0] = new ProgrammingBook(1,"book1",10000,"Thu","JAVA","core");
        programmingBooks[1] = new ProgrammingBook(2,"book2",12000,"Ho","JAVA","swing");
        programmingBooks[2] = new ProgrammingBook(3,"book3",12000,"Ho","JS","abc");
        programmingBooks[3] = new ProgrammingBook(4,"book4",13000,"Hoa","JS","xyz");
        programmingBooks[4] = new ProgrammingBook(5,"book5",15000,"Hoa","PHP","xyz");
        FictionBook[] fictionBooks = new FictionBook[5];
        fictionBooks[0] = new FictionBook(6,"book6",7000,"KK","fic");
        fictionBooks[1] = new FictionBook(7,"book7",9000,"KH","nus");
        fictionBooks[2] = new FictionBook(8,"book8",11000,"KK","ghost");
        fictionBooks[3] = new FictionBook(9,"book9",11000,"KK","fiction");
        fictionBooks[4] = new FictionBook(10,"book10",17000,"KK","horour");

        for (ProgrammingBook programmingBook:
             programmingBooks) {
            System.out.println(programmingBook);
        }
        System.out.println("");
        for (FictionBook fictionBook:
             fictionBooks) {
            System.out.println(fictionBook);
        }


        for (int i=0;i<programmingBooks.length;i++){
            totalMoneyProgrammingBook += programmingBooks[i].getPrice();
            if (programmingBooks[i].getLanguage()=="JAVA"){
                countlanguageJAVA ++;
            }
        }
        for (int i=0;i<fictionBooks.length;i++){
            totalMoneyFictionBook += fictionBooks[i].getPrice();
        }

        System.out.println("");
        System.out.println("Số sách Programming có language là JAVA: "+countlanguageJAVA);
        System.out.println("Tổng tiền 10 cuốn sách: "+(totalMoneyProgrammingBook+totalMoneyFictionBook));


    }
}
