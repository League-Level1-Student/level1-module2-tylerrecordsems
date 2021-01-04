package _06_tea_party;

import org.junit.Assert;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {

		if (isKnighted && isWoman) {
			return "Hello Lady " + name;
		}
if (!isWoman && !isKnighted) {
	return "Hello Mr. " + name;
}
if (!isWoman && isKnighted) {
	return "Hello Sir " + name;
}
if (isWoman && !isKnighted) {
	return "Hello Ms. " + name;
}
		return null;
	}
}