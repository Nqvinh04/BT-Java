public class TestBook {
    public static void main(String[] args) {
        double sum = 0;
        double sum1 = 0;
        int count = 0;

        ProgrammingBook[] programmingBooks = new ProgrammingBook[5];
        programmingBooks[0] = new ProgrammingBook(1111, "Think Java",120.000 ,"Allen B. Downey", "Java","Spring MVC" );
        programmingBooks[1] = new ProgrammingBook(1112,"Think in Java",130.000,"Bruce Eckel","Java", "Struts 2");
        programmingBooks[2] = new ProgrammingBook(1113, "Effective Java", 140.000, "Joshua Bloch", "Java", "Hibernate");
        programmingBooks[3] = new ProgrammingBook(1114, "Java Performance", 150.000, "Charlie Hunt", "Java", "JSF");
        programmingBooks[4] = new ProgrammingBook(1115, "Java, A Beginner's Guide", 160.000, "Herbert Schildt", "Java","Vaadin" );

        FictionBook[] fictionBooks = new FictionBook[5];
        fictionBooks[0] = new FictionBook(2226, "451 độ F",90.000 ,"Allen B. Downey", "Science Fiction");
        fictionBooks[1] = new FictionBook(2227, "Người Về Từ Sao Hỏa",110.000 ,"Allen B. Downey","Science Fiction" );
        fictionBooks[2] = new FictionBook(2228, "HARRY POTTER",170.000 ,"J.K. ROWLING","novel" );
        fictionBooks[3] = new FictionBook(2229, "THE LORD OF THE RINGS",180.000 ,"J.R.R. TOLKIEN", "novel" );
        fictionBooks[4] = new FictionBook(2230, "OUTLANDER SERIES",190.000 ,"DIANA GABALDON", "novel");

        for (int i = 0; i < programmingBooks.length; i++) {

            sum += programmingBooks[i].getPrice();
        }
        for (int i = 0; i < fictionBooks.length; i++){
            sum1 += fictionBooks[i].getPrice();
        }
        System.out.println(" Tổng số tiền 10 quyển sách là " + (sum + sum1) + " VND");

        for (int i = 0; i < programmingBooks.length; i++){
            if (programmingBooks[i].getLanguage() == "Java"){
                count++;
            }
        }
        System.out.println(" Tổng số lần từ Java xuất hiện " + count);
    }
}
