package optionalExample;
import java.util.Optional;

public class StudyTimeTable {
    public static void main(String[] args) {
        StudyTimeTable studyTimeTable = new StudyTimeTable();
        Optional<String> whatToStudyOnSunday= studyTimeTable.whatToStudy("Sunday");
        Optional<String> whatToStudyOnTuesday = studyTimeTable.whatToStudy("Tuesday");

        whatToStudyOnSunday.ifPresent(System.out::println);
        whatToStudyOnTuesday.ifPresent(System.out::println);
    }

    public Optional<String> whatToStudy(String day){
        switch (day){
            case "Monday":
                return Optional.of("A");
            case "Tuesday":
                return Optional.of("B");
            case "Wednesday":
                return Optional.of("C");
            case "Thursday":
                return Optional.of("D");
            case "Friday":
                return Optional.of("E");
            default:
                return Optional.empty();
        }
    }
}
