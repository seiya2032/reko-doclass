package review;

public class CsvConversion implements DataConversion{

    @Override
    public String conversion(String[] bata) {
        return String.join(",", bata);
    }
}
