
public class Deer implements Animal {
	int calories =1200;
	
	@Override
	public void eat(FoodType food, int calories) {
		// TODO Auto-generated method stub
		if (food ==FoodType.PLANTS ) {
			
			this.calories-=calories;
			//this.calories=this.calories-calories
		}
		
	}

	@Override
	public boolean isSated() {
		// TODO Auto-generated method stub
		if (this.calories ==0){
			return true;
		}
		return false;
		
	}
}
