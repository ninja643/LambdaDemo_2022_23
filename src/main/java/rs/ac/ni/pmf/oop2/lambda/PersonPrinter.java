package rs.ac.ni.pmf.oop2.lambda;

import lombok.Value;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Function;

public class PersonPrinter
{
    public static void main(String[] args)
    {
        final List<Person> people = List.of(
                new Person("Pera", Person.Gender.MALE, LocalDate.of(1990, Month.AUGUST, 3), "pera@mail.com"),
                new Person("Mika", Person.Gender.MALE, LocalDate.of(2003, Month.JANUARY, 30), "mika@mail.com"),
                new Person("Maja", Person.Gender.FEMALE, LocalDate.of(1996, Month.NOVEMBER, 2), null),
                new Person("Goca", Person.Gender.FEMALE, LocalDate.of(1990, Month.MAY, 13), "goca@mail.com"));

        final int ageFrom = 20;
        final int ageTo = 30;

//        for (int i = 0; i < people.size(); i++)
//        {
//            final Person person = people.get(i);
//            if (person.getAge() >= ageFrom)
//            {
//                System.out.println(person.getEmail());
//            }
//        }

        people.stream()
              .filter(person -> person.getAge() >= ageFrom)
              .filter(person -> person.getGender() == Person.Gender.MALE)
              .map(Person::getEmail)
              .filter(Objects::nonNull)
              .forEach(System.out::println);


        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        int sum = 0;

//        for (int i = 0; i < integers.size(); i++)
//        {
//            int value = integers.get(i);
//            if (value % 2 == 1 && value % 3 == 0)
//            {
//                sum += value;
//            }
//        }


//        final PersonRepository personRepository = new PersonRepository(people);

        //personRepository.printPersonsOlderThan(20);

//		final Filter filter = new OlderThanFilter(20);
//		personRepository.printFiltered(filter);


//        personRepository.printFiltered(person -> person.getAge() >= ageFrom && person.getAge() <= ageTo);
//        personRepository.printFiltered(person -> person.getGender() == Person.Gender.MALE,
//                                       Person::getEmail,
//                                       System.out::println);
//
//        personRepository.printFiltered(person -> person.getGender() == Person.Gender.MALE,
//                                       Person::toString,
//                                       System.out::println);
    }
//
//    @Value
//    public static class TestClass
//    {
//        int x;
//    }
}
