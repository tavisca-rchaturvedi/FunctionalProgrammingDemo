package optionalExample;

public class NameReader {

    public static void main(String[] args) {
        NameReader nameReader = new NameReader();
        String name = nameReader.getName(0);
        System.out.println(name.toLowerCase());
    }

    public String getName(int id){
        if(id == 1){
            return "ABCD";
        }
        return null;
    }
}
