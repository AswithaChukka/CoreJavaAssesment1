import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectorsExercise {
    public static void main(String[] args) {
        List<Player> player = Arrays.asList(new Player("Abhi",300,30000,500,"India"),
                new Player("Amar",323,31000,520,"India"),
                new Player("Surya",325,32000,525,"Russia"),
                new Player("Manu",200,25000,600,"India"),
                new Player("Ram",100,22000,350,"India"));
        getPlayersByCountry(player);
        getTotalPlayersByCountry(player);
        getTotalRunsByCountry(player);
    }
    public static void getPlayersByCountry(List<Player> p){
        Map<Object, Object> countryNameWithPlayerName = p.stream().collect(Collectors.toMap(p1->p1.getPlayerName(), p1->p1.getCountry()));
        System.out.println(countryNameWithPlayerName);}
    public static void getPlayerNamesByCountry(List<Player> p){
        Map<Object, Object> countryNameWithPlayerName1 = p.stream().filter(player -> player.getMatchesPlayed() > 100).collect(Collectors.toMap(p1->p1.getPlayerName(),p1->p1.getCountry()));
        System.out.println(countryNameWithPlayerName1);}
    public static void getTotalPlayersByCountry(List<Player> p) {
        Map<String, Long>  n2 = p.stream().collect(Collectors.groupingBy(k -> k.getCountry(), Collectors.counting()));;
        System.out.println(n2);
    }
    public static void getTotalRunsByCountry(List<Player> p) {
        Map<String, Long>  n3 = p.stream().collect(Collectors.groupingBy(k -> k.getCountry(), Collectors.summingLong(p5->p5.getRuns())));
        System.out.println(n3);
    }
    public static void getMaxScoreByCountry(List<Player> p) {
        //Map<String, Integer>  n4 = p.stream().collect(Collectors.groupingBy(k -> k.getCountry() , Collectors.max(Comparator.comparing(Player::getRuns()).get()));
        //System.out.println(n4);

    }
}
