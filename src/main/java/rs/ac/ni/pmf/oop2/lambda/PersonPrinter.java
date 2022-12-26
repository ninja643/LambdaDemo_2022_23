package rs.ac.ni.pmf.oop2.lambda;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class PersonPrinter
{
	public static void main(String[] args)
	{
		final List<Person> people = List.of(
			new Person("Pera", Person.Gender.MALE, LocalDate.of(1990, Month.AUGUST, 3)),
			new Person("Mika", Person.Gender.MALE, LocalDate.of(2003, Month.JANUARY, 30)),
			new Person("Maja", Person.Gender.FEMALE, LocalDate.of(1996, Month.NOVEMBER, 2)),
			new Person("Goca", Person.Gender.FEMALE, LocalDate.of(1990, Month.MAY, 13)));

		final PersonRepository personRepository = new PersonRepository(people);

		personRepository.printPersonsOlderThan(20);
	}
}
