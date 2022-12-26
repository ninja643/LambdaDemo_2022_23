package rs.ac.ni.pmf.oop2.lambda;

import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PersonRepository
{
	private final List<Person> persons;

	public void printPersonsOlderThan(int age)
	{
		for (final Person person : persons)
		{
			if (person.getAge() >= age)
			{
				person.printData();
			}
		}
	}

	public void printPersonsWithinAgeRange(int ageFrom, int ageTo)
	{
		for (final Person person : persons)
		{
			if (person.getAge() >= ageFrom && person.getAge() <= ageTo)
			{
				person.printData();
			}
		}
	}
}
