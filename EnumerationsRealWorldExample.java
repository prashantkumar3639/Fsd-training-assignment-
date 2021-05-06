class EnumerationsRealWorldExample{
	public static void main(String[] args) {
		new MultilevelParking().getAvailability();
	}
}
enum ParkingAvailability{
	FIRST_FLOOR(5), SECOND_FLOOR(10), THIRD_FLOOR(1);
	private int parking_space;
	
	ParkingAvailability(int parking_space){
		this.parking_space = parking_space;
	}

	int getparking_space(){
		return this.parking_space;
	}
}


class MultilevelParking{
	void getAvailability(){
		System.out.println("Dear Customer, we have the following spaces available currently for parking:");
		for(ParkingAvailability empty_space : ParkingAvailability.values()){
			System.out.println(empty_space.getparking_space() + " vechiles can get parked on "+empty_space);
		}
		
	}
}

