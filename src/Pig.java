

	public class Pig implements Animal {
		int calories =3000;
		int meatCalories =0;
		int plantCalories =0;
		
		
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
					this.calories-=calories;
					this.plantCalories+=calories;
					break;
				case LIGHT:
					this.calories-=calories;
					break;
				
		
			
			}
			
			
		}

		@Override
		public boolean isSated() {
			// TODO Auto-generated method stub
			if (this.calories <=0 && this.meatCalories>=1000 && this.plantCalories>=1000){
				
				
				return true;
			}
			return false;
			
		}
	}


