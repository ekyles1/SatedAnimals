

	public class Chimp implements Animal {
		int calories =1000;
		int meatCalories =0;
		
		
		
		@Override
		public void eat(FoodType food, int calories) {
		
					
			//this.calories-=calories;
			//this.calories=this.calories-calories
			switch(food) {
				case MEAT:
					this.calories-=calories;
					this.meatCalories+=calories;
					break;
				case PLANTS:
				case LIGHT:
					this.calories-=calories;
					break;
				
		
			
			}
			
			
		}

		@Override
		public boolean isSated() {
			// TODO Auto-generated method stub
			if (this.calories <=0 && this.meatCalories>=200){
				
				
				return true;
			}
			return false;
			
		}
	}


