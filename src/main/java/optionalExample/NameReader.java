package optionalExample;

import java.util.Optional;

public class NameReader {

    public static void main(String[] args) {
        NameReader nameReader = new NameReader();
        Optional<String> name = nameReader.getName(1);
        if(name.isPresent())
            System.out.println(name.get());
    }

    public Optional<String> getName(int id){
        if(id == 1){
            return Optional.of("ABCD");
        }
        return Optional.empty();
    }
}
