

public class Wolf implements Animal {
	int calories = 0;
	int eatmeseymour =0;
	
	
	
	@Override
	public void eat(FoodType food, int calories) {
	
				
		//this.calories-=calories;
		//this.calories=this.calories-calories
		if (food==FoodType.MEAT) {
			
			this.calories+=calories;
			this.eatmeseymour+=1;
			
			
		}
				
	}

	@Override
	public boolean isSated() {
		// TODO Auto-generated method stub
		if (this.calories >=800 && this.eatmeseymour>=4){
			
			
			return true;
		}
		return false;
		
	}
}
