package Basic;


	public class Car 
	{
	    /*****************************************************************
	     *                     Attributes                                *
	     *                                                               *
	     ****************************************************************/
	    //Encapsulation Principle: All the attributes are by default private 
		private String carName; //name of the car
		private int startSpeed; //first speed of the car when it is started
		private int initialSpeed; //startSpeed speed of a car to be driven by a   
	                                //non-experimented person
	      private int currentSpeed; //current speed of the car
	      private int speedIncreaseStep;//Car speed increase step
	      private int zeroCounter;//counter of seconds when speedIncreaseStep speed 
	                               //is zero (constant speed)
	        
	    /*****************************************************************
	     *                     Constructors                              *
	     *                                                               *
	     ****************************************************************/
	    //First Constructor that constructs a Car with just a specified name
	    public Car(String myNameCar)
	    {
	    	carName = myNameCar;
	    }

	//Second Constructor that constructs a Car to be driven by a non- experimented person.
	    //This Car is created with a specified name, and starts the race with an initial speed
	    //given by the player as a parameter to the constructor during its creation.
	    public Car(String myNameCar, int is)
	    {
	        carName = myNameCar;
	        initialSpeed = is;
	    }
	    //Third is a parameterless Constructor that constructs an empty          
	    //car that looks exactly as a real car but doesn't really move
	    public Car()
	    {
	    	carName = "ToyCar";
	    }      
	        
	    /*****************************************************************
	     *                     Accessor Methods                          *
	     *                                                               *
	     ****************************************************************/
	    //returns the name of the car
	    public String getCarName()
	    {
		  return this.carName;
	    }
	    
	    //returns the startSpeed of the car
	    public int getStartSpeed()
	    {
	        return this.startSpeed;
	    }
	    


	    //returns the initialSpeed of the car
	    public int getInitialSpeed()
	    {
		 return this.initialSpeed;
	    } 
	    
	    //returns the currentSpeed of the car
	    public int getCurrentSpeed()
	    {
		 return this.currentSpeed;
	    } 
	    
	    //returns the speedIncreaseStep of the car
	    public int getSpeedIncreaseStep()
	  	{
		 return this.speedIncreaseStep;	
	    }
	    
	    //returns the zeroCounter of the car
	    public int getZeroCounter()
	    {
		 return this.zeroCounter;
	    }  
	  
	    /*****************************************************************
	     *                     Mutator Methods                           *
	     *                                                               *
	     ****************************************************************/
	    //sets the name of the car
	    public void setCarName(String newName)
	    {
	    	 this.carName = newName;
	    }
	    
	    //sets the startSpeed of the car
	    public void setStartSpeed(int sp)
	    {
	         this.startSpeed = sp;
	    } 
	    
	    //sets the initialSpeed of the car
	    public void setInitialSpeed(int newSpeed)
	    {
	         this.initialSpeed = newSpeed;
	    }
	    
	    //sets the currentSpeed of the car
	    public void setCurrentSpeed(int newCurrentSpeed)
	    {
	    	  this.currentSpeed = newCurrentSpeed;
	    }
	    
	    //sets the speedIncreaseStep of the car
	    public void setSpeedIncreaseStep(int newInc)
	    {
	    	  this.speedIncreaseStep = newInc;
	    }
	    
	    //sets the zeroCounter of the car
	    public void setZeroCounter(int newZc)
	    {
	    	  this.zeroCounter = newZc;
	    }
	    
	    /*****************************************************************
	     *                     Methods                                   *
	     *                                                               *
	     ****************************************************************/
		//Method that generates a random number between minx10 and maxx10
		static int createRandomNumber(int min, int max){
			
			/* min *= 10;
			 * max *= 10
			 * 
			 * return (int)(Math.random() * (max - min) + 1 + min);
			 * 
			 * int myRandomInt = (int)(Math.random() * 10 * (Math.random() > 0.5 ? min : max);
			 * return myRandomInt;
			 */
			
			int minMaxRange = ((max * 10) - (min * 10)) + 1;     
			return (int)(Math.random() * minMaxRange) + (min * 10);
		}
		
		//Method to starts the car (initialize the car speed)
	    public void start(int h, int l)
	    {
	    	if(initialSpeed != 0){//startSpeed = initialSpeed
	    		
	            this.startSpeed = initialSpeed;
	    	}
	    	else{//startSpeed = randomNumber generated from createRandomNumber(h, l);
	    		
	           this.startSpeed = createRandomNumber(h, l);
	    	}
	    }
	    
		//Method that starts running the car (just double the initial speed to run)
	    public void StartRunning()
	    {
	    	  this.currentSpeed = getStartSpeed() * 2;
	    }
	    
	//Method that runs the car with positive and negative   
	//speedIncreaseStep(normal acceleration and deceleration)
	// speedIncreaseStep will be = createRandomNumber(h, l);
	//currentSpeed will be =  speedIncreaseStep;

	    public void run(int h, int l)
	    {
	    	this.speedIncreaseStep = createRandomNumber(h, l);
	    	this.currentSpeed = createRandomNumber(h, l);
	    }
		
	    //This method accelerates the cars by step of highSpeed (High speed acceleration). It saves highSpeed to currentSpeed and returns currentSpeed
	    public int accelerate(int highSpeed)
	    {
	    		this.currentSpeed = highSpeed;
	    		return currentSpeed;
	}
	    
	    //This method accelerates the cars by step of moreGaz (Very high speed acceleration). It will set moreGas to currentSpeed 
	    public void automaticAccelerationIncrease(int moreGaz)
	    {
	    		this.currentSpeed = moreGaz;  
	 }

	}    



