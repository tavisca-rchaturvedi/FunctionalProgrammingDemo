package optionalExample;

import java.util.Optional;

public class NameReader {

    public static void main(String[] args) {
        NameReader nameReader = new NameReader();
        Optional<String> mayBeName = nameReader.getName(1);
        mayBeName.ifPresent(System.out::println);
    }

    public Optional<String> getName(int id){
        if(id == 1){
            return Optional.of("ABCD");
        }
        return Optional.empty();
    }
}
