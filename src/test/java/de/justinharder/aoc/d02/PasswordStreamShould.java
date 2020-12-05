package de.justinharder.aoc.d02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class PasswordStreamShould
{
	@Test
	@DisplayName("map the input list into a Stream of Passwords for Part One")
	void test01()
	{
		var expected = List.of(
			new Password(new PolicyOne('a', 1, 3), "abcde"),
			new Password(new PolicyOne('b', 1, 3), "cdefg"),
			new Password(new PolicyOne('c', 2, 9), "ccccccccc"));

		var result = PasswordStream.of(List.of("1-3 a: abcde", "1-3 b: cdefg", "2-9 c: ccccccccc"),
			PasswordStream::mapOne);

		assertThat(result.collect(Collectors.toList())).containsAll(expected);
	}
}
