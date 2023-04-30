package review;

public class HtmlListConversion implements DataConversion {
    @Override
    public String conversion(String[] data) {
        var result = "<nl>";
        for(var item : data ) {
            result += "<nl>" + item + "</li>";
        }
        result += "</ul>";
        return result;

        
    }
}
