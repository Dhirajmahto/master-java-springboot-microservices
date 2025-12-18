package Exception;
 // throw , throws

class BookUnavailableException extends Exception {
    public BookUnavailableException(String message) {
        super(message);
    }

static class InvalidMemberException extends Exception {
    public InvalidMemberException(String message) {
        super(message);
    }
}


static class Library{
    int availableBooks = 3;

    public  void borrowBook(String membername ,int bookRequestedCount) throws Exception {
        if(bookRequestedCount > availableBooks){
            throw  new BookUnavailableException("not enogh books available");
        }
        if(bookRequestedCount < 0){
            throw  new Exception(" You Must request atlaest 1 book");
        }
        if(membername == null && membername.isEmpty()){
            throw  new InvalidMemberException("Invalid MemeberShip");
        }
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();
        try {
            library.borrowBook("Dhiraj", 10);
            library.borrowBook(null, 10);
        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Exception caught");
            System.out.println(e.getMessage());
        }

    }
}
}


//int availableBooks = 3;
//
//public  void borrowBook(int bookRequestedCount) throws Exception {
//    if(bookRequestedCount > availableBooks){
//        throw  new Exception("not enogh books available");
//    }
//    if(bookRequestedCount < 0){
//        throw  new Exception(" You Must request atlaest 1 book");
//    }
//}
//}


//public  void borrowBook(int bookRequested){
//    try{
//        int[] books = {101, 102, 103};
//        System.out.println("Book Requested : "+ books[bookRequested]);
//    } catch(ArrayIndexOutOfBoundsException e){
//        System.out.println(e.getMessage());
//    } catch (NullPointerException e){
//        System.out.println("NullPointerException");
//    } finally{
//        System.out.println("finally");
//    }
//}


//public  void borrowBook(int bookRequestedCount){
//    try{
//        if(bookRequestedCount>availableBooks){
//            throw new Exception("Not enough books available");
//        }
//    } catch(ArrayIndexOutOfBoundsException e){
//        System.out.println(e.getMessage());
//    } catch (Exception e){
//        System.out.println(e.getMessage());
//    } finally{
//        System.out.println("finally");
//    }
//}