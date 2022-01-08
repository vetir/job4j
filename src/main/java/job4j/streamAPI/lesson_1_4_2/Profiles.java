package job4j.streamAPI.lesson_1_4_2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

//    private final Comparator<Address> compareByCity = Comparator.comparing(Address::getCity);

    public List<Address> collect(List<Profile> profiles){

        return profiles.stream()
                .map(Profile::getAddress)
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());
    }
}


