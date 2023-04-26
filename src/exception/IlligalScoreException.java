package exception;

//RuntimeExceptionを継承した「IlligalScoreException」クラスを作成してください。
public class IlligalScoreException extends RuntimeException{
    IlligalScoreException(String message){
        super(message);
    }
}
