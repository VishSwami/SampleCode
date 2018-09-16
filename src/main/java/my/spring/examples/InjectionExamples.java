package my.spring.examples;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class InjectionExamples {
	String stringProp; // from p-namespace
	@Value("10")
	int intProp; // from @value
	List<Integer> intList; // from app context (util namespace)
	Map<String, Integer> intMap; // from app context (util namespace)
	@Value("${d.var}")
	String sysProp; // from exported shell variable
	@Value("${env.var}")
	String definedProp; // from java -D
	@Value("${value.withSpel}")
	String valueProp; // from @value
	String fileProp; // from .properties
	String constProp; // constructor-arg
	
	public InjectionExamples(String cp) {
		constProp = cp;
	}
	
	public void init() {
		System.out.println(stringProp);
		System.out.println(intProp);
		System.out.println(intList);
		System.out.println(intMap);
		System.out.println(sysProp);
		System.out.println(definedProp);
		System.out.println(valueProp);
		System.out.println(fileProp);
		System.out.println(constProp);

	}
	
}
