

	public class Bush implements Animal {
		int calories =50;
		
		@Override
		public void eat(FoodType food, int calories) {
			// TODO Auto-generated method stub
			if (food ==FoodType.LIGHT ) {
				
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


