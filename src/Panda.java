
public class Panda implements Animal {
		int calories =0;
		
	
	
	@Override
	public void eat(FoodType food, int calories) {
	
				
		//this.calories-=calories;
		//this.calories=this.calories-calories
		
		if (food==FoodType.PLANTS) {
			
			this.calories+=calories;
		}
			
			
		}
		
		
	
	@Override
	public boolean isSated() {
		// TODO Auto-generated method stub
		if (this.calories >=6000 ){
			//divide calories by 2
			this.calories /= 2;

			
			return true;
		}
		return false;
		
	}
}

