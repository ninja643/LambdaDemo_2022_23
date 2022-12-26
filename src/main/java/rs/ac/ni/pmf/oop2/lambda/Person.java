package rs.ac.ni.pmf.oop2.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Person
{
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE;

	public enum Gender
	{
		MALE,
		FEMALE
	}

	private final String name;
	private final Gender gender;
	private final LocalDate birthday;
	private String email;

	public int getAge()
	{
		return birthday.until(LocalDate.now()).getYears();
	}

	public void printData()
	{
		System.out.printf("(%s, %s, %s)\n", name, gender.name(), birthday.format(FORMATTER));
	}
}
