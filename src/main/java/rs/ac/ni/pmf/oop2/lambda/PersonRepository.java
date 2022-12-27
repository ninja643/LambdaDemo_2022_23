package rs.ac.ni.pmf.oop2.lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PersonRepository
{
    private final List<Person> persons;

    public void printFiltered(Predicate<Person> filter, Function<Person, String> transformer, Consumer<String> consumer)
    {
        for (final Person person : persons)
        {
            if (filter.test(person))
            {
                final String value = transformer.apply(person);
                consumer.accept(value);
            }
        }
    }

//	public void printPersonsOlderThan(int age)
//	{
//		for (final Person person : persons)
//		{
//			if (person.getAge() >= age)
//			{
//				person.printData();
//			}
//		}
//	}
//
//	public void printPersonsWithinAgeRange(int ageFrom, int ageTo)
//	{
//		for (final Person person : persons)
//		{
//			if (person.getAge() >= ageFrom && person.getAge() <= ageTo)
//			{
//				person.printData();
//			}
//		}
//	}
}
