import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SatedTest {
	
	@Test
	void deerTest() {
		Deer deer =new Deer();
		deer.eat(FoodType.PLANTS , 1200);
		assertEquals(true, deer.isSated());
	}

	@Test
	void bushTest() {
		Bush bush =new Bush();
		bush.eat(FoodType.LIGHT , 50);
		assertEquals(true, bush.isSated());
	}
	@Test
	void pigTest() {
		Pig pig =new Pig();
		pig.eat(FoodType.LIGHT,1000);
		pig.eat(FoodType.MEAT, 1000);
		pig.eat(FoodType.PLANTS,1000);
		assertEquals(true, pig.isSated());
	}
	@Test
	void chimpTest() {
		Chimp chimp =new Chimp();
		chimp.eat(FoodType.MEAT, 200);
		chimp.eat(FoodType.PLANTS,800);
		assertEquals(true, chimp.isSated());
	}
	@Test
	void pandaTest() {
		Panda panda =new Panda();
		panda.eat(FoodType.PLANTS,6000);
		assertEquals(true, panda.isSated());
}
	@Test
	void wolfTest() {
		Wolf wolf =new Wolf();
		wolf.eat(FoodType.MEAT,200);
		wolf.eat(FoodType.MEAT,200);
		wolf.eat(FoodType.MEAT,200);
		wolf.eat(FoodType.MEAT,200);
		assertEquals(true, wolf.isSated());
}
}